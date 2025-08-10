/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1193                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1193                           #+#        #+#      #+#    */
/*   Solved: 2025/08/07 00:40:43 by abc8325767    ###          ###   ##.kr    */
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

        int number = Integer.parseInt(br.readLine());
        
        int value = 1;
        while(number > (value) * (value + 1) / 2 ){
            value += 1;
        }
        int count = number - (value - 1) * value / 2;
        
        if(value % 2 == 0){
            bw.write(""+count+"/"+(value-count+1));
        } else {
            bw.write(""+(value-count+1)+"/"+count);
        }
        bw.flush();
        bw.close();
    }
}

