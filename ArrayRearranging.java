package com.demo;
import java.util.Scanner;
public class ArrayRearranging {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int a =s.nextInt();
        int l[]=new int[a];
        for(int i=0;i<a;i++){
            l[i] =s.nextInt();
        }
        for(int i=0;i<=a-2;i++){
        	int m=l[i];
            System.out.print(l[l[i]]+" ");
        }
        if(a>0){
            System.out.print(l[l[a-1]]);
        }

	}

}
