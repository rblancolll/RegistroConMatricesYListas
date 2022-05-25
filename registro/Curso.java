
package registro;


public class Curso extends Grado{
    private String codigo_curso;
    private String nombre_curso;


public Curso()
 {
     codigo_curso = " ";
     nombre_curso = " ";
     
 }

public Curso(String cc, String nc ){
     codigo_curso = cc;
     nombre_curso = nc;
    
 }
 public String getCodigo_Curso(){
     return codigo_curso;
 }
 
 public void setCodigo_Curso(String codigo_curso){
     this.codigo_curso = codigo_curso;
 }
 
public String getNombre_Curso(){
     return nombre_curso;
 }
 
 public void setNombre_Curso(String nombre_curso){
     this.nombre_curso = nombre_curso;
 }


}
