
/**
 * Write a description of class Carrera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carrera
{
   
    public static void main (String[] args)
    {   //5.1.1
        Curso POO= new Curso ("POO");  
   
        Alumno a1 = new Alumno(12,"Carlitos","Bala",7,8);
        Alumno a2 = new Alumno(24,"Mario","Bofil",10,10);
        Alumno a3 = new Alumno(34,"Requencho","Acordeon",4,5);
        Alumno a4 = new Alumno (56,"Marcelo","Polino",0,1);
        
        POO.inscribirAlumno(a1);
        POO.inscribirAlumno(a2);
        POO.inscribirAlumno(a3);
        POO.inscribirAlumno(a4);
        //5.1.4.     Imprimir la cantidad y la lista de alumnos inscriptos al curso
        System.out.println("La cantidad de inscriptos son: " + POO.cantidadDeAlumnos());
        POO.mostrarInscriptos();
       
        //5.1.5. Dar de baja un alumno del curso, y luego verificar que no esté inscripto
        POO.quitarALumno(12);
        System.out.println("La cantidad de inscriptos son: " + POO.cantidadDeAlumnos());
        POO.mostrarInscriptos();

        //5.1.7. Buscar un alumno por su libreta. Una vez encontrado, mostrarlo con el método apropiado. 
        POO.buscarAlumno(56).mostrar();
        //5.1.8. Mostrar el promedio del alumno solicitado, según libreta

        POO.imprimirPromedioDelAlumno(24);
        

     
    }
 
   
}
