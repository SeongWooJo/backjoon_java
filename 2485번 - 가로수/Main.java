/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2485                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2485                           #+#        #+#      #+#    */
/*   Solved: 2025/09/03 21:48:58 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<Integer>();
        
        int start = 0;
        int previous = 0;
        for(int i = 0; i < N; i++){
            int input = Integer.parseInt(br.readLine());
            if(i > 0) set.add(input - previous);
            else start = input;
            previous = input;
        }
        
        Integer[] array = set.toArray(new Integer[set.size()]);
        Arrays.sort(array, Collections.reverseOrder());

        int gcd = 0;
        for(int elem : array) {
            if(gcd == 0) gcd = elem;
            else gcd = gcd(gcd, elem);
        }
        
        int count = 0;
        for(int i = start; i <= previous; i += gcd){
            count += 1;
        }

        bw.write(count - N + "");
        bw.flush();
        bw.close();
    }

    static int gcd(int A, int B) {
        if(A % B == 0) return B;
        else return gcd(B, A % B);
    }
}
