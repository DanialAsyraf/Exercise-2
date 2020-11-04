/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg2;

/**
 *
 * @author user
 */
public class NewCgpa {
    double CGPA;
    double gpa[]=new double[4];
    double sum;
    double finalcgpa;
    double cgpa;
    
    //default constructor
    NewCgpa(){
        this.CGPA=4.00;
        this.gpa=new double[]{3.98,3.56,3.45,3.76};
        
    }
    //parameterized constructor
    NewCgpa(double [] d) {

        this.gpa=d;
    }
public void printCgpa(){
    System.out.println("CGPA          :"+CGPA);
}
public void printGpa(){
    for (int i=0; i<gpa.length; i++){
    System.out.println("Sem "+(i+1)+"          :"+gpa[i]);
    
    }
}
public double calculateCgpa(){
    for (int i=0; i<gpa.length; i++){
        sum+=gpa[i];
        //sum=sum+gpa[i];
    }
    if (gpa.length != 0){
        cgpa=sum/gpa.length;
    }
    else {
        cgpa=0.0;
    }
        
    
    return cgpa;
}
public void printNewCgpa(){
    NewCgpa obj1= new NewCgpa();
    NewCgpa obj2= new NewCgpa(new double[]{3.9,3.75,3.44,3.64});
    
    System.out.println("Sem 1: "+obj1.gpa[0]+"\n"+"Sem 2: "+obj1.gpa[1]+"\n"+"Sem 3: "+obj1.gpa[2]+"\n"+"Sem 4: "+obj1.gpa[3]);
    System.out.println("Sem 1: "+obj2.gpa[0]+"\n"+"Sem 2: "+obj2.gpa[1]+"\n"+"Sem 3: "+obj2.gpa[2]+"\n"+"Sem 4: "+obj2.gpa[3]+cgpa);
    
    }    
}
