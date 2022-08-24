//https://leetcode.com/discuss/interview-question/838215/guidewire-online-assessment-questions

package string;

import java.util.Arrays;

public class StringMinimumNumberOfMoves {

    public static void main(String[] args) {
        String str = "baaaaa";
        System.out.println(solution(str));
    }

    private static int solution(String s) {
        if (s.length() < 3)
            return 0;

        int move = 0;
        int sameCharCount = 0;
        StringBuffer str = new StringBuffer(s);

        for (int i = 0; i < str.length() - 1; i++) {
            System.out.println(str.charAt(i));
            char replacement = 'a';
            if (str.charAt(i) == 'a')
                replacement = 'b';

            if (str.charAt(i) != str.charAt(i + 1)) {
                sameCharCount = 0;
                continue;
            } else {
                sameCharCount = sameCharCount + 1;
                if (sameCharCount == 2) {
                    str.setCharAt(i, replacement);
                    move = move + 1;
                }
            }

        }

        return move;
    }

}
