import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println(NumberFormat2(3438));
	}
	public static String NumberFormat2(int ogint){
	    int len = String.valueOf(ogint).length();
	    String finall = "";
	    HashMap<Integer, String> numberchar = new HashMap<Integer, String>();
	    numberchar.put(3, "k");
	    numberchar.put(6, "m");
	    numberchar.put(9, "b");
	    if(len<=3){
	        return String.valueOf(ogint);
	    }
	    for(int i= 1;i<=numberchar.size();i++){
	        int now = i*3;
	        if(now<=len && len <= now+3){
	            String numchar = numberchar.get(now);
	            double dvidie = Math.pow(10, now);
	            double maybefinal = ogint/dvidie;
	            finall = maybefinal + numchar;
	            break;
	        }
	    }
	    return finall;
	}
}