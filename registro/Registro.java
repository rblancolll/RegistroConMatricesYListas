package registro;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Registro {
static  Scanner leer=new Scanner (System.in);
   
    public static void main(String[] args) {
    MenuUno Menu=new MenuUno();
    
        int opcion  = 0;
  do{
       
      System.out.println("\n Bienvenido");
        
           System.out.println(" 1"+" Metodo Vectores y Matriz");
           System.out.println(" 2"+" Metodo Listas");
           System.out.println(" "+"Escoja una opcion");
          
      
               opcion = leer.nextInt();
               
               switch(opcion){
  case 1 -> { 
           
            Menu.MenuUno(opcion);
           
               }
          
  case 2 -> {
        
            Menu.MenuDos(opcion);
      
              }
                   
    }
    
}while (opcion !=2);
    }
  
  }

