/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.com.senac.dao;

import br.com.senac.entidade.Usuario;
import org.hibernate.Session;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author faels
 */
public class UsuarioDaoImplTest {
    
    private Usuario usuario;
    private UsuarioDao usuarioDao;
    private Session sessao;
    
    public UsuarioDaoImplTest() {
        usuarioDao = new UsuarioDaoImpl();
    }
    
  
    @Test
    public void testSalvar() {
        System.out.println("Salvar");
        usuario = new Usuario(null, "Rafael", "111.111.111.-44", "teste@teste.com", "5.555.555");
        sessao = HibernateUtil.abrirConexao();
        usuarioDao.salvarOuAlterar(usuario, sessao);
        sessao.close();
        
        assertNotNull(usuario.getId());
       
    }
   // @Test
    public void testPesquisarPorId() {
        System.out.println("pesquisarPorId");
       
    }
    
}
