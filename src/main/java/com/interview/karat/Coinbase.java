import java.io.*;
import java.util.*;

/*

We are working on a security system for a badged-access room in our company's building.

We want to find employees who badged into our secured room unusually often. We have an unordered list of names and entry times over a single day. Access times are given as numbers up to four digits in length using 24-hour time, such as "800" or "2250".

Write a function that finds anyone who badged into the room three or more times in a one-hour period. Your function should return each of the employees who fit that criteria, plus the times that they badged in during the one-hour period. If there are multiple one-hour periods where this was true for an employee, just return the earliest one for that employee.

badge_times = [
  ["Paul",      "1355"], ["Jennifer",  "1910"], ["Jose",    "835"],
  ["Jose",       "830"], ["Paul",      "1315"], ["Chloe",     "0"],
  ["Chloe",     "1910"], ["Jose",      "1615"], ["Jose",   "1640"],
  ["Paul",      "1405"], ["Jose",       "855"], ["Jose",    "930"],
  ["Jose",       "915"], ["Jose",       "730"], ["Jose",    "940"],
  ["Jennifer",  "1335"], ["Jennifer",   "730"], ["Jose",   "1630"],
  ["Jennifer",     "5"], ["Chloe",     "1909"], ["Zhang",     "1"],
  ["Zhang",       "10"], ["Zhang",      "109"], ["Zhang",   "110"],
  ["Amos",         "1"], ["Amos",         "2"], ["Amos",    "400"],
  ["Amos",       "500"], ["Amos",       "503"], ["Amos",    "504"],
  ["Amos",       "601"], ["Amos",       "602"],
];

Expected output (in any order)
   Paul: 1315 1355 1405
   Jose: 830 835 855 915 930
   Zhang: 10 109 110
   Amos: 500 503 504

n: length of the badge records array


P: 1315, 1355, 1405
Jose: 1355, 1450 ,  1455

P: 1315
J: 1315
P: 1355
H:1355
P: 1405
H: 1450


P: 1315
H:


*/



public class Coinbase {

    public static Map<String,List<Integer>> findBreach(String[][] badgeTimes){
        Map<String,List<Integer>> answer= new HashMap<>();
        Map<String,List<Integer>> counterMap= new HashMap<>();

        //sort the badgeTimes
        Arrays.sort(badgeTimes, new Comparator<String[]>() {
            public int compare(String[] o1, String[] o2) {
                return Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
            }
        });

        for(String[]badgeTime : badgeTimes){
            String employee = badgeTime[0];
            int entryTime = Integer.parseInt(badgeTime[1]);
            if(answer.containsKey(employee))
                continue;
            //System.out.println(employee + entryTime);

            //if(employee.equalsIgnoreCase("Zhang"))
            // System.out.println(counterMap);

            if(!counterMap.containsKey(employee)){

                counterMap.put(employee, new ArrayList<Integer>());
                counterMap.get(employee).add(entryTime);

            } else{

                List<Integer> times = counterMap.get(employee);
                int firstTime = times.size()==0? entryTime: times.get(0);

                if(firstTime >= entryTime - 100){
                    times.add(entryTime);

                    if(times.size() == 3)
                        answer.put(employee,counterMap.get(employee));

                } else{
                    while(!times.isEmpty() && times.get(0) < entryTime - 100)
                        times.remove(0);
                    times.add(entryTime);
                }
            }

        }

        // System.out.println(counterMap);

        System.out.println(answer);
        return answer;
    }


    public static void main(String[] argv) {
        String[][] badgeTimes = new String[][] {
                {"Paul", "1355"},
                {"Jennifer", "1910"},
                {"Jose", "835"},
                {"Jose", "830"},
                {"Paul", "1315"},
                {"Chloe", "0"},
                {"Chloe", "1910"},
                {"Jose", "1615"},
                {"Jose", "1640"},
                {"Paul", "1405"},
                {"Jose", "855"},
                {"Jose", "930"},
                {"Jose", "915"},
                {"Jose", "730"},
                {"Jose", "940"},
                {"Jennifer", "1335"},
                {"Jennifer", "730"},
                {"Jose", "1630"},
                {"Jennifer", "5"},
                {"Chloe", "1909"},
                {"Zhang", "1"},
                {"Zhang", "10"},
                {"Zhang", "109"},
                {"Zhang", "110"},
                {"Amos", "1"},
                {"Amos", "2"},
                {"Amos", "400"},
                {"Amos", "500"},
                {"Amos", "503"},
                {"Amos", "504"},
                {"Amos", "601"},
                {"Amos", "602"},
        };

        findBreach(badgeTimes);

    }
}


