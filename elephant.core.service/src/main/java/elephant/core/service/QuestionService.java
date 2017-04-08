/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package elephant.core.service;

import elephant.core.contract.service.IQuestionService;
import elephant.core.domainmodel.Question;
import java.util.ArrayList;

/**
 *
 * @author mfe
 */
public class QuestionService implements IQuestionService {
    
    @Override
    public ArrayList<Question> GetQuestions() {
        ArrayList<Question> list = new ArrayList<Question>() {{
            add( new Question());
            add( new Question());
            add( new Question());
        }};
        return list;
    }
    
}
