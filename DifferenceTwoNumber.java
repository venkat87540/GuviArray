package com.demo;
import java.util.Scanner;
import java.lang.Math;
public class DifferenceTwoNumber {

	public static void main(String[] args ){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c[] = new int[a];
		for(int i=0;i<a;i++){
			c[i] = s.nextInt();
		}
		int count = 0;
		for(int i=0;i<a;i++){
			for(int j=i;j<a;j++){
				int d=c[i]-c[j];
				int e =Math.abs(d);
				if(b == e){
					count +=1;
				}  
			}
		}
		System.out.println(count);
	}
}

