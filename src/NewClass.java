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
    
    System.out.println("Bienvenido a UN Lotería \n"
            + "Ingrese 3 cifras y participe por los siguientes premios: \n"
            + "Acierte 1 cifra en cualquier orden: $10 \n"
            + "Acierte 2 cifras en cualquier orden: $100 \n"
            + "Acierte 3 cifras en cualquier orden: $1.000 \n"
            + "Acierte 3 cifras en orden: $1.000.000 \n");
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
    if ((d==e||d==f||e==f)&&(a==b||b==c||a==c)){
        h=h+1;
        i=i+1;
    }
    System.out.println("Y usted acertó en: "+h+" cifras con "+i+" cifras en orden");
    
    PremioGanado(h,i);
    }

public static void PremioGanado(int Cifras, int Orden){
    
    if (Orden==3){
        System.out.println("Su premio es: $1.000.000");
    }
    else {
        switch (Cifras) {
            case 1:
                System.out.println("Su premio es: $10");
                break;
            case 2:
                System.out.println("Su premio es: $100");
                break;
            case 3:
                System.out.println("Su premio es: $1000");
                break;
            default:
                System.out.println("Usted no ha gannado en esta oportunidad, intentelo de nuevo");
                break;
        }
        
    }
  }

}
    
