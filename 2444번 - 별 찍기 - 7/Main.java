/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2444                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2444                           #+#        #+#      #+#    */
/*   Solved: 2025/08/05 19:45:24 by abc8325767    ###          ###   ##.kr    */
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

        StringBuilder sb = new StringBuilder();

        for(var i = 1; i<=number; i++) {
            for(var j = i; j < number; j++)sb.append(" ");
            for(var j = 1; j < i; j++) sb.append("*");
            sb.append("*");
            for(var j = 1; j < i; j++) sb.append("*");
            sb.append("\n");
        }
        for(var i = number-1; i>0; i--) {
            for(var j = i; j < number; j++) sb.append(" ");
            for(var j = 1; j < i; j++) sb.append("*");
            sb.append("*");
            for(var j = 1; j < i; j++) sb.append("*");
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

