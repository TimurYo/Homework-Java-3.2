public class Main {
    public static void main (String[] args) {
        BmiService service= new BmiService();
        int weight = 65;
        double height = 1.65 ;
        double bmi = service.calculate(weight, height);
        System.out.print(bmi);
    }
}