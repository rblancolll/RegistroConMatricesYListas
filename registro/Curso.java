
package registro;


public class Curso extends Grado {
    protected String [] nombrecurso;
    protected String [] codigoCurso; 
    private String[] vectorTransacciones;  
    private int indiceVector;


   Curso(){
       
    nombrecurso=new String [100];
    codigoCurso=new String[100];
    indiceVector=0; 
       
   }
 
   public void mostrarnombrecurso(){
      
            for (int i=1; i<nombrecurso.length;i++){
                if(nombrecurso[i] != null){
               
                    System.out.println(nombrecurso[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : nombrecurso){
                if(transaccion != null){
                   
                }   
            } 
   }
    public void registrarNombreCurso(String tipo ){
        indiceVector= indiceVector+1;
        nombrecurso[indiceVector]= " Nombre del Curso = ┃"+ tipo+"┃ ";
        
     }
     
    
    
    public void mostrarcursocodigo(){
      
            for (int i=1; i<codigoCurso.length;i++){
                if(codigoCurso[i] != null){
               
                    System.out.println(codigoCurso[i]);
                   
                }
            }
            System.out.println("");
            for(String transaccion : codigoCurso){
                if(transaccion != null){
                   
                }   
            } 
        }
    
    
    
     public void registrarCodigoCurso(String tipo ){
        indiceVector= indiceVector+1;
        codigoCurso[indiceVector]=  " Codigo del Curso = ┃"+ tipo+"┃ ";
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
