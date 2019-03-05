
class ProblemFourteen {
    public static long main(long upperBound) {
        long candidate = 0;
        long maxChainLength = 0;
        for (long i = 1; i <= upperBound; i++) {
            if (i % 5000 == 0) {
                System.out.println("At " + i);
            }
            if (colatz(i) >= maxChainLength) {
                candidate = i;
                maxChainLength = colatz(i);
            }
        }
        return candidate;
    }

    static long colatz(long i) {
        long n = i;
        long chain = 1;
        while (true) {
            if (n == 1) {
                return chain;
            } else if (n % 2 == 0){
                n /= 2;    
            } else {
                n = (3 * n) + 1;
            }
            chain++;
        }
    }
}