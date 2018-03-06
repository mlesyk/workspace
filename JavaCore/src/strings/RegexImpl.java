package strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Maks on 13.07.2017.
 */
public class RegexImpl {

    private static Pattern mailPattern = Pattern.compile("^([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z\\.]{2,6})$");
    private static Pattern digitsWithPostfix = Pattern.compile("([0-9]+)(?:st|nd|rd|th)?");
    private static Pattern digitsAfterLettersGroups = Pattern.compile("(([a-z]+)([0-9]+))");
    private static Pattern urlNonCapturingGroup = Pattern.compile("(?:http(?:s?)|ftp):\\/\\/([^\\/\\r\\n]+)(\\/[^\\r\\n]*)?");
    private static Pattern phoneNamedGroups = Pattern.compile("(?<globalCode>\\+?\\d+(\\s?))(?<operatorCode>\\(\\d+\\))(?<phoneNumber>(\\s?)\\d+-?\\d+-?\\d+)");

    public static void main(String[] args) {
        String email = "example.one@gmail.com";
        String digitString = "1 There were already 1st and 2nd chances. I will not give you 3rd or 4th. sadasdasdasd";
        String digitsLetters = "qwe1qwe2qwe3qwe4qwe5";
        String url = "https://example.com/foo/bar";
        String phoneNumber = "+380 (099) 99-99-999";


//        testMail(email);
//        testDigits(digitString);
//        testDigitsLetters(digitsLetters);
        testUrl(url);
//        testPhoneNumber(phoneNumber);
//        System.out.println(Pattern.matches("([a-z]+[0-9]+)+","qwe1qwe2qwe3qwe4eqweqeqweqew123"));
//        System.out.println(Arrays.asList(digits.split("qwe1qwe2qwe3qwe4eqweqeqweqew")));
//        System.out.println(Arrays.asList(digits.split("qwe1qwe2qwe3qwe4eqweqeqweqew", 2)));

    }

    public static void testMail(String input) {
        Matcher mailMatcher = mailPattern.matcher(input);
        System.out.println(mailMatcher.matches()?"email validation passed":"email validation failed");
    }

    public static void testDigits(String input) {
        Matcher digitsMatcher = digitsWithPostfix.matcher(input);

//        System.out.println("Digits groups count: " + digitsMatcher.groupCount());
//        while(digitsMatcher.find()) {
//            System.out.println("Match: " + digitsMatcher.group() + "\t Starts at: " + digitsMatcher.start()
//                    + "\t Ends at: " + digitsMatcher.end() + "\t Group1:" + digitsMatcher.group(1));
//        }
//        System.out.println(digitsMatcher.lookingAt());

        StringBuffer sb = new StringBuffer();
        while(digitsMatcher.find()) {
            digitsMatcher.appendReplacement(sb,"ppp");
        }
//        digitsMatcher.appendTail(sb);
        System.out.println(sb.toString());
    }

    public static void testDigitsLetters(String input) {
        Matcher digitsLettersMatcher = digitsAfterLettersGroups.matcher(input);
        System.out.println("Digit groups count: " + digitsLettersMatcher.groupCount());
        while(digitsLettersMatcher.find()) {
            System.out.println("Match: " + digitsLettersMatcher.group() + "\t Starts at: " + digitsLettersMatcher.start()
                    + "\t Ends at: " + digitsLettersMatcher.end());
            System.out.println("Groups list: ");
            displayAllGroups(digitsLettersMatcher);

        }

        System.out.println(digitsLettersMatcher.lookingAt());
    }

    public static void testUrl(String input) {
        Matcher urlMatcher = urlNonCapturingGroup.matcher(input);
        System.out.println("Url groups count: " + urlMatcher.groupCount());

        while (urlMatcher.find())  {
            System.out.println("Match: " + urlMatcher.group() + "\t Starts at: " + urlMatcher.start()
                    + "\t Ends at: " + urlMatcher.end());
            System.out.println("Groups list: ");
            displayAllGroups(urlMatcher);
        }
     }

    public static void testPhoneNumber(String input) {
        Matcher phoneMatcher = phoneNamedGroups.matcher(input);
        System.out.println("Phone groups count: " + phoneMatcher.groupCount());

        while(phoneMatcher.find()) {
            System.out.println("Match: " + phoneMatcher.group() + "\t Starts at: " + phoneMatcher.start()
                    + "\t Ends at: " + phoneMatcher.end());
            System.out.println("Groups list: ");
            displayAllGroups(phoneMatcher);
        }

    }

    private static void displayAllGroups(Matcher matcher) {
        for(int i = 1; i < matcher.groupCount() + 1; i++) {
            System.out.print("Group"+ i + ": " + matcher.group(i) + "; ");
        }
        System.out.println("");
    }
}
