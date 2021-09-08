import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03MatchDate {
    public static void main(String[] args) {
        String regex = "\\b(?<date>\\d{2})\\b(\\.?-?\\/?)(?<mont>[A-Z][a-z]{2})" +
                "\\2(?<year>\\d{4})\\b";
        //String text = new Scanner(System.in).nextLine();
        Map<String, List<String>> dates = new LinkedHashMap<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(new Scanner(System.in).nextLine());
        while (matcher.find()){
            String date = matcher.group();
            dates.putIfAbsent(date, new ArrayList<>());
            dates.get(date).add(matcher.group("date"));
            dates.get(date).add(matcher.group("mont"));
            dates.get(date).add(matcher.group("year"));

        }

            //Day: 13, Month: Jul, Year: 1928
        for (Map.Entry<String, List<String>> entry : dates.entrySet()) {

            List<String> valus = entry.getValue();
            System.out.printf("Day: %s, Month: %s, Year: %S%n", valus.get(0),
                    valus.get(1), valus.get(2));



        }



    }
}
