package nibss.nip.fundtransfer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="FTSingleCreditRequest")
@XmlType(propOrder = { "sessionID", "nameEnquiryRef",
		"destinationInstitutionCode", "channelCode", "beneficiaryAccountName",
		"beneficiaryAccountNumber", "beneficiaryBankVerificationNumber",
		"beneficiaryKYCLevel", "originatorAccountName",
		"originatorAccountNumber", "originatorBankVerificationNumber",
		"originatorKYCLevel", "transactionLocation", "narration",
		"paymentReference", "amount" })
public class FundTransferRequestData {

	private String sessionID;
	private String nameEnquiryRef;
	private String destinationInstitutionCode;
	private String channelCode;
	private String beneficiaryAccountName;
	private String beneficiaryAccountNumber;
	private String beneficiaryBankVerificationNumber;
	private String beneficiaryKYCLevel;
	private String originatorAccountName;
	private String originatorAccountNumber;
	private String originatorBankVerificationNumber;
	private String originatorKYCLevel;
	private String transactionLocation;
	private String narration;
	private String paymentReference;
	private String amount;

	public FundTransferRequestData() {
	}

	@XmlElement(name = "SessionID")
	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	@XmlElement(name = "NameEnquiryRef")
	public String getNameEnquiryRef() {
		return nameEnquiryRef;
	}

	public void setNameEnquiryRef(String nameEnquiryRef) {
		this.nameEnquiryRef = nameEnquiryRef;
	}

	@XmlElement(name = "DestinationInstitutionCode")
	public String getDestinationInstitutionCode() {
		return destinationInstitutionCode;
	}

	public void setDestinationInstitutionCode(String destinationInstitutionCode) {
		this.destinationInstitutionCode = destinationInstitutionCode;
	}

	@XmlElement(name = "ChannelCode")
	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	@XmlElement(name = "BeneficiaryAccountName")
	public String getBeneficiaryAccountName() {
		return beneficiaryAccountName;
	}

	public void setBeneficiaryAccountName(String beneficiaryAccountName) {
		this.beneficiaryAccountName = beneficiaryAccountName;
	}

	@XmlElement(name = "BeneficiaryAccountNumber")
	public String getBeneficiaryAccountNumber() {
		return beneficiaryAccountNumber;
	}

	public void setBeneficiaryAccountNumber(String beneficiaryAccountNumber) {
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
	}

	@XmlElement(name = "BeneficiaryKYCLevel")
	public String getBeneficiaryKYCLevel() {
		return beneficiaryKYCLevel;
	}

	public void setBeneficiaryKYCLevel(String beneficiaryKYCLevel) {
		this.beneficiaryKYCLevel = beneficiaryKYCLevel;
	}

	@XmlElement(name = "BeneficiaryBankVerificationNumber")
	public String getBeneficiaryBankVerificationNumber() {
		return beneficiaryBankVerificationNumber;
	}

	public void setBeneficiaryBankVerificationNumber(
			String beneficiaryBankVerificationNumber) {
		this.beneficiaryBankVerificationNumber = beneficiaryBankVerificationNumber;
	}

	@XmlElement(name = "OriginatorAccountName")
	public String getOriginatorAccountName() {
		return originatorAccountName;
	}

	public void setOriginatorAccountName(String originatorAccountName) {
		this.originatorAccountName = originatorAccountName;
	}

	@XmlElement(name = "OriginatorAccountNumber")
	public String getOriginatorAccountNumber() {
		return originatorAccountNumber;
	}

	public void setOriginatorAccountNumber(String originatorAccountNumber) {
		this.originatorAccountNumber = originatorAccountNumber;
	}

	@XmlElement(name = "OriginatorBankVerificationNumber")
	public String getOriginatorBankVerificationNumber() {
		return originatorBankVerificationNumber;
	}

	public void setOriginatorBankVerificationNumber(
			String originatorBankVerificationNumber) {
		this.originatorBankVerificationNumber = originatorBankVerificationNumber;
	}

	@XmlElement(name = "OriginatorKYCLevel")
	public String getOriginatorKYCLevel() {
		return originatorKYCLevel;
	}

	public void setOriginatorKYCLevel(String originatorKYCLevel) {
		this.originatorKYCLevel = originatorKYCLevel;
	}

	@XmlElement(name = "TransactionLocation")
	public String getTransactionLocation() {
		return transactionLocation;
	}

	public void setTransactionLocation(String transactionLocation) {
		this.transactionLocation = transactionLocation;
	}

	@XmlElement(name = "Narration")
	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	@XmlElement(name = "PaymentReference")
	public String getPaymentReference() {
		return paymentReference;
	}

	public void setPaymentReference(String paymentReference) {
		this.paymentReference = paymentReference;
	}

	@XmlElement(name = "Amount")
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
