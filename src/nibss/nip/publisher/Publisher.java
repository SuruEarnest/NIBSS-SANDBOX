package nibss.nip.publisher;

import javax.xml.ws.Endpoint;  

import nibss.nip.core.NIPInterfaceImpl;

public class Publisher {
	
	public static void main(String args[]) {

		System.out.println("about to publish");

		Endpoint.publish("http://10.152.2.31:8086/NIPWS/NIPInterface",
				new NIPInterfaceImpl());

		System.out.println("finish publishing...");
	}
}
