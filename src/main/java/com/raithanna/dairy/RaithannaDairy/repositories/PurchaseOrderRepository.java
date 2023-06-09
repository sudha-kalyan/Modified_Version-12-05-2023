package com.raithanna.dairy.RaithannaDairy.repositories;
import com.azure.spring.data.cosmos.repository.Query;
import com.raithanna.dairy.RaithannaDairy.models.customer;
import com.raithanna.dairy.RaithannaDairy.models.purchaseOrder;
import org.springframework.data.repository.CrudRepository;
import java.time.LocalDate;
import java.util.List;

public interface PurchaseOrderRepository extends CrudRepository<purchaseOrder,Integer> {
  // List<purchaseOrder> findByOrderBySlNo();
  // List<purchaseOrder> findByOrderByAmtDesc();
   //   @Query("select count(*) from  purchase_order where supplier=?1 and recDate=?2")
//   Integer findBySupplierAndRecDate(String supplier,LocalDate recDate);
   @Query("select count(*) from  purchase_order where supplier=?1 and invDate=?2")
   Integer countBySupplierAndInvDate(String supplier,LocalDate invDate);

//   @Query("select * from  purchase_order where supplier=?1 and recDate=?2")
//   purchaseOrder findBySupplierAndRecDate(String supplier,LocalDate recDate);


   @Query("select * from  purchase_order where supplier=?1 and invDate=?2")
   List<purchaseOrder> findBySupplierAndInvDate(String supplier,LocalDate recDate);


   //Integer countDistinctSupplierByInvDate(LocalDate invDate);
   // List<purchaseOrder> findByInvDate(LocalDate recDate);

   @Query("select * from  purchase_order where supplier=?1 and invDate=?2 and invDate=?3")
   List<purchaseOrder> findBySuplCodeAndInvDateBetween(String suplCode, String invDate, String recDate);
  @Query("select * from  purchase_order where suplCode=?1 ")
   List<purchaseOrder> findBySuplCode(String suplCode);
   @Query("select * from  purchase_order where invDate=?1")
   List<purchaseOrder> findByInvDate(String invDate);
   purchaseOrder findTopByOrderByOrderNoDesc();
   List<purchaseOrder>findByOrderNo(Integer orderNo);
}

