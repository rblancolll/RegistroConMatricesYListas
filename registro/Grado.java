
package registro;


public class Grado  {
    protected String [] codigoGrado;
    protected String [] descripcion;
     private String[] vectorTransacciones;  
    private int indiceVector;
    
    public Grado(){
    codigoGrado=new String [100];
    descripcion=new String[100];
    indiceVector=0;
    }
    
    
    public void mostrarCodigoGrado(){
      
            for (int i=1; i<codigoGrado.length;i++){
                if(codigoGrado[i] != null){
               
                    System.out.println(codigoGrado[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : codigoGrado){
                if(transaccion != null){
                   
                }   
            } 
        }
    
public void registrogrado(String tipo ){
        indiceVector= indiceVector+1;
        codigoGrado[indiceVector]= " Codigo del Grado = ┃"+ tipo+"┃ ";
        
     }


       public void mostrarDes(){
      
            for (int i=1; i<descripcion.length;i++){
                if(descripcion[i] != null){
               
                    System.out.println(descripcion[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : descripcion){
                if(transaccion != null){
                   
                }   
            } 
        }      

     public void descripcion(String tipo ){
        indiceVector= indiceVector+1;
        descripcion[indiceVector]= " Descripcion = ┃"+ tipo+"┃ ";
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
}