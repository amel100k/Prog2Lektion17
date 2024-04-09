package opgave02;

import opgave01.models.LinkedStack;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Opgave02 {
    public static void main(String[] args) {
        System.out.println(checkParantes("(3+{5{99{*}}[23[{67}67]]})"));
        System.out.println(checkParantes("(((4444{{{"));
    }
    public static boolean checkParantes(String s){
        boolean checkParantes = false;
        LinkedStack<Character> stack = new LinkedStack<Character>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '('){
                stack.push(c);
            }
            if (c == '{'){
                stack.push(c);
            }
            if (c == '['){
                stack.push(c);
            }
            if (c == ')'){
                if (stack.peek() == '('){
                    stack.pop();
                }
            }
            if (c == '}'){
                if (stack.peek() == '{'){
                    stack.pop();
                }
            }
            if (c == ']'){
                if (stack.peek() == '['){
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()){
            checkParantes = true;
        }
        if (!stack.isEmpty()){
            checkParantes = false;
        }
        return checkParantes;
    }
}
