/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 25192                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/25192                          #+#        #+#      #+#    */
/*   Solved: 2025/09/22 21:36:23 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<String>();
        int count = 0;
        for(int i = 0; i < N; i++){
            String input = br.readLine();
            if(input.equals("ENTER")){
                set = new HashSet<String>();
            } else {
                if(set.contains(input)){
                    continue;
                } else {
                    set.add(input);
                    count += 1;
                }
            }
        }
        
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}