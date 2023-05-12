package com.raithanna.dairy.RaithannaDairy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Map;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class purchaseOrder extends DownloadSuperBean{
    @Id
    @GeneratedValue
    private Integer id;
    private Integer slNo;
    private String invDate;
    private String invNo;
    private String supplier;
    private String suplCode;
    private String vehNumber;
    private String milkType;
    private Double quantity;
    private Double fatP;
    private Double snfP;
    private Double tsRate;
    private Double ltrRate;
    private Double amt;
    private String code;
    private String paymentStatus;
    private String bankIfsc;
    private String bankrefno;
    private String recDate;
    private Integer orderNo;
    public String[] getListValues(){
        String values[] = {this.invDate.toString(), this.invNo,this.supplier, this.vehNumber, this.milkType,this.quantity.toString(), this.fatP.toString(), this.snfP.toString(), this.tsRate.toString(), this.ltrRate.toString(), this.amt.toString(), this.paymentStatus, this.bankIfsc,this.bankrefno,this.recDate.toString()};
        return values;
    }

   public void mapToVariables(@NotNull Map purchase) throws ParseException {
       this.supplier = purchase.get("supplier").toString();
   }

}
