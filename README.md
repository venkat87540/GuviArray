# GuviArrayimport java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int sum = 0;
        int arr[] = new int[a];
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
               sum +=arr[j];
            }
            if(sum%2==0){
                l.add(sum);
            }else{
                int y = arr[i];
                l.add(y);
            }
            sum = 0;
        }
        for(int i=0;i<a-1;i++){
            System.out.print(l.get(i)+" ");
        }
        for(int i=a-1;i<=a-1;i++){
            System.out.print(l.get(i));
        }
    }
}
