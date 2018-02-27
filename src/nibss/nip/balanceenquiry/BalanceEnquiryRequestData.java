package nibss.nip.balanceenquiry;

public class BalanceEnquiryRequestData {

	String SessionID;
	String DestinationInstitutionCode;
	String ChannelCode;
	String AuthorizationCode;
	String TargetAccountName;
	String TargetBankVerificationNumber;
	String TargetAccountNumber;

	public String getSessionID() {
		return SessionID;
	}

	public void setSessionID(String sessionID) {
		SessionID = sessionID;
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

	public String getAuthorizationCode() {
		return AuthorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		AuthorizationCode = authorizationCode;
	}

	public String getTargetAccountName() {
		return TargetAccountName;
	}

	public void setTargetAccountName(String targetAccountName) {
		TargetAccountName = targetAccountName;
	}

	public String getTargetBankVerificationNumber() {
		return TargetBankVerificationNumber;
	}

	public void setTargetBankVerificationNumber(
			String targetBankVerificationNumber) {
		TargetBankVerificationNumber = targetBankVerificationNumber;
	}

	public String getTargetAccountNumber() {
		return TargetAccountNumber;
	}

	public void setTargetAccountNumber(String targetAccountNumber) {
		TargetAccountNumber = targetAccountNumber;
	}
}
