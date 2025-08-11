/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 9063                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/9063                           #+#        #+#      #+#    */
/*   Solved: 2025/08/11 22:20:14 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int number = Integer.parseInt(br.readLine());

        int[][] points = new int[number][2];
        for(int i = 0; i < number; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }
        
        bw.write("" + get_ground(points));
        bw.flush();
        bw.close();
    }

    static int get_ground(int[][] points){
        int result = 0;
        int[] max_point = new int[2];
        int[] min_point = new int[2];

        for(int i = 0; i < 2; i++){
            max_point[i] = -10000;
            min_point[i] = 10000;
        }

        for(int[] point:points){
            for(int i = 0; i < 2; i++){
                if(point[i] > max_point[i]) max_point[i] = point[i];
                if(point[i] < min_point[i]) min_point[i] = point[i];
            }
        }

        result = (max_point[1] - min_point[1]) * (max_point[0] - min_point[0]);

        return result;
    }
}