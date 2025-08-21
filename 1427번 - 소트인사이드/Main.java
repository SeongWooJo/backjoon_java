/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1427                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1427                           #+#        #+#      #+#    */
/*   Solved: 2025/08/21 20:36:14 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
        int number = Integer.parseInt(br.readLine());

        bw.write("" + sort_number(number));
        bw.flush();
        bw.close();
    }
    static int sort_number(int number){
        String str_number = String.valueOf(number);
        
        int length = str_number.length();
        Integer[] arr_numbers = new Integer[length];

        for(int i = 0; i < length; i++){
            arr_numbers[i] = str_number.charAt(i) - '0';
        }

        Arrays.sort(arr_numbers, new MyComparator());

        int sum = 0;
        for(Integer elem:arr_numbers) sum = sum * 10 + elem;

        return sum;
    }
}
class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
