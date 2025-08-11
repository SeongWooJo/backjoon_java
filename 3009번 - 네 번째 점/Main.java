/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 3009                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/3009                           #+#        #+#      #+#    */
/*   Solved: 2025/08/10 20:17:53 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int[][] coords = new int[3][2];
        for(int i = 0; i < 3 ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            coords[i][0] = Integer.parseInt(st.nextToken()); 
            coords[i][1] = Integer.parseInt(st.nextToken()); 
        }
        
        int[] coord = get_coord(coords);

        StringBuilder sb = new StringBuilder();

        for(int elem:coord){
            sb.append(elem + " ");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }

    static int[] get_coord(int[][] coords){
        int[] result_coord = new int[2];

        for(int i = 0; i < 2; i++){
            if(coords[0][i] == coords[1][i]) {
                result_coord[i] = coords[2][i];
            } else if(coords[0][i] == coords[2][i]) {
                result_coord[i] = coords[1][i];
            } else {
                result_coord[i] = coords[0][i];
            }
        }
        
        return result_coord;
    }
}