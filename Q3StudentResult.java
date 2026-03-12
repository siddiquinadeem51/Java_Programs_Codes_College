import java.util.Scanner;

public class Q3StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 3 subjects:");

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        System.out.println("m1:" + m1);
        System.out.println("m2:" + m2);
        System.out.println("m3:" + m3);
        System.out.println("total:" + total);
        System.out.println("avg:" + avg);

        if (avg >= 35)
            System.out.println("Result:Pass");
        else
            System.out.println("Result:Fail");

        sc.close();
    }
}