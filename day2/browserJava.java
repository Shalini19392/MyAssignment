package week1.day2;

public class browserJava {
public void launchBrowser(String browserName) {
System.out.println("Chrome");
}
public void loadUrl()
{
System.out.println("Url loaded sucessfully");
}
public static void main(String[] args)
{
	browserJava b = new browserJava();
b.launchBrowser("chrome");
b.loadUrl();
}
}