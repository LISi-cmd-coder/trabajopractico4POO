/**
 * La clase Alumno representa a un estudiante con un número de legajo universitario (LU),
 * nombre, apellido y dos calificaciones (nota1 y nota2).
 * 
 * Funcionalidad: Permite gestionar la información básica del alumno, 
 * calcular el promedio de sus calificaciones y determinar si aprueba o no 
 * según ciertos criterios.
 * 
 * Comportamiento: Los atributos de calificaciones se inicializan en cero al crear una 
 * instancia de Alumno. Se proporcionan métodos para establecer las calificaciones 
 * y calcular el promedio, además de verificar si el alumno aprueba.
 */
public class Alumno {

    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
 
 
      /**
      * Constructor que inicializa una instancia de Alumno con los datos proporcionados.
      * Las calificaciones se inicializan en cero.
      * 
      * Funcionalidad: Inicializa los atributos del alumno con los valores dados.
      * 
      * Comportamiento: Asigna los valores proporcionados a los atributos correspondientes
      * y establece las notas en cero.
      * 
      * @param p_lu El número de legajo universitario (LU) del alumno.
      * @param p_nombre El nombre del alumno.
      * @param p_apellido El apellido del alumno.
      */
    public Alumno(int p_lu,String p_nombre,String p_apellido){
           this.setLu(p_lu);
           this.setNombre(p_nombre);
           this.setApellido(p_apellido);
           this.setNota1(0);
           this.setNota2(0);
      }

    public Alumno (int p_lu,String p_nombre,String p_apellido,double p_nota1,double p_nota2)
    {

        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNota1(p_nota2);
        this.setNota2(p_nota2);
        
    }
     /**
      * Calcula y devuelve el promedio de las dos calificaciones del alumno.
      * 
      * Funcionalidad: Calcula el promedio de las dos notas del alumno.
      * 
      * Comportamiento: Suma las dos notas y divide el resultado entre dos.
      * 
      * @return El promedio de las dos notas.
      */
      public double promedio()
      {
         return ((this.getNota1()+this.getNota2())/2);
      }
       
      /**
      * Verifica si el alumno aprueba o no según sus calificaciones.
      * 
      * Funcionalidad: Determina si el alumno aprueba en base a su promedio y 
      * si ambas notas son iguales o mayores a 6.0.
      * 
      * Comportamiento: Retorna true si el promedio es mayor a 7.0 y ambas 
      * calificaciones son mayores o iguales a 6.0; de lo contrario, retorna false.
      * 
      * @return true si el alumno aprueba, false en caso contrario.
      */
      public boolean aprueba(){
        if (this.getNota1() >= 6 && this.getNota2() >= 6  &&  this.promedio()> 7)
        {
         return true;
        }else{
         return false;
        }       
      }
      /**
      * Retorna una cadena que indica si el alumno está aprobado o desaprobado.
      * 
      * Funcionalidad: Proporciona una representación en texto del estado de aprobación del alumno.
      * 
      * Comportamiento: Devuelve "APROBADO" si el método aprueba() retorna true, 
      * de lo contrario, retorna "DESAPROBADO".
      * 
      * @return "APROBADO" si el alumno aprueba, "DESAPROBADO" en caso contrario.
      */
      public String leyendaAprueba(){
        if(this.aprueba()==true)
        {
         return "APROBADO";
        }else {
         return "DESAPROBADO";
        }
      }
 
      public String nomYapell(){
        return (this.getName() + " " + this.getApell());
      }
      //getters
      public String apellYnom(){
        return ( this.getApell() + " " +  this.getName());
      }
 
      public int getLU()
      {
        return this.lu;
      }
      public String getName() {
         return this.nombre;
      }
      public String getApell() {
         return this.apellido;
      }
      
      public double getNota1() {
         return this.nota1;
      }
      public double getNota2(){
         return this.nota2;
      }
     //setters
      public  void setNota1(double p_nota)
      {
        this.nota1=p_nota;
      }
      public  void setNota2(double p_nota)
      {
        this.nota2=p_nota;
      }
      private void setLu(int p_lu)
      {
       this.lu=p_lu;
      }
      private void setNombre(String p_name)
      {
       this.nombre=p_name;
      }  
      private void setApellido(String p_ape)
      {
       this.apellido=p_ape;
      }
    
    
       /**
      * Muestra en la consola los datos del alumno, incluyendo su LU, nombre, apellido, 
      * promedio de calificaciones y su estado de aprobación.
      * 
      * Funcionalidad: Imprime en la consola la información relevante del alumno.
      */
      public void mostrar(){
         System.out.println("Nombre y apellido:" + this.nomYapell());
         System.out.println("LU:" + this.getLU()+ "|| " + "Notas: "+ this.getNota1() +"|| "+ this.getNota2());
         System.out.println("Promedio: " + this.promedio() + "|| " + this.leyendaAprueba() );
       }
 
 }
 