/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2164                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2164                           #+#        #+#      #+#    */
/*   Solved: 2025/09/18 18:50:01 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i = 1; i <= N; i++){
            queue.add(i);
        }

        int count = 0;
        for(;queue.size() > 1;) {
            if(count % 2 == 0){
                queue.poll();
            } else {
                int target = queue.poll();
                queue.add(target);
            }
            count += 1;
        }

        bw.write(queue.poll() + "");
        bw.flush();
        bw.close();
    }
}