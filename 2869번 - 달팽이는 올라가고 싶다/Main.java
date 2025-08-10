/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2869                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2869                           #+#        #+#      #+#    */
/*   Solved: 2025/08/08 19:35:02 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] arr_str = br.readLine().split(" ");
        int A = Integer.parseInt(arr_str[0]);
        int B = Integer.parseInt(arr_str[1]);
        int V = Integer.parseInt(arr_str[2]);
        
        int count = (V-A) % (A-B) == 0 ? ((V-A) / (A-B)) + 1 : ((V-A) / (A-B) + 1) + 1;
        
        bw.write(""+count);
        bw.flush();
        bw.close();
    }
}