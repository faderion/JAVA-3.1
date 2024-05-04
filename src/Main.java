public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double HeightCM = 1.87; // Рост в см , дробное число
        int Weight = 98; // Масса в кг, целое число
        int index =   service.calculate(Weight , HeightCM); //
        System.out.println(index);
    }
}