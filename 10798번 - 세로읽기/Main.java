/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10798                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10798                          #+#        #+#      #+#    */
/*   Solved: 2025/08/06 21:35:25 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] words = new int[5][15];
        Loop:
        for(var i = 0; i < 5; i++){
            var j = 0;
            for(j = 0; j < 17; j++){
                int target = br.read();
                if(target == '\r') continue;
                if(target == '\n') break;
                if(target == -1) break Loop;
                words[i][j] = (char) target;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(var j = 0; j < 15; j++){
            for(var i = 0; i < 5; i++){
                if(words[i][j] == 0) continue;
                sb.append((char) words[i][j]);
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

