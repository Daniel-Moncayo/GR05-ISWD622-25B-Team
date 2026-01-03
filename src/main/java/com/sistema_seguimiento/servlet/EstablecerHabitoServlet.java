package com.sistema_seguimiento.servlet;

import com.sistema_seguimiento.controller.EstablecerHabitoController;
import com.sistema_seguimiento.dao.HabitoDAO;
import com.sistema_seguimiento.model.Categoria;
import com.sistema_seguimiento.model.Habito;
import com.sistema_seguimiento.view.MensajeGuardado;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;

/**
 * Servlet que actua como puente entre las vistas JSP y el EstablecerHabitoController
 */
@WebServlet(name = "EstablecerHabitoServlet", urlPatterns = {"/establecer-habito"})
public class EstablecerHabitoServlet extends HttpServlet implements MensajeGuardado {
    
    private EstablecerHabitoController controller;
    private String mensajeActual;
    
    @Override
    public void init() throws ServletException {
        super.init();
        HabitoDAO habitoDAO = new HabitoDAO();
        controller = new EstablecerHabitoController(habitoDAO, this);
        System.out.println("EstablecerHabitoServlet inicializado");
    }
    
    /**
     * GET: Paso 1-3 - El usuario solicita crear un habito, se obtienen categorias y se muestra el formulario
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Paso 1: Usuario solicita crear nuevo habito
        // Paso 2: Controlador obtiene las categorias
        Categoria[] categorias = controller.solicitarCrearHabito();
        
        // Paso 3: Presentar formulario con las categorias
        request.setAttribute("categorias", categorias);
        request.getRequestDispatcher("/WEB-INF/views/establecerHabito.jsp").forward(request, response);
    }
    
    /**
     * POST: Paso 4-6 - El usuario envia el formulario, se guarda el habito y se muestra mensaje
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Paso 4: Obtener datos del formulario
        String nombreHabito = request.getParameter("nombreHabito");
        String categoriaStr = request.getParameter("categoria");
        String fechaInicioStr = request.getParameter("fechaInicio");
        
        // Convertir datos
        Categoria categoria = Categoria.valueOf(categoriaStr);
        LocalDate fechaInicio = LocalDate.parse(fechaInicioStr);
        
        // Paso 5: Guardar el habito usando el controlador
        controller.guardar(nombreHabito, categoria, fechaInicio);
        
        // Paso 6: Presentar mensaje de guardado
        Categoria[] categorias = controller.obtenerCategorias();
        request.setAttribute("categorias", categorias);
        request.setAttribute("mensaje", mensajeActual);
        
        request.getRequestDispatcher("/WEB-INF/views/establecerHabito.jsp").forward(request, response);
    }
    
    /**
     * Implementacion de MensajeGuardado
     * Almacena el mensaje para mostrarlo en la vista
     */
    @Override
    public void presentar(String mensaje) {
        this.mensajeActual = mensaje;
    }
}
