import java.math.*;

class ProblemSix {
    public static long squareSum(long n) {
        long sum = 0;
        for (long i = n; i > 0; i--) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }
    
    public static long sumSquare(long n) {
        double sum = (n * (n + 1)) / 2;
        sum = Math.pow(sum, 2);
        long realSum = (long) sum;
        return realSum;
    }
    
    public static long main(long n) {
        return sumSquare(n) - squareSum(n);
    }   
}
