import java.util.*;

public class p07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> list = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());
            if (!list.containsKey(name)) {
                list.put(name, new ArrayList<>());
            }
            list.get(name).add(grade);
        }

        list.entrySet()
                .stream()
                .filter(e -> e.getValue()
                        .stream().mapToDouble(Double::doubleValue)
                        .average().getAsDouble()>=4.5)
                .sorted((f,s) ->{
                        Double firstD = f.getValue()
                                .stream().mapToDouble(Double::doubleValue)
                                .average()
                                .getAsDouble();

                        Double secondD= s.getValue()
                                .stream()
                                .mapToDouble(Double::doubleValue)
                                .average()
                                .getAsDouble();
                        return secondD.compareTo(firstD);
                })
                .forEach(s -> {
                    Double avr = s.getValue()
                            .stream().mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();
                    System.out.printf("%s -> %.2f%n", s.getKey(), avr );
                });

    }
}
