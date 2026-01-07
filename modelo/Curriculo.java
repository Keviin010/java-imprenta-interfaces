package org.app.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja{

    private String persona;
    private  String carrera;
    private List<String> experiencias;

    public Curriculo(String persona, String contenido, String carerra) {
        super(contenido);
        this.persona = persona;
        this.carrera = carerra;
        this.experiencias = new ArrayList<>();
    }
    public Curriculo addExperiencias (String exp){
        experiencias.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre:");
        sb.append(persona).append("\n")
                .append("Resumen: ")
                .append(this.contenido).append("\n")
                .append("Profesión: ")
                .append(this.carrera).append("\n")
                .append(" Experiencias: ");
        for (String exp: this.experiencias){
            sb.append("-").append(exp).append("\n");
        }
        return sb.toString();
    }
}
