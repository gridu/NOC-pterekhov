import NUMBERS.NumberWorker;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class START {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<List<Integer>> RESULT = new LinkedList<List<Integer>>();
        ArrayList<Integer> NUMBERS = new ArrayList<>();

        System.out.println("Введите количество чисел:");
        int N = getInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Введите число:");
            NUMBERS.add(getInt());
        }

        NumberWorker NMBW = new NumberWorker();


        for (int i = 1; i <= NUMBERS.size(); i++) {
            RESULT.addAll(NMBW.Start(NUMBERS, i));
        }

        System.out.println(RESULT);

    }

    public static int getInt() {
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа.");
            scanner.next();
            num = getInt();
        }
        return num;
    }
}
