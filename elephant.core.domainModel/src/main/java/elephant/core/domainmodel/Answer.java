/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elephant.core.domainmodel;

/**
 *
 * @author mfe
 */
public class Answer {

    public Answer() {
    }
    
    private String Text;

    /**
     * Get the value of Text
     *
     * @return the value of Text
     */
    public String getText() {
        return Text;
    }

    /**
     * Set the value of Text
     *
     * @param Text new value of Text
     */
    public void setText(String Text) {
        this.Text = Text;
    }

}
