/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubt.kiosk.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author F
 */
@Embeddable
public class PhonePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "person_id")
    private int personId;
    @Basic(optional = false)
    @Column(name = "phone_number")
    private String phoneNumber;

    public PhonePK() {
    }

    public PhonePK(int personId, String phoneNumber) {
        this.personId = personId;
        this.phoneNumber = phoneNumber;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) personId;
        hash += (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PhonePK)) {
            return false;
        }
        PhonePK other = (PhonePK) object;
        if (this.personId != other.personId) {
            return false;
        }
        if ((this.phoneNumber == null && other.phoneNumber != null) || (this.phoneNumber != null && !this.phoneNumber.equals(other.phoneNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.ubt.kiosk.entity.PhonePK[ personId=" + personId + ", phoneNumber=" + phoneNumber + " ]";
    }
    
}
