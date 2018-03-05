package nibss.nip.nameenquiry;

public class NameEnquiryService {

	private NameEnquiryRequestData req;

	public NameEnquiryService(NameEnquiryRequestData req) {
		// TODO Auto-generated constructor stub
		this.req = req;
	}
	public NameEnquiryResponseData doNameEnquiry() {
		// TODO Auto-generated method stub
		NameEnquiryResponseData res = new NameEnquiryResponseData(req);

		if (req.getAccountNumber().equals(null)
				|| req.getAccountNumber().isEmpty()) {

			// Invalid account
			res.setResponseCode("07");

		} else if (req.getDestinationInstitutionCode().equals(null)
				|| req.getDestinationInstitutionCode().isEmpty()) {

			// Unknown Bank Code
			res.setResponseCode("16");

		} else if (!req.getChannelCode().equals("1")
				|| req.getChannelCode().equals(null)) {
			// Invalid Channel Code
			res.setResponseCode("17");

		} else if (req.getAccountNumber().equals("1111100000")) {

			res.setAccountName("Suru Earnest Erihbra");
			res.setBankVerificationNumber("1020987625");
			res.setKycLevel("1");
			res.setResponseCode("00");
			
		} else {

			// Invalid Transaction
			res.setResponseCode("12");

		}
		return res;
	}
}
