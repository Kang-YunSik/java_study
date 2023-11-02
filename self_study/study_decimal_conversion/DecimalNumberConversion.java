import java.util.Scanner;

public class hw1_DecimalNumberConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("10진수를 입력하세요");
        int decimal = sc.nextInt();

        System.out.println("10진수 = " + decimal);
        System.out.println("2진수 = " + Integer.toBinaryString(decimal));
        System.out.println("8진수 = " + Integer.toOctalString(decimal));
        System.out.println("16진수 = " + Integer.toHexString(decimal));

    }
}