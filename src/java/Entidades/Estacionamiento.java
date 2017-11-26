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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "estacionamiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estacionamiento.findAll", query = "SELECT e FROM Estacionamiento e")
    , @NamedQuery(name = "Estacionamiento.findByIdEstacionamiento", query = "SELECT e FROM Estacionamiento e WHERE e.idEstacionamiento = :idEstacionamiento")
    , @NamedQuery(name = "Estacionamiento.findByNombreEstacionamiento", query = "SELECT e FROM Estacionamiento e WHERE e.nombreEstacionamiento = :nombreEstacionamiento")
    , @NamedQuery(name = "Estacionamiento.findByPrecioEstacionamiento", query = "SELECT e FROM Estacionamiento e WHERE e.precioEstacionamiento = :precioEstacionamiento")
    , @NamedQuery(name = "Estacionamiento.findByTicketEstacionamiento", query = "SELECT e FROM Estacionamiento e WHERE e.ticketEstacionamiento = :ticketEstacionamiento")})
public class Estacionamiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estacionamiento")
    private Integer idEstacionamiento;
    @Basic(optional = false)
    @Column(name = "nombre_estacionamiento")
    private String nombreEstacionamiento;
    @Basic(optional = false)
    @Column(name = "precio_estacionamiento")
    private int precioEstacionamiento;
    @Basic(optional = false)
    @Column(name = "ticket_estacionamiento")
    private int ticketEstacionamiento;

    public Estacionamiento() {
    }

    public Estacionamiento(Integer idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public Estacionamiento(Integer idEstacionamiento, String nombreEstacionamiento, int precioEstacionamiento, int ticketEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
        this.nombreEstacionamiento = nombreEstacionamiento;
        this.precioEstacionamiento = precioEstacionamiento;
        this.ticketEstacionamiento = ticketEstacionamiento;
    }

    public Integer getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(Integer idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public String getNombreEstacionamiento() {
        return nombreEstacionamiento;
    }

    public void setNombreEstacionamiento(String nombreEstacionamiento) {
        this.nombreEstacionamiento = nombreEstacionamiento;
    }

    public int getPrecioEstacionamiento() {
        return precioEstacionamiento;
    }

    public void setPrecioEstacionamiento(int precioEstacionamiento) {
        this.precioEstacionamiento = precioEstacionamiento;
    }

    public int getTicketEstacionamiento() {
        return ticketEstacionamiento;
    }

    public void setTicketEstacionamiento(int ticketEstacionamiento) {
        this.ticketEstacionamiento = ticketEstacionamiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstacionamiento != null ? idEstacionamiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estacionamiento)) {
            return false;
        }
        Estacionamiento other = (Estacionamiento) object;
        if ((this.idEstacionamiento == null && other.idEstacionamiento != null) || (this.idEstacionamiento != null && !this.idEstacionamiento.equals(other.idEstacionamiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Estacionamiento[ idEstacionamiento=" + idEstacionamiento + " ]";
    }
    
}
