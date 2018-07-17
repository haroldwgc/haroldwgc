/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Estruc;
import beans.InformaciondeTrabajadores;
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
public class EstrucFacade extends AbstractFacade<Estruc> {

    List<InformaciondeTrabajadores> result;
    @PersistenceContext(unitName = "AppSigerhPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstrucFacade() {
        super(Estruc.class);
    }

    public List<String> Areas() {

        return em.createNamedQuery("Estruc.findDescripcion").getResultList();
    }

    public List<String> AreasPorDir(String dir) {

        return (List<String>) em.createNamedQuery("Estruc.findAreaPorDir").setParameter("nombre", dir + "%").getResultList().stream().sorted().distinct().collect(Collectors.toList());
    }
    
   
}
