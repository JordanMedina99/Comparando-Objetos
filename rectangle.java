package uv.interfacebasics;
public class rectangle implements calculate {
    
    private final double area;
    
    public rectangle(double width, double height){
        this.area = calculateArea(width,height);
    }
    public Double calculateArea(double width, double height){
        double area = width*height;
        return area;
    }
    public Boolean compareTo(rectangle obj){
        rectangle two =  obj;
        return this.area == two.area;
    }
}
