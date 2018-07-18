public class Program {
    public static void main(String[] args){
        Numbers NUM1 = new Numbers();
        int res1 =NUM1.SUM(5);
        System.out.println(res1);

        int res2 = NUM1.Multiply(5,5);
        System.out.println(res2);

        double res3 =NUM1.MultiplyDouble(2.5 , 3);
        System.out.println(res3);
    }
}
