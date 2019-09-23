package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.EmployeeEntity;

/**
 * Session Bean implementation class EmployeeEJB
 */
@Stateless
@LocalBean
public class EmployeeEJB {

    @PersistenceContext
    private EntityManager em;
    public EmployeeEJB() {	
    }
    
    public void addNew(EmployeeEntity employeeentity)
	{
	  System.out.println("===adding to database====");
	  em.persist(employeeentity);
	}

}
