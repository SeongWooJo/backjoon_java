/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 5073                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/5073                           #+#        #+#      #+#    */
/*   Solved: 2025/08/12 19:15:40 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] lines = new int[3];
            for(int i = 0; i < 3; i++){
                lines[i] = Integer.parseInt(st.nextToken());
            }
            if(lines[0] == 0) break;
            sb.append(check_option(lines) + "\n");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }

    static String check_option(int[] lines){
        int same_count = 0;
        boolean valid = true;
        for(int i = 0; i < 3; i++) {
            if(lines[i % 3] == lines[(i+1) % 3]) same_count+=1;
            if(lines[i % 3] >= lines[(i+1) % 3] + lines[(i+2) % 3]){
                valid = false;
            }
        }
        if(!valid) return "Invalid";

        if(same_count == 3){
            return "Equilateral";   
        } else if(same_count > 0){
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}