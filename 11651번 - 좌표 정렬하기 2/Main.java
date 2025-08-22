/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11651                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11651                          #+#        #+#      #+#    */
/*   Solved: 2025/08/21 21:41:08 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[][] points = new int[N][2];

        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            points[i][0] = Integer.parseInt(input[0]);
            points[i][1] = Integer.parseInt(input[1]);
        }
        int[][] result = sort_points(points);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            sb.append(result[i][0] + " " + result[i][1] + "\n");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }

    static int[][] sort_points(int[][] points){
        Integer[][] obj_points = new Integer[points.length][points[0].length];
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points[0].length; j++){
                obj_points[i][j] = Integer.valueOf(points[i][j]);
            }
        }

        Arrays.sort(obj_points, new MyCompactor());

        int[][] result = new int[points.length][points[0].length];
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points[0].length; j++){
                result[i][j] = obj_points[i][j].intValue();
            }
        }
        return result;
    }
}

class MyCompactor implements Comparator<Integer[]>{
    @Override
    public int compare(Integer[] o1, Integer[] o2){
        Integer high = o1[1] - o2[1];
        if(high == 0) return o1[0] - o2[0];
        else return high;
    }
}

