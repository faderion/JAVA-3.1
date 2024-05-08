public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightCM = 1.87; // Рост в метрах , дробное число
        int weight = 98; // Масса в кг, целое число
        int index = service.calculate(weight, heightCM); //
        System.out.println(index);
    }
}