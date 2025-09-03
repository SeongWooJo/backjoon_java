/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1735                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1735                           #+#        #+#      #+#    */
/*   Solved: 2025/09/03 21:34:23 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());

        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        
        int low = lcm(B, D);
        int high = A * (low / B) + C * (low / D);

        int gcd = gcd(low, high);

        bw.write(high / gcd + " " + low / gcd);
        bw.flush();
        bw.close();
    }
    
    static int lcm(int A, int B) {
        return Math.abs(A * B) / gcd(A, B);
    }
    static int gcd(int A, int B) {
        if(A % B == 0) return B;
        else return gcd(B, A % B);
    }
}
