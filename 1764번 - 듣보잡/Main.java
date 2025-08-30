/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1764                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1764                           #+#        #+#      #+#    */
/*   Solved: 2025/08/30 18:37:14 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Set<String> nohearSet = new HashSet<String>();
        Set<String> noseeSet = new HashSet<String>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            String input = br.readLine();
            nohearSet.add(input);
        }

        for(int i = 0; i < M; i++){
            String input = br.readLine();
            noseeSet.add(input);
        }

        nohearSet.retainAll(noseeSet);
        
        int result_size = nohearSet.size();
        String[] result = nohearSet.toArray(new String[result_size]);
        
        Arrays.sort(result);

        StringBuilder sb = new StringBuilder();
        sb.append(result_size + "\n");
        for(String elem : result) {
            sb.append(elem + "\n");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}