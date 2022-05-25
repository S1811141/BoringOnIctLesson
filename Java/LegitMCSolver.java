import java.util.Random;
public class Main
{
    public static void main(String[] args) {
        System.out.println(MCAnswer(50));
    }
    public static String MCAnswer(int length){
        String bruh = "";
        for(int i= 0;i<length;i++){
            Random random = new Random();
            int ran = random.nextInt(4);
            switch(ran){
                case 0:
                    bruh = bruh + "A";
                    break;
                case 1:
                    bruh = bruh + "B";
                    break;
                case 2:
                    bruh = bruh + "C";
                    break;
                case 3:
                    bruh = bruh + "D";
                    break;
            }
        }
        return bruh;
    }
}