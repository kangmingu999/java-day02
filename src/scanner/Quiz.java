package scanner;

import java.util.Scanner;

public class Quiz {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String name = "홍길동";
	int a=100,b=98,c=75,sum;
	sum = a+b+c;
	
	System.out.println("===================");
	System.out.println("이름 : "+name);
	System.out.println("===================");
	System.out.println("국어 : "+a);
	System.out.println("영어 : "+b);
	System.out.println("수학 : "+c);
	System.out.println("===================");
	System.out.println("합계 : "+sum);
	System.out.println("===================");
}
}  
