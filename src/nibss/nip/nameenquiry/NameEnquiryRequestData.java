package nibss.nip.nameenquiry;

public class NameEnquiryRequestData {

	private String SessionID;
	private String DestinationInstitutionCode;
	private String ChannelCode;
	private String AccountNumber;

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

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

}
