/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elephant.core.dao;

/**
 *
 * @author mfe
 */
public abstract class BaseDao<T>  {
    
    protected Class<T> _EntityClass;
    
    public BaseDao(Class entityClass) {
        _EntityClass = entityClass;
    }
    
    
}
