
package registro;


public class CursoListas extends GradoListas{
    protected String codigocurso;
    protected String nombrecurso;

public String getCodigoCurso(){
        
       return codigocurso;
    }
    
     public void setCodigoCurso(String codigocurso){
        
       this.codigocurso = codigocurso;
     }
    
public String getNombreCurso(){
       return nombrecurso;
    }
    
public void setNombreCurso(String nombrecurso){
        
       this.nombrecurso = nombrecurso;
     }

}
