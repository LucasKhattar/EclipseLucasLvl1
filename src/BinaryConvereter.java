
public class BinaryConvereter {
	public static void main(String[] args) {
		
	}
	String convert(String binary) {
	   	 int asciiValue = Integer.parseInt(binary, 2);
	   	 char theLetter = (char) asciiValue;
	   	 return "" + theLetter;
	    }
	void UI(){
		
	}
}
