/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2745                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2745                           #+#        #+#      #+#    */
/*   Solved: 2025/08/06 23:14:25 by abc8325767    ###          ###   ##.kr    */
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
        
        int sum = 0;
        int times = Integer.parseInt(arr_str[1]);
        for(var i = 0; i < arr_str[0].length(); i++){
            char target = arr_str[0].charAt(i);
            if(target >= 'A'){
                sum = sum * times + (target - 'A' + 10);
            } else {
                sum = sum * times + (target - '0');
            }
        }

        bw.write(""+ sum);
        bw.flush();
        bw.close();
    }
}

