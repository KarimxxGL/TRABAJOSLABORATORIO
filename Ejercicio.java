
package ejercicio;


public class Ejercicio {

    
    public static void main(String[] args){
        int edad = 6;
        if (edad>=0 && edad<=1){
            System.out.println("La persona seria un Bebe");
        }
        else if(edad>=2 && edad<=12){
            System.out.println("La persona seria un Niño");
    }
        else if(edad>=13 && edad<=17){
            System.out.println("La persona seria un Puberto");
        }
        else if(edad>=18 && edad<=27){
            System.out.println("La persona seria un Joven");
        }
        else{
            System.out.println("La persona seria un Adulto");
        
        }
        
    }
}