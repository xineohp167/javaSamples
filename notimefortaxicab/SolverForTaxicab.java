/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notimefortaxicab;

import java.util.List;

/**
 * Solver for NoTimeForTaxicab using:
 * Multiplying i is a rotation by 90 degrees counter-clockwise
 * Multiplying by -i is a rotation of 90 degrees clockwise
 * @author Fabien
 */
public class SolverForTaxicab {
    private final List<String> commands;
    
    // N, S, E, W = 1j, -1j, 1, -1 # Unit vectors for headings
    private static final Complex N = new Complex(0, 1);
    private static final Complex S = new Complex(0, -1);
    private static final Complex E = new Complex(1, 0);
    private static final Complex W = new Complex(-1, 0);
    
    
    public SolverForTaxicab(List<String> commands){
        this.commands = commands;
    }
    
    /**
     * After following moves, how far away from the origin do we end up?"
     * @return how far away from the origin
     */
    public double howFar(){
        // Begin at origin, heading North
        Complex location = new Complex(0,0);
        Complex heading = N;
        for(String command : commands){
            // heading *= turn
            char direction = command.charAt(0);
            if(direction == 'R'){
                heading = heading.times(N);
            }else if(direction == 'L'){
                heading = heading.times(S);
            }else{
                throw new IllegalArgumentException("Direction should be R or L");
            }
            // loc += heading * dist
            double distance = Double.parseDouble(command.substring(1));
            Complex product = heading.times(new Complex(distance, 0));
            location = location.plus(product);
        }
        return distance(location);
    }
    
    private static double distance(Complex number){
        return Math.abs(number.re()) + Math.abs(number.im());
    }
    
    private static void testingUnitVectors(){
        System.out.println(N);
        System.out.println(S);
        System.out.println(E);
        System.out.println(W);
    }
     
    public static void main(String[] args) {
        testingUnitVectors();
        // Using Comples(3,4) should be 7
        System.out.println(distance(new Complex(3,4)));
        
        //assert how_far("R2, L3") == 5
        //assert how_far("R2, R2, R2") == 2
        //assert how_far("R5, L5, R5, R3") == 12
    }
    
}
