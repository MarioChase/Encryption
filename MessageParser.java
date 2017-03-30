import java.util.ArrayList;

public class MessageParser implements IMessageParser{
	private ArrayList<String> m_words = new ArrayList<String>();
	private String m_message = "";
	public MessageParser(String message){
		m_message = message;
		String[] array_word = m_message.split(" ");
		for (int i = 0; i < array_word.length; i++){
			m_words.add(array_word[i]);
		}
	}
	@Override
	public int getCharCount() {
		return m_message.length();
	}

	@Override
	public int getWordCount() {
		return m_words.size();
	}

	@Override
	public char getChar(int i) {
		return m_message.charAt(i);
	}

	@Override
	public String getWord(int i) {
		return m_words.get(i);
	}

}
