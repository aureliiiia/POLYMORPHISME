/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author DELL
 */
public class Test {

    public static void main(String[] args) {
        Rect a = new Rect(1, 1, 4, 4);
        Rect b = new Rect(2, 3, 5, 6);

        System.out.println("<2,3> isinside the union");
        System.out.println(a + "union" + b + " = " + a.union(b));
        System.out.println(a + "intersect" + b + " = " + a.intersection(b));
    }
}
