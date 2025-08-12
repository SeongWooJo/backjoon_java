/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 14215                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/14215                          #+#        #+#      #+#    */
/*   Solved: 2025/08/12 19:33:48 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] lines = new int[3];
        for(int i = 0; i < 3; i++) lines[i] = Integer.parseInt(st.nextToken());
        		
        bw.write("" + get_boundary_size(lines));
        bw.flush();
        bw.close();
    }

    static int get_boundary_size(int[] lines){
        int result = 0;
        int max_line_size = 0;
        int max_idx = 0;
        for(int i = 0; i < 3; i++){
            int line = lines[i];
            if(max_line_size < line){
                max_line_size = line;
                max_idx = i;
            }
        }
        while(lines[max_idx] >= lines[(max_idx + 1) % 3] + lines[(max_idx + 2) % 3]){
            lines[max_idx] -= 1;
        }
        for(int i = 0; i < 3; i++) result+=lines[i];
        return result;
    }
}