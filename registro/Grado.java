
package registro;


public class Grado {
    private String codigo_grado;
    private String descripcion;


public Grado()
 {
     codigo_grado = " ";
     descripcion = " ";
     
 }

public Grado(String cg, String d ){
     codigo_grado = cg;
     descripcion = d;
    
 }
 public String getCodigo_Grado(){
     return codigo_grado;
 }
 
 public void setCodigo_Grado(String codigo_grado){
     this.codigo_grado = codigo_grado;
 }
 
public String getDescripcion(){
     return descripcion;
 }
 
 public void setDescripcion(String descripcion){
     this.descripcion = descripcion;
 }


}
