package com.sistema_seguimiento.dao;

import com.sistema_seguimiento.model.Habito;
import com.sistema_seguimiento.model.Tarea;
import java.util.List;
import java.util.Optional;

/**
 * DAO para la clase Tarea
 * Implementa el patron Active Record para la persistencia de tareas
 */
public class TareaDAO {
    
    /**
     * Guarda una nueva tarea en la base de datos
     * @param tarea La tarea a guardar
     * @return La tarea guardada con su ID asignado
     */
    public Tarea guardar(Tarea tarea) {
        // TODO: Implementar conexion a base de datos
        return tarea;
    }
    
    /**
     * Actualiza una tarea existente en la base de datos
     * @param tarea La tarea a actualizar
     * @return La tarea actualizada
     */
    public Tarea actualizar(Tarea tarea) {
        // TODO: Implementar conexion a base de datos
        return tarea;
    }
    
    /**
     * Elimina una tarea de la base de datos
     * @param id El ID de la tarea a eliminar
     * @return true si se elimino correctamente, false en caso contrario
     */
    public boolean eliminar(Integer id) {
        // TODO: Implementar conexion a base de datos
        return false;
    }
    
    /**
     * Busca una tarea por su ID
     * @param id El ID de la tarea
     * @return Optional con la tarea si existe
     */
    public Optional<Tarea> buscarPorId(Integer id) {
        // TODO: Implementar conexion a base de datos
        return Optional.empty();
    }
    
    /**
     * Busca tareas por habito
     * @param habito El habito asociado
     * @return Lista de tareas del habito
     */
    public List<Tarea> buscarPorHabito(Habito habito) {
        // TODO: Implementar conexion a base de datos
        return List.of();
    }
    
    /**
     * Obtiene todas las tareas
     * @return Lista de todas las tareas
     */
    public List<Tarea> obtenerTodas() {
        // TODO: Implementar conexion a base de datos
        return List.of();
    }
}
