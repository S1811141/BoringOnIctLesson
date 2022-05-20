public class Main
{
	public static void main(String[] args) {
		System.out.println(IntToRoman(3127));
	}
	public static String IntToRoman(int grr){
	    String roman = "";
	    while(grr >= 1000){
	        roman = roman + "M";
	        grr = grr - 1000;
	    }
	    while(grr >= 900){
	        roman = roman + "CM";
	        grr = grr - 900;
	    }
	    while(grr >= 500){
	        roman = roman + "D";
	        grr = grr - 500;
	    }
	    while(grr >= 400){
	        roman = roman + "CD";
	        grr = grr - 400;
	    }
	    while(grr >= 100){
	        roman = roman + "C";
	        grr = grr - 100;
	    }
	    while(grr >= 90){
	        roman = roman + "XC";
	        grr = grr - 90;
	    }
	    while(grr >= 50){
	        roman = roman + "L";
	        grr = grr - 50;
	    }
	    while(grr >= 40){
	        roman = roman + "XL";
	        grr = grr - 40;
	    }
	    while(grr >= 10){
	        roman = roman + "X";
	        grr = grr - 10;

	    }
	    while(grr >= 9){
	        roman = roman + "IX";
	        grr = grr - 9;

	    }
	    while(grr >= 5){
	        roman = roman + "V";
	        grr = grr - 5;

	    }
	    while(grr >= 4){
	        roman = roman + "IV";
	        grr = grr - 4;

	    }

	    while(grr >= 1){
	        roman = roman + "I";
	        grr = grr - 1;
	    }
	    return roman;
	    
	}
}