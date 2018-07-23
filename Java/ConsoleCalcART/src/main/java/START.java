import CalcLogic.NUMBERS;
import java.util.Scanner;

public class START {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double num1 = getDouble();
        double num2 = getDouble();
        char operation = getOperation();
        double result = Calculation(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }

    public static int getDouble(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа.");
            scanner.next();
            num = getDouble();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("ошибка при вводе операции.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static double Calculation(double num1, double num2, char operation) {
        NUMBERS NMB = new NUMBERS();
        double result;
        switch (operation) {
            case '+':
                result = NMB.SUM(num1,num2);
                break;
            case '-':
                result = NMB.DIFF(num1,num2);
                break;
            case '*':
                result = NMB.MULTIPLY(num1,num2);
                break;
            case '/':
                result = NMB.DIVIDE(num1,num2);
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод. Или");
                result = Calculation(num1, num2, getOperation());
        }
        return result;
    }
}
