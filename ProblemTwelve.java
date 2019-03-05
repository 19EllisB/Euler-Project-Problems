
class ProblemTwelve {
    public static int main(int lowerBound) {
        int divisors = 0;
        int triangularNum = 0;
        for (int i = 1; true; i++) {
            divisors = 0;
            triangularNum += i;
            for (int j = 1; j <= (int) Math.floor(Math.sqrt(triangularNum)); j++) {
                if (triangularNum % j == 0) {
                    divisors += 2;
                }
            }
            if (divisors > lowerBound) {
                return triangularNum;
            }
        }
    }
}
