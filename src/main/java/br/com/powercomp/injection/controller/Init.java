package br.com.powercomp.injection.controller;

import javax.ejb.EJB;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class Init implements ServletContextListener{

    //injecao de dependencia com anotacao EJB
    @EJB
    PeoplePersistence p;
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //apos carregamendo das classes pelo container 
        //metodo de uma classe injetada responsavel pela persistencia
        p.save();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
        
    }
    
}
