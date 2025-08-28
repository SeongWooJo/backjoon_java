/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1620                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1620                           #+#        #+#      #+#    */
/*   Solved: 2025/08/28 23:00:26 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Set<String> set = new LinkedHashSet<String>();


        for(int i = 0; i < N; i++){
            set.add(br.readLine());
        }

        ArrayList<String> document = new ArrayList<String>(set);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            String input = br.readLine();
            if(input.chars().allMatch(Character::isDigit)){
                sb.append(document[Integer.parseInt(input)] + "\n");
            } else {
                sb.append(document.indexOf(input) + "\n")
            }
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}