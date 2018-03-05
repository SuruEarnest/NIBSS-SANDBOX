package nibss.nip.core;

import javax.jws.WebService;   
import nibss.nip.balanceenquiry.BalanceEnquiryRequestData;
import nibss.nip.balanceenquiry.BalanceEnquiryResponseData;
import nibss.nip.balanceenquiry.BalanceEnquiryService;
import nibss.nip.fundtransfer.FundTransferRequestData;
import nibss.nip.fundtransfer.FundTransferResponseData;
import nibss.nip.fundtransfer.FundTransferService;
import nibss.nip.nameenquiry.NameEnquiryRequestData;
import nibss.nip.nameenquiry.NameEnquiryResponseData;
import nibss.nip.nameenquiry.NameEnquiryService;

@WebService(endpointInterface = "nibss.nip.core.NIPInterface", serviceName = "NIPInterface", portName = "NIPInterfacePort")
public class NIPInterfaceImpl implements NIPInterface {

	@Override
	public String doAmountBlock() {

		return null;
	}

	@Override
	public String doAmountUnBlock() {

		return null;
	}

	@Override
	public NameEnquiryResponseData makeNameEnquirySingleItem(NameEnquiryRequestData req) {

		NameEnquiryResponseData res = new NameEnquiryService(req).doNameEnquiry();

		return res;
	}

	@Override
	public String doFundTransferAdvice_dc() {

		return null;
	}

	@Override
	public String doFundTransferAdvice_dd() {

		return null;
	}

	@Override
	public BalanceEnquiryResponseData makeBalanceEnquiry(BalanceEnquiryRequestData req) {

		BalanceEnquiryResponseData res = new BalanceEnquiryService(req).makeEnquiry();
		return null;
	}

	@Override
	public FundTransferResponseData doFundTransferSingleItem_dc(
			FundTransferRequestData req) {

		FundTransferResponseData res = new FundTransferService(req).doDirectCreditTransfer();

		return res;
	}

	@Override
	public FundTransferResponseData doFundTransferSingleItem_dd(
			FundTransferRequestData req) {

		FundTransferResponseData res = new FundTransferService(req).doDirectDeditTransfer();
		

		return null;
	}

	@Override
	public String doAccountBlock() {

		return null;
	}

	@Override
	public String doAccountUnBlock() {

		return null;
	}

	@Override
	public String doMandateAdvice() {

		return null;
	}

	@Override
	public String getFinInstitutionList() {

		return null;
	}

}
