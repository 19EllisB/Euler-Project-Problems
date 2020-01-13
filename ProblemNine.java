import java.util.ArrayList;

class ProblemNine {
    ArrayList<Integer> a = new ArrayList<Integer>();
    ArrayList<Integer> b = new ArrayList<Integer>();
    ArrayList<Integer> c = new ArrayList<Integer>();
    
    public void populateTriples(int iterations) {
        //The index for any given triple is (m - 1) * iterations + (n - 1)
        for (int m = 1; m <= iterations; m++) {
            for (int n = 1; n <= iterations; n++) {
                a.add((int) (Math.pow(m, 2) - Math.pow(n, 2)));
                b.add((int) (2 * m * n));
                c.add((int) (Math.pow(m, 2) + Math.pow(n, 2)));
            }   
        }
    }
    
    public static void main(String[] args) {
        ProblemNine p = new ProblemNine();
        p.populateTriples(20);
        /*for (int i = 0; i < 400; i++) {
            System.out.printf("Index %03d: %d %d %d%n", i, p.a.get(i), p.b.get(i), p.c.get(i));
        }*/
        for(int i = 0; i < 400; i++) {
            if ((p.a.get(i) + p.b.get(i) + p.c.get(i)) == 1000) {
                System.out.printf("a:%d b:%d c:%d", p.a.get(i), p.b.get(i), p.c.get(i));
                System.out.printf("abc = %d", p.a.get(i) * p.b.get(i) * p.c.get(i));
                break;
            }
        }
    }
}