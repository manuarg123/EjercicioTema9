/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotema9;

/**
 *
 * @author MANUEL RIVAS GAUNA
 */
public class EjercicioTema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente miCliente;
        Trabajador miTrabajador;
        
        miCliente = new Cliente();
        miTrabajador = new Trabajador();
        
        miCliente.setNombre("Manuel");
        miCliente.setEdad(44);
        miCliente.setTelefono("4556565");
        miCliente.setCredito(50);
        
        miTrabajador.setNombre("Juan");
        miTrabajador.setEdad(50);
        miTrabajador.setTelefono("787787");
        miTrabajador.setSalario(5000);
        
        System.out.println("El Cliente es " + miCliente.getNombre() + ", tiene la edad de " + miCliente.getEdad() + ", su telefono es " + miCliente.getTelefono() + " y su credito es de " + miCliente.getCredito() + "." );
        System.out.println("El Trabajador se llama " + miTrabajador.getNombre() + ", tiene la edad de " + miTrabajador.getEdad() + ". Su telefono es " + miTrabajador.getTelefono() + " y tiene  un salario de " + miTrabajador.getSalario() + "." );
    }
    
}
