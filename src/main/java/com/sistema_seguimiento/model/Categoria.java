package com.sistema_seguimiento.model;

/**
 * Enum que representa las categorias disponibles para los habitos
 */
public enum Categoria {
    PERSONAL,
    ACADEMICO,
    LABORAL;
    
    /**
     * Obtiene todas las categorias disponibles
     * @return Array con todas las categorias
     */
    public static Categoria[] obtenerTodas() {
        return Categoria.values();
    }
}
