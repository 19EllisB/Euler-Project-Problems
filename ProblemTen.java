import java.util.ArrayList;

class ProblemTen {
    public static boolean nIsPrime(long n) {
        if (n == 1) {return false;}
        else if (n < 4) {return true;}
        else if (n % 2 == 0) {return false;}
        else if (n < 9) {return true;}
        else if (n % 3 == 0) {return false;}
        else {
            int r = (int) Math.floor(Math.sqrt(n));
            int f = 5;
            while (f <= r) {
                if (n % f == 0) {return false;}
                if (n % (f + 2) == 0) {return false;}
                f += 6;
            }
            return true;
        }
    }
    
    public static long main(int upperLimit) {
        ArrayList<Long> primes = new ArrayList<Long>();
        primes.add(new Long(2));
        for (long i = 3; i <= upperLimit; i += 2) {
            if (nIsPrime(i)) {primes.add(i);}
        }
        
        long sum = 0;
        for (Long p: primes) {
            sum += p;
        }
        
        return sum;
    }
    
    public static void driver(int upperLimit){
        System.out.printf("The sum of all primes less than %d is: %d", upperLimit, main(upperLimit));
    }
}