/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10816                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10816                          #+#        #+#      #+#    */
/*   Solved: 2025/08/29 23:34:37 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int N = Integer.parseInt(br.readLine());
        
        Map<Integer, Integer> numberToCount = new HashMap<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int input = Integer.parseInt(st.nextToken());
            Integer value = numberToCount.get(input);
            if(value == null){
                numberToCount.put(input, 1);
            } else {
                numberToCount.put(input, value + 1);
            }
        }
        
        int M = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            int input = Integer.parseInt(st.nextToken());
            Integer value = numberToCount.get(input);
            if(value == null){
                sb.append(0 + " ");
            } else {
                sb.append(value + " ");
            }
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}