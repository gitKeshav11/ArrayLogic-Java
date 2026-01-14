import java.util.Scanner;
import java.util.Arrays;

public class Sorted_Array{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        
        System.out.print("Enter Number of Elements: ");
        int n=obj.nextInt();
        
        int[] a=new int[n];
        System.out.println("Enter Array Elements: ");
        
        for(int i=0;i<n;i++){
            a[i] = obj.nextInt();
        }
        Arrays.sort(a);
                    System.out.print("Sorted Array Elements: ");
        for(int Element:a){

             System.out.print(Element+" ");
        }
        obj.close();
    }
    
}

