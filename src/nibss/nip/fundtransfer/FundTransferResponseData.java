package nibss.nip.fundtransfer;

public class FundTransferResponseData {

	private String SessionID;
	private String NameEnquiryRef;
	private String DestinationInstitutionCode;
	private String ChannelCode;
	private String BeneficiaryAccountName;
	private String BeneficiaryAccountNumber;
	private String BeneficiaryKYCLevel;
	private String BeneficiaryBankVerificationNumber;
	private String OriginatorAccountName;
	private String OriginatorAccountNumber;
	private String OriginatorBankVerificationNumber;
	private String OriginatorKYCLevel;
	private String TransactionLocation;
	private String Narration;
	private String PaymentReference;
	private String Amount;
	// response code
	private String ResponseCode;

	public FundTransferResponseData(FundTransferRequestData req) {
		
		this.SessionID = req.getSessionID();
		this.NameEnquiryRef = req.getNameEnquiryRef();
		this.DestinationInstitutionCode = req.getDestinationInstitutionCode();
		this.ChannelCode = req.getChannelCode();
		this.BeneficiaryAccountName = req.getBeneficiaryAccountName();
		this.BeneficiaryAccountNumber = req.getBeneficiaryAccountNumber();
		this.BeneficiaryKYCLevel = req.getBeneficiaryKYCLevel();
		this.BeneficiaryBankVerificationNumber = req
				.getBeneficiaryBankVerificationNumber();
		this.OriginatorAccountName = req.getBeneficiaryAccountName();
		this.OriginatorAccountNumber = req.getOriginatorAccountNumber();
		this.OriginatorBankVerificationNumber = req
				.getOriginatorBankVerificationNumber();
		this.OriginatorKYCLevel = req.getOriginatorKYCLevel();
		this.TransactionLocation = req.getTransactionLocation();
		this.Narration = req.getNarration();
		this.PaymentReference = req.getPaymentReference();
		this.Amount = req.getAmount();
	}

	public String getSessionID() {
		return SessionID;
	}

	
	public String getNameEnquiryRef() {
		return NameEnquiryRef;
	}

	
	public String getDestinationInstitutionCode() {
		return DestinationInstitutionCode;
	}

	
	public String getChannelCode() {
		return ChannelCode;
	}

	
	public String getBeneficiaryAccountName() {
		return BeneficiaryAccountName;
	}

	
	public String getBeneficiaryAccountNumber() {
		return BeneficiaryAccountNumber;
	}

	

	public String getBeneficiaryKYCLevel() {
		return BeneficiaryKYCLevel;
	}


	public String getBeneficiaryBankVerificationNumber() {
		return BeneficiaryBankVerificationNumber;
	}

	
	public String getOriginatorAccountName() {
		return OriginatorAccountName;
	}

	
	public String getOriginatorAccountNumber() {
		return OriginatorAccountNumber;
	}

	
	public String getOriginatorBankVerificationNumber() {
		return OriginatorBankVerificationNumber;
	}

	

	public String getOriginatorKYCLevel() {
		return OriginatorKYCLevel;
	}

	

	public String getTransactionLocation() {
		return TransactionLocation;
	}

	
	public String getNarration() {
		return Narration;
	}

	
	public String getPaymentReference() {
		return PaymentReference;
	}

	public String getAmount() {
		return Amount;
	}

	public String getResponseCode() {
		return ResponseCode;
	}

	public void setResponseCode(String responseCode) {
		ResponseCode = responseCode;
	}

	/**
	 * @param sessionID the sessionID to set
	 */
	public void setSessionID(String sessionID) {
		SessionID = sessionID;
	}

	/**
	 * @param nameEnquiryRef the nameEnquiryRef to set
	 */
	public void setNameEnquiryRef(String nameEnquiryRef) {
		NameEnquiryRef = nameEnquiryRef;
	}

	/**
	 * @param destinationInstitutionCode the destinationInstitutionCode to set
	 */
	public void setDestinationInstitutionCode(String destinationInstitutionCode) {
		DestinationInstitutionCode = destinationInstitutionCode;
	}

	/**
	 * @param channelCode the channelCode to set
	 */
	public void setChannelCode(String channelCode) {
		ChannelCode = channelCode;
	}

	/**
	 * @param beneficiaryAccountName the beneficiaryAccountName to set
	 */
	public void setBeneficiaryAccountName(String beneficiaryAccountName) {
		BeneficiaryAccountName = beneficiaryAccountName;
	}

	/**
	 * @param beneficiaryAccountNumber the beneficiaryAccountNumber to set
	 */
	public void setBeneficiaryAccountNumber(String beneficiaryAccountNumber) {
		BeneficiaryAccountNumber = beneficiaryAccountNumber;
	}

	/**
	 * @param beneficiaryKYCLevel the beneficiaryKYCLevel to set
	 */
	public void setBeneficiaryKYCLevel(String beneficiaryKYCLevel) {
		BeneficiaryKYCLevel = beneficiaryKYCLevel;
	}

	/**
	 * @param beneficiaryBankVerificationNumber the beneficiaryBankVerificationNumber to set
	 */
	public void setBeneficiaryBankVerificationNumber(
			String beneficiaryBankVerificationNumber) {
		BeneficiaryBankVerificationNumber = beneficiaryBankVerificationNumber;
	}

	/**
	 * @param originatorAccountName the originatorAccountName to set
	 */
	public void setOriginatorAccountName(String originatorAccountName) {
		OriginatorAccountName = originatorAccountName;
	}

	/**
	 * @param originatorAccountNumber the originatorAccountNumber to set
	 */
	public void setOriginatorAccountNumber(String originatorAccountNumber) {
		OriginatorAccountNumber = originatorAccountNumber;
	}

	/**
	 * @param originatorBankVerificationNumber the originatorBankVerificationNumber to set
	 */
	public void setOriginatorBankVerificationNumber(
			String originatorBankVerificationNumber) {
		OriginatorBankVerificationNumber = originatorBankVerificationNumber;
	}

	/**
	 * @param originatorKYCLevel the originatorKYCLevel to set
	 */
	public void setOriginatorKYCLevel(String originatorKYCLevel) {
		OriginatorKYCLevel = originatorKYCLevel;
	}

	/**
	 * @param transactionLocation the transactionLocation to set
	 */
	public void setTransactionLocation(String transactionLocation) {
		TransactionLocation = transactionLocation;
	}

	/**
	 * @param narration the narration to set
	 */
	public void setNarration(String narration) {
		Narration = narration;
	}

	/**
	 * @param paymentReference the paymentReference to set
	 */
	public void setPaymentReference(String paymentReference) {
		PaymentReference = paymentReference;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		Amount = amount;
	}



}
