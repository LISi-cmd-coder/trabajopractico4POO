import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author lisandro Valenzuela
 * @version 110032002
 */
public class CuentaBancaria
{
   private int nroCuenta;
   private  double saldo;
   private Persona gente;
   
   public CuentaBancaria(int p_nrocuenta,Persona  p_Persona)
   { 
        this.setNrocuenta(p_nrocuenta);
        this.setSaldo(0.0);
        this.setPersona(p_Persona);
   }
   public CuentaBancaria(int p_nroCuenta , Persona p_titular , double p_saldo )
   {
    this.setNrocuenta(p_nroCuenta);
    this.setPersona(p_titular);
    this.setSaldo(p_saldo);
   }

   //setters
   private void setNrocuenta(int p_nro)
   {
    this.nroCuenta=p_nro;
   }
   private void setSaldo(double p_saldo)
   {
        this.saldo=p_saldo;
   }
   private void setPersona(Persona p_persona)
   {
    this.gente=p_persona;
   }

   //Getters
   public int getNroCuenta()
   {
    return this.nroCuenta;
   }
   public double getSaldo()
   {
    return this.saldo;
   }
   public String getTitular()
   {
    return this.gente.apeYnom();
   }
   //metodos  solicitados
   public void depositar(double p_importe)
   {
     this.saldo += p_importe;
   }
   public void extraer(double p_importe)
   {
    this.saldo -= p_importe;
   }

   public void mostrar()
   {
    System.out.println("\t- Cuenta bancaria -\n");
    System.out.println("Titular: "+this.gente.nomYApe() + " " + this.gente.edad()+"\n");
    System.out.println("SALDO: " + this.getSaldo());
   }

   public String toString()
   {
    return " "+this.getNroCuenta() +"\t" + this.gente.nomYApe();
   }

 
   
}
