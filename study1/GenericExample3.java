package study1;

import java.util.ArrayList;

public class GenericExample3 {

    //와일드카드
    public void processList(ArrayList<? extends Number> list) {
        for(Number num : list){
            System.out.println(num);
        }
    }

    // 타입파라미터
    // public 뒤에 붙는 제네릭은 이 메서드에 들어갈 파라미터를 선언할 때 어떤 타입으로 선언해야하는지 알려주는 것
    // 이 제네릭을 안 쓰면 파라미터에 들어가는 arraylist의 제네릭에 T를 사용할 수 없음
    public <T extends Number> void addToNumberList (ArrayList<T> list, T item) {
        list.add(item);
        System.out.println(list);
    }

    // ? super T
    public  void processList2(ArrayList<? super Integer> list) {
        list.add(1); // super 숫자타입을 넣어주지 않으면 add 불가눙

    }
    public static void main(String[] args) {
        GenericExample3 example = new GenericExample3();
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);
        
        // 와일드카드 <? extends T> 은 읽기전용으로 주로 사용
        example.processList(integerList);
        example.processList(doubleList);

        example.addToNumberList(integerList, 4);
        example.addToNumberList(doubleList, 4.4);

        // 와일드카드 <? super T> 는 쓰기 전용으로 주로 사용
        ArrayList<Number> numbers = new ArrayList<>();
        example.processList2(numbers);
        System.out.println(numbers);
        
        // 와일드카드 주의사항
        // 1. 복잡성  : 와일드카드를 과도하게 사용하게 되면 복잡성이 증가하며, 협업에 알맞지않음
        // 2. 제한된 작업 : "? extends T" 같은 경우 새로운 요소 추가 불가능
    }
}
