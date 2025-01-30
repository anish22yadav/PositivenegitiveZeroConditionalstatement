import java.util.Scanner;

public class PositiveNegativeZeroConditionalStatements {
    public static void main(String[] args) {
        System.out.println("Enter the number to check wheather it is positive negative or zero =");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==0){
            System.out.println("the entered number is zero");
        }
        else if(num>0){
            System.out.println("the enterd number is positive");
        }
        else{
            System.out.println("the entered number is negative");
        }
        sc.close();

    }
}
