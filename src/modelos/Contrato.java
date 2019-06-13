/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Kevin
 */
public abstract class Contrato {
    
    String id;
    String idCliente;
    String idVeiculo;
    String nomeFuncionario;
    String valorFinal;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the idVeiculo
     */
    public String getIdVeiculo() {
        return idVeiculo;
    }

    /**
     * @param idVeiculo the idVeiculo to set
     */
    public void setIdVeiculo(String idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    /**
     * @return the nomeFuncionario
     */
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    /**
     * @param nomeFuncionario the nomeFuncionario to set
     */
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    /**
     * @return the valorFinal
     */
    public String getValorFinal() {
        return valorFinal;
    }

    /**
     * @param valorFinal the valorFinal to set
     */
    public void setValorFinal(String valorFinal) {
        this.valorFinal = valorFinal;
    }

    /**
     * @return the idCliente
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
    
}
