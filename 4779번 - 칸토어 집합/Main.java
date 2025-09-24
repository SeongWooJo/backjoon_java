/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 4779                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/4779                           #+#        #+#      #+#    */
/*   Solved: 2025/09/23 23:21:48 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input;
        StringBuilder sb = new StringBuilder();
        while((input = br.readLine()) != null){
            int N = Integer.parseInt(input);
            칸토어 k = new 칸토어(N);
            sb.append(k.result).append("\n");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}

class 칸토어{
    String result = "-";
    int count = 0;
    int target_num;
    칸토어(int N){
        target_num = N;
        make_result();
    }

    void make_result(){
        if(this.count == this.target_num){
            return;        
        } else {
            result = result + " ".repeat((int) Math.pow(3, this.count)) + result;
            this.count += 1;
            make_result();
        }
    }
}