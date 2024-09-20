import java.util.HashMap;
import java.util.Map;

/**
 * Write a description of class Curso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Curso
{
   private String nombre;
   private HashMap <Integer, Alumno> alumnos;
   public Curso (String p_nombre)
   {
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap<Integer, Alumno>());
   }

   public Curso (String p_nombre, HashMap  <Integer, Alumno> p_alumnos)
   {
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
   }
   

   private void setAlumnos(HashMap <Integer, Alumno>  p_alumnos)
   {
        this.alumnos=p_alumnos;
   }


   private void setNombre(String p_nombre)
   {
        this.nombre=p_nombre;
   }
   public HashMap <Integer, Alumno> getAlumno()
   {
        return this.alumnos;
   }
   public String getNombre()
   {
    return this.nombre;
   }

   /**
    *     inscribirALumno inserta al hashmap un dato de tipo alumno. 
    *
    * 
    * @param p_alumno 
    */
   public void inscribirAlumno(Alumno p_alumno)
   {
        this.getAlumno().put(new Integer(p_alumno.getLU()),p_alumno);
   }
 
   public Alumno quitarALumno(int p_lu)
   {
     return (Alumno)this.getAlumno().remove(new Integer(p_lu));
   }

   public int cantidadDeAlumnos()
   {
     return this.getAlumno().size();
   }

   public boolean estaInscripto(int p_lu)
   {
     return this.getAlumno().containsKey(new Integer (p_lu));
   } 

   public boolean estaInscripto(Alumno p_alumno)
   {
     return this.getAlumno().containsValue(p_alumno);
   }

   public Alumno buscarAlumno(int p_lu)
   {
     return (Alumno)this.getAlumno().get(new Integer (p_lu));
   }
   public void imprimirPromedioDelAlumno(int p_lu)
   {
     System.out.println("Este el promedio: " + this.buscarAlumno(p_lu).promedio());
   }

   public void mostrarInscriptos()
   {
     for(Map.Entry<Integer, Alumno> alumnosInscriptos: this.getAlumno().entrySet())
     {
          System.out.println(" " + alumnosInscriptos.getValue().getLU() + " " + alumnosInscriptos.getValue().apellYnom());
     }
   }


}