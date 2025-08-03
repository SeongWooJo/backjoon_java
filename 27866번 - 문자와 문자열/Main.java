/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 27866                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/27866                          #+#        #+#      #+#    */
/*   Solved: 2025/08/03 23:44:28 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        String str2 = br.readLine();
        
        int num = Integer.parseInt(str2);

        System.out.print(str.charAt(num-1));
    }
}
