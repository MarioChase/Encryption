
public class Factory {
	private static Factory m_instance;
	public IMessageParser m_parser;
	
	private Factory(){
		
	}
	public static Factory getInstance(){
		if (m_instance == null)
			m_instance = new Factory();
		return m_instance;
	} 
	public IMessageParser createParser(String message){
		m_parser = new MessageParser(message);
		return m_parser;
	}
}
