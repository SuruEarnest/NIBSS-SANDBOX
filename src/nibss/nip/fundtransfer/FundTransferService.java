package nibss.nip.fundtransfer;

public class FundTransferService {

	private FundTransferRequestData req;

	public FundTransferService(FundTransferRequestData req) {
		this.req = req;
	}

	public FundTransferResponseData doDirectCreditTransfer() {

		FundTransferResponseData res = new FundTransferResponseData(req);

		if (req.getBeneficiaryAccountNumber().isEmpty()
				|| req.getBeneficiaryAccountNumber().equals(null)) {

			res.setResponseCode("07");

		} else if (!res.getChannelCode().equals("1")
				|| res.getChannelCode().equals(null)) {

			res.setResponseCode("17");

		} else {

			res.setResponseCode("00");
		}
		return res;
	}

	public FundTransferResponseData doDirectDeditTransfer() {
		return null;
	}
}
