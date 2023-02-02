public class BmiService {
    public float calculate(int x, double y) {
        float bmi = 0;
        if (x > 0) {
            bmi = (float) ((float) x / (y * y));
        }
        return (float) bmi;
    }
}
