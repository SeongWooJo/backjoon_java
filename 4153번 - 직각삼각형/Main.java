/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 4153                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/4153                           #+#        #+#      #+#    */
/*   Solved: 2025/08/21 23:00:09 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] lines = new int[3];
            int max_idx = 0;
            for(int i = 0; i < 3; i++) {
                lines[i] = Integer.parseInt(st.nextToken());
                if(lines[max_idx] < lines[i]) max_idx = i;
            }
            if(lines[0] == 0) break;
            else {
                if(lines[max_idx] * lines[max_idx] == (lines[(max_idx+1) % 3]*lines[(max_idx+1) % 3] + lines[(max_idx+2) % 3] * lines[(max_idx+2) % 3])){
                    sb.append("right\n");
                } else {
                    sb.append("wrong\n");
                }
            }
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}