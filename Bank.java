class Bank{

    int bankId;
    String bankName;
	String branchName;
	String ifscCode;
	String swiftCode;
	int noOfWorker;
	String managerName;
	
	Bank(int bankId,String bankName,String branchName,String ifscCode,String swiftCode,int noOfWorker,String managerName){
		this.bankId = bankId;
		this.bankName= bankName;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.swiftCode = swiftCode;
		this.noOfWorker = noOfWorker;
		this.managerName = managerName;
	}
}