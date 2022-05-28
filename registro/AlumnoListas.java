package registro;


public class AlumnoListas extends CursoListas{
    protected String codigo;
    protected String nombre;
    protected String alias;
    protected String correo;
    protected Integer telefono;

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
     
     public Integer getTelefono(){
        
       return telefono;
    }
    
     public void setTelefono(Integer telefono){
        
       this.telefono = telefono;
     }


}
