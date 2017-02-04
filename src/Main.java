import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers:");
        Scanner sc=new Scanner(System.in);
        Integer[] a=new Integer[10];
        for (int i = 0; i < 10; i++) {
            a[i]=sc.nextInt();
        }
        Integer[] b=a.clone();
        for (int i = 0; i < 10; i++) {
            b[i]=a[i]*(i+1);
            System.out.print(b[i]+" ");
        }
    }
}
