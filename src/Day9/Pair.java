package Day9;

public class Pair<T1, T2> {
    private T1 first;
    private T2 second;
    public Pair(T1 first,T2 second) {
        this.first = first;
        this.second = second;
    }
    public Pair(Pair<? extends T1, ? extends T2> other) {
    // public Pair(Pair<T1, T2> other) {
        // this.first = this.getFirst();
        // this.second = this.getSecond()
        this(other.first, other.second);
    }
    public T1 getFirst() {
        return first;
    }
    public T2 getSecond() {
        return second;
    }
    public Pair<T2, T1> swap() {
        return new Pair<>(second, first);
    }
}