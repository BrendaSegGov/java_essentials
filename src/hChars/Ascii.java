package hChars;

import libs.Input;

public class Ascii {

	public static void main(String[] args) {
		char x = 'A';
		int y= x+5;
	    for (int i = 65; i < 65 + 26; i++)
	    {
	        Input.print((char) i + " is " + i + "\n");
	    }

	}

}
