/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oraclejavaseexamples.javaLanguage;

/**
 *
 * @author Fabien
 */
public class NestedIf {
    public static void main(String[] args) {
	int aNumber = 3;

        if (aNumber >= 0)
            if (aNumber == 0) System.out.println("first string");
        else System.out.println("second string");
        System.out.println("third string");
    }
}
