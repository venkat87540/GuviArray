package com.demo;
import java.util.Scanner;
import java.util.ArrayList;
public class CompareToArray {


	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		int b =s.nextInt();
		int l[] =new int[a];
		int l1[] = new int[b];
		ArrayList<Integer> l2 =new ArrayList<Integer>();
		for(int i=0;i<a;i++){
			l[i]=s.nextInt();
		}

		for(int j=0;j<b;j++){
			l1[j]=s.nextInt();
		}
		for(int i=0;i<b;i++){
			for(int j=0;j<a;j++){
				if(l1[i]==l[j]){
					l2.add(l1[i]);
				}
			}
		}
		if(l1.length==l2.size()){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}

	}
}

