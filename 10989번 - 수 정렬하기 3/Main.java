/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10989                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10989                          #+#        #+#      #+#    */
/*   Solved: 2025/08/21 20:27:45 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] counts = new int[10000];

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            counts[Integer.parseInt(br.readLine()) - 1] += 1;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 10000; i++){
            if(counts[i] > 0){
                counts[i] -= 1;
                sb.append(i+1 + "\n");
                i -= 1;
            }
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }   
}


