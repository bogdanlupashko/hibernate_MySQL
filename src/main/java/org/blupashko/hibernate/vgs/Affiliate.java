package org.blupashko.hibernate.vgs;

/**
 * Created by blupashko on 25.03.2015.
 */
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity
@Table(name = "affiliate")
public class Affiliate {
    private Integer id;
    private String name;

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String address;
    private String phone;
    private String contactName;
    private Integer comission;
    private String code;
    private String adress;
    private Integer commision;
@Column(name = "adress")
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
@Column(name = "commision")
    public Integer getCommision() {
        return commision;
    }

    public void setCommision(Integer commision) {
        this.commision = commision;
    }

    public Affiliate() {
    }

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Column(name = "contactName")
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contacctName) {
        this.contactName = contacctName;
    }
    @Column(name = "comission")
    public Integer getComission() {
        return comission;
    }

    public void setComission(Integer comission) {
        this.comission = comission;
    }
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
