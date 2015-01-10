/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entitiies.FinancialRecord;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.GregorianCalendar;
/**
 *
 * @author gduresso
 */
@Stateless
@Path("entitiies.financialrecord")
public class FinancialRecordFacadeREST extends AbstractFacade<FinancialRecord> {
    @PersistenceContext(unitName = "com.Testmyfiance_test3_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public FinancialRecordFacadeREST() {
        super(FinancialRecord.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(FinancialRecord entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Long id, FinancialRecord entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public FinancialRecord find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<FinancialRecord> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<FinancialRecord> findRange(@PathParam("from") int from, @PathParam("to") int to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @POST
     @Path("save")
    @Consumes({"application/xml", "application/json"})
    public void saveFinancialRecord(@QueryParam("transactionId") Long transactionId,
                            @QueryParam("ccNumbeer") String ccNumbeer,
                            @QueryParam("vendorId") Long vendorId,
                            @QueryParam("totalAmount") Double totalAmount,
                           // @QueryParam("totalAmount") Double totalAmount,
                            @QueryParam("Profit") Double profit,
                            @QueryParam("profitToMycompany") Double profitToMycompany,
                            @QueryParam("amountToVendor") Double amountToVendor,
                            @QueryParam("dateOfTransaction") String dateOfTransaction
                            ) throws ParseException {
        
      // this.create(newfinancialrecord);
      DateFormat format = 
            DateFormat.getDateInstance(DateFormat.SHORT);
         Date date = format.parse(dateOfTransaction);  
         
FinancialRecord newfinancialrecord = new FinancialRecord();
newfinancialrecord.setAmountToVendor(amountToVendor);
newfinancialrecord.setCcNumbeer(ccNumbeer);
newfinancialrecord.setDateOfTransaction(date);
newfinancialrecord.setProfit(profit);
newfinancialrecord.setProfitToMycompany(profitToMycompany);
newfinancialrecord.setTotalAmount(totalAmount);
newfinancialrecord.setTransactionId(transactionId);
newfinancialrecord.setVendorId(vendorId);
       super.create(newfinancialrecord);
    }
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
