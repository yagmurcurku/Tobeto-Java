package workshop27102023.core.logging;

public class FileLogger implements Logger{

	@Override
	public void log(String brand) {
		System.out.println("   ---> Dosyaya Loglandı : " + brand);
	}

}
