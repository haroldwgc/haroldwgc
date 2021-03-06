/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.VPromTrabProv;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author harold
 */
@Stateless
public class VPromTrabProvFacade extends AbstractFacade<VPromTrabProv> {

    @PersistenceContext(unitName = "AppSigerhPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VPromTrabProvFacade() {
        super(VPromTrabProv.class);
    }
    
}
