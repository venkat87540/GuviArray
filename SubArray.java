package com.demo;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
public class SubArray {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int l[] = new int[a];
		ArrayList<Integer> l1= new ArrayList<Integer>();
				for(int i=0;i<a;i++){
					l[i] = s.nextInt();
				}
		int sum=0;
		for(int i=0;i<a;i++){
			sum=0;
			for(int j=i;j<a;j++) {
				sum +=l[j];
			}
			l1.add(sum);
		}
		
		int min = Collections.min(l1);
		System.out.println(min);
	}
}


