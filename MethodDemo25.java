package homeworke;

import java.util.Scanner;

public class MethodDemo25 {

	public static void main(String[] args) {
		// ��д�жϺ��ֻ��ĵĺ����������ô˺����ж�һ�������ַ����Ƿ��ǻ���

		
		String str="";
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("������һ������");
		
		str=s.next();
		
		int n=h(str);
			
		if(n==str.length()-1)
		
			System.out.println("�ǻ���");
		
		else
			
			System.out.println("���ǻ���");
			
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
	


