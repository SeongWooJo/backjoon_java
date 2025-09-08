/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1929                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1929                           #+#        #+#      #+#    */
/*   Solved: 2025/09/08 19:34:16 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        for(int i = M; i <= N; i++){
            
            if(check_decimal(i)) {
                sb.append(i + "\n");
            }
        }
        
        bw.write(sb.toString().trim() + "");
        bw.flush();
        bw.close();
    }
    static boolean check_decimal(int i){
        if (i == 1) return false;
        if ((i == 2) || (i == 3)) return true;
        if ((i & 1) == 0) return false; // 짝수 컷
        int limit = (int) Math.sqrt(i);
        for(int j = 3; j <= limit; j+=2){
            if(i % j == 0) return false;
        }
        return true;
    }
}