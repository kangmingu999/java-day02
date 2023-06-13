package scanner;

import java.util.Scanner;

public class Testclass01 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int num;
	String name;
	
	System.out.println("이름 입력 : ");
	name = sc.next(); // 문자열 입력
	
	System.out.println("수 입력 : ");
	num = sc.nextInt(); // 정수 입력
	
	System.out.println("이름 : "+name);
	System.out.println("입력 수 : "+num);
}
}
