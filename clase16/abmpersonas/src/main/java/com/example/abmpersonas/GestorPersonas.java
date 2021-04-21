package com.example.abmpersonas;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@Component
@ApplicationScope
// ambitos:
// aplicacion: dura hasta que se apaga el servidor
// sesion: dura desde la primera peticion de un cliente hasta que se finaliza la sesion
// peticion: dura desde que se inicia una peticion hasta que se envia la respuesta
public class GestorPersonas {


    private ArrayList<Persona> lista = new ArrayList<>();
    public GestorPersonas() {}

    public int agregar(Persona nueva) {
        lista.add(nueva);
        return nueva.getCodigo();
    }

    public ArrayList<Persona> listar() {
        return lista;
    }

    public Persona buscar(int codigo) {
        return lista
                .stream()
                .filter(p -> p.getCodigo() == codigo)
                .findFirst()
                .orElse(null);
    }

    public ArrayList<Persona> buscar(String filtro) {
        return lista.stream()
                .filter(p -> p.getNombre().contains(filtro) ||
                        p.getApellido().contains(filtro) )
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public boolean eliminar(int codigo) {
        boolean existe = lista.stream().anyMatch(p -> p.getCodigo() == codigo);
        if (existe)
            lista.removeIf(p -> p.getCodigo() == codigo);
        return existe;
    }
}
