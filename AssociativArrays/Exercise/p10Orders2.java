import java.util.*;

public class p10Orders2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Integer>> students = new HashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int grade = Integer.parseInt(scanner.nextLine());
            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }
        students.entrySet()
                .stream()
                .filter(e->
                    e.getValue()
                            .stream().mapToDouble(Integer::doubleValue)
                            .average().getAsDouble() >= 4)
                .sorted((f,s)-> {
                    Double fa = f.getValue().stream().mapToDouble(Integer::doubleValue)
                            .average().getAsDouble();
                    Double sa = s.getValue().stream()
                            .mapToDouble(Integer::doubleValue).average().getAsDouble();

                    return sa.compareTo(fa);
                })
                .forEach(s->{
                    System.out.printf("%s -> %.2f%n",
                            s.getKey(), s.getValue().stream()
                                    .mapToDouble(Integer::doubleValue)
                                    .average().getAsDouble());
                });





    }
}

