/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elephant.core.domainmodel;

import java.util.ArrayList;

/**
 *
 * @author mfe
 */
public class Question {

    public Question() {
        this.Answers = new ArrayList();
    }
    
    private String question;

    /**
     * Get the value of question
     *
     * @return the value of question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Set the value of question
     *
     * @param question new value of question
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    private ArrayList<Answer> Answers;

    /**
     * Get the value of Answers
     *
     * @return the value of Answers
     */
    public ArrayList<Answer> getAnswers() {
        return Answers;
    }

    /**
     * Set the value of Answers
     *
     * @param Answers new value of Answers
     */
    public void setAnswers(ArrayList<Answer> Answers) {
        this.Answers = Answers;
    }

}
