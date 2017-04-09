/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.elephant.contract.dao;

import java.util.List;

import code.elephant.domainmodel.Question;

/**
 *
 * @author mfe
 */
public interface IQuestionDao {
    public List<Question> findAll();
}
