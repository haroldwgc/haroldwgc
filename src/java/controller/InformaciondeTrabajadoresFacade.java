/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.InformaciondeTrabajadores;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author harold
 */
@Stateless
public class InformaciondeTrabajadoresFacade extends AbstractFacade<InformaciondeTrabajadores> {

    List<InformaciondeTrabajadores> result;
    List<String> nombreyapellidos;
    List<String> unidad;
    List<String> ubicacion;
    List<String> cargo;
    List<String> nombre;
    List<String> apellido1;
    List<String> apellido2;

    @PersistenceContext(unitName = "AppSigerhPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InformaciondeTrabajadoresFacade() {
        super(InformaciondeTrabajadores.class);
    }

    public List<InformaciondeTrabajadores> directorio() {
        LinkedList<InformaciondeTrabajadores> listado = new LinkedList<>();
        return (List<InformaciondeTrabajadores>) em.createNamedQuery("InformaciondeTrabajadores.findAll").getResultList().stream().distinct().collect(Collectors.toList());
    }

    public List<String> directores() {
        return em.createNamedQuery("InformaciondeTrabajadores.findDirectores").getResultList();
    }

    public String AreaPorNombre(String nombre) {
        return (String)em.createNamedQuery("InformaciondeTrabajadores.findAreaUser").setParameter("nombreyApellidos", nombre + "%").getResultList().toString();
    }

}
