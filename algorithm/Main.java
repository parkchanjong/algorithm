package algorithm;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            h.add(Integer.parseInt(br.readLine()) % 42);
        }
        br.close();
        System.out.print(h.size());
    }
}
