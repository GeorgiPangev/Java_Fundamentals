import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p04Songs {

    public static class Songs{
        public String type;
        public String name;
        public String time;

        Songs(String type, String name, String time){
            this.type = type;
            this.name = name;
            this.time = time;
        }

        public String getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Songs> songs = new ArrayList<>();
        int n= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("_");
            songs.add(new Songs(input[0], input[1], input[2]));
        }

        String filter = scanner.nextLine();
        if (filter.equals("all")) {
            for (Songs song : songs) {
                System.out.println(song.getName());
            }


        }else {
            songs.stream()
                    .filter(s -> s.getType().equals(filter))
                    .forEach(s-> {
                        System.out.println(s.getName());
                    });

        }

    }
}
