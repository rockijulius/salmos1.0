/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.salmos.infrastructure.service;

/**
 *
 * @author rocki.julius
 */

public class FacadeInstance {
     /**
     * Represents the singleton instance of the class.
     */
    private static IFacade fachadaInstance;

    /**
     * Object monitor for synchronize.
     */
    private static final Object MONITOR = new Object();
    
    /**
     * Create a new instance of this class.
     */
    public FacadeInstance() {
        super();
    }
    
    /**
     * Return a new instance of Facade if there's not.
     * @return 
     */
    public static IFacade getInstance() {
        synchronized (MONITOR) {
            if (fachadaInstance == null) {
                fachadaInstance = new Facade();
            }
        }
        return fachadaInstance;
    }
}
