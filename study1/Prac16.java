package study1;

class Pair<K, V> {
    private K k;
    private V v;

    public Pair (K k, V v){
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}

public class Prac16 {
    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("One", 1);
        Pair<Integer, String> pair2 = new Pair<>(2, "Two");
        System.out.println("Key: " + pair1.getK() + ", Value: " + pair1.getV());
        System.out.println("Key: " + pair2.getK() + ", Value: " + pair2.getV());
    }
}
