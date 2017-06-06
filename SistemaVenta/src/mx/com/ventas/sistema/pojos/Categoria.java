/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ventas.sistema.pojos;

/**
 *
 * @author Ivan Rojo
 */
public class Categoria {
    private int idCategoriaProd;
    private String nomCategoria;
    private String descripCategoria;

    public Categoria(int idCategoriaProd, String nomCategoria, String descripCategoria) {
        this.idCategoriaProd = idCategoriaProd;
        this.nomCategoria = nomCategoria;
        this.descripCategoria = descripCategoria;
    }

    public String getDescripCategoria() {
        return descripCategoria;
    }

    public void setDescripCategoria(String descripCategoria) {
        this.descripCategoria = descripCategoria;
    }

    public int getIdCategoriaProd() {
        return idCategoriaProd;
    }

    public void setIdCategoriaProd(int idCategoriaProd) {
        this.idCategoriaProd = idCategoriaProd;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }
    
    @Override
    public String toString(){
        return this.nomCategoria;
    }
}
