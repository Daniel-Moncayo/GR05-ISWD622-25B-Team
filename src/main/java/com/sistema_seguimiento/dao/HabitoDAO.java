package com.sistema_seguimiento.dao;

import com.sistema_seguimiento.model.Categoria;
import com.sistema_seguimiento.model.Habito;
import com.sistema_seguimiento.model.Tarea;
import java.time.LocalDate;
import java.util.ArrayList;
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
    
    /**
     * Obtiene los habitos de un usuario especifico
     * @param usuarioId El ID del usuario
     * @return Lista de habitos del usuario
     */
    public List<Habito> obtenerHabitosPorUsuario(Integer usuarioId) {
        // TODO: Implementar conexion a base de datos
        // Por ahora retornamos datos simulados para pruebas
        return generarDatosPrueba();
    }
    
    /**
     * Genera datos de prueba para visualizacion
     * @return Lista de habitos de ejemplo
     */
    private List<Habito> generarDatosPrueba() {
        List<Habito> habitos = new ArrayList<>();
        
        // Hábito 1: Ejercicio Matutino
        Habito habito1 = new Habito("Ejercicio Matutino", Categoria.EJERCICIO, LocalDate.now().minusDays(7));
        habito1.setId(1);
        Tarea tarea1_1 = new Tarea("Correr 30 minutos");
        tarea1_1.setId(1);
        tarea1_1.setCompletada(true);
        Tarea tarea1_2 = new Tarea("Hacer estiramientos");
        tarea1_2.setId(2);
        tarea1_2.setCompletada(true);
        Tarea tarea1_3 = new Tarea("20 flexiones");
        tarea1_3.setId(3);
        tarea1_3.setCompletada(false);
        habito1.agregarTarea(tarea1_1);
        habito1.agregarTarea(tarea1_2);
        habito1.agregarTarea(tarea1_3);
        habitos.add(habito1);
        
        // Hábito 2: Lectura Diaria
        Habito habito2 = new Habito("Lectura Diaria", Categoria.LECTURA, LocalDate.now().minusDays(14));
        habito2.setId(2);
        Tarea tarea2_1 = new Tarea("Leer 20 páginas");
        tarea2_1.setId(4);
        tarea2_1.setCompletada(true);
        Tarea tarea2_2 = new Tarea("Tomar notas importantes");
        tarea2_2.setId(5);
        tarea2_2.setCompletada(true);
        Tarea tarea2_3 = new Tarea("Resumir capítulo");
        tarea2_3.setId(6);
        tarea2_3.setCompletada(true);
        Tarea tarea2_4 = new Tarea("Reflexionar sobre lo leído");
        tarea2_4.setId(7);
        tarea2_4.setCompletada(true);
        habito2.agregarTarea(tarea2_1);
        habito2.agregarTarea(tarea2_2);
        habito2.agregarTarea(tarea2_3);
        habito2.agregarTarea(tarea2_4);
        habitos.add(habito2);
        
        // Hábito 3: Alimentación Saludable
        Habito habito3 = new Habito("Alimentación Saludable", Categoria.SALUD, LocalDate.now().minusDays(3));
        habito3.setId(3);
        Tarea tarea3_1 = new Tarea("Desayuno nutritivo");
        tarea3_1.setId(8);
        tarea3_1.setCompletada(true);
        Tarea tarea3_2 = new Tarea("Beber 2 litros de agua");
        tarea3_2.setId(9);
        tarea3_2.setCompletada(false);
        Tarea tarea3_3 = new Tarea("Comer 5 porciones de frutas/verduras");
        tarea3_3.setId(10);
        tarea3_3.setCompletada(false);
        Tarea tarea3_4 = new Tarea("Evitar comida chatarra");
        tarea3_4.setId(11);
        tarea3_4.setCompletada(true);
        Tarea tarea3_5 = new Tarea("Cena ligera");
        tarea3_5.setId(12);
        tarea3_5.setCompletada(false);
        habito3.agregarTarea(tarea3_1);
        habito3.agregarTarea(tarea3_2);
        habito3.agregarTarea(tarea3_3);
        habito3.agregarTarea(tarea3_4);
        habito3.agregarTarea(tarea3_5);
        habitos.add(habito3);
        
        // Hábito 4: Productividad en el Trabajo
        Habito habito4 = new Habito("Productividad en el Trabajo", Categoria.PRODUCTIVIDAD, LocalDate.now().minusDays(10));
        habito4.setId(4);
        Tarea tarea4_1 = new Tarea("Planificar día con lista de tareas");
        tarea4_1.setId(13);
        tarea4_1.setCompletada(true);
        Tarea tarea4_2 = new Tarea("Trabajar en tarea más importante");
        tarea4_2.setId(14);
        tarea4_2.setCompletada(true);
        Tarea tarea4_3 = new Tarea("Revisar emails 2 veces al día");
        tarea4_3.setId(15);
        tarea4_3.setCompletada(false);
        habito4.agregarTarea(tarea4_1);
        habito4.agregarTarea(tarea4_2);
        habito4.agregarTarea(tarea4_3);
        habitos.add(habito4);
        
        // Hábito 5: Meditación y Bienestar
        Habito habito5 = new Habito("Meditación y Bienestar", Categoria.BIENESTAR, LocalDate.now().minusDays(5));
        habito5.setId(5);
        Tarea tarea5_1 = new Tarea("Meditar 10 minutos");
        tarea5_1.setId(16);
        tarea5_1.setCompletada(false);
        Tarea tarea5_2 = new Tarea("Practicar gratitud");
        tarea5_2.setId(17);
        tarea5_2.setCompletada(false);
        habito5.agregarTarea(tarea5_1);
        habito5.agregarTarea(tarea5_2);
        habitos.add(habito5);
        
        return habitos;
    }
}
