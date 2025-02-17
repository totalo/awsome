package contest.atcoder.abc_b372;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B {
    
    static BufferedReader reader;
    static BufferedWriter writer;
    
    public static void main(String[] args) throws Exception {
        reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int m = sc.nextInt();
        List<Integer> ans = new ArrayList<>();
        int[] pows = new int[11];
        for (int i = 0; i <= 10; i++) {
            pows[i] = (int) Math.pow(3, i);
        }
        int i = 0;
        for (i = 1; i <= 20; i++) {
            for (int j = 10; j >= 0; j--) {
                int power = pows[j];
                if (m >= power) {
                    ans.add(j);
                    m -= power;
                    break;
                }
            }
            
            if (m == 0) {
                break;
            }
        }
        
        writer.write(i + "\n");
        for (i = ans.size() - 1; i >= 0; i--) {
            writer.write(ans.get(i) + "");
            if (i > 0) {
                writer.write(" ");
            }
        }
        writer.write("\n");
        
        reader.close();
        writer.close();
    }
    
    static Kattio sc = new Kattio();
    
    static class Kattio {
        static BufferedReader r;
        static StringTokenizer st;
        
        public Kattio() {
            r = new BufferedReader(new InputStreamReader(System.in));
        }
        
        public String next() {
            try {
                while (st == null || !st.hasMoreTokens()) {
                    st = new StringTokenizer(r.readLine());
                }
                return st.nextToken();
            } catch (Exception e) {
                return null;
            }
        }
        
        public int nextInt() {
            return Integer.parseInt(next());
        }
        
        public long nextLong() {
            return Long.parseLong(next());
        }
        
        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
