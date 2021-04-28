package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

@RestController
@RequestMapping("/autor")
public class AutoresController {
    @GetMapping("/")
    public List<Autor> consultarAutores() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibrosPU");
        EntityManager em = emf.createEntityManager();
        // Para ejecutar JPQL: createQuery
        // Para ejecutar SQL: createNativeQuery

        List<Autor> lista = em.createQuery("select a from Autor a",Autor.class).getResultList();
        // Criteria API
        em.close();
        emf.close();
        return lista;
    }

    @GetMapping("/{id}")
    public Autor consultarUno(@PathVariable int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibrosPU");
        EntityManager em = emf.createEntityManager();
        Autor encontrado = em.find(Autor.class, id);
        em.close();
        emf.close();
        return encontrado;
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibrosPU");
        EntityManager em = emf.createEntityManager();
        Autor encontrado = em.find(Autor.class, id);
        if (encontrado == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Foo Not Found");
        }

        EntityTransaction t = em.getTransaction();
        t.begin();
        em.remove(encontrado);
        t.commit();
        em.close();
        emf.close();

    }
}
