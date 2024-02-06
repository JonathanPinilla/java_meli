package IntroduccionJava.P2VIVO;

import java.util.HashSet;
import java.util.Set;

public class Categoria {

    private int distancia;
    private String descripcion;
    private int precioMenor;
    private int precioMayor;
    private Set<Participante> participantes = new HashSet<>();

    public Categoria(int distancia, String descripcion, int precioMenor, int precioMayor, Set<Participante> participantes) {
        this.distancia = distancia;
        this.descripcion = descripcion;
        this.precioMenor = precioMenor;
        this.precioMayor = precioMayor;
        this.participantes = participantes;
    }

    public Categoria(int distancia, String descripcion, int precioMayor, Set<Participante> participantes) {
        this.distancia = distancia;
        this.descripcion = descripcion;
        this.precioMenor = 0;
        this.precioMayor = precioMayor;
        this.participantes = participantes;
    }
}
