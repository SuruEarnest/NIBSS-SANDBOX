package nibss.nip.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import nibss.nip.core.NIPInterface;
import nibss.nip.fundtransfer.FundTransferRequestData;
import nibss.nip.fundtransfer.FundTransferResponseData;
import nibss.nip.nameenquiry.NameEnquiryRequestData;
import nibss.nip.nameenquiry.NameEnquiryResponseData;

public class NIPClient {

	public static void main(String args[]) throws MalformedURLException {

		URL url = new URL("http://10.152.2.31:8086/NIPWS/NIPInterface?wsdl");

		// 1st argument service URI, refer to wsdl document above
		// 2nd argument is service name, refer to wsdl document above
		QName qname = new QName("http://core.nip.nibss/", "NIPInterface");

		Service service = Service.create(url, qname);

		NIPInterface sei = service.getPort(NIPInterface.class);

		NameEnquiryRequestData req = new NameEnquiryRequestData();

		req.setAccountNumber("1111100000");
		req.setChannelCode("2");
		req.setDestinationInstitutionCode("1001");
		req.setSessionID("100200012837373000123");

		NameEnquiryResponseData response = sei.makeNameEnquirySingleItem(req);
		System.out.println("Name Enquiry ResponseCode:"+response.getResponseCode());
		
		//////fundtransfer
		FundTransferRequestData fdtransferReq = new FundTransferRequestData();
		fdtransferReq.setAmount("2000");
		fdtransferReq.setBeneficiaryAccountName("Suru Earnest Erihbra");
		fdtransferReq.setBeneficiaryAccountNumber("1111100000");
		fdtransferReq.setBeneficiaryBankVerificationNumber("1098736352372");
		fdtransferReq.setBeneficiaryKYCLevel("1");
		fdtransferReq.setChannelCode("1");
		fdtransferReq.setDestinationInstitutionCode("10001");
		fdtransferReq.setNameEnquiryRef("100007263");
		fdtransferReq.setNarration("The School Fees");
		fdtransferReq.setOriginatorAccountName("Abolade Rachel");
		fdtransferReq.setOriginatorAccountNumber("1000298761");
		fdtransferReq.setOriginatorBankVerificationNumber("110827253");
		fdtransferReq.setPaymentReference("12435");
		fdtransferReq.setSessionID("1100272534352");
		fdtransferReq.setTransactionLocation("10.76524,19.12333");
		
		FundTransferResponseData res = sei.doFundTransferSingleItem_dc(fdtransferReq);
		System.out.println("FundTransfer Response Code:"+res.getResponseCode());
	}

}
