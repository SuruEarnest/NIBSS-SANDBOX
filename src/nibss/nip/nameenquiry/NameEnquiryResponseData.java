package nibss.nip.nameenquiry;

public class NameEnquiryResponseData {

	// original request data
	private String SessionID;
	private String DestinationInstitutionCode;
	private String ChannelCode;
	private String AccountNumber;
	// appended data to the response
	private String AccountName;
	private String BankVerificationNumber;
	private String ResponseCode;
	private String KYCLevel;

	public NameEnquiryResponseData(NameEnquiryRequestData req) {
		this.SessionID = req.getSessionID();
		this.DestinationInstitutionCode = req.getDestinationInstitutionCode();
		this.ChannelCode = req.getChannelCode();
		this.AccountNumber = req.getAccountNumber();
	}

	public String getSessionID() {
		return SessionID;
	}

	public String getDestinationInstitutionCode() {
		return DestinationInstitutionCode;
	}

	public String getChannelCode() {
		return ChannelCode;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public String getAccountName() {
		return AccountName;
	}

	public void setAccountName(String accountName) {
		AccountName = accountName;
	}

	public String getBankVerificationNumber() {
		return BankVerificationNumber;
	}

	public void setBankVerificationNumber(String bankVerificationNumber) {
		BankVerificationNumber = bankVerificationNumber;
	}

	public String getResponseCode() {
		return ResponseCode;
	}

	public void setResponseCode(String responseCode) {
		ResponseCode = responseCode;
	}

	public String getKYCLevel() {
		return KYCLevel;
	}

	public void setKYCLevel(String kYCLevel) {
		KYCLevel = kYCLevel;
	}

	/**
	 * @param sessionID the sessionID to set
	 */
	public void setSessionID(String sessionID) {
		SessionID = sessionID;
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
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
}
