/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.VtrabTecnicos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author harold
 */
@Stateless
public class VtrabTecnicosFacade extends AbstractFacade<VtrabTecnicos> {

    @PersistenceContext(unitName = "AppSigerhPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VtrabTecnicosFacade() {
        super(VtrabTecnicos.class);
    }
    
}
