package CPTemplates;

import java.io.*;
import java.util.*;

public class Extras {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String s = br.readLine();
            int count = 0;

            for(int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
                    count+= 2;
                }
            }
            if(s.charAt(s.length() - 1) == '0') count++;
            System.out.println(count);
        }
    }
}

