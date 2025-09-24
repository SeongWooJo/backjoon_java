/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1010                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1010                           #+#        #+#      #+#    */
/*   Solved: 2025/09/22 21:08:19 by abc8325767    ###          ###   ##.kr    */
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
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long N = Long.parseLong(st.nextToken());
            long M = Long.parseLong(st.nextToken());
            sb.append(nCk(M, N)).append("\n");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }

    static long nCk(long n, long k){
        long target = k > n-k ? k : n-k;
        return n2k(n, target) / n2k(n-target, 1);
    }

    static long n2k(long n, long k){
        if(n <= k) return 1;
        else return n * n2k(n-1, k);
    }
}