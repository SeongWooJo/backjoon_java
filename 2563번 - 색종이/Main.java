/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2563                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2563                           #+#        #+#      #+#    */
/*   Solved: 2025/08/06 23:09:29 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int num = Integer.parseInt(line);

        int[][] array = new int[100][100];
        
        for(var i = 0; i < num; i++){
            String[] arr_str = br.readLine().split(" ");
            int x = Integer.parseInt(arr_str[0]);
            int y = Integer.parseInt(arr_str[1]);
            
            for(var j = 0; j < 10; j++){
                Arrays.fill(array[j + y - 1], x-1, x+9, 1);
            }
        }

        int sum = 0;
        for(var i = 0; i < 100; i++){
            for(var j = 0; j < 100; j++){
                sum += array[i][j]; 
            }
        }

        bw.write(""+ sum);
        bw.flush();
        bw.close();
    }
}

