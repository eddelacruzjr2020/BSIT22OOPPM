/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class PolygonMain {
    
    public static void main(String[] args) {
         Rectangle rec = new Rectangle(4.5, 5.5);
         System.out.println(rec.calculateArea());
         
         Triangle tri = new Triangle(3.90, 9.99);
         System.out.println(tri.calculateArea());
         
         Polygon poly = new Polygon(10.0, 50.0);
         System.out.println(poly.calculateArea());
    }
}
