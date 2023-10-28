package workshop27102023.core.logging;

public class MailLogger implements Logger{

	@Override
	public void log(String brand) {
		System.out.println("   ---> Mail İle Gönderildi : " + brand);
	}

}
