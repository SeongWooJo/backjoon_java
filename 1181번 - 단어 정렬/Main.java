/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1181                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1181                           #+#        #+#      #+#    */
/*   Solved: 2025/08/21 22:28:00 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int number = Integer.parseInt(br.readLine());

        String[] inputs = new String[number];
        for(int i = 0; i < number; i++){
            inputs[i] = br.readLine();
        }

        Arrays.sort(inputs, new MyCompactor());

        StringBuilder sb = new StringBuilder();
        String previous = "";
        for(int i = 0; i < number; i++){
            if(previous.equals(inputs[i])) continue;
            else {
                previous = inputs[i];
                sb.append(inputs[i] + "\n");
            }
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}

class MyCompactor implements Comparator<String>{
    @Override
    public int compare(String o1, String o2){
        int len_o1 = o1.length();
        int len_o2 = o2.length();

        if(len_o1 != len_o2) return len_o1 - len_o2;
        return o1.compareTo(o2);
    }
}