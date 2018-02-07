/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notimefortaxicab;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Advent of code 2016 day 1 problem
 *
 * @author Fabien
 */
public class NoTimeForTaxicab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instruction1: read the file and return the commands as list of
        // strings
        List<String> commands = readTheCommands();
        SolverForTaxicab solver = new SolverForTaxicab(commands);
        double distance = solver.howFar();
        System.out.println("The distance is: " + distance);
    }

    private static List<String> readTheCommands() {
        List<String> command = new ArrayList<>();
        try 
        {
            Scanner in = new Scanner(new FileReader("res/day1.txt"));
            while (in.hasNext()) {
                String token = in.next();
                if(token.endsWith(",")){
                    token = token.substring(0, token.length()-1);
                }
                command.add(token);
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("Error: could not open the file");
        }
        return command;
    }

}
