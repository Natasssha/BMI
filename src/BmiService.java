public class BmiService {
    public double calculate(double height, double weight) {
        double height2 = height * height;
        double bodyMassIndex = weight / height2;


        return bodyMassIndex;
    }


}





