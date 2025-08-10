/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 24266                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/24266                          #+#        #+#      #+#    */
/*   Solved: 2025/08/08 23:49:08 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************* */

import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        
        bw.write(n*n*n + "\n");
        bw.write(3 + "");
        bw.flush();
        bw.close();
    }
}