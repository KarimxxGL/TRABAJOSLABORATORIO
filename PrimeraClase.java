
package primeraclase;


public class PrimeraClase {

    
    public static void main(String[] args) {
        System.out.println("HOLA MUNDO");
        int n1 = 1;    //VARIABLES
        int n2 = 2;   //VARIABLES
        int total = n1+n2;
        int totalresta  = n2-n1;
        int totalmulti = n1*n2;
        int totaldiv = n2/n1;
        String nombre1 = "Adrian";
        System.out.println(nombre1);
        System.out.println("Este es el resultado de la suma: " +total);
        System.out.println("Este es el resultado de la resta: " +totalresta);
        System.out.println("Este es el resultado de la multiplicacion: " +totalmulti);
        System.out.println("Este es el resultado de la division: " +totaldiv);
        
        if(n1 < n2){
            System.out.println("N1 es menor");
        }else{
            System.out.println("N2 es menor");
        }
       
        
    }
  
}
