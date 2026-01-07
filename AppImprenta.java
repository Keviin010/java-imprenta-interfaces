package org.app.poointerfaces.imprenta;
import static org.app.poointerfaces.imprenta.modelo.Genero.*;

import org.app.poointerfaces.imprenta.modelo.Curriculo.*;
import org.app.poointerfaces.imprenta.modelo.*;

public class AppImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("Kevin", "Resumen Laboral...", "Ingeniería en Software");
        cv.addExperiencias("Java");
        cv.addExperiencias("Oracle DBA");
        cv.addExperiencias("Spring Framework");
        cv.addExperiencias("Desarrollador Backend");
        cv.addExperiencias("React, Angular");

        Libro libro = new Libro("Erich Gamma", "Microservicios", PROGRAMACION);

        libro.addPagina(new Pagina("Patrones de diseño"))
                .addPagina(new Pagina("Factory"))
                .addPagina(new Pagina("Singleton"));


        Informe informe = new Informe("Martin Fowler","James","Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);

    }

    public static void imprimir(Hoja imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
