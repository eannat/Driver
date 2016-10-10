/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DriverPackage;

import RegSystemPackage.Module;
import RegSystemPackage.Programme;
import RegSystemPackage.Student;
import org.joda.time.DateTime;

/**
 *
 * @author Eannat
 */
public class Driver {
 
    
    public static void main(String[] args) {
        
        Student A = new Student("Eanna", "20","A" , "13476428", "05/02/1996");
        Student B = new Student("John","21", "D","13452222","06/11/1995");
        Student C = new Student("Peter", "19", "C", "12345678", "24/07/1995");
        
        
        
        Module E = new Module("Telecoms", "CT453" );
        Module F = new Module("Software", "CT417" );
        Module G = new Module("SystemOnChip", "CT444");
        
        Programme CSIT  = new Programme("Computer Science & IT", new DateTime(2016, 9, 05, 9, 05), new DateTime(2017, 5, 07, 16, 00 ));
        Programme ECE = new Programme("Computer & Electronic", new DateTime(2016, 9, 06, 9, 05), new DateTime(2017, 5, 07, 16, 00 ));
        Programme EEE = new Programme("Electrical & Electronic", new DateTime(2016, 9, 06, 9, 05), new DateTime(2017, 5, 07, 16, 00 ));
        
        
        CSIT.addModule(E);
        EEE.addModule(F);
        ECE.addModule(G);
        
        
        E.addStudent(A);
        F.addStudent(B);
        G.addStudent(C);
        
        System.out.println(CSIT);
        System.out.println(ECE);
        System.out.println(EEE);
        
        
    }
}


