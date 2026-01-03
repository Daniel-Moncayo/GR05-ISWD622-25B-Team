package com.sistema_seguimiento.controller;

import com.sistema_seguimiento.dao.HabitoDAO;
import com.sistema_seguimiento.model.Categoria;
import com.sistema_seguimiento.model.Habito;
import com.sistema_seguimiento.view.MensajeGuardado;

import java.time.LocalDate;

/**
 * Controlador para establecer (crear) nuevos habitos
 * Implementa el patron MVC - Controlador
 */
public class EstablecerHabitoController {
    
    private HabitoDAO habitoDAO;
    private MensajeGuardado mensajeGuardado;
    
    /**
     * Constructor del controlador
     * @param habitoDAO DAO para persistencia de habitos
     * @param mensajeGuardado Interfaz para presentar mensajes
     */
    public EstablecerHabitoController(HabitoDAO habitoDAO, MensajeGuardado mensajeGuardado) {
        this.habitoDAO = habitoDAO;
        this.mensajeGuardado = mensajeGuardado;
    }
    
    /**
     * Obtiene todas las categorias disponibles para mostrar en el formulario
     * Paso 2: El controlador obtiene las categorias desde la entidad
     * @return Array con todas las categorias disponibles
     */
    public Categoria[] obtenerCategorias() {
        return Categoria.obtenerTodas();
    }
    
    /**
     * Guarda un nuevo habito
     * Paso 4-5: El usuario llena el formulario y el controlador guarda el habito
     * @param nombreHabito Nombre del habito
     * @param categoria Categoria del habito
     * @param fechaInicio Fecha de inicio del habito
     * @return El habito creado y guardado
     */
    public Habito guardar(String nombreHabito, Categoria categoria, LocalDate fechaInicio) {
        // Crear nueva instancia del objeto Habito
        Habito nuevoHabito = new Habito(nombreHabito, categoria, fechaInicio);
        
        // Guardar usando el DAO
        Habito habitoGuardado = habitoDAO.guardar(nuevoHabito);
        
        // Paso 6: Presentar mensaje de guardado
        if (mensajeGuardado != null) {
            mensajeGuardado.presentar("Habito '" + nombreHabito + "' guardado exitosamente.");
        }
        
        return habitoGuardado;
    }
    
    /**
     * Solicita crear un nuevo habito
     * Paso 1: El usuario solicita crear un nuevo habito
     * Prepara los datos necesarios para mostrar el formulario
     * @return Array de categorias para el formulario
     */
    public Categoria[] solicitarCrearHabito() {
        // Obtener categorias para mostrar en el formulario
        return obtenerCategorias();
    }
}
