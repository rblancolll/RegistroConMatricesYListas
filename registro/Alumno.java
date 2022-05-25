package registro;


public class Alumno extends Curso {
    private String codigo;
    private String nombre;
    private String alias;
    private String correo;
    private int telefono;

 public Alumno()
 {
     codigo = " ";
     nombre = " ";
     alias = " ";
     correo = " ";
     telefono = 0;
 }
 
 public Alumno(String c, String n, String a, String co, int t){
     codigo = c;
     nombre = n;
     alias = a;
     correo = co;
     telefono = t;
 }
 public String getCodigo(){
     return codigo;
 }
 
 public void setCodigo(String codigo){
     this.codigo = codigo;
 }
 
public String getNombre(){
     return nombre;
 }
 
 public void setNombre(String nombre){
     this.nombre = nombre;
 }
    
 
 public String getAlias(){
     return alias;
 }

 public void setAlias(String alias){
     this.alias = alias;
 }

public String getCorreo(){
     return correo;
 }

 public void setCorreo(String correo){
     this.correo = correo;
 }

 public int getTelefono(){
     return telefono;
 }
 
 public void setTelefono(int telefono){
     this.telefono = telefono;
 }

}
