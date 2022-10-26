import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        int j=0,k=1,fibo=0;
        Scanner input= new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz:");
        int n= input.nextInt();

        for(int i=0;i<n;i++){
            System.out.print(fibo+",");
            if(j==0){
                System.out.print(k+",");
            }
            fibo=j+k;
            j=k;
            k=fibo;
        }
    }
}