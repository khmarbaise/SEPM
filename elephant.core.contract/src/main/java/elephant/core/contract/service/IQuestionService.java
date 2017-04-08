/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elephant.core.contract.service;


import elephant.core.domainmodel.Question;
import java.util.ArrayList;

/**
 *
 * @author mfe
 */
public interface IQuestionService {
    ArrayList<Question> GetQuestions();
}
