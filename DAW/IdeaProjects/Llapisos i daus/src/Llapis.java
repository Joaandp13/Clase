public class Llapis implements Comparable<Llapis>{
    @Override
    public int compareTo(Llapis o) {
        return 0;
    }
    /**
     * Implementem la interfície Comparable, ja que la classe Llapis farà servir un mètode compareTo implementat
     * Comparable és una interfície genèrica:
     * public interface Comparable<T> {
     *     int compareTo(T o);
     * }
     * però nosaltres volem comparar Llapis, per això fem Comparable<Llapis>
     * */

}