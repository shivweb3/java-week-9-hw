package calculate;

public class Calculator {

    public void addition(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is = " + (a + b));
    }

    public void Subtraction(int a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + " is = " + (a - b));
    }

    public void Multiplication(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " is = " + (a * b));
    }

    public void Division(int a, int b) {
        System.out.println("Division of " + a + " and " + b + " is = " + (a * b));
    }

    public void calculateResult(int a, int b, char symbol) {
        switch (symbol) {
            case '+':
                addition(a, b);
                break;
            case '-':
                Subtraction(a, b);
                break;
            case '*':
                Multiplication(a, b);
                break;
            case '/':
                Division(a, b);
                break;


        }

    }
}
