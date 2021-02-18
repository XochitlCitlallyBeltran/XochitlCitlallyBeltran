
import java.util.*;

/**
 * 
 */
public class Profesores extends Usuario {

    /**
     * Default constructor
     */
    public Profesores() {
    }
    public String nombre;
    public String correo;
    public String materia;
    public Float añosLaborando;
    public String sexo;
    
    
   public Profesires(String n, String c, String m, float a, String s){
    this.nombre=n;
    this.correo=c;
    this.materia=m;
    this.añosLaborando=a;
    this.sexo=s;

}
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
        
        public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }
     public String getMateria() {
        return materia;
    }
    public void setMateria(String materia){
        this.materia=materia;
    }
   
     public float getAñoslaborando() {
        return añosLaborando;
    }
    public void setAñoslaborando(float añosLaborando){
        this.añosLaborando=añosLaborando;
    }
    
     public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
}
