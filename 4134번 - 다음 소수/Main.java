/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 4134                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/4134                           #+#        #+#      #+#    */
/*   Solved: 2025/09/04 20:50:30 by abc8325767    ###          ###   ##.kr    */
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
        for(int i = 0; i < N; i++) {
            long input = Long.parseLong(br.readLine());
            Loop:
            for(long j = input; ; j++){
                if(j == 2 || j == 3){
                    sb.append(j + "\n");
                    break;
                }
                else
                { 
                    for(long k = 2; k <= Math.sqrt(j); k++){
                        if(j % k == 0) continue Loop;
                    }
                    sb.append(j + "\n");
                    break;
                }
            }
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}