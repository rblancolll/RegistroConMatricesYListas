
package registro;

import java.util.Scanner;  
public class MenuUno extends MenuDos{
    static  Scanner leer=new Scanner (System.in);
    Alumno registro=new Alumno();
    
    public void MenuUno(int opcion){
        
        do{
           System.out.print("\n Vectores y Tablas");
           System.out.println();
           System.out.println("1" + " TABLA-ALUMNO ");
           System.out.println("2" + " Mostrar registros de TABLA-ALUMNO");
           System.out.println("3" + " TABLA-CURSO ");
           System.out.println("4" + " Mostrar registros de TABLA-CURSO ");
           System.out.println("5" + " GRADO ");
           System.out.println("6" + " Mostrar registros de GRADO");
           System.out.println("7" + " Mostrar todos los registros ");
                 opcion = leer.nextInt();
       switch(opcion){
               
         case 1 -> { 
           System.out.println("ingrese el codigo");
           String codigo=leer.next();
           System.out.println("-----------------");
           System.out.println("ingrese el nombre");
           String nombre=leer.next();
           System.out.println("-----------------");
           System.out.println("ingrese el alias");
           String alias=leer.next();
           System.out.println("-----------------");
           System.out.println("ingrese el correo");
           String correo=leer.next();
           System.out.println("-----------------");
           System.out.println("ingrese el telefono");
           int telefono=leer.nextInt();
           System.out.println("-----------------");
           registro.registrarcodigo(codigo);
           registro.registrarnombre(nombre);
           registro.registraralias(alias);
           registro.registrarcorreo(correo);
           registro.registrartelefono(telefono);
         
         }
           
         case 2 -> { 
           System.out.println("Registro de TABLA-ALUMNO ");
           
           registro.mostrarcodigo();   
           registro.mostrarnombre();
           registro.mostraralias();
           registro.mostrarcorreo();
           registro.mostrarTransacciones();
           }
         
           case 3 -> { 
           System.out.println("ingrese el nombre del curso");
           String nombrecurso=leer.next();
           System.out.println("-----------------");
           System.out.println("ingrese el codigo del Curso");
           String codigoCurso=leer.next();
           System.out.println("-----------------");
           registro.registrarNombreCurso(nombrecurso);
           registro.registrarCodigoCurso(codigoCurso);
           }
           
            case 4 -> { 
           System.out.println("Registro de TABLA-CURSO  ");
           
           registro.mostrarnombrecurso();
           registro.mostrarcursocodigo();
               }
           
           case 5 -> { 
           System.out.println("ingrese el codigo del grado");
           String codigoGrado=leer.next();
           System.out.println("-----------------");
           System.out.println("descrpcion del grado");
           String descripcion=leer.next();
           System.out.println("-----------------");
           registro.registrogrado(codigoGrado);
           registro.descripcion(descripcion);
               }
          
         case 6 -> {
           System.out.println("Registro de la tabla GRADO ");
           
           registro.mostrarCodigoGrado();
           registro.mostrarDes();
          
               }
             
         case 7 -> {
           System.out.println("Todos los registros ");
           
           registro.mostrarcodigo();   
           registro.mostrarnombre();
           registro.mostraralias();
           registro.mostrarcorreo();
           registro.mostrarTransacciones();
           registro.mostrarnombrecurso();
           registro.mostrarcursocodigo();
           registro.mostrarCodigoGrado();
           registro.mostrarDes();
          
               }
   
    }
    
}while (opcion !=7);
      
        
    }
            
        }
    

