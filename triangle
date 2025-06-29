public class Triangle {
    double a;
    double b;
    
    public Triangle(double a1, double b1){
        a = Math.abs(a1);
        b = Math.abs(b1);
    }
    public void PrintInfo(){
        System.out.println("Triangle:");
        System.out.format("a = %f\nb = %f\nc = %f\nArea = %f\nTheta = %f\nPhi = %f\n", a , b, C(), Area(), Theta(),Phi());
    }
    public double C(){
        return Math.sqrt(a*a + b*b);
    }
    public double Area(){
        return (a*b)/2;
    }
    public double Theta(){
        return Math.atan2(a, b)*180/Math.PI;
    }
    public double Phi(){
        return Math.atan2(b, a)*180/Math.PI;
    }
}