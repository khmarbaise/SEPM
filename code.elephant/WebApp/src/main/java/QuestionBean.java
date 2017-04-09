/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/


import code.elephant.dao.*;
import code.elephant.domainmodel.*;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author mfe
 */
@ManagedBean(name = "QuestionBean")
@ViewScoped
public class QuestionBean implements Serializable {
    
    
    /**
     * Creates a new instance of QuestionBean
     */
    public QuestionBean() {
        setName("Elephant");
        Question q = new Question();
    }
    
    @PostConstruct
    public void init() {
        QuestionDao dao = new QuestionDao();
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
