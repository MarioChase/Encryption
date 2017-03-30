import java.util.concurrent.Semaphore;

public class WordReverse implements ICrypto {
	private static WordReverse m_instance;

	@Override
	public String decrypt(String message) {
		return null;
	}

	public static ICrypto getInstance() {
		if (m_instance == null)
			m_instance = new WordReverse();
		return m_instance;
	}

}
