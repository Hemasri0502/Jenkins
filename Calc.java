public class Calc {
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 5.5;
        char operator = '+';

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("The result of " + num1 + " " + operator + " " + num2 + " is: " + result);
    }
}
