/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 15894                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/15894                          #+#        #+#      #+#    */
/*   Solved: 2025/08/10 21:11:51 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		long number = Integer.parseInt(br.readLine());

        bw.write("" + (2 * (number * (number + 1)) - (number * (number - 1)) * 2));
        bw.flush();
        bw.close();
    }
}