import java.util.concurrent.Semaphore;

public class VowelMash implements ICrypto{
	private static VowelMash m_instance;
	@Override
	public String decrypt(String message) {
		
		return null;
	}

	public static ICrypto getInstance() {
		if (m_instance == null)
			m_instance = new VowelMash();
		return m_instance;
	}

}
