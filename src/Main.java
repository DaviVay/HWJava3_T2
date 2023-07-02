public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double meter = 1.63;
        int kilogram = 56;
        int index = service.calculate(meter, kilogram);
        System.out.println(index);
    }
}
