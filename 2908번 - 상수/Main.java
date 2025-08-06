/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2908                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2908                           #+#        #+#      #+#    */
/*   Solved: 2025/08/04 21:51:49 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input_arr = br.readLine().split(" ");
        String temp = "";
        for(var i=2; i >= 0; i--) temp+=input_arr[0].charAt(i);
        int a = Integer.parseInt(temp);
        temp="";
        for(var i=2; i >= 0; i--) temp+=input_arr[1].charAt(i);
        int b = Integer.parseInt(temp);
        System.out.print(Math.max(a, b));
    }
}
