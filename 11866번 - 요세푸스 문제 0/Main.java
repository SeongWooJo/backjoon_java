/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11866                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11866                          #+#        #+#      #+#    */
/*   Solved: 2025/09/18 18:58:32 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<Integer>();

        for(int i = 1; i <= N; i++) queue.add(i);
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(;;){
            for(int j = 0; j < K - 1; j++){
                int target = queue.poll();
                queue.add(target);
            }
            sb.append(queue.poll());
            if(queue.isEmpty()) {
                sb.append(">");
                break;
            } else {
                sb.append(", ");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}