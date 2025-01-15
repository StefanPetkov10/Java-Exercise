import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.printf("Enter a name!\n");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.printf("Hello, %s!\n", name);

        System.out.println("Enter two numbers:");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        Calculator calculator = new Calculator(a, b);
        System.out.printf("The sum is: %d\n", calculator.sum());
        System.out.printf("The area is: %d\n", calculator.area());

        UnitConverter converter = new UnitConverter();
        System.out.printf("a in inches: %.2f inches\n", converter.cmToInches(a));
    }
}

class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int area() {
        return a * b;
    }
}

class UnitConverter {
    public float cmToInches(int cm) {
        return (float) (cm * 0.393701);
    }
}
