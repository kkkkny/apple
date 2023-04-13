package day02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n1, n2, n3;
		String str;
		
		System.out.print("당신의 이름은 무엇입니까? ");
		str = input.next();
		System.out.print(str+" 님의 국어 점수 : ");
		n1 = input.nextInt();
		System.out.print(str+" 님의 영어 점수 : ");
		n2 = input.nextInt();
		System.out.print(str+" 님의 수학 점수 : ");
		n3 = input.nextInt();
		System.out.println();
		System.out.println("===========");
		System.out.println("이 름 : "+str);
		System.out.println("===========");
		System.out.println("국 어 : "+n1);
		System.out.println("영 어 : "+n2);
		System.out.println("수 학 : "+n3);
		System.out.println("===========");
		System.out.println("합 계 : "+(n1+n2+n3));
		System.out.println("===========");
		

	}

}
