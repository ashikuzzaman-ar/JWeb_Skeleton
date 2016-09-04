/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.models.providers;

import com.studevs.models.UserInformation;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ashik
 */
public class UserInformationProvider implements SessionFactoryProvider{
    
    private Session session;
    private Transaction transaction;
//    private 
    
    public Boolean insertUserInformation(UserInformation userInformation){
        
        Boolean isInserted = false;
        
        this.session = SESSION_FACTORY.openSession();
        this.transaction = null;
        
        try {
            
            this.transaction = this.session.beginTransaction();
            this.session.save(userInformation);
            this.transaction.commit();
            isInserted = true;
        } catch (Exception e) {
            
            if(this.transaction!=null){
                
                this.transaction.rollback();
            }
            
//            throw new ExceptionInInitializerError(e);
        }finally{
            
            this.session.close();
        }
        
        return isInserted;
    }
}
