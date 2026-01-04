package com.sistema_seguimiento.model;

/**
 * Clase que representa una Tarea asociada a un Habito
 * Un habito puede contener ninguna o varias tareas
 */
public class Tarea {
    
    private Integer id;
    private String nombreTarea;
    private Habito habito;
    private boolean completada;
    
    // Constructor vacio
    public Tarea() {
        this.completada = false;
    }
    
    // Constructor con parametros
    public Tarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
        this.completada = false;
    }
    
    // Constructor con habito
    public Tarea(String nombreTarea, Habito habito) {
        this.nombreTarea = nombreTarea;
        this.habito = habito;
        this.completada = false;
    }
    
    // Getters y Setters
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNombreTarea() {
        return nombreTarea;
    }
    
    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }
    
    public Habito getHabito() {
        return habito;
    }
    
    public void setHabito(Habito habito) {
        this.habito = habito;
    public boolean isCompletada() {
        return completada;
    }
    
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", nombreTarea='" + nombreTarea + '\'' +
                ", completada=" + completada
                "id=" + id +
                ", nombreTarea='" + nombreTarea + '\'' +
                ", habitoId=" + (habito != null ? habito.getId() : null) +
                '}';
    }
}
