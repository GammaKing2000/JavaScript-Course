import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Example {
    public Example() {}

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("nap time", Pattern.CASE_INSENSITIVE);
        String s = "Every morning starts with some nap time!";
        Matcher matcher = pattern.matcher(s);
        //matcher.replaceAll("Codecademy");
        System.out.println(matcher.replaceAll("Codecademy"));

    }
}