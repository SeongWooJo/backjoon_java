/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 12789                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/12789                          #+#        #+#      #+#    */
/*   Solved: 2025/09/17 19:51:42 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(br.readLine());
        int[] input = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        
        if(check_valid(input)) bw.write("Nice");
        else bw.write("Sad");
        bw.flush();
        bw.close();
    }

    static boolean check_valid(int[] input){
        Stack<Integer> st = new Stack<Integer>();
        
        int previous = 0;

        for(int elem : input){
            if(elem == previous + 1) {
                previous += 1;
                continue;
            }
            while(!st.isEmpty() && st.peek() == previous + 1) {
                previous += 1;
                if(st.isEmpty()) break;
                else st.pop();
            }
            st.push(elem);
        }
        while(!st.isEmpty() && st.peek() == previous + 1) {
            previous += 1;
            if(st.isEmpty()) break;
            else st.pop();
        }
        if(st.isEmpty()) return true;
        else return false;
    }
}