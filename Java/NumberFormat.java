import java.util.*;
public class Main {
    public static void main(String args[]) {
        System.out.println(FormatNumber(1232144133));
    }
    public static String FormatNumber(int no){
        String nostring = String.valueOf(no);
        String formatted = "";
        int l = String.valueOf(no).length();
        if(l<=3){
            return String.valueOf(no);
        }
        for(int i = 0;i<l;i++){
            String bruh = nostring.substring(l-i-1, l-i);
            int bruh2 = i%3;
            switch(bruh2){
                case 0:
                    if(formatted == ""){
                        formatted = bruh;
                    }else{
                        formatted = bruh +","+ formatted;
                    }
                    break;
                case 1:
                    formatted = bruh + formatted;
                    break;
                case 2:
                    formatted = bruh + formatted;
                    break;
            }
        }
        return formatted;
    }
}