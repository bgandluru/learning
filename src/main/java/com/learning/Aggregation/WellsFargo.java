package com.learning.Aggregation;

public class WellsFargo {

   private CreditCheckDepartment ccd;
   private LegalDepartment ld;
   private SSNDepartment ssnd;

   WellsFargo(CreditCheckDepartment ccd, LegalDepartment ld, SSNDepartment ssnd) {

      this.ccd = ccd;
      this.ld = ld;
      this.ssnd = ssnd;

     System.out.println("CCD "+ccd.hashCode());
      System.out.println("LD "+ld.hashCode());
      System.out.println("ssnd "+ssnd.hashCode());
   }

   boolean createCustomer() {

      boolean status = false;
      if (ccd.getCreditCheckReportStatus()) {
         if (ld.getLegalReportStatus()) {
            if (ssnd.getSSNReportStatus()) {
               System.out.println("Customer Created");
               status = true;
            }
         }
      }
      return status;
   }

}
