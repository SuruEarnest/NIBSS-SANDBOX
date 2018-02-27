package nibss.nip.core;

import javax.jws.WebMethod;   
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import nibss.nip.balanceenquiry.BalanceEnquiryRequestData;
import nibss.nip.balanceenquiry.BalanceEnquiryResponseData;
import nibss.nip.fundtransfer.FundTransferRequestData;
import nibss.nip.fundtransfer.FundTransferResponseData;
import nibss.nip.nameenquiry.NameEnquiryRequestData;
import nibss.nip.nameenquiry.NameEnquiryResponseData;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface NIPInterface {

	@WebMethod(operationName = "fundtransfersingleitem_dc")
	public abstract FundTransferResponseData doFundTransferSingleItem_dc(@WebParam(name="FTSingleCreditRequest")FundTransferRequestData req);

	@WebMethod(operationName = "fundtransfersingleitem_dd")
	public abstract FundTransferResponseData  doFundTransferSingleItem_dd(@WebParam(name="FTSingleCreditRequest")FundTransferRequestData req);

	@WebMethod(operationName = "fundtransferAdvice_dc")
	public abstract String doFundTransferAdvice_dc();

	@WebMethod(operationName = "fundtransferAdvice_dd")
	public abstract String doFundTransferAdvice_dd();

	@WebMethod(operationName = "balanceenquiry")
	public abstract BalanceEnquiryResponseData makeBalanceEnquiry(@WebParam(name = "BalanceEnquiryRequest") BalanceEnquiryRequestData req);

	@WebMethod(operationName = "nameenquirysingleitem")
	public abstract NameEnquiryResponseData makeNameEnquirySingleItem(@WebParam(name = "NESingleRequest") NameEnquiryRequestData req);

	@WebMethod(operationName = "amountblock")
	public abstract String doAmountBlock();

	@WebMethod(operationName = "amountunblock")
	public abstract String doAmountUnBlock();
	
	@WebMethod(operationName = "accountblock")
	public abstract String doAccountBlock();

	@WebMethod(operationName = "accountunblock")
	public abstract String doAccountUnBlock();
	
	@WebMethod(operationName = "mandateadvice")
	public abstract String doMandateAdvice();
	
	@WebMethod(operationName = "financialinstitutionlist")
	public abstract String getFinInstitutionList();

	
}