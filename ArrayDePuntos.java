import java.util.Scanner;

public class ArrayDePuntos
{
    public static void main(String[ ]args)
    {

        Punto[]  puntos = new Punto[6];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("ingrese los valores del array  en la posicion " + i);
            System.out.println("x:");
            double p_dx = entrada.nextDouble(); 
            System.out.println("y:");
            double p_dy= entrada.nextDouble();
            puntos[i]= new Punto(p_dx,p_dy);
            
        }
    entrada.close();
    
    /*for( Punto muestra : puntos)
    {
        muestra.mostrar();
    }*/

    //distancia entre dos puntos
    for(int i= 0; i < puntos.length-1; i++)
    {
        double distancia = puntos[i].distanciaA(puntos[i+1]);
        System.out.println("Distancia entre punto " + (i+1)+ "y el punto " +(i+2) +": "+ distancia );
    }
    }
   


} 