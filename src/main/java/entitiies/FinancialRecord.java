/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitiies;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author gduresso
 */
@Entity
public class FinancialRecord  implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public Long getId() {
        return id;
    }
  //@Column(name = "transactionId")
    private Long transactionId;
    //@Column(name = "ccNumbeer")
    private String ccNumbeer;

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public FinancialRecord() {
    }

    public String getCcNumbeer() {
        return ccNumbeer;
    }

    public void setCcNumbeer(String ccNumbeer) {
        this.ccNumbeer = ccNumbeer;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(long vendorId) {
        this.vendorId = vendorId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public Double getProfitToMycompany() {
        return profitToMycompany;
    }

    public void setProfitToMycompany(Double profitToMycompany) {
        this.profitToMycompany = profitToMycompany;
    }

    public Double getAmountToVendor() {
        return amountToVendor;
    }

    public void setAmountToVendor(Double amountToVendor) {
        this.amountToVendor = amountToVendor;
    }

    public Date getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setDateOfTransaction(Date dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }
    //@Column(name = "vendorId")
    private Long vendorId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
   // @Column(name = "totalAmount")
    private Double totalAmount;
   // @Column(name = "Profit")
    private Double profit;
  //@Column(name = "profitToMycompany")
    private Double profitToMycompany;
    //@Column(name = "amountToVendor")
    private Double amountToVendor;
   // @Column(name = "dateOfTransaction")
    @Temporal(TemporalType.DATE)
    private Date dateOfTransaction;
//    public FinancialRecord(long transactionId, String ccNumbeer, long vendorId, Double totalAmount, Double profit, Double profitToMycompany, Double amountToVendor, Date dateOfTransaction) {
//        this.transactionId = transactionId;
//        this.ccNumbeer = ccNumbeer;
//        this.vendorId = vendorId;
//        this.totalAmount = totalAmount;
//        this.profit = profit;
//        this.profitToMycompany = profitToMycompany;
//        this.amountToVendor = amountToVendor;
//        this.dateOfTransaction = dateOfTransaction;
//    }
  
    public void setId(Long id) {
        this.id = id;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FinancialRecord)) {
            return false;
        }
        FinancialRecord other = (FinancialRecord) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "entitiies.FinancialRecord[ id=" + id + " ]";
    }
    
}
