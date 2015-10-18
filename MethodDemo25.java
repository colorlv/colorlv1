package homeworke;

import java.util.Scanner;

public class MethodDemo25 {

	public static void main(String[] args) {
		// 编写判断汉字回文的函数，并调用此函数判定一个汉字字符串是否是回文

		
		String str="";
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("请输入一串汉字");
		
		str=s.next();
		
		int n=h(str);
			
		if(n==str.length()-1)
		
			System.out.println("是回文");
		
		else
			
			System.out.println("不是回文");
			
	}

	static int h(String str){
		
		int i=0;
		
	for(int j=1;j<str.length();j++){
		
		if(str.charAt(0)==str.charAt(j))
		
			i++;
		
		else 
			
			break;
		
	}
		
		return i;
			
			
			
			
		}
		
	}
	


