
package registro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;  

public class MenuDos {
     static  Scanner leer=new Scanner (System.in);
     
     public void MenuDos(int opcion){
     List<AlumnoListas> lista = new ArrayList<>();
     AlumnoListas registro = new AlumnoListas();
     
        do{
        System.out.print("\n Vectores y Tablas");
        System.out.println();
        System.out.println("1" + " TABLA-ALUMNO ");
        System.out.println("2" + " TABLA-CURSO ");
        System.out.println("3" + " GRADO ");
        System.out.println("4" + " Mostrar todos los registros ");
        opcion = leer.nextInt();
            
         switch(opcion){
               
          case 1 -> { 
        System.out.println(" TABLA-ALUMNO ");
        System.out.println("Ingrese el codigo");
        String codigo=leer.next();
        registro.setCodigo(codigo);
        System.out.println("-----------------");
        System.out.println("Ingrese un nombre");
        String nombre=leer.next();
        registro.setNombre(nombre);
        System.out.println("-----------------");
        System.out.println("Ingrese un alias");
        String alias=leer.next();
        registro.setAlias(alias);
        System.out.println("-----------------");
        System.out.println("Ingrese un correo");
        String correo=leer.next();
        registro.setCorreo(correo);
        System.out.println("-----------------");
        System.out.println("Ingrese su telefono");
        int telefono=leer.nextInt();
        registro.setTelefono(telefono);
        lista.add(registro);
        //System.out.println("Lista: " + lis_nombres.get(0).getCodigo()+" " + lis_nombres.get(0).getNombre()+" " + lis_nombres.get(0).getAlias()+" " + lis_nombres.get(0).getCorreo()+" " + lis_nombres.get(0).getTelefono());
         
         }
           
         case 2 -> { 
        System.out.println("Registro de TABLA-CURSO ");
       
        System.out.println("Ingrese el codigo del curso");
        String codigocurso=leer.next();
        registro.setCodigoCurso(codigocurso);
        System.out.println("-----------------");
        System.out.println("Ingrese un nombre del curso");
        String nombrecurso=leer.next();
        registro.setNombreCurso(nombrecurso);
        lista.add(registro);   
           }
         
           case 3 -> { 
        System.out.println("Registro de GRADO ");
        System.out.println("Ingrese el codigo del curso");
        String codigogrado=leer.next();
        registro.setCodigoGrado(codigogrado);
        System.out.println("-----------------");
        System.out.println("Ingrese la descripcion");
        String descripcion=leer.next();
        registro.setDescripcion(descripcion);
        
        lista.add(registro);
           }
           
            
         case 4 -> {
        System.out.println("Todos los registros ");
        System.out.println("TABLA-ALUMNO: " +"┃"+"Codigo = "+ lista.get(0).getCodigo()+"┃ "+" " +"┃"+"Nombre = "+ lista.get(0).getNombre()+"┃ "+" " +"┃"+" Alias = "+ lista.get(0).getAlias()+"┃ "+" "+ "┃"+" Correo = "+ lista.get(0).getCorreo()+"┃ "+" "+"┃"+" Telefono = " + lista.get(0).getTelefono()+"┃ ");
        System.out.println("TABLA-CURSO: " + "┃"+"Codigo Curso = "+ lista.get(0).getCodigoCurso()+"┃ "+" "+"┃ "+"Nombre Curso = " + lista.get(0).getNombreCurso()+"┃ ");
        System.out.println("GRADO: "+"┃"+"Codigo Grado = " + lista.get(0).getCodigoGrado()+"┃ "+" "+"┃"+"Descripcion = " + lista.get(0).getDescripcion()+"┃ ");
        
          
               }
   
    }
    
}while (opcion !=4);
      
        }
        }
