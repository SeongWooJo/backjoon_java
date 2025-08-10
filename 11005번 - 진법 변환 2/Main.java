/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11005                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11005                          #+#        #+#      #+#    */
/*   Solved: 2025/08/06 23:32:13 by abc8325767    ###          ###   ##.kr    */
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

        int number = Integer.parseInt(arr_str[0]);
        int times = Integer.parseInt(arr_str[1]);
        
        StringBuilder sb = new StringBuilder();

        while(number != 0) {
            int remain = number % times;
            if(number >= times){
                number = number / times;
            } else {
                number = 0;
            }
            if(remain > 9) {
                sb.append((char) (remain - 10 + 'A'));
            } else {
                sb.append((char) (remain + '0'));
            }
        }

        bw.write(sb.reverse().toString());
        bw.flush();
        bw.close();
    }
}

