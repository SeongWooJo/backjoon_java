/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10814                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10814                          #+#        #+#      #+#    */
/*   Solved: 2025/08/21 22:47:16 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(br.readLine());
        Customer[] customers = new Customer[N];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            customers[i] = new Customer(age, name);
        }

        Arrays.sort(customers);
        StringBuilder sb = new StringBuilder();
        for(Customer elem:customers){
            sb.append(elem.age + " " + elem.name + "\n");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}

class Customer implements Comparable<Customer> {
    int age;
    String name;

    Customer(int age, String name){
        this.age = age;
        this.name = name;
    }
    // 정렬 기준 정의 (예: id 기준 오름차순)
    
    @Override
    public int compareTo(Customer other) {
        return this.age - other.age;
    }
}

class MyCompactor implements Comparator<Customer>{
    @Override
    public int compare(Customer c1, Customer c2){
        return c1.age - c2.age;
    }
}