package uv.interfacebasics;
public class circle implements calculate{

    private final double area;
    
    public circle(double radius){
        this.area = calculateArea(radius,0);
    }
    public Double calculateArea(double radius, double none){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    public Boolean compareTo(circle obj){
        circle two = obj;
        return this.area == two.area;
    }
}
