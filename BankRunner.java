class BankRunner{

    public static void main(String bank[]){
	
	    System.out.println("Main Started");
		
		Bank icic = new Bank(455623,"ICICI Bank","Koramangala","ICIC0000047","ICICINBB002",18,"Rafik");
		
		System.out.println("Bank Details");
		System.out.println("Bank Id is " + icic.bankId);
		System.out.println("Bank Name is " + icic.bankName);
		System.out.println("Branch Name is " + icic.branchName);
		System.out.println("IFSC Code is " + icic.ifscCode);
		System.out.println("Swift Code is " + icic.swiftCode);
		System.out.println("Number of Worker is " + icic.noOfWorker);
		System.out.println("Branch Manager Name is " + icic.managerName);
		
	    Bank baroda = new Bank(521452,"Bank of Baroda","Chikkamagaluru","BARB0000237","BARBINBB237",20,"Rakesh");
		
		System.out.println("Bank Details");
		System.out.println("Bank Id is " + baroda.bankId);
		System.out.println("Bank Name is " + baroda.bankName);
		System.out.println("Branch Name is " + baroda.branchName);
		System.out.println("IFSC Code is " + baroda.ifscCode);
		System.out.println("Swift Code is " + baroda.swiftCode);
		System.out.println("Number of Worker is " + baroda.noOfWorker);
		System.out.println("Branch Manager Name is " + baroda.managerName);
		
		Bank canara = new Bank(254136,"Canara bank","Koramangala","CNRB00000885","CNRBINBB885",22,"Asha");
		
		System.out.println("Bank Details");
		System.out.println("Bank Id is " + canara.bankId);
		System.out.println("Bank Name is " + canara.bankName);
		System.out.println("Branch Name is " + canara.branchName);
		System.out.println("IFSC Code is " + canara.ifscCode);
		System.out.println("Swift Code is " + canara.swiftCode);
		System.out.println("Number of Worker is " + canara.noOfWorker);
		System.out.println("Branch Manager Name is " + canara.managerName);
		
		Bank hdfc = new Bank(96542,"HDFC","Birur","HDFC0000544","HDFCINBB544",25,"Akash");
		
		System.out.println("Bank Details");
		System.out.println("Bank Id is " + hdfc.bankId);
		System.out.println("Bank Name is " + hdfc.bankName);
		System.out.println("Branch Name is " + hdfc.branchName);
		System.out.println("IFSC Code is " + hdfc.ifscCode);
		System.out.println("Swift Code is " + hdfc.swiftCode);
		System.out.println("Number of Worker is " + hdfc.noOfWorker);
		System.out.println("Branch Manager Name is " + hdfc.managerName);
		
		Bank fedral = new Bank(254785,"Federal Bank","kadur","FEDB00000378","FEDBINBB378",26,"Chandru");
		
		System.out.println("Bank Details");
		System.out.println("Bank Id is " + fedral.bankId);
		System.out.println("Bank Name is " + fedral.bankName);
		System.out.println("Branch Name is " + fedral.branchName);
		System.out.println("IFSC Code is " + fedral.ifscCode);
		System.out.println("Swift Code is " + fedral.swiftCode);
		System.out.println("Number of Worker is " + fedral.noOfWorker);
		System.out.println("Branch Manager Name is " + fedral.managerName);
		
		Bank kgb = new Bank(517468,"Karnataka Bank","Swavdati","KARB00000071","KARBINBB071",41,"Arun");
		
		System.out.println("Bank Details");
		System.out.println("Bank Id is " + kgb.bankId);
		System.out.println("Bank Name is " + kgb.bankName);
		System.out.println("Branch Name is " + kgb.branchName);
		System.out.println("IFSC Code is " + kgb.ifscCode);
		System.out.println("Swift Code is " + kgb.swiftCode);
		System.out.println("Number of Worker is " + kgb.noOfWorker);
		System.out.println("Branch Manager Name is " + kgb.managerName);
		
		Bank sbi = new Bank(726138,"State Bank of India","Kadur","SBI00000343","SBIINBB343",21,"Suraj");
		
		System.out.println("Bank Details");
		System.out.println("Bank Id is " + sbi.bankId);
		System.out.println("Bank Name is " + sbi.bankName);
		System.out.println("Branch Name is " + sbi.branchName);
		System.out.println("IFSC Code is " + sbi.ifscCode);
		System.out.println("Swift Code is " + sbi.swiftCode);
		System.out.println("Number of Worker is " + sbi.noOfWorker);
		System.out.println("Branch Manager Name is " + sbi.managerName);
		
		Bank iob = new Bank(7231649,"Indian Oversies Bank","lingadahalli","IOBA0000312","IOBAINBB312",20,"Prashant");
		
		System.out.println("Bank Details");
		System.out.println("Bank Id is " + iob.bankId);
		System.out.println("Bank Name is " + iob.bankName);
		System.out.println("Branch Name is " + iob.branchName);
		System.out.println("IFSC Code is " + iob.ifscCode);
		System.out.println("Swift Code is " + iob.swiftCode);
		System.out.println("Number of Worker is " + iob.noOfWorker);
		System.out.println("Branch Manager Name is " + iob.managerName);
		
		System.out.println("Main ended");
	}
}