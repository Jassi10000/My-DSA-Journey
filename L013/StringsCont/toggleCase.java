import java.io.*;
import java.util.*;

public class toggleCase{
    public static Scanner scn = new Scanner(System.in );

	public static String toggleCase(String str){
		//write your code here
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++){
		    char ch = str.charAt(i);
		    
		    if(ch >= 'a' && ch <= 'z')
		        sb.append((char)(ch - 'a' + 'A'));
		    else
		        sb.append((char)(ch + 'a' - 'A'));
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}