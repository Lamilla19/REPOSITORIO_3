/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author David
 */
public class Curso implements IAsignacion{
    private String nombre;
    private String seccion;
    private String asignatura;
    
    public Curso(){
        nombre="";
        seccion="";
        asignatura="";    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
   
    public String BuscarCurso(){
        String x="";
        String materias[]={"Innovación Técnologica","Cambio de Violencia","Prevención y mal uso de la Técnologia",
                           "Ambiente","Vida Saludable"};
        String cursos[]={"2do Informatica","1ro Informatica","3ro Contabilidad","2do Ciencias","2do Contabilidad"};
        
        for(int i=0;i<materias.length;i++){
            if(this.asignatura.compareToIgnoreCase(materias[i])==0){
                x=cursos[i];   
            }
            
        } 
        return x;  
    }
    
    @Override
    public String AsignarCurso(){
        return "Asignación de Curso de PPE";
    }
    @Override
    public String toString(){
        return "\n"+AsignarCurso()+"\nNombre: "+nombre+"\nSeccion: "+seccion+"\nAsignatura: "+asignatura+"\nCurso Asiganado: "+BuscarCurso();
            
    }            
}
    

