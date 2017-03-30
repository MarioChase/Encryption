import java.util.concurrent.Semaphore;

public class VowelMash implements ICrypto{
	private static VowelMash m_instance;
	public String m_message = "";
	@Override
	public String decrypt(String message) {
		IMessageParser parser = Factory.getInstance().createParser(message);
		String m_message = "";
		for(int i = 0; i < parser.getCharCount(); i ++){
			switch(parser.getChar(i)){
			case 'A':
				m_message += 'U';
				break;
			case 'E':
				m_message += 'A';
				break;
			case 'I':
				m_message += 'E';
				break;
			case 'O':
				m_message += 'I';
				break;
			case 'U':
				m_message += 'O';
				break;
			default :
				m_message += parser.getChar(i);
				break;
			}
		}
		return m_message;
	}
	private VowelMash(){
	}
	public static ICrypto getInstance() {
		if (m_instance == null)
			m_instance = new VowelMash();
		return m_instance;
	}

}
