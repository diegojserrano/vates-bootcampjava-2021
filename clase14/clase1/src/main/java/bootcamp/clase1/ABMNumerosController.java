package bootcamp.clase1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/numeros")
public class ABMNumerosController {

    private ArrayList<Integer> lista = new ArrayList<>();

    @GetMapping("/agregar/{numeroNuevo}")
    public void agregar(@PathVariable int numeroNuevo) {
        lista.add(numeroNuevo);
    }

    @GetMapping("/listar")
    public ArrayList<Integer> listar() {
        return lista;
    }

    @GetMapping("/buscar/{numero}")
    public boolean buscar(@PathVariable int numero) {
        return lista.contains(numero);
    }

    @GetMapping("/eliminar/{numero}")
    public void eliminar(@PathVariable int numero) {
        lista.removeIf(x -> x == numero);
    }



}
