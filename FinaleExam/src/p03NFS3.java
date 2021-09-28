import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p03NFS3 {
    static class Car{
        public String name;
        public int mileage;
        public int fuel;

        public Car(String name, int mileage, int fuel) {
            this.name = name;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        public String getName() {
            return name;
        }

        public int getMileage() {
            return mileage;
        }

        public int getFuel() {
            return fuel;
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int garajeSize = Integer.parseInt(scanner.nextLine());

        ArrayList<Car> cars =new ArrayList<Car>();

        for (int i = 0; i < garajeSize; i++) {
            String[] carInput = scanner.nextLine().split("\\|");
            if (!cars.contains(carInput[0])) {

                cars.add(new Car(carInput[0], Integer.parseInt(carInput[1]),
                        Integer.parseInt(carInput[2])));

            }
        }

        String[] comand = scanner.nextLine().split(" : ");

        while (!comand[0].equals("Stop")){
            String curentCar = comand[1];
           // boolean IsTru = cars.contains(comand[1]);
           int index = indexChec(cars, curentCar);

            if (comand[0].equals("Drive")) {


                int distensToDrive = Integer.parseInt(comand[2]);
                int fuelToSpend = Integer.parseInt(comand[3]);
                int fuelInCar = cars.get(index).getFuel();
                int mielsOfcar = cars.get(index).getMileage();
                int resultFuel = fuelInCar-fuelToSpend;
                int resultMiels = mielsOfcar+distensToDrive;
                
                if (resultFuel<=0) {

                    System.out.println("Not enough fuel to make that ride");
                    
                }else if (fuelInCar>0) {
                    cars.get(index).setMileage(resultMiels);
                    cars.get(index).setFuel(resultFuel);

                    System.out.printf("%s driven for %d kilometers. %d liters of fuel " +
                            "consumed.%n", curentCar, distensToDrive, fuelToSpend);

                    if (cars.get(index).getMileage()>= 100000) {
                        System.out.printf("Time to sell the %s!%n", curentCar);
                        cars.remove(index);
                    }
                    
                }

            }else if (comand[0].equals("Refuel")) {

                int ref = Integer.parseInt(comand[2]);
                int fuelinCar = cars.get(index).getFuel();
                if (fuelinCar+ ref<= 75) {
                    cars.get(index).setFuel(ref+fuelinCar);

                    System.out.printf("%s refueled with %d liters%n",
                            curentCar, ref);

                }else {

                    int realFuel = ref - (fuelinCar+ref - 75);
                    cars.get(index).setFuel(realFuel);
                    System.out.printf("%s refueled with %d liters%n", curentCar
                    , realFuel);
                }


                
            }else if (comand[0].equals("Revert")) {
                    int mielsToDecr = Integer.parseInt(comand[2]);
                    int milesInCar = cars.get(index).getMileage();
                    int real = milesInCar-mielsToDecr;
                if (real>= 10000) {
                    cars.get(index).setMileage(real);

                    System.out.printf("%s mileage decreased by %d kilometers%n",
                            curentCar, mielsToDecr);

                }else {
                    cars.get(index).setMileage(10000);


                }
            }

            comand = scanner.nextLine().split(" : ");

        }

        /*for (Car car : cars) {
            System.out.printf("%s - %d km - %d lt. %n", car.getName()
            , car.getMileage(), car.getFuel());
        }*/

        cars.stream()
                .sorted((f,s)-> {

                    if ((s.getMileage()==(f.getMileage()))) {
                        return f.getName().compareTo(s.getName());
                    }else {
                        return Integer.compare(s.getMileage(), f.getMileage());
                    }
                })
                .forEach(c->{
                    System.out.printf("%s -> Mileage: %d kms, Fuel in" +
                            " the tank: %d lt.%n", c.getName(),c.getMileage(),c.getFuel());
                    });


    }

    private static int indexChec(ArrayList<Car> cars, String curentCar) {
        int x = -1;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getName().equals(curentCar)) {
                x=i;
            }

        }
        return x;

    }
}
