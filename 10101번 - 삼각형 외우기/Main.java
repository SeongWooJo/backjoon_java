/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10101                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10101                          #+#        #+#      #+#    */
/*   Solved: 2025/08/11 23:01:14 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int[] degrees = new int[3];
        for(int i = 0; i < 3; i++){
            degrees[i] = Integer.parseInt(br.readLine());
        }

        bw.write(check_option(degrees));
        bw.flush();
        bw.close();
    }
    static String check_option(int[] degrees){
        String result;
        int sum = 0;
        for(int degree : degrees){
            sum+=degree;    
        }
        
        if(sum == 180) {
            int same_count = 0;
            for(int i = 0; i < 3; i++) if(degrees[i % 3] == degrees[(i + 1) % 3]) same_count += 1;
            if(same_count == 3){
                result = "Equilateral";
            } else if(same_count > 0) {
                result = "Isosceles";
            } else {
                result = "Scalene";
            }

        } else {
            result = "Error";
        }
        return result;
    }
}