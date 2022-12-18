package com.demo;
import java.util.Scanner;
import java.lang.Math;
public class CircleDiff {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		int b =s.nextInt();
		int l [] = new int[a];
		for(int i=0;i<a;i++){
			l[i]=s.nextInt();
		}
		for(int j=0;j<=a-2;j++){
			int r =j+1;
			int diff=l[j]-l[r];
			if(Math.abs(diff) > b){
				System.out.print("1"+" ");
			}
			else{
				System.out.print("0"+" ");
			}
		}
		int diff1=l[a-1]-l[0];
		if(Math.abs(diff1)>b){
			System.out.print("1");
		}
		else{
			System.out.print("0");
		}
		s.close();
	}
}

