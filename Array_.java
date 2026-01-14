import java.util.Scanner;
import java.util.Arrays;

public class Array_ {
    public static void main(String[] args){
        int a[]=new int [5];
        System.out.print("Enter Array Element:\n ");
        Scanner obj=new Scanner(System.in);


        for(int i=0; i<5; i++){

           a[i]=obj.nextInt();
        }
        Arrays.sort(a);
        System.out.println("\nSorted Array Elements: ");

        obj.close();

        for(int b:a){
            System.out.print(b+" ");
        }

    }
}
