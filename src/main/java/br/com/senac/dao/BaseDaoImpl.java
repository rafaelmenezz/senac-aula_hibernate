
package br.com.senac.dao;

import org.hibernate.*;

/**
 *
 * @author faels
 * @param <T> representa  qualquer classe entidade
 * @param <ID> representa qualquer chave primária
 */
public abstract class BaseDaoImpl<T , ID> implements BaseDao<T, ID>{
    
    private Transaction transaction;

    @Override
    public void salvarOuAlterar(T entidade, Session sessao) throws HibernateException {
     
        transaction = sessao.beginTransaction();
        sessao.saveOrUpdate(entidade);
        transaction.commit();
        
    }

    @Override
    public void excluir(T entidade, Session sessao) throws HibernateException {
        transaction = sessao.beginTransaction();
        sessao.delete(entidade);
        transaction.commit();  
    }


    
}
