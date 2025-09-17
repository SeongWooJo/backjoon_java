/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 4949                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/4949                           #+#        #+#      #+#    */
/*   Solved: 2025/09/16 21:53:02 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        StringBuilder sb = new StringBuilder();
        for(String input = br.readLine(); !input.equals("."); input = br.readLine()){
            if(check_valid(input)) sb.append("yes\n");
            else sb.append("no\n");
        }
        bw.write(sb.toString().trim() + "");
        bw.flush();
        bw.close();
    }
    static boolean check_valid(String input) {
        Stack<Integer> st = new Stack<Integer>();
  
        for(char c : input.toCharArray()){
            if(c == '('){
                st.push(1);
            } else if(c == ')') {
                if(st.isEmpty() || st.pop() != 1) return false;
            }
            if(c == '[') {
                st.push(2);
            } else if(c == ']'){
                if(st.isEmpty() || st.pop() != 2) return false;
            }
            else if(c == '.') if(st.isEmpty()) return true; 
        }
        return false;
    }
}