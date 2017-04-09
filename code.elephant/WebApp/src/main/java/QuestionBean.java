/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/


import elephant.core.domainmodel.Question;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author mfe
 */
@ManagedBean(name = "QuestionBean")
@ViewScoped
public class QuestionBean {
    
    /**
     * Creates a new instance of QuestionBean
     */
    public QuestionBean() {
        Question q = new Question();
    }
    
    @PostConstruct
    public void init() {
        System.out.print("yoyoyo");
    }
    
    
}
