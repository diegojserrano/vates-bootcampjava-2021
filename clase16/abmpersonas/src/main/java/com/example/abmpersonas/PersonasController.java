package com.example.abmpersonas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/persona")
public class PersonasController {

    @Autowired
    GestorPersonas g;

    @PostMapping("/{nombre}/{apellido}/{edad}")
    public int agregarPersona2(@Autowired Persona nueva, @PathVariable String nombre, @PathVariable String apellido, @PathVariable int edad) {
        nueva.setNombre(nombre);
        nueva.setApellido(apellido);
        nueva.setEdad(edad);
        return g.agregar(nueva);
    }


    @PostMapping("")
    public int agregarPersona3(@RequestBody Persona nueva) {
        return g.agregar(nueva);
    }

    // GET http://ip/persona/345
    @GetMapping("/{codigo}")
    public Persona buscar(@PathVariable int codigo)
    {
        return g.buscar(codigo);
    }


    // GET http://ip/persona
    @GetMapping("")
    public ArrayList<Persona> listar(@RequestParam(required = false) String filtro)
    {
        if (filtro == null)
            return g.listar();
        else
            return g.buscar(filtro);
    }

    // DELETE http://ip/persona/345
    // al servidor le llega siempre el par ordenado VERBO + URI
    // En Spring:
    @DeleteMapping("/{codigo}")
    // En Java estandar:
    //@DELETE @Path("/persona/{codigo}")
    public boolean eliminar(@PathVariable int codigo)
    {
        return g.eliminar(codigo);
    }

    // Para la semana que viene ver https://youtu.be/rf4ogZXvfTI
}

