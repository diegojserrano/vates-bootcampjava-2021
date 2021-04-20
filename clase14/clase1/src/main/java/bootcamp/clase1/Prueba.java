package bootcamp.clase1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Prueba {

    @GetMapping("/")
    public String index() {
        return "Pagina de inicio";
    }

    int contador = 0;

    @GetMapping("/contador")
    public int contador() {
        return ++contador;
    }

    @GetMapping("/v")
    public int[] vector() {
        return new Random()
                .ints(100,1000)
                .limit(20)
                .toArray();
    }
    @GetMapping("/n")
    public int numero() {
        return 42;
    }

    // Puedo devolver un objeto?
    @GetMapping("/p")
    public Persona[] per() {

        Persona p = new Persona(1223,"Juan","Perez");
        return new Persona[] { p, p, p, p, p, p};
    }

    @GetMapping("/sumar/{s1}/{s2}")
    public int sumar(@PathVariable int s1, @PathVariable int s2) {
        return s1 + s2;
    }

}
