/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author DELL
 */
public class cobalah {

    public static void main(String[] args) {
        Line coba = new Line(2.5, 3, 4, 5);
        Line pertama = new Line(3, 4, 5, 6);
        coba.getLength();
        pertama.getLength();
        System.out.println("coba > pertama = " + coba.isGreater(coba, pertama));
        System.out.println("coba < pertama = " + coba.isLess(coba, pertama));
        //System.out.println("coba == pertama = " + coba.isEqual(coba, pertama));
    }
}
