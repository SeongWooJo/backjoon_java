/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2720                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2720                           #+#        #+#      #+#    */
/*   Solved: 2025/08/07 00:07:50 by abc8325767    ###          ###   ##.kr    */
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
        
        for(var i = 0; i < number; i++){
            int sum = Integer.parseInt(br.readLine());
            int Quater = sum / 25;
            sum %= 25;
            int Dime = sum / 10;
            sum %= 10;
            int Nickel = sum / 5;
            sum %= 5;
            int Penny = sum;
            bw.write(Quater + " " + Dime + " " + Nickel + " " + Penny);
            if(i < number - 1) bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}

