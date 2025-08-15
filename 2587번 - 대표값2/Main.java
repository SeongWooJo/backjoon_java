/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2587                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2587                           #+#        #+#      #+#    */
/*   Solved: 2025/08/15 21:54:26 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        Integer[] numbers = new Integer[5];
        int mean = 0;
        for(int i = 0; i < 5; i++){
            numbers[i] = Integer.parseInt(br.readLine());
            mean += numbers[i];
        }

        Arrays.sort(numbers, new MyComparator());
        
        bw.write(mean / 5 + "\n");
        bw.write(numbers[2] + "");
        bw.flush();
        bw.close();
    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
