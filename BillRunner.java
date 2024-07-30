class BillRunner{
	
	public static void main(String []bills){
		
		System.out.println("Bill Reference Id: ");

		Bill ref = new Bill();
		int billReferenceId = ref.billReferenceId;
	   
		billReferenceId = 1;
		System.out.println(billReferenceId);
	   
		billReferenceId = 2;
		System.out.println(billReferenceId);

		billReferenceId = 3;
		System.out.println(billReferenceId);

		billReferenceId = 4;
		System.out.println(billReferenceId);

		billReferenceId = 5;
		System.out.println(billReferenceId);

		billReferenceId = 6;
		System.out.println(billReferenceId);

		billReferenceId = 7;
		System.out.println(billReferenceId);

		billReferenceId = 8;
		System.out.println(billReferenceId);

		billReferenceId = 9;
		System.out.println(billReferenceId);

		billReferenceId = 10;
		System.out.println(billReferenceId);

		System.out.println("Bill Sequence Number:");

		Bill ref1 = new Bill();
		int billSequenceNo = ref1.billSequenceNo;   
	   
		billSequenceNo = 1101;
		System.out.println(billSequenceNo);

		billSequenceNo = 1102;
		System.out.println(billSequenceNo);

		billSequenceNo = 1103;
		System.out.println(billSequenceNo);

		billSequenceNo = 1104;
		System.out.println(billSequenceNo);

		billSequenceNo = 1105;
		System.out.println(billSequenceNo);

		billSequenceNo = 1106;
		System.out.println(billSequenceNo);

		billSequenceNo = 1107;
		System.out.println(billSequenceNo);

		billSequenceNo = 1108;
		System.out.println(billSequenceNo);

		billSequenceNo = 1109;
		System.out.println(billSequenceNo);

		billSequenceNo = 1110;
		System.out.println(billSequenceNo);

		System.out.println("Bill Issue dates are:");

		Bill ref2 = new Bill();
		String billIssueDate = ref2.billIssueDate;  
	   
		billIssueDate = "11/07/2024";
		System.out.println(billIssueDate);
	 
		billIssueDate = "12/07/2024";
		System.out.println(billIssueDate);
	 
		billIssueDate = "13/07/2024";
		System.out.println(billIssueDate);
	 
		billIssueDate = "11/07/2024";
		System.out.println(billIssueDate);
	 
		billIssueDate = "24/07/2024";
		System.out.println(billIssueDate);
	 
		billIssueDate = "25/07/2024";
		System.out.println(billIssueDate);
	 
		billIssueDate = "26/07/2024";
		System.out.println(billIssueDate);
	 
		billIssueDate = "17/07/2024";
		System.out.println(billIssueDate);
	 
		billIssueDate = "28/07/2024";
		System.out.println(billIssueDate);
	 
		billIssueDate = "19/07/2024";
		System.out.println(billIssueDate);
	 
		billIssueDate = "30/07/2024";
		System.out.println(billIssueDate);

		System.out.println("Bill Due dates are:");

		Bill ref3 = new Bill();
		String billDueDate = ref3.billDueDate;
	   
		billDueDate = "10/8/2024";
		System.out.println(billDueDate);
	   
		billDueDate = "11/8/2024";
		System.out.println(billDueDate);
	   
		billDueDate = "12/8/2024";
		System.out.println(billDueDate);
	   
		billDueDate = "13/8/2024";
		System.out.println(billDueDate);
	   
		billDueDate = "14/8/2024";
		System.out.println(billDueDate);
	   
		billDueDate = "15/8/2024";
		System.out.println(billDueDate);
	   
		billDueDate = "16/8/2024";
		System.out.println(billDueDate);
	   
		billDueDate = "17/8/2024";
		System.out.println(billDueDate);
	   
		billDueDate = "18/8/2024";
		System.out.println(billDueDate);
	   
		billDueDate = "19/8/2024";
		System.out.println(billDueDate);
	   
		System.out.println("Is The Bill Paid or Not:");

		Bill ref4 = new Bill();
		boolean isBillPaid = ref4.isBillPaid;
	   
		isBillPaid = true;
		System.out.println(isBillPaid);
	   
	    isBillPaid = true;
		System.out.println(isBillPaid);
	   
	    isBillPaid = false;
		System.out.println(isBillPaid);
	   
	    isBillPaid = true;
		System.out.println(isBillPaid);
	   
	    isBillPaid = false;
		System.out.println(isBillPaid);
	   
	    isBillPaid = false;
		System.out.println(isBillPaid);
	   
	    isBillPaid = true;
		System.out.println(isBillPaid);
	   
	    isBillPaid = true;
		System.out.println(isBillPaid);
	   
	    isBillPaid = false;
		System.out.println(isBillPaid);
	   
	    isBillPaid = true;
		System.out.println(isBillPaid);
	   
		System.out.println("Is The Bill Latest one:");

		Bill ref5 = new Bill();
		boolean isLatestBill = ref5.isLatestBill;
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = false;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = false;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = false;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   isLatestBill = true;
	   System.out.println(isLatestBill);
	   
	   System.out.println("Is Final Bill:");
	   
		Bill ref6 = new Bill();
		boolean isFinalBill = ref6.isFinalBill;
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = false;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = false;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	   isFinalBill = true;
	   System.out.println(isFinalBill);
	   
	    System.out.println("Bill Amouts Are:");
	   
		Bill ref7 = new Bill();
		double billAmount = ref7.billAmount;
	   
		billAmount = 20999.00d;
		System.out.println(billAmount);
	   
	    billAmount = 25999.00d;
		System.out.println(billAmount);
	   
	    billAmount = 36990.00d;
		System.out.println(billAmount);
	   
	    billAmount = 39899.85d;
		System.out.println(billAmount);
	   
	    billAmount = 120900.00d;
		System.out.println(billAmount);
	   
	    billAmount = 150999.50d;
		System.out.println(billAmount);
	   
	    billAmount = 180998.50d;
		System.out.println(billAmount);
	   
	    billAmount = 200999.00d;
		System.out.println(billAmount);
	   
	    billAmount = 210900.05d;
		System.out.println(billAmount);
	   
	    billAmount = 220999.50d;
		System.out.println(billAmount);
	   
	   System.out.println("Is Tax Inclusive :");
	   
		Bill ref8 = new Bill();
		boolean taxInclusiveBill = ref8.taxInclusiveBill;
	   
		taxInclusiveBill = true;
		System.out.println(taxInclusiveBill);
	   
		taxInclusiveBill = true;
		System.out.println(taxInclusiveBill);
	   
		taxInclusiveBill = true;
		System.out.println(taxInclusiveBill);
	   
		taxInclusiveBill = true;
		System.out.println(taxInclusiveBill);
	   
		taxInclusiveBill = false;
		System.out.println(taxInclusiveBill);
	   
		taxInclusiveBill = true;
		System.out.println(taxInclusiveBill);
	   
		taxInclusiveBill = true;
		System.out.println(taxInclusiveBill);
	   
		taxInclusiveBill = true;
		System.out.println(taxInclusiveBill);
	   
		taxInclusiveBill = true;
		System.out.println(taxInclusiveBill);
	   
		taxInclusiveBill = false;
		System.out.println(taxInclusiveBill);
	   
	}
}