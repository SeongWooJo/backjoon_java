/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10773                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10773                          #+#        #+#      #+#    */
/*   Solved: 2025/09/16 21:29:54 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<Integer>();

        for(int i = 0; i < N; i++){
            int input = Integer.parseInt(br.readLine());
            if(input != 0) {
                st.push(input);
            } else {
                st.pop();
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}