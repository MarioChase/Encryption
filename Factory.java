
public class Factory {
	private static Factory m_instance;
	public String m_message;
	public IMessageParser m_parser;
	public Factory(String message){
		m_message = message;
		m_parser = createParser(m_message);
	}
	public Factory getInstance(){
		if (m_instance == null)
			m_instance = new Factory(m_message);
		return m_instance;
	} 
	public IMessageParser createParser(String message){
		return new MessageParser(message);
	}
}
