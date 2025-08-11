/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1085                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1085                           #+#        #+#      #+#    */
/*   Solved: 2025/08/10 19:35:52 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);
        

        bw.write("" + dis_boundary(x, y, w, h));
        bw.flush();
        bw.close();
    }

    static int dis_boundary(int x, int y, int w, int h){
        int distance = 1000;

        distance = Math.min(distance, x);
        distance = Math.min(distance, y);
        
        distance = Math.min(distance, w - x);
        distance = Math.min(distance, h - y);

        return distance;
    }
}