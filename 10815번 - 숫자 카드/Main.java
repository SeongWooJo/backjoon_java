/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10815                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10815                          #+#        #+#      #+#    */
/*   Solved: 2025/08/23 21:29:55 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());

        Set<Long> set_sanggeun = new HashSet<Long>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) set_sanggeun.add(Long.parseLong(st.nextToken()));
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            Long input = Long.parseLong(st.nextToken());
            if(set_sanggeun.contains(input)) {
                sb.append(1 + " ");
            } else {
                sb.append(0 + " ");
            }
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}