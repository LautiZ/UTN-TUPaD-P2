package tp4;
import Estudiantes.Estudiantes;

public class Tp4 {
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiantes es1 = new Estudiantes(1, "Lauti", "Backend dev", 1500000.00);
        System.out.println(Estudiantes.mostrarTotalEmpleados());
        
        Estudiantes es2 = new Estudiantes("Pedro", "Frontend dev");
        Estudiantes es3 = new Estudiantes(2, "Jorge", "Backend dev", 1300000.00);
        Estudiantes es4 = new Estudiantes(3, "Raul", "Frontend dev", 1350000.00);
        Estudiantes es5 = new Estudiantes(4, "Esteban", "Designer", 1200000.00);
        System.out.println(Estudiantes.mostrarTotalEmpleados());
        System.out.println("");
        
        System.out.println(es1);
        System.out.println("");
        
        System.out.println(es2);
        System.out.println("");
        
        System.out.println(es3);
        System.out.println("");
        
        System.out.println(es4);
        System.out.println("");
        
        System.out.println(es5);
        System.out.println("");
        
        es1.actualizarSalario(50.00);
        es2.actualizarSalario(50000);
        
        System.out.println(es1);
        System.out.println("");
        
        System.out.println(es2);
        System.out.println("");
    }
    
}
