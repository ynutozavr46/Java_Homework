package LB05;
public class Rhombus {
    public static void main(String[] args) {
        double diagonal1 = 6.0; // Довжина першої діагоналі
        double diagonal2 = 8.0; // Довжина другої діагоналі
        
        double area = calculateRhombusArea(diagonal1, diagonal2);
        System.out.println("Площа ромба: " + area);
    }
    
    public static double calculateRhombusArea(double diagonal1, double diagonal2) {
        double area = (diagonal1 * diagonal2) / 2;
        return area;
    }
}
