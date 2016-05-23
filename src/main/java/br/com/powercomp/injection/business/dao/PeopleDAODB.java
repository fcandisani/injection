package br.com.powercomp.injection.business.dao;

import javax.ejb.Stateless;

//anotacao EJB para iniciar um ManageBean
@Stateless
public class PeopleDAODB {
    
     
    
    public PeopleDAODB(){
    
    }
    
    public void save(){
    
        System.out.println("Saving object ... ");
    }
    
}
