package trianglepackage;

public class Isosceles_Triangle{
    private double base;
    private double side;
    public Isosceles_Triangle(double base, double side);{
        this.base= base;
        this.side= side;

    }

    public double Perimeter(){
        double perimeter = 2*side+base;
        return perimeter;
    }

    public double Area(){
        double area = (base*Math.sqrt((side*side)-(base*base)/4))/2;
        return area;
    }
    public String showdata(){
        return "Base:"+base+"\nside: "+side+"\nPerimeter"+Perimeter()+"\nArea"+Area()+"\n";
    }
}




























/*public class Triangle {
  
     double Perimeter;
     double Area;
    
   public void setArea(double a){
       Area = a;
   }
    public double getArea(){
    return Area;
    }
   public void setPerimeter(double p){
       Perimeter = p;
   }
   public double getPerimeter(){
       return Perimeter;
   }

    
    private void triangle(int i, int j, int k, int l, int m, int n) {
    }
    private void background(int i) {
    }
     private void size(int i, int j) {
    }
    void setup() {
        size(500, 500);
        background(0);
    }
   
   
    void draw() {
        triangle(0, 0, 25, 0, 12, 12);
    }
    
}*/
