/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.models.providers;

import java.io.Serializable;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author ashik
 */
public interface SessionFactoryProvider extends Serializable{
    
    public static final SessionFactory SESSION_FACTORY = new AnnotationConfiguration().configure().buildSessionFactory();
}
