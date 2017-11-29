/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubt.kiosk.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author F
 */
@Entity
@Table(name = "Phone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Phone.findAll", query = "SELECT p FROM Phone p"),
    @NamedQuery(name = "Phone.findByPersonId", query = "SELECT p FROM Phone p WHERE p.phonePK.personId = :personId"),
    @NamedQuery(name = "Phone.findByPhoneNumber", query = "SELECT p FROM Phone p WHERE p.phonePK.phoneNumber = :phoneNumber")})
public class Phone implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PhonePK phonePK;
    @JoinColumn(name = "person_id", referencedColumnName = "person_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Person person;

    public Phone() {
    }

    public Phone(PhonePK phonePK) {
        this.phonePK = phonePK;
    }

    public Phone(int personId, String phoneNumber) {
        this.phonePK = new PhonePK(personId, phoneNumber);
    }

    public PhonePK getPhonePK() {
        return phonePK;
    }

    public void setPhonePK(PhonePK phonePK) {
        this.phonePK = phonePK;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (phonePK != null ? phonePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Phone)) {
            return false;
        }
        Phone other = (Phone) object;
        if ((this.phonePK == null && other.phonePK != null) || (this.phonePK != null && !this.phonePK.equals(other.phonePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.ubt.kiosk.entity.Phone[ phonePK=" + phonePK + " ]";
    }
    
}
