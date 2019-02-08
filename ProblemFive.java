
class ProblemFive {
    public static long main(long a) {
        long[] divisors = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11};
        long n = a;
        outer: 
        while (true) {
            for (long i: divisors) {
                if ((n % i) != 0) {
                    n += a;
                    continue outer;
                }
            }
            return n;
        }   
    }
}   