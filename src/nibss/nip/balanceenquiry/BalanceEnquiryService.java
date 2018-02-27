package nibss.nip.balanceenquiry;

public class BalanceEnquiryService {

	private BalanceEnquiryRequestData req;

	public BalanceEnquiryService(BalanceEnquiryRequestData req) {
		this.req = req;
	}

	public BalanceEnquiryResponseData makeEnquiry() {
		// TODO Auto-generated method stub
		BalanceEnquiryResponseData res = new BalanceEnquiryResponseData(req);
		return res;
	}

}
