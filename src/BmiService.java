public class BmiService {
    public int calculate(double meter, int kilogram) {
        int index;
        index = (int) (kilogram / (meter * meter));
        return (int) index;
    }
}
