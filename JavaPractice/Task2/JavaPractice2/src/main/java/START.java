import java.util.*;

public class START{

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {


        List<List<Integer>> INPUTARR = new LinkedList<List<Integer>>();
        List<List<Integer>> RESULT = new LinkedList<List<Integer>>();
        int n; System.out.print("Введите число массивов: "); n = getInt();
        int t=0;
        for(int i=0; i<n; i++){
            int k;
            System.out.print("Введите размер "+i+"-ого массива: "); k =getInt();
            System.out.println("Введите элементы "+i+"-ого массива: ");
            List<Integer> temp = new ArrayList<>();
            t+=k;
            for(int j=0; j<k;j++){
                System.out.print("["+j+"] элемент: "); temp.add(getInt());
            }
            INPUTARR.add(temp);
        }

        int[] temp = new int[t];
        List<Integer> ARR = new LinkedList<Integer>();

        for(int i=0;i<INPUTARR.size();i++){
            int[] temp1 = new int[INPUTARR.get(i).size()];
            for(int j=0; j<INPUTARR.get(i).size();j++){
                temp1[j] = INPUTARR.get(i).get(j);
            }
            for(int h=0; h<temp1.length;h++){
                ARR.add(temp1[h]);
            }
        }
        for(int i=0; i<t; i++){
            temp[i] = ARR.get(i);
        }

        temp = removeDuplicates(temp);
        RESULT = COMB(temp);
        int y = RESULT.size();
        System.out.println("Кол-во возможных пар: " + y);
        System.out.println(RESULT);


    }





    private static int getInt() {
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


    private static int[] removeDuplicates(int[] values) {
        boolean mask[] = new boolean[values.length];
        int removeCount = 0;

        for (int i = 0; i < values.length; i++) {
            if (!mask[i]) {
                int tmp = values[i];

                for (int j = i + 1; j < values.length; j++) {
                    if (tmp == values[j]) {
                        mask[j] = true;
                        removeCount++;
                    }
                }
            }
        }

        int[] result = new int[values.length - removeCount];

        for (int i = 0, j = 0; i < values.length; i++) {
            if (!mask[i]) {
                result[j++] = values[i];
            }
        }
        return result;

    }

    private static List<List<Integer>> COMB(int[] arr){
        List<List<Integer>> ARR = new LinkedList<List<Integer>>();
        for(int i=0; i<arr.length; i++){
           int temp1 = arr[i];
           for(int j=0; j<arr.length; j++){
               List<Integer> tempArr = new ArrayList<>();
               int temp2 = arr[j];
               tempArr.add(temp1); tempArr.add(temp2);
               ARR.add(tempArr);
           }
        }
        return ARR;
    }

}