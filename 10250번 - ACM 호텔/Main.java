/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10250                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10250                          #+#        #+#      #+#    */
/*   Solved: 2025/08/22 23:55:53 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
			
            String[] input = br.readLine().split(" ");

			int H = Integer.parseInt(input[0]);
			int W = Integer.parseInt(input[1]);
			int N = Integer.parseInt(input[2]);
			
			if(N % H == 0) {
                sb.append(((H * 100) + (N / H)) + "\n");
			} else {
                sb.append(((N % H) * 100) + ((N / H) + 1)+ "\n");
			}
		}
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}