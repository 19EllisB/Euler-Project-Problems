import java.util.ArrayList;

class ProblemSeven {
    public static long main(int index) {
        ArrayList<Long> primes = new ArrayList<Long>();
        primes.add(new Long(2));
        long n = 3;
        while (primes.size() <= index) {
            boolean nIsPrime = true;
            for (long p: primes) {
                if (n % p == 0) {
                    nIsPrime = false;
                    break;
                }   
            }
            if (nIsPrime) { primes.add(n); }
            n += 2;
        }
        return primes.get(index);
    }
}