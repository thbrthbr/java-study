package study1;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prac17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력해주세요");
        Set<Integer> hashSet = new HashSet<>();
        while(true){
            int word = scanner.nextInt();
            if(word == -1){
                break;
            }
            hashSet.add(word);
        }
        System.out.println(hashSet);
        scanner.close();
    }
}
