package ca.cmbs.hr.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    PerformOperation isOdd() {
        return num -> num % 2 != 0;
    }

    PerformOperation isPrime() {
        return num -> {
            if (num <= 1) {
                return false;
            }
            if (num == 2) {
                return true;
            }

            for (int i = 3; i < num / 2; i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        };
    }

    PerformOperation isPalindrome() {
        return num -> {
            String numString = String.valueOf(num);
            if (numString.length() == 1) {
                return true;
            }
            if (numString.length() == 2) {
                return numString.charAt(0) == numString.charAt(1);
            }

            return numString.charAt(0) == numString.charAt(numString.length() - 1) && isPalindrome().check(Integer.valueOf(numString.substring(1, numString.length() - 1)));
        };
    }
}

public class LambdaExpressions {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
