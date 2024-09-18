// Parenthesis Checker
// Difficulty: Easy
// Accuracy: 28.56%
// Submissions: 589K+
// Points: 2
// question
// -------------
// Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
// For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).

// Note: The driver code prints "balanced" if function return true, otherwise it prints "not balanced".

// Examples :

// Input: {([])}
// Output: true
// Explanation: { ( [ ] ) }. Same colored brackets can form balanced pairs, with 0 number of unbalanced bracket.
// Input: ()
// Output: true
// Explanation: (). Same bracket can form balanced pairs,and here only 1 type of bracket is present and in balanced way.
// Input: ([]
// Output: false
// Explanation: ([]. Here square bracket is balanced but the small bracket is not balanced and Hence , the output will be unbalanced.
// Expected Time Complexity: O(|x|)
// Expected Auixilliary Space: O(|x|)

// Constraints:
// 1 ≤ |x| ≤ 105
import java.util.*;
public class validparanthesis {
    static boolean isvalid(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                st.push(c);
            } else {
                if (st.isEmpty())
                    return false;
                char pop = st.pop();

                if ((c == ')' && pop != '(') || (c == ']' && pop != '[') || (c == '}' && pop != '{')) {
                    return false;
                }
            }

        }
        return st.empty();
    }

    public static void main(String[] args) {
        System.out.println(isvalid("{([])}"));
    }
}
