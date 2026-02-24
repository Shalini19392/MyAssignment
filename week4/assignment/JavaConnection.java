package week4.assignment;

public class JavaConnection implements DatabaseConnection {

	public static void main(String[] args) {
		JavaConnection j= new JavaConnection();
		j.connect();
		j.disconnect();
		j.executeUpdate();
	

	}

	@Override
	public void connect() {
		System.out.println("Connect the server");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disConnect the server");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute the code");
		
	}

}
