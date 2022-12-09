import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz ");
        int n = input.nextInt();
        int i = 1;

            while (i<=n){
                for (int j =1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for (int k=1;k<=(2*i)-1;k++){
                    System.out.print("*");
                }
                System.out.println();
                i++;
            }
            int newi = i-2;

            while (newi>0){
                for (int a = 1;a<=n-newi;a++){
                    System.out.print(" ");
                }
                for (int b = 1;b<=(2*newi)-1;b++){
                    System.out.print("*");
                }
                newi--;
                System.out.println();
            }



    }
}