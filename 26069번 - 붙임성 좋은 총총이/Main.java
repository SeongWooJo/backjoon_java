/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 26069                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/26069                          #+#        #+#      #+#    */
/*   Solved: 2025/09/22 21:40:08 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        HashSet<String> set = new HashSet<String>();

        set.add("ChongChong");

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input1 = st.nextToken();
            String input2 = st.nextToken();

            if(set.contains(input1) | set.contains(input2)){
                set.add(input1);
                set.add(input2);
            }
        }
        bw.write(set.size() + "");
        bw.flush();
        bw.close();
    }
}