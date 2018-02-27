package nibss.nip.balanceenquiry;

public class BalanceEnquiryResponseData {

	// original request data
	private String SessionID;
	private String DestinationInstitutionCode;
	private String ChannelCode;
	private String AuthorizationCode;
	private String TargetAccountName;
	private String TargetBankVerificationNumber;
	private String TargetAccountNumber;
	// appended data to the response
	private String AvailableBalance;
	private String ResponseCode;

	public BalanceEnquiryResponseData(BalanceEnquiryRequestData req) {

		this.SessionID = req.getSessionID();
		this.DestinationInstitutionCode = req.getSessionID();
		this.ChannelCode = req.getSessionID();
		this.AuthorizationCode = req.getSessionID();
		this.TargetAccountName = req.getTargetAccountName();
		this.TargetBankVerificationNumber = req.getTargetBankVerificationNumber();
		this.TargetAccountNumber = req.getTargetAccountNumber();
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

	public String getAuthorizationCode() {
		return AuthorizationCode;
	}

	public String getTargetAccountName() {
		return TargetAccountName;
	}

	public String getTargetBankVerificationNumber() {
		return TargetBankVerificationNumber;
	}

	public String getTargetAccountNumber() {
		return TargetAccountNumber;
	}

	public String getAvailableBalance() {
		return AvailableBalance;
	}

	public void setAvailableBalance(String availableBalance) {
		AvailableBalance = availableBalance;
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
	 * @param authorizationCode the authorizationCode to set
	 */
	public void setAuthorizationCode(String authorizationCode) {
		AuthorizationCode = authorizationCode;
	}

	/**
	 * @param targetAccountName the targetAccountName to set
	 */
	public void setTargetAccountName(String targetAccountName) {
		TargetAccountName = targetAccountName;
	}

	/**
	 * @param targetBankVerificationNumber the targetBankVerificationNumber to set
	 */
	public void setTargetBankVerificationNumber(String targetBankVerificationNumber) {
		TargetBankVerificationNumber = targetBankVerificationNumber;
	}

	/**
	 * @param targetAccountNumber the targetAccountNumber to set
	 */
	public void setTargetAccountNumber(String targetAccountNumber) {
		TargetAccountNumber = targetAccountNumber;
	}
}
