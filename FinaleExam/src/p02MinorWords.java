import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02MinorWords {
    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        String reg = "(@|#){1}(?<first>[A-z]{3,})\\1\\1(?<second>[A-z]{3,})\\1";
        Map<String, String> words = new LinkedHashMap<>();
        Pattern pattern = Pattern.compile(reg);
        Matcher mach = pattern.matcher(text);
        int counter = 0;
        while (mach.find()){
            String one = mach.group("first");
            String two = mach.group("second");
            StringBuilder str = new StringBuilder(two);
            two = str.reverse().toString();
            counter++;
            if (one.equals(two)) {
                words.put(mach.group("first"), mach.group("second") );
            }


        }
        if (counter == 0) {
            System.out.println("No word pairs found!");
        }else {
            System.out.printf("%d word pairs found!%n", counter);
        }

        if (words.size()>0) {

            List<String> print = new ArrayList<>();
            for (Map.Entry<String, String> entry : words.entrySet()) {

                print.add(entry.getKey() + " <=> " + entry.getValue());

            }
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", print));
        }else {
           System.out.println("No mirror words!");
        }
    }
}
