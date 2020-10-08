package pyf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HexExchange {
	
	public static int inputlong;
	public static String str;
	public static String a = "A";
	public static String b = "B";
	public static String c = "C";
	public static String d = "D";
	public static String e = "E";
	public static String f = "F";
	
	public static int result;
	
	public static void main(String[] args)  {
		gethex16();
		getlong();
		exchange();
	}
	public static void gethex16() {
		System.out.println("请输入你需要转换的16进制数字：");
		Scanner hex16=new Scanner(System.in);
		str=hex16.nextLine();
	}
	public static void getlong() {
	String hex16=str;

	inputlong=hex16.length();
	}
	
	
	
	
	public static void exchange() {
		
		int i =0;
		int x =1;
		int num = 0;
		int sum = 0;
		int def = 0;
		String ss;
		List<String> list = new ArrayList<String>(); //定义对象依次存放每一个字符

		do {
			
			ss = String.valueOf(str.charAt(i));
			

			if (ss.equals(a))
			{
				num = 10;
				
			}
			else if (ss.equals(b))
			{
				num = 11;
			}
			else if (ss.equals(c))
			{
				num = 12;
			}
			else if (ss.equals(d))
			{
				num = 13;
			}
			else if (ss.equals(e))
			{
				num = 14;
			}
			else if (ss.equals(f))
			{
				num = 15;
			}
			else {
				num = Integer.parseInt(ss);
			}
			sum = (int) (num * Math.pow(16,inputlong-x));
			
			sum = def + sum;
			def = sum;
			
			x++;
			i++;
		}
		while(i < inputlong);
		
		
		result = sum;
		System.out.println("转换为10进制为："+result);
	}
	
	
	
}
