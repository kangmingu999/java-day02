package operator;

import java.util.Scanner;

public class Quiz{
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int su;
	System.out.print("수 입력 : ");
	su = input.nextInt();
	String s = (su % 2 == 0)?"짝수":"홀수";
	System.out.println(su+" = "+s);

	s = (su % 3 == 0)?"3의 배수":"3의 배수가 아니다";
	System.out.println(su+" = "+s);
	
	System.out.print("두 수 입력 : ");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	s = (num1 > num2)?"num1이 num2보다 크다":
		"num2가 num1보다 크다";
	System.out.println("num1 : "+num1+" ,num2 : "+num2);
	System.out.println(s);
}
}


/*
  내가한것
 package operator;


import java.util.Scanner;

public class Quiz {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=0; 
	int b=0;
	int n1 = a/2;
	int n4 = a/3;
	String n2 = (n1>0)? "홀수":"짝수";
	String n3 = (n4==0)? "홀수":"짝수";
		
	
	System.out.print("수를 입력하세요");
	a = sc.nextInt();
	System.out.println(a + "=" +n2 ) ;
	System.out.println(a + "=" +n3);
	System.out.println("두수 입력 :");
	a = sc.nextInt();
	b = sc.nextInt();
	System.out.println("num1 : "+a+","+"num2 :"+b);
	String result=(a>b)? "num1이 num2 보다 크다":"num2가 num1 보다 크다";
	System.out.println(result);
}
}
*/