package week4.assignment;

public interface DatabaseConnection {
	
	public abstract  void connect();
	public  abstract void disconnect();
	public abstract void executeUpdate();
	

}
