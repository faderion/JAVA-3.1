public class BmiService {
    public int calculate(int weight, double heightCM) {  // Рост, вес
        double index = weight / heightCM / heightCM;
        return (int) index;
    }
}
