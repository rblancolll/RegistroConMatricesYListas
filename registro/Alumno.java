package registro;


public class Alumno extends Curso  {
    private String[] vectorTransacciones;  
    private int indiceVector;
    private String [] codigo;
    private String [] nombre;
    private String [] alias;
    private String [] correo;
    private int [] telefono;

 public Alumno()
 {
    codigo =new String[100];
    nombre =new String[100];
    alias =new String [100];
    correo =new String [100];
    telefono =new int [100];
    vectorTransacciones= new String[100];
    this.indiceVector=0;
     
 }
 
 
 
  public void registrarcodigo(String tipo ){
        indiceVector= indiceVector+1;
               codigo[indiceVector]= " Codigo = ┃"+ tipo +"┃ ";
        
    }
 public void codigo(String codigo){
      this.registrarcodigo(codigo);
      
      }
      
 
  public void registrarnombre(String tipo ){
        indiceVector= indiceVector+1;
               nombre[indiceVector]= " Nombre = ┃"+ tipo +"┃ ";
       
    }
 
 public void nombre(String nombre){
      this.registrarnombre(nombre);
      
      }
    
    
     public void registraralias(String tipo ){
        indiceVector= indiceVector+1;
       
                 alias[indiceVector]= " Alias =  ┃"+ tipo+"┃ ";
        
    }
   
     public void alias(String alias){
      this.registraralias(alias);
      
      }
     
      public void registrarcorreo(String tipo ){
        indiceVector= indiceVector+1;
                correo[indiceVector]= " Correo = ┃"+ tipo+"┃ ";
        
    }
   
     public void correo(String correo){
      this.registrarcorreo(correo);
      
      }
     
     public void registrartelefono(int tipo ){
        indiceVector= indiceVector+1;
vectorTransacciones[indiceVector]=" Telefono = ┃"+ tipo+"┃ ";
      
    }
    
     public void telefono(int telefono){
      this.registrartelefono(telefono);
      
      }
   
 
    
    
     public void mostrarTransacciones(){
      
            for (int i=1; i<vectorTransacciones.length;i++){
                if(vectorTransacciones[i] != null){
               
                    System.out.println(vectorTransacciones[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : vectorTransacciones){
                if(transaccion != null){
                   
                }   
            } 
        }      
     
     public void mostrarcodigo(){
      
            for (int i=1; i<codigo.length;i++){
                if(codigo[i] != null){
               
                    System.out.println(codigo[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : codigo){
                if(transaccion != null){
                   
                }   
            } 
        }
          public void mostrarnombre(){
      
            for (int i=1; i<nombre.length;i++){
                if(nombre[i] != null){
               
                    System.out.println(nombre[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : nombre){
                if(transaccion != null){
                   
                }   
            } 
        }
      public void mostraralias(){
      
            for (int i=1; i<alias.length;i++){
                if(alias[i] != null){
               
                    System.out.println(alias[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : alias){
                if(transaccion != null){
                   
                }   
            } 
        }
     
       public void mostrarcorreo(){
      
            for (int i=1; i<correo.length;i++){
                if(correo[i] != null){
               
                    System.out.println(correo[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : correo){
                if(transaccion != null){
                   
                }   
            } 
        }
     
             public void mostrartelefono(){
      
            for (int i=1; i<telefono.length;i++){
                if(telefono[i] != 0){
               
                    System.out.println(telefono[i]);
                   
                }
            }
            System.out.println("");
            for(int transaccion : telefono){
                if(transaccion != 0){
                   
                }   
            } 
        }
             
             
                      
 
}
