import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void outAbbr(String text){
            String regex = "\\b[A-Za-z]{2,6}\\b";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()){
                System.out.println(matcher.group());
            }
    }

    public static void outInfo(String text){

        String regex1 = "\\b[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.print("email : ");
            System.out.println(matcher.group());
        }



        String regex2 = "\\b[0-9]{4}+-[0-9]{4}+-[0-9]{2}\\b";
        pattern = Pattern.compile(regex2);
        matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.print("document number : ");
            System.out.println(matcher.group());
        }

        String regex3 = "\\+\\(\\d{2}\\)\\d{7}\\b";
        pattern = Pattern.compile(regex3);
        matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.print("Phone number : ");
            System.out.println(matcher.group());
        }

    }
}
