
import java.util.*;

/**
 * 
 */
public class ServicioMedico extends Usuario {

    /**
     * Default constructor
     */
    public ServicioMedico() {
          //Atributos
  String nombre;  
  String correo;
  String direccion;
  float numeroTelefonico;
  float curp;
  String sexo;
  
        
  public ServicioMedico(String n, String c, String d, float t, float u, String s){
    this.nombre=n;
    this.correo=c;
    this.direccion=d;
    this.numeroTelefonico=t;
    this.curp=u;
    this.sexo=s;

} 
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
     public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

     public float getNumerotelefonico() {
        return numeroTelefonico;
    }
    public void setNumerotelefonico(float numeroTelefonico){
        this.numeroTelefonico=numeroTelefonico;
    }

    public float getCurp() {
        return curp;
    }
    public void setCurp(float curp){
        this.curp=curp;
    }
        
     public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo=sexo;
    }      
}
