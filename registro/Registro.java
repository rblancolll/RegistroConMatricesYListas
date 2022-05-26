package registro;

import java.util.Arrays;
import java.util.Scanner;


public class Registro {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
  
        
        Alumno a[]= new Alumno[2];
        Curso b[]= new Curso[2];
        Grado c[]= new Grado[2];
       
       
        
       String codigo ;
       String nombre ;
       String alias ;
       String correo ;
       int telefono ;
       String codigo_curso ;
       String nombre_curso ;
       String codigo_grado ;
       String descripcion ;
       
        for(int i=0;i<a.length;i++)
        {
           System.out.println("Ingresa tu codigo");
           codigo = leer.next();
           System.out.println("Ingresa tu nombre");
           nombre = leer.next();
           System.out.println("Ingresa tu alias");
           alias = leer.next();
           System.out.println("Ingresa tu correo");
           correo = leer.next();
           leer.nextLine();
           System.out.println("Ingresa tu telefono");
           telefono = leer.nextInt();
           a[i] = new Alumno(codigo,nombre,alias,correo,telefono);
           System.out.println("Ingresa tu codigo_curso");
           codigo_curso = leer.next();
           System.out.println("Ingresa tu nombre_curso");
           nombre_curso = leer.next();
           b[i] = new Curso(codigo_curso,nombre_curso);
           System.out.println("Ingresa tu codigo_grado");
           codigo_grado = leer.next();
           System.out.println("Ingresa tu descripcion");
           descripcion = leer.next();
           c[i] = new Grado(codigo_grado,descripcion);
        }
            for(int i=0;i<a.length;i++){
            System.out.println("Codigo: "+a[i].getCodigo()+" "+"Nombre: "+a[i].getNombre()+" "+"Alias: "+a[i].getAlias()+" "+"Correo: "+a[i].getCorreo()+" "+"Telefono: "+a[i].getTelefono());
                  }       
           for(int i=0;i<b.length;i++){
              System.out.println("Codigo del curso: "+b[i].getCodigo_Curso()+" "+"Nombre del curso: "+b[i].getNombre_Curso());
           }
   
              for(int i=0;i<c.length;i++){
              System.out.println("Codigo del Grado: "+c[i].getCodigo_Grado()+" "+"Descripcion: "+c[i].getDescripcion());
              }
    
    }
}
