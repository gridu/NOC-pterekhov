public class Numbers {
    public int SUM (int N){
        int temp=0;
        for(int i=1; i<=N; i++){
            temp+=i;
        }
        return temp;
    }

    public int Multiply(int N, int M){
        return N*M;
    }

    public double MultiplyDouble(double N, double M){
        return N*M;
    }


}
