
/**
 * Write a description of class GestionComercio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GestionComercio
{    
     public static void main(String[] args)
     {
          Comercio kioskoelKuki= new Comercio("maxikiosko el kuki-pupi");
          Empleado e1 = new Empleado(234,"Tevez", "Carlitos", 255124, 2019);
          Empleado e2 = new Empleado(2412, "Baracus", "Marito", 25555, 2018);
          Empleado e3 = new Empleado(4544, "San Martin", "Jose", 521312, 1812);
          Empleado e4 = new Empleado(2555,"Guevara","Che",12,1989);

          kioskoelKuki.altaEmpleado(e1);
          kioskoelKuki.altaEmpleado(e2);
          kioskoelKuki.altaEmpleado(e3);
          kioskoelKuki.altaEmpleado(e4);

         System.out.println("Cantidad de empleados:"+kioskoelKuki.cantidadDeEmpleados());
         kioskoelKuki.nomina();
        
         kioskoelKuki.bajaEmpleado(2555);
          System.out.println("Cantidad de empleados:"+kioskoelKuki.cantidadDeEmpleados());
         kioskoelKuki.nomina();
     }
}
     
