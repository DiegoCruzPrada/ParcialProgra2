package trianglepackage;

import java.util.Scanner;

public class Isosceles {
 public static void main(String[] args) {
      Scanner entrada= new Scanner(System.in);
      double base,side;
      int nTriangles;
      
      System.out.println("Set a number for the triangles ");
        nTriangles= entrada.nextInt();

        Isosceles_Triangle triangles[] = new Isosceles_Triangle[nTriangles];
        for(int i=0;i<triangles.length;i++){
            System.out.println("\nSet the triangle values "+(i+1)+":");
            System.out.println("Set the base: ");
            base=entrada.nextDouble();
            System.out.println("");
            System.out.println("Set the sides: ");
            side=entrada.nextDouble();
            triangles[i]= new Isosceles_Triangle(base, side);
            System.out.println("\nThe triangle perimeter is: "+triangles[i].Perimeter());
            System.out.println("\nThe triangle area is: "+triangles[i].Area());
            System.out.println("I'm an isosceles triangle");
            
        }
        private void triangles(int i, int j, int k, int l, int m, int n) {
        }
        private void background(int i) {
        }
         private void size(int i, int j) {
        }
           public int setup() {
            size(500, 500);
            background(0);
           }
       
       
        void draw() {
            triangle(0, 0, 25, 0, 12, 12);
        }
    }
    

}
