package assignment.week3;


public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("String endpoint:" +endpoint);
		
	}
public void sendRequest(String endpoint,String requestBody,String requestStatus) {
	System.out.println("String endpoint:" +endpoint);
	System.out.println("String requestBody:" +requestBody);
	System.out.println("String requestStatus:" +requestStatus);
	}

	public static void main(String[] args) {
		APIClient ac =new APIClient();
		ac.sendRequest("https://platform.testleaf.com/#/");
		ac.sendRequest("https://platform.testleaf.com/#/", "<html></html>", "Sucess");
	}

}
