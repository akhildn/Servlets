package com.training.servlet;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Sample
 *
 */
@WebListener
public class Sample implements ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public Sample() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
         // TODO Auto-generated method stub
    }
	
}
