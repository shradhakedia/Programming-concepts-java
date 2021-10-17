package CPTemplates;

import java.io.*;
import java.util.*;


public class Practice {

    public static void main(final String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {

        }
    }
}

//    static class pair {
//        long first;
//        long second;
//
//        pair(long f, long s) {
//            first = f;
//            second = s;
//        }
//
//        @Override
//        public String toString() {
//            return "pair{" +
//                "first=" + first +
//                ", second=" + second +
//                '}';
//        }
//    }
//    Arrays.sort(a, Comparator.comparing((pair x) -> x.first));
//    map.put(key, map.getOrDefault(key, 0) + 1);

//    Integer[] input = Arrays.stream(nums).boxed().toArray(Integer[]::new);
//
//        Arrays.sort(input, (a, b) -> {
//                if (Integer.bitCount(a) == Integer.bitCount(b))
//                return a - b;
//                else {
//                return Integer.bitCount(a) - Integer.bitCount(b);
//                }
//                });