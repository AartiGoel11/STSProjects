package test;

import java.util.Arrays;

public class String1 {

	public static void main(java.lang.String[] args) {

 String str = "abfv5djfh6743e348";
 
 expressions(str);
// int sum=0;
// for(int i=0;i<str.length();i++)
// {
//	 if(Character.isDigit(str.charAt(i)))
//	 {
////		 System.out.println(Character.getNumericValue(str.charAt(i)));
////		 System.out.println(str.charAt(i));
//		 sum =sum+Character.getNumericValue(str.charAt(i));
//	 }
// }
// System.out.println(sum);
//
 }

	public static void  expressions(String str)
	{
		String str1 = str.replaceAll("[^-?0-9A-Za-z]+", " ");
		
		System.out.println(Arrays.asList(str.trim().split(" ")));
	}
}
