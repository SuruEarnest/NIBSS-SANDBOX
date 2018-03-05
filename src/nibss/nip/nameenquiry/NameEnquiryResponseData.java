package nibss.nip.nameenquiry;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "NESingleResponse")
@XmlType(propOrder = { "sessionID", "destinationInstitutionCode",
		"channelCode", "accountNumber", "accountName",
		"bankVerificationNumber", "kycLevel", "responseCode" })
public class NameEnquiryResponseData {
	// original request data
	private String sessionID;
	private String destinationInstitutionCode;
	private String channelCode;
	private String accountNumber;
	// appended data to the response
	private String accountName;
	private String bankVerificationNumber;
	private String kycLevel;
	private String responseCode;

	public NameEnquiryResponseData() {

	}

	public NameEnquiryResponseData(NameEnquiryRequestData req) {
		this.sessionID = req.getSessionID();
		this.destinationInstitutionCode = req.getDestinationInstitutionCode();
		this.channelCode = req.getChannelCode();
		this.accountNumber = req.getAccountNumber();
	}

	@XmlElement(name = "SessionID")
	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
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

	@XmlElement(name = "AccountNumber")
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the accountName
	 */
	@XmlElement(name = "AccountName")
	public String getAccountName() {
		return accountName;
	}

	/**
	 * @param accountName
	 *            the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * @return the bankVerificationNumber
	 */
	@XmlElement(name = "BankVerificationNumber")
	public String getBankVerificationNumber() {
		return bankVerificationNumber;
	}

	/**
	 * @param bankVerificationNumber
	 *            the bankVerificationNumber to set
	 */
	public void setBankVerificationNumber(String bankVerificationNumber) {
		this.bankVerificationNumber = bankVerificationNumber;
	}

	/**
	 * @return the kycLevel
	 */
	@XmlElement(name = "KYCLevel")
	public String getKycLevel() {
		return kycLevel;
	}

	/**
	 * @param kycLevel
	 *            the kycLevel to set
	 */
	public void setKycLevel(String kycLevel) {
		this.kycLevel = kycLevel;
	}

	/**
	 * @return the responseCode
	 */
	@XmlElement(name = "ResponseCode")
	public String getResponseCode() {
		return responseCode;
	}

	/**
	 * @param responseCode
	 *            the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

}
