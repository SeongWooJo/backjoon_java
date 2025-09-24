/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 24060                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/24060                          #+#        #+#      #+#    */
/*   Solved: 2025/09/23 22:26:18 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        mergeSort m = new mergeSort(arr, K);

        bw.write(m.result + "");
        bw.flush();
        bw.close();
    }
}

class mergeSort{
    int[] arr;
    int target_count;
    int count = 0;
    int result = -1;

    mergeSort(int[] arr, int count){
        this.arr = arr;
        this.target_count = count;
        do_mergeSort(0, arr.length - 1);
    }

    void merge(int start, int between, int end){
        int t1 = start;
        int t2 = between + 1;
        int[] tmp = new int[end-start + 1];
        int t = 0;
        while((t1 <= between) && (t2 <= end)){
            if(this.arr[t1] <= this.arr[t2]){
                tmp[t++] = this.arr[t1++]; 
            } else {
                tmp[t++] = this.arr[t2++];
            }
        }
        while(t1 <= between){
            tmp[t++] = this.arr[t1++];
        }
        while(t2 <= end){
            tmp[t++] = this.arr[t2++];
        }
        t = 0;
        for(int i = start; i <= end; i++){
            this.arr[i] = tmp[t++];
            this.count += 1;
            if(this.count == this.target_count) {
                this.result = this.arr[i];
            }
        }
    }
    void do_mergeSort(int start, int end){
        if(this.result != -1) return;
        if(start < end){
            int between = (start+end)/2;
            do_mergeSort(start, between);
            do_mergeSort(between+1, end);
            merge(start, between, end);
        }
    }
}