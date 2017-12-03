/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.marketmanagement.aplicacao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marco
 */
public class RepositorioBuilder {
    
    private static InputStream arquivo;  // Representa o arquivo físico no disco
    private static Properties prop;      // Responsável por carregar as configurações dentro do arquivo
    
    
    static {
        try {
            arquivo = RepositorioBuilder.class.getResourceAsStream("/config.properties"); //new FileInputStream("config.properties");
            prop = new Properties();
            prop.load(arquivo);
            
        } catch (IOException ex) {
            
            Logger.getLogger(RepositorioBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private static VeiculoRepositorio veiculo;
    
    public static VeiculoRepositorio getVeiculoRepositorio(){
        if(veiculo == null){
            try {
                
                // Carrega a classe
                Class obj = Class.forName(prop.getProperty("VeiculoRepositorio"));
                
                // Cria uma nova instância da classe
                veiculo = (VeiculoRepositorio)obj.newInstance();
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RepositorioBuilder.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(RepositorioBuilder.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(RepositorioBuilder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return veiculo;
    }
    
    private static ClienteRepositorio cliente;
    
    public static ClienteRepositorio getClienteRepositorio(){
        if(cliente == null){
            try {
                
                // Carrega a classe
                Class obj = Class.forName(prop.getProperty("ClienteRepositorio"));
                
                // Cria uma nova instância da classe
                cliente = (ClienteRepositorio)obj.newInstance();
                
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(RepositorioBuilder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cliente;
    }
    
    private static FornecedorRepositorio fornecedor;
    
    public static FornecedorRepositorio getFornecedorRepositorio(){
        if(fornecedor == null){
            try {
                
                // Carrega a classe
                Class obj = Class.forName(prop.getProperty("FornecedorRepositorio"));
                
                // Cria uma nova instância da classe
                fornecedor = (FornecedorRepositorio)obj.newInstance();
                
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(RepositorioBuilder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return fornecedor;
    }
    
    private static EnderecoRepositorio endereco;
    
    public static EnderecoRepositorio getEnderecoRepositorio(){
        if(endereco == null){
            try {
                
                // Carrega a classe
                Class obj = Class.forName(prop.getProperty("EnderecoRepositorio"));
                
                // Cria uma nova instância da classe
                endereco = (EnderecoRepositorio)obj.newInstance();
                
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(RepositorioBuilder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return endereco;
    }
    
}