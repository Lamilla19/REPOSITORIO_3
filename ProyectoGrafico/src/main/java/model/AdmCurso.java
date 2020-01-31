/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class AdmCurso {
    ArrayList <Curso> cursos=null;
    Curso curso=null;
    private static AdmCurso admcurso = null;
    
    public AdmCurso(){
        cursos = new ArrayList<>();
        
    }
    public static AdmCurso getAdmCurso(){
        if(admcurso==null)
           admcurso= new AdmCurso();
        return admcurso;
    }
    public boolean verificar(String nombre, String seccion, String asignatura){
        boolean x=false;
        
        if(!nombre.isEmpty()&&!seccion.isEmpty()&&!asignatura.isEmpty()){
            if(!esteNombre(nombre))
            x=true;
        }
        return x;
    }
     private boolean esteNombre(String nombre){
        boolean y = false;
        int i=0;
        for(Curso  p: cursos ){
            
            if(p.getNombre().compareTo(nombre)==0){
                y=true;
            }
                  
        }   
        return y;
     }    
    public String Guardar(String nombre,String seccion, String asignatura){
        String x = " ";
        curso = new Curso();
        curso.setNombre(nombre);
        curso.setSeccion(seccion);
        curso.setAsignatura(asignatura);
        cursos.add(curso);
        x = curso.toString();
        return x;
    }
    
}
