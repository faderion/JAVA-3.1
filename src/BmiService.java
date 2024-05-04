public class BmiService {
    public int calculate (int Weight , double HeightCM ){  // Рост, вес
        double index =   Weight / HeightCM  / HeightCM ;
        return (int) index;
    }
}
