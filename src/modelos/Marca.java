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
public abstract class Marca {
    
    protected String nomeDaMarca;
    protected String enderecoAnexoMarca;

    /**
     * @return the nomeDaMarca
     */
    public String getNomeDaMarca() {
        return nomeDaMarca;
    }

    /**
     * @param nomeDaMarca the nomeDaMarca to set
     */
    public void setNomeDaMarca(String nomeDaMarca) {
        this.nomeDaMarca = nomeDaMarca;
    }

    /**
     * @return the enderecoAnexoMarca
     */
    public String getEnderecoAnexoMarca() {
        return enderecoAnexoMarca;
    }

    /**
     * @param enderecoAnexoMarca the enderecoAnexoMarca to set
     */
    public void setEnderecoAnexoMarca(String enderecoAnexoMarca) {
        this.enderecoAnexoMarca = enderecoAnexoMarca;
    }
    
}
