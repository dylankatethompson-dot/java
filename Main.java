import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Seat number:  ");
        int seatNumber = Integer.parseInt(input.next());
        while (seatNumber != -1) {
            int num = seatNumber + 5;
            System.out.println("int num = seatNumber + 5; =\t" + num);
            System.out.println("num | 37 =\t\t\t" + (num | 37));
            num = num + 25;
            System.out.println("num = num + 25; =\t\t" + num);
            System.out.println("num & 14 =\t\t\t" + (num & 14));
            num = num - 8;
            System.out.println("num = num - 8; =\t\t" + num);
            System.out.println("num ^ 31 =\t\t\t" + (num ^ 31));
            num = num - 19;
            System.out.println("num = num - 19; =\t\t" + num);
            System.out.println("num & 15 =\t\t\t" + (num & 15));
            num *=2;
            System.out.println("num *=2; =\t\t\t" + num);
            System.out.println("11 | num ^ 34 =\t\t\t" + (11 | num ^ 34));
            System.out.println("\n");
            System.out.print("Seat number:  ");
            seatNumber = Integer.parseInt(input.next());
        }
        System.out.println("Program end");
    }
}