import java.util.*;
import java.io.*;

class Dstring{
   private static String rdc(String s) {
	char[] str = s.toCharArray();
	String res = "";
	for(char c: str) {
		if(res.indexOf(c) == -1) {
			res += c;
		}
	}
	return res;
   }
   public static void main(String[] args) {
	long start = System.currentTimeMillis();
	int i;
	Scanner sc = new Scanner(System.in);
	String s = new String();
	System.out.print("Enter the text: ");
	s = sc.nextLine();
	int n = s.length();
	int[] a = new int[256];
	for(i=0;i<n;i++)
	{	
			a[s.charAt(i)]++;
	}
	for(i=0;i<rdc(s).length();i++) 	//print distinct string chars
	{
		if(rdc(s).charAt(i) != ' ')
			System.out.print(rdc(s).charAt(i)+""+a[s.charAt(s.lastIndexOf(rdc(s).charAt(i)))]);
	}
	long end = System.currentTimeMillis();
	System.out.println("time: " + (end-start) + "ms");
    }
}