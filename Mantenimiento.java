/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimiento;

/**
 *
 * @author carme
 */
public class Mantenimiento{

    private String seccionReparacion;
    private String materialReparar;
    private String materialNuevo;
    private float costoMaterial;
    private float costoLimpieza;
    private float salarioEmpleado;
    private String horarioEmpleado;

    public Mantenimiento(String seccionReparacion, String materialReparar, String materialNuevo, float costoMaterial, float costoLimpieza, float salarioEmpleado, String horarioEmpleado) {
        this.seccionReparacion = seccionReparacion;
        this.materialReparar = materialReparar;
        this.materialNuevo = materialNuevo;
        this.costoMaterial = costoMaterial;
        this.costoLimpieza = costoLimpieza;
        this.salarioEmpleado = salarioEmpleado;
        this.horarioEmpleado = horarioEmpleado;
    }

    public String getSeccionReparacion() {
        return seccionReparacion;
    }

    public void setSeccionReparacion(String seccionReparacion) {
        this.seccionReparacion = seccionReparacion;
    }

    public String getMaterialReparar() {
        return materialReparar;
    }

    public void setMaterialReparar(String materialReparar) {
        this.materialReparar = materialReparar;
    }

    public String getMaterialNuevo() {
        return materialNuevo;
    }

    public void setMaterialNuevo(String materialNuevo) {
        this.materialNuevo = materialNuevo;
    }

    public float getCostoMaterial() {
        return costoMaterial;
    }

    public void setCostoMaterial(float costoMaterial) {
        this.costoMaterial = costoMaterial;
    }

    public float getCostoLimpieza() {
        return costoLimpieza;
    }

    public void setCostoLimpieza(float costoLimpieza) {
        this.costoLimpieza = costoLimpieza;
    }

    public float getSalarioEmpleado() {
        return salarioEmpleado;
    }

    public void setSalarioEmpleado(float salarioEmpleado) {
        this.salarioEmpleado = salarioEmpleado;
    }

    public String getHorarioEmpleado() {
        return horarioEmpleado;
    }

    public void setHorarioEmpleado(String horarioEmpleado) {
        this.horarioEmpleado = horarioEmpleado;
    }

    @Override
    public String toString() {
        return "Mantenimiento{" + "seccionReparacion=" + seccionReparacion + ", materialReparar=" + materialReparar + ", materialNuevo=" + materialNuevo + ", costoMaterial=" + costoMaterial + ", costoLimpieza=" + costoLimpieza + ", salarioEmpleado=" + salarioEmpleado + ", horarioEmpleado=" + horarioEmpleado + '}';
    }
    
    public static void main(String[] args) {
        
        Mantenimiento parteUno=new Mantenimiento("Salon de clases","Pizarron Electronico","Ninguno",1200,800,2000,"Lunes y Martes");
        
        System.out.println(parteUno.toString());
        
        Mantenimiento parteDos=new Mantenimiento("Oficina Rectoria","Ninguno","Equipo de Computo",30000,0,2000,"Toda la Semana");
        
        System.out.println(parteDos.toString());
        
        
    }
        
    }
 
