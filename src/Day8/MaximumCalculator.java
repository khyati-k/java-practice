public class MaximumCalculator<T extends Number>{
    public T getMax(T n, T m) {
        if (n.doubleValue() < m.doubleValue()) {
            return m;
        } else {
            return n;
        }
    }
    public static void main(String[] args) {
        MaximumCalculator<Integer> maxCalc1 = new MaximumCalculator<>();
        maxCalc1.getMax(1,2);
        MaximumCalculator<Double> maxCalc2 = new MaximumCalculator<>();
        maxCalc2.getMax(1.0,2.0);
    }
}