package nibss.nip.fundtransfer;

public class FundTransferRequestData {

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

	public String getSessionID() {
		return SessionID;
	}

	public void setSessionID(String sessionID) {
		SessionID = sessionID;
	}

	public String getNameEnquiryRef() {
		return NameEnquiryRef;
	}

	public void setNameEnquiryRef(String nameEnquiryRef) {
		NameEnquiryRef = nameEnquiryRef;
	}

	public String getDestinationInstitutionCode() {
		return DestinationInstitutionCode;
	}

	public void setDestinationInstitutionCode(String destinationInstitutionCode) {
		DestinationInstitutionCode = destinationInstitutionCode;
	}

	public String getChannelCode() {
		return ChannelCode;
	}

	public void setChannelCode(String channelCode) {
		ChannelCode = channelCode;
	}

	public String getBeneficiaryAccountName() {
		return BeneficiaryAccountName;
	}

	public void setBeneficiaryAccountName(String beneficiaryAccountName) {
		BeneficiaryAccountName = beneficiaryAccountName;
	}

	public String getBeneficiaryAccountNumber() {
		return BeneficiaryAccountNumber;
	}

	public void setBeneficiaryAccountNumber(String beneficiaryAccountNumber) {
		BeneficiaryAccountNumber = beneficiaryAccountNumber;
	}

	public String getBeneficiaryKYCLevel() {
		return BeneficiaryKYCLevel;
	}

	public void setBeneficiaryKYCLevel(String beneficiaryKYCLevel) {
		BeneficiaryKYCLevel = beneficiaryKYCLevel;
	}

	public String getBeneficiaryBankVerificationNumber() {
		return BeneficiaryBankVerificationNumber;
	}

	public void setBeneficiaryBankVerificationNumber(
			String beneficiaryBankVerificationNumber) {
		BeneficiaryBankVerificationNumber = beneficiaryBankVerificationNumber;
	}

	public String getOriginatorAccountName() {
		return OriginatorAccountName;
	}

	public void setOriginatorAccountName(String originatorAccountName) {
		OriginatorAccountName = originatorAccountName;
	}

	public String getOriginatorAccountNumber() {
		return OriginatorAccountNumber;
	}

	public void setOriginatorAccountNumber(String originatorAccountNumber) {
		OriginatorAccountNumber = originatorAccountNumber;
	}

	public String getOriginatorBankVerificationNumber() {
		return OriginatorBankVerificationNumber;
	}

	public void setOriginatorBankVerificationNumber(
			String originatorBankVerificationNumber) {
		OriginatorBankVerificationNumber = originatorBankVerificationNumber;
	}

	public String getOriginatorKYCLevel() {
		return OriginatorKYCLevel;
	}

	public void setOriginatorKYCLevel(String originatorKYCLevel) {
		OriginatorKYCLevel = originatorKYCLevel;
	}

	public String getTransactionLocation() {
		return TransactionLocation;
	}

	public void setTransactionLocation(String transactionLocation) {
		TransactionLocation = transactionLocation;
	}

	public String getNarration() {
		return Narration;
	}

	public void setNarration(String narration) {
		Narration = narration;
	}

	public String getPaymentReference() {
		return PaymentReference;
	}

	public void setPaymentReference(String paymentReference) {
		PaymentReference = paymentReference;
	}

	public String getAmount() {
		return Amount;
	}

	public void setAmount(String amount) {
		Amount = amount;
	}

}
