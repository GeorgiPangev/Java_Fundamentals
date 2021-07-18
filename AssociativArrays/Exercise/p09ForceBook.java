import java.util.*;

public class p09ForceBook {
    public static void main(String[] args) {
        Map<String , LinkedList<String>> users = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("Lumpawaroo")){
            if (input.contains(" | ")) {
                String[] inp = input.split(" \\| ");
               // boolean IsExisting = exist(users, inp[1]);
                if (!users.containsKey(inp[0])&&!exist(users, inp[1])) {
                    users.put(inp[0], new LinkedList<>());
                    users.get(inp[0]).add(inp[1]);
                    System.out.printf("%s joins the %s side!%n", inp[1], inp[0]);
                }else if (users.containsKey(inp[0]) &&
                        !exist(users, inp[1])) {
                    users.get(inp[0]).add(inp[1]);
                    System.out.printf("%s joins the %s side!%n", inp[1], inp[0]);
                }

            }else if (input.contains(" -> ")) {
                String[] inp = input.split(" -> ");
                String side = inp[1];
                String us = inp[0];
                boolean IsInAtherSide = aderSideCheck(users, side, us);
                if (exist(users, us)&& IsInAtherSide){
                    if (!users.containsKey(side)) {
                        users.put(side, new LinkedList<>());
                    }
                    users.get(side).add(us);
                    System.out.printf("%s joins the %s side!%n", us, side);
                    int ind = indOfchange(users, side, us);
                    String oterS = oterS(users, side);
                    users.get(oterS).remove(ind);


                } else if (!exist(users, us)) {
                    users.putIfAbsent(side, new LinkedList<>());
                    users.get(side).add(us);
                    System.out.printf("%s joins the %s side!%n", us, side);
                }
            }

            input = scanner.nextLine();
        }
         users.entrySet().stream()
                 .filter(x -> x.getValue().size()>0)
                 .sorted((f,s) ->{

                    int sx= s.getValue().size();
                    int fx = f.getValue().size();
                     if (sx == fx) {
                         return f.getKey().compareTo(s.getKey());
                     }
                    return Integer.compare(sx, fx);
                 })
                 .forEach(s-> {
                     System.out.println("Side: " + s.getKey() +
                             ", Members: "+ s.getValue().size());
                     s.getValue().stream()
                             .sorted((v1,v2)-> v1.compareTo(v2))
                             .forEach(v-> {
                                 System.out.println("! " + v);
                             });
                 });
    }

    private static String oterS(Map<String, LinkedList<String>> users,
                                String side) {
        String x = "";
        for (Map.Entry<String, LinkedList<String>> entry : users.entrySet()) {
            if (!entry.getKey().equals(side)) {
                x = entry.getKey();
            }

        }
        return x;
    }

    private static int indOfchange(Map<String, LinkedList<String>>
                                           users, String side, String us) {
        for (Map.Entry<String, LinkedList<String>> entry : users.entrySet()) {
            if (!entry.getKey().equals(side)){
                List<String> x = entry.getValue();
                for (int i = 0; i < x.size(); i++) {
                    if (x.get(i).equals(us)) {
                        return i;

                    }
                }
            }
        }
        return -1;
    }

    private static boolean aderSideCheck(Map<String, LinkedList<String>>
                                                 users, String side, String us) {
        boolean isFound = false;
        for (Map.Entry<String, LinkedList<String>> entry : users.entrySet()) {
            if (!entry.getKey().equals(side)){
                List<String> x = entry.getValue();
                for (String value : x) {
                    if (value.equals(us)) {
                        isFound=true;

                    }
                }
            }
        }
        return isFound;

    }


    private static boolean exist(Map<String, LinkedList<String>> users, String s) {
        boolean isHear = false;
        for (Map.Entry<String, LinkedList<String>> entry : users.entrySet()) {
            for (String s1 : entry.getValue()) {
                if (s1.equals(s)){
                    isHear = true;
                }
            }
        }
        return  isHear;
    }
}
