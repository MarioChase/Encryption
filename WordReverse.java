import java.util.concurrent.Semaphore;

public class WordReverse implements ICrypto {
	private static WordReverse m_instance;

	@Override
	public String decrypt(String message) {
		IMessageParser parser = Factory.getInstance().createParser(message);
		String m_message = "";
		for (int j = 0; j <= parser.getWordCount() - 1; j++) {
			for (int i = parser.getWord(j).length() - 1; i >= 0; i--) {
				m_message += parser.getWord(j).charAt(i);
			}
			m_message += " ";
		}
		return m_message;
	}

	public static ICrypto getInstance() {
		if (m_instance == null)
			m_instance = new WordReverse();
		return m_instance;
	}

}
