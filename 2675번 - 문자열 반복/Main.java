/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2675                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2675                           #+#        #+#      #+#    */
/*   Solved: 2025/08/04 11:57:43 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int num = Integer.parseInt(str);
        String result = "";
        for(var i = 0; i<num; i++){
            String[] arr_str = br.readLine().split(" ");
            int iter = Integer.parseInt(arr_str[0]);
            
            for(var j = 0; j < arr_str[1].length(); j++) {    
                for(var k = 0; k < iter; k++){
                    result += arr_str[1].charAt(j);
                }
            } 
            result += "\n";
        }
        System.out.print(result);
    }
}
