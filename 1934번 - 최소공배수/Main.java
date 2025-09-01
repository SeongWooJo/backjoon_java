/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1934                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1934                           #+#        #+#      #+#    */
/*   Solved: 2025/09/01 21:54:43 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append(get_num(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())) + "\n");
        }
        
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }

    static int get_num(int a, int b){
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for(int count = 1; ;count++){
            if(((max * count) % min) == 0) return max * count;
        }
    }
}