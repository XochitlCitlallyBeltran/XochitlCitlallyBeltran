
import java.util.*;

/**
 * 
 */
public class Alumnos extends Usuario {

    /**
     * Default constructor
     */
    public Alumnos() {
    }
public String matricula;
public float semestre;
public String carrera;

public Alumnos(String m,float s,String c){
    this.matricula=m;
    this.semestre=s;
    this.carrera=c;
}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getSemestre() {
        return semestre;
    }

    public void setSemestre(float semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

}