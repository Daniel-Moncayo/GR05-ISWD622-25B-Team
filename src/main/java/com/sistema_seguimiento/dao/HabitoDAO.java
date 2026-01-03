package com.sistema_seguimiento.dao;

import com.sistema_seguimiento.model.Categoria;
import com.sistema_seguimiento.model.Habito;
import java.util.List;
import java.util.Optional;

/**
 * DAO para la clase Habito
 * Implementa el patron Active Record para la persistencia de habitos
 */
public class HabitoDAO {
    
    /**
     * Guarda un nuevo habito en la base de datos
     * @param habito El habito a guardar
     * @return El habito guardado con su ID asignado
     */
    public Habito guardar(Habito habito) {
        // TODO: Implementar conexion a base de datos
        return habito;
    }
    
    /**
     * Actualiza un habito existente en la base de datos
     * @param habito El habito a actualizar
     * @return El habito actualizado
     */
    public Habito actualizar(Habito habito) {
        // TODO: Implementar conexion a base de datos
        return habito;
    }
    
    /**
     * Elimina un habito de la base de datos
     * @param id El ID del habito a eliminar
     * @return true si se elimino correctamente, false en caso contrario
     */
    public boolean eliminar(Integer id) {
        // TODO: Implementar conexion a base de datos
        return false;
    }
    
    /**
     * Busca un habito por su ID
     * @param id El ID del habito
     * @return Optional con el habito si existe
     */
    public Optional<Habito> buscarPorId(Integer id) {
        // TODO: Implementar conexion a base de datos
        return Optional.empty();
    }
    
    /**
     * Busca habitos por categoria
     * @param categoria La categoria a buscar
     * @return Lista de habitos de esa categoria
     */
    public List<Habito> buscarPorCategoria(Categoria categoria) {
        // TODO: Implementar conexion a base de datos
        return List.of();
    }
    
    /**
     * Obtiene todos los habitos
     * @return Lista de todos los habitos
     */
    public List<Habito> obtenerTodos() {
        // TODO: Implementar conexion a base de datos
        return List.of();
    }
}
