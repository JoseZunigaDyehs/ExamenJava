/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jose
 */
@Entity
@Table(name = "pago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pago.findAll", query = "SELECT p FROM Pago p")
    , @NamedQuery(name = "Pago.findByIdPago", query = "SELECT p FROM Pago p WHERE p.idPago = :idPago")
    , @NamedQuery(name = "Pago.findByNombrePago", query = "SELECT p FROM Pago p WHERE p.nombrePago = :nombrePago")})
public class Pago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id_pago")
    private int idPago;
    @Id
    @Basic(optional = false)
    @Column(name = "nombre_pago")
    private String nombrePago;

    public Pago() {
    }

    public Pago(String nombrePago) {
        this.nombrePago = nombrePago;
    }

    public Pago(String nombrePago, int idPago) {
        this.nombrePago = nombrePago;
        this.idPago = idPago;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getNombrePago() {
        return nombrePago;
    }

    public void setNombrePago(String nombrePago) {
        this.nombrePago = nombrePago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombrePago != null ? nombrePago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pago)) {
            return false;
        }
        Pago other = (Pago) object;
        if ((this.nombrePago == null && other.nombrePago != null) || (this.nombrePago != null && !this.nombrePago.equals(other.nombrePago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Pago[ nombrePago=" + nombrePago + " ]";
    }
    
}
