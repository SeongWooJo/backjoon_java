/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1037                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1037                           #+#        #+#      #+#    */
/*   Solved: 2025/09/22 21:31:29 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(br.readLine());
        if(N == 1){
            int M = Integer.parseInt(br.readLine());
            bw.write(M * M + "");
        } else {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int max = 1;
            int min = 1000000;
            for(int i = 0; i < N; i++){
                int input = Integer.parseInt(st.nextToken());
                if(input > max) max = input;
                if(input < min) min = input;
            }
            bw.write(min * max + "");
        }
        bw.write("");
        bw.flush();
        bw.close();
    }
}