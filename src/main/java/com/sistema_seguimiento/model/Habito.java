package com.sistema_seguimiento.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un Habito en el sistema
 * Implementa el patron Active Record
 */
public class Habito {
    
    private Integer id;
    private String nombre;
    private Categoria categoria;
    private LocalDate fechaInicio;
    private List<Tarea> tareas;
    
    // Constructor vacio
    public Habito() {
        this.tareas = new ArrayList<>();
    }
    
    // Constructor con parametros
    public Habito(String nombre, Categoria categoria, LocalDate fechaInicio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.fechaInicio = fechaInicio;
        this.tareas = new ArrayList<>();
    }
    
    // Getters y Setters
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public List<Tarea> getTareas() {
        return tareas;
    }
    
    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }
    
    /**
     * Agrega una tarea al habito
     * @param tarea La tarea a agregar
     */
    public void agregarTarea(Tarea tarea) {
        if (this.tareas == null) {
            this.tareas = new ArrayList<>();
        }
        tarea.setHabito(this);
        this.tareas.add(tarea);
    }
    
    /**
     * Elimina una tarea del habito
     * @param tarea La tarea a eliminar
     */
    public void eliminarTarea(Tarea tarea) {
        if (this.tareas != null) {
            this.tareas.remove(tarea);
        }
    }
    
    /**
     * Calcula el porcentaje de progreso del habito
     * @return Porcentaje de tareas completadas (0-100)
     */
    public double calcularProgreso() {
        if (tareas == null || tareas.isEmpty()) {
            return 0.0;
        }
        long tareasCompletadas = tareas.stream().filter(Tarea::isCompletada).count();
        return (tareasCompletadas * 100.0) / tareas.size();
    }
    
    /**
     * Obtiene el numero de tareas completadas
     * @return Cantidad de tareas completadas
     */
    public int getTareasCompletadas() {
        if (tareas == null) {
            return 0;
        }
        return (int) tareas.stream().filter(Tarea::isCompletada).count();
    }
    
    @Override
    public String toString() {
        return "Habito{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", fechaInicio=" + fechaInicio +
                ", cantidadTareas=" + (tareas != null ? tareas.size() : 0) +
                '}';
    }
}
