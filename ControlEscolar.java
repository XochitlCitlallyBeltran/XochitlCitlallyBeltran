
import java.util.*;

/**
 * 
 */
public class ControlEscolar extends Usuario {

    /**
     * Default constructor
     */
    public ControlEscolar() {
    }
public String nombre;
public String matricula;
public String carrera;
public String grupo;
public Float semestre;
public String curp;
public String sexo;
    
public ControlEscolar(String n, String m, String c, String g, float s, String cu, String se){
    this.nombre=n;
    this.matricula=m;
    this.carrera=c;
    this.grupo=g;
    this.semestre=s;
    this.curp=cu;
    this.sexo=se;
}
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
     public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
     public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }
     public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo){
        this.grupo=grupo;
    }
     public float getSemestre() {
        return semestre;
    }
    public void setSemestre(float semestre){
        this.semestre=semestre;
    }
     public String getCurp() {
        return curp;
    }
    public void setCurp(String curp){
        this.curp=curp;
    }
     public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
}
