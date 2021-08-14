import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p01Students {

    static class  Student{
        public String firstName;
        public String lastName;
        public String town;
        public  int age;

        Student(String firstName, String lastName, String town, int age){
           this.firstName= firstName;
           this.lastName = lastName;
           this.town = town;
           this.age = age;

       }

        @Override
        public String toString() {
            return firstName +" "+lastName + " is " +
                     age + " years old";

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<Student>();
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] data = input.split("\\s+");
                students.add(new Student(data[0], data[1], data[3], Integer.parseInt(data[2])));
            input = scanner.nextLine();
        }

        String townToShow = scanner.nextLine();

        students.stream()
                .filter(x-> x.town.equals(townToShow))
                .forEach(x-> {
                    System.out.println(x.toString());
                });



    }
}
