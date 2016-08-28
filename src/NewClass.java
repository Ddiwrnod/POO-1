/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nelson
 */
public class NewClass {

public static void main(String[] args) {
    int a,b,c,d,e,f,g,h=0,i=0;
    d=(int)(Math.random()*10);
    e=(int)(Math.random()*10);
    f=(int)(Math.random()*10);
    System.out.println("El numero de la loteria es:"+d+""+e+""+f);
    java.util.Scanner lectura = new java.util.Scanner(System.in);
    System.out.println("Ingrese su número de lotería");
    g=lectura.nextInt();
    c = g % 10;
    b = g % 100 / 10;
    a = g % 1000 / 100;
        
    if(a==d){
        h=h+1;
        i=i+1;   
    }
    else if (b==d){
        h=h+1;     
    }
    else if (c==d){
        h=h+1;     
    }
    if(a==e){
        h=h+1;
    }
    else if (b==e){
        h=h+1;   
        i=i+1;
    }
    else if (c==e){
        h=h+1;     
    }
    if(a==f){
        h=h+1;
    }
    else if (b==f){
        h=h+1;     
    }
    else if (c==f){
        h=h+1; 
        i=i+1;
    }
    System.out.println("El numero de la loteria es:"+d+""+e+""+f);
    if (d==e||d==f||e==f){
        h=h-1;
    }
    System.out.println("Y usted acertó en: "+h+" cifras con "+i+" cifras en orden");
    }

public static void Premios (int premio){
    
    int resultado = premio;
    
    System.out.println("El resultado de la suma fue: " + resultado);
    
  }

}
    
