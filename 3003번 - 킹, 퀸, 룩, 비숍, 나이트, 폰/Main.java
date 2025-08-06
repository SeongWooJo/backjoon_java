/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 25083                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/25083                          #+#        #+#      #+#    */
/*   Solved: 2025/08/05 19:30:27 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input_arr = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for(var i=0; i< 6; i++){
            int number = Integer.parseInt(input_arr[i]);
            if(i < 2){ //king, queen
                sb.append((1-number) + " ");
            } else if (i >= 2 && i < 5){
                sb.append((2-number) + " ");
            } else {
                sb.append((8-number));
            }
            
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
