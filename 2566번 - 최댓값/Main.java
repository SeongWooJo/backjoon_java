/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2566                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2566                           #+#        #+#      #+#    */
/*   Solved: 2025/08/06 21:15:31 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = -1;
        int max_y = 0, max_x = 0;

        for(var i = 0; i < 9; i++){
            String[] arr_str = br.readLine().split(" ");
            for(var j = 0; j < 9; j++){
                int target_num = Integer.parseInt(arr_str[j]);
                if(max < target_num) {
                    max = target_num;
                    max_y = i + 1;
                    max_x = j + 1;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();

        sb.append(max + "\n");
        sb.append(max_y + " " + max_x);
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}

