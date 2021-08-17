import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p02Students2 {

    static class  Student{
        public String firstName;
        public String lastName;
        public String town;
        public  int age;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getTown() {
            return town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return firstName + " " +
                    lastName + " is " +
                     age +
                    " years old";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] data = input.split("\\s+");
            Student stud = studentsList.stream()
                    .filter(x-> x.getFirstName().equals(data[0])
                            && x.getLastName().equals(data[1]))
                    .findFirst()
                    .orElse(null);

            if (stud == null){
                Student stu = new Student();
                stu.setFirstName(data[0]);
                stu.setLastName(data[1]);
                stu.setAge(Integer.parseInt(data[2]));
                stu.setTown(data[3]);
                studentsList.add(stu);

            }else {
                int indrxOfStud = indexStud(studentsList, data[0], data[1]);
                if (indrxOfStud>-1){
                    studentsList.get(indrxOfStud).setTown(data[3]);
                    studentsList.get(indrxOfStud).setAge(Integer.parseInt(data[2]));

                }
            }
            input = scanner.nextLine();
        }
        String showTown = scanner.nextLine();
        List<Student> sholUs = studentsList.stream()
                .filter(x-> x.getTown().equals(showTown))
                .collect(Collectors.toList());

        for (Student us : sholUs) {
            System.out.println(us);

        }


    }

    private static int indexStud(List<Student> students, String datum, String datum1) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstName().equals(datum)
            && students.get(i).getLastName().equals(datum1)){
                return  i;
            }


        }
        return -1;
    }
}
