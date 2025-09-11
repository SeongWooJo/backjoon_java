/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 4948                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/4948                           #+#        #+#      #+#    */
/*   Solved: 2025/09/12 00:17:39 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        StringBuilder sb = new StringBuilder();
        for(int input = -1;(input=Integer.parseInt(br.readLine()))!=0;){
            int output = check_demical_num(input);
            sb.append(output + "\n");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }

    static int check_demical_num(int N) {
        int result_num = 0;

        for(int i = N + 1; i <= 2*N; i++){
            if(check_demical(i)) result_num += 1;
        }
        return result_num;
    }

    static boolean check_demical(int num){
        if(num == 1) return false;
        if((num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0) || (num % 7 == 0)){
            if((num == 2) || (num == 3) || (num == 5) || (num == 7)) return true;
            else return false;
        }
        int limit = (int) Math.sqrt(num);
        for(int i = 10; i <= limit; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}