import java.util.*;
import java.math.*;

class ProblemThree {
    public static void main(String testNum) {
        BigInteger n = new BigInteger(testNum);
        BigInteger i = new BigInteger("3");
        ArrayList<BigInteger> primes = new ArrayList<BigInteger>();
        primes.add(new BigInteger("2"));
        
        while (i.compareTo(n) == -1) {//for every i < n, is i prime, if yes add to primes
            boolean iIsPrime = true;
            for (BigInteger x: primes) {
                if (!iIsPrime) { break; } //If i isnt prime, there's no need to keep checking
                if(BigInteger.ZERO.compareTo(i.mod(x)) == 0) {//if i % x == 0
                    iIsPrime = false;
                }
            }
            if (iIsPrime) {
                primes.add(i);
            }
            i = i.add(new BigInteger("2"));
        }
        
        for (BigInteger x: primes) {//prints the prime factors of n
            if (BigInteger.ZERO.compareTo(n.mod(x)) == 0) {//if n % x == 0
                System.out.println(x.toString());
            }
        }
        
        /*for (BigInteger x: primes) {
            System.out.println(x.toString());
        }*/
    }
}   