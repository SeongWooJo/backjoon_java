/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11478                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11478                          #+#        #+#      #+#    */
/*   Solved: 2025/09/01 21:44:45 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        String input = br.readLine();
        int length = input.length();
        Set<String> set = new HashSet<String>();

        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(j + i < length) set.add(input.substring(j, j+i+1));
            }
        }

        bw.write(set.size() + "");
        bw.flush();
        bw.close();
    }
}