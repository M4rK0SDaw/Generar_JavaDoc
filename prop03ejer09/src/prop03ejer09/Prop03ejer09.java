package prop03ejer09;
import java.util.Scanner;
 /**
     *  Generar JavaDoc
     * Este ejercicio consta de introducir un numero y verificar que ese numero 
     * sea primo, además de comprobar su reverso si es primo
     * 
     * @author Mare Krupoves
     * @version 1.2.3
     */
public class Prop03ejer09 {
    
    static int x,j; //Creamos Atributos
    static Scanner teclado= new  Scanner (System.in);// Creamso un Scanner
    
    /**
     * Obtener si es primo.
     * @return Esprimo
     * 
     */
    public static boolean Esprimo(){// Sacamos si el numero  es primo. 
        
        int d=x; //Indicamos que la d es x.
         for (int i = 2; i <d ; i++) {
             if (d%i==0) 
                return false;         
         }
        return true;
        
    }
    /**
     * Obtener el número al revés.
     * @return InvNum
     * 
     */
    public static int InvNum(){//invierte los numero .
        int y=x;//Indicamos que la y es x
        int resto;
        int invertido=0;
        while (y > 0){
            resto = y%10;
            invertido = invertido * 10 + resto;
            y/=10;
        }
        return invertido;
     }
    /**
     * Obtener el número al revés si es primo.
     * @return EsOmirp
     * 
     */
    
    public static boolean EsOmirp(){// Sacamos si el numero invertido es primo.
        for (int c = 2; c < InvNum(); c++) {
            if(InvNum()%c==0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("jugar 1 no juar 0");
        j=teclado.nextInt();
        while(j!=0){
                     System.out.println("Introduce un número para saber si es omirp o no");
        x=teclado.nextInt();
            if (Esprimo()==false && EsOmirp()== false){
                  System.out.println(x+" al revés es "+InvNum()+", pero no es orpmim el "+InvNum() );
            }else{
                  System.out.println(x+" al revés es "+InvNum()+" y es oprim el " +InvNum() );
            } 
        System.out.println("jugar 1 no juar 0");
        j=teclado.nextInt();
        }
        System.out.println("Gracias por participar en el concurso de belleza");
    }
}