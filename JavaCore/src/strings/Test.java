package strings;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Maks on 13.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?:http(?:s?)|ftp):\\/\\/");
        Matcher matcher = pattern.matcher("https://example.com/foo/bar");
        matcher.find();
        System.out.println(matcher.group());

//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,4));
//        int listSize = list.size();
//
//        List<List<Integer>> listArr = new ArrayList<>(listSize/4);
//
//        for (int i = 0; i < listSize; i += 4) {
//            List<Integer> listOfNums = new ArrayList<>();
//            listOfNums.add(list.get(i + 3));
//            listOfNums.add(list.get(i));
//            listOfNums.add(list.get(i + 1));
//            listOfNums.add(list.get(i + 2));
//            listArr.add(listOfNums);
//        }
//
//// Это чтоб пробежаться только по уникальным значениям листа.
//        Set<List<Integer>> uniqueSet = new HashSet<>(listArr);
//
//        for (List<Integer> temp : uniqueSet) {
//            System.out.println("counts of " + temp + ": " + Collections.frequency(listArr, temp));
//        }
    }
}
