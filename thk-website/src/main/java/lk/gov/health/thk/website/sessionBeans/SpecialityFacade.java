/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.thk.website.sessionBeans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import lk.gov.health.thk.website.entity.Speciality;

/**
 *
 * @author User
 */
@Stateless
public class SpecialityFacade extends AbstractFacade<Speciality> {

    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SpecialityFacade() {
        super(Speciality.class);
    }
    
}
