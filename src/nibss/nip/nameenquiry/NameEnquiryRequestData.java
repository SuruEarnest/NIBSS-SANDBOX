package nibss.nip.nameenquiry;

import javax.xml.bind.annotation.XmlRootElement; 
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="NESingleRequest")
@XmlType(propOrder = { "sessionID", "destinationInstitutionCode",
		"channelCode", "accountNumber" })
public class NameEnquiryRequestData {

	private String sessionID;
	private String destinationInstitutionCode;
	private String channelCode;
	private String accountNumber;

	public NameEnquiryRequestData() {
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

}
