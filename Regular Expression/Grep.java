import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Grep {
    public Grep() {}

    public static void main(String[] args) {
        String fname;
        Scanner sc;

        for(int i=1;i<=5;i++){
            fname = "TestFile"+i+".txt";
            try{
                File files = new File(fname);
                sc = new Scanner(files);
            }
            catch(FileNotFoundException e){
                System.out.println("Problem opening file.");
                e.printStackTrace();
                return;
            }
            while(sc.hasNextLine()){
                Pattern pattern = Pattern.compile("\\w*\\d\\w*");
                String line = sc.nextLine();
                Matcher matcher = pattern.matcher(line);
                if(matcher.find())  System.out.println(fname+": "+line);
            }
            sc.close();

        }
    }
}