/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 5086                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/5086                           #+#        #+#      #+#    */
/*   Solved: 2025/08/08 20:19:09 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = -1;
        int b = -1;

        a = Math.max(a, b);
        
        StringBuilder sb = new StringBuilder();

        while(true){
            String[] str_arr = br.readLine().split(" ");
            a = Integer.parseInt(str_arr[0]);
            b = Integer.parseInt(str_arr[1]);
            
            if((a == 0) && (b == 0)) break;

            if(b % a == 0){
                sb.append("factor\n");
            } else if(a % b == 0){
                sb.append("multiple\n");
            } else {
                sb.append("neither\n");
            }
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}