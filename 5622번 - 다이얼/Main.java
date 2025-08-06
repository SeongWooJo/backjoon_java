/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 5622                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/5622                           #+#        #+#      #+#    */
/*   Solved: 2025/08/04 21:58:03 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        int sum = 0;
        for(var i=0; i<input.length(); i++){
            char target = input.charAt(i);
            if(target >= 'A') sum += 1;
            if(target >= 'D') sum += 1;
            if(target >= 'G') sum += 1;
            if(target >= 'J') sum += 1;
            if(target >= 'M') sum += 1;
            if(target >= 'P') sum += 1;
            if(target >= 'T') sum += 1;
            if(target >= 'W') sum += 1;
            sum += 2;
        }
        System.out.println(sum);
    }
}
