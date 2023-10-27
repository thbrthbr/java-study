package study1;

import java.util.*;
import java.util.Scanner;

public class Prac18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름과 나이를 입력해주세요");
        Map<String, Integer> hashMap = new HashMap<>();
        while(true){
            String name = scanner.next();
            if(name.equals("종료")){
                break;
            }
            int age = scanner.nextInt();
            hashMap.put(name, age);
        }
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        scanner.close();
    }
}
