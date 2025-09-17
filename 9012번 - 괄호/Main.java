/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 9012                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/9012                           #+#        #+#      #+#    */
/*   Solved: 2025/09/16 21:40:33 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            String input = br.readLine();
            if(check_valid(input)) sb.append("YES\n");
            else sb.append("NO\n");
        }
        bw.write(sb.toString() + "");
        bw.flush();
        bw.close();
    }
    static boolean check_valid(String input) {
        Stack<Integer> st = new Stack<Integer>();

        for(char c : input.toCharArray()){
            if(c == '('){
                st.push(1);
            } else if(c == ')') {
                if(st.isEmpty()) return false;
                st.pop();
            }
        }
        if(st.isEmpty()) return true;
        else return false;
    }
}