/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package elephant.web.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author mfe
 */
@ManagedBean(name = "answerBean")
@ViewScoped
public class answerBean {
    
    /**
     * Creates a new instance of answerBean
     */
    public answerBean() {
        this.setName("Martin");
    }
    
    @PostConstruct
    public void init() {
        
//		if (Utility.getApplication().getProjectStage() == ProjectStage.Development) {
//		}
System.out.print("yoyoyo");

    }
    
    private String Name;
    
    /**
     * Get the value of Name
     *
     * @return the value of Name
     */
    public String getName() {
        return Name;
    }
    
    /**
     * Set the value of Name
     *
     * @param Name new value of Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }
    
    
    
}
