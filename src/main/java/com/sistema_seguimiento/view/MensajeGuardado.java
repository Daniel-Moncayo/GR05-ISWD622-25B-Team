package com.sistema_seguimiento.view;

/**
 * Interfaz para presentar mensajes al usuario
 * Implementa el patron de interfaz para la capa de vista
 */
public interface MensajeGuardado {
    
    /**
     * Presenta un mensaje al usuario
     * @param mensaje El mensaje a presentar
     */
    void presentar(String mensaje);
}
