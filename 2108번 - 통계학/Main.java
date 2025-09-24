/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2108                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2108                           #+#        #+#      #+#    */
/*   Solved: 2025/09/22 21:44:00 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] numbers = new int[8001];

        for(int i = 0; i < N; i++){
            int input = Integer.parseInt(br.readLine());
            numbers[input + 4000] += 1;
        }

        int count = 0;
        long sum = 0;
        int median = 4001;
        boolean[] modes = new boolean[8001];
        int max_count = 0;
        
        int min = 4001;
        int max = 0;
        for(int i = 0; i < 8001; i++){
            if(numbers[i] == 0) {
                continue;
            } else {
                if(min == 4001) min = i - 4000;
                max = i - 4000;
                sum += numbers[i] * (i - 4000);
                count += numbers[i];
                if((median == 4001) && (count > N / 2)){
                    median = i - 4000;
                }

                if(max_count < numbers[i]){
                    modes = new boolean[8001];
                    modes[i] = true;
                    max_count = numbers[i];
                } else if(max_count == numbers[i]){
                    modes[i] = true;
                }
            }
        }
        long average = Math.round((double) sum / (double) N);

        int mode = 9999;
        for(int i = 0; i < 8001; i++){
            if(modes[i] == true) {
                if(mode == 9999) mode = i - 4000;
                else {
                    mode = i - 4000;
                    break;
                }
            }
        }
        bw.write(average + "\n" + median + "\n" + mode + "\n" + (max - min) + "");
        bw.flush();
        bw.close();
    }

}