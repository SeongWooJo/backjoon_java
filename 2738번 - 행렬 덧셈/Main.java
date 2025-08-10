/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2738                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2738                           #+#        #+#      #+#    */
/*   Solved: 2025/08/06 20:57:16 by abc8325767    ###          ###   ##.kr    */
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

        String[] arr_str = br.readLine().split(" ");
        int N = Integer.parseInt(arr_str[0]);
        int M = Integer.parseInt(arr_str[1]);
        
        int[][] sum_matrix = new int[N][M];

        for(var i = 0; i < N * 2; i++){
            String[] arr_str2 = br.readLine().split(" ");
            for(var j = 0; j < M; j++){
                sum_matrix[i % N][j] += Integer.parseInt(arr_str2[j]);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(var i = 0; i < N; i++){
            for(var j = 0; j < M; j++){
                sb.append(sum_matrix[i][j]);
                if(j < M-1) sb.append(" ");
            }
            if(i < N-1) sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

