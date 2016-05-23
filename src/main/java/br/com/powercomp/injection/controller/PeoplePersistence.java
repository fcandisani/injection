package br.com.powercomp.injection.controller;

import br.com.powercomp.injection.business.dao.PeopleDAODB;
import javax.ejb.EJB;
import javax.ejb.Stateless;

//anotacao EJB para iniciar um ManageBean
@Stateless
public class PeoplePersistence {
    
    
    //injecao de dependencia com anotacao EJB
    @EJB
    public PeopleDAODB pDAO;   
    
    
    public void save(){
    
        pDAO.save();
    
    }    
}
