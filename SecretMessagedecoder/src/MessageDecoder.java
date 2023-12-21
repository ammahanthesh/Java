1public class MessageDecoder {
	public int decodeCharacter(char ch) {
		return ch;
	}

	public static void main(String[] args) {
		MessageDecoder decoder = new MessageDecoder();
		System.out.println(decoder.decodeCharacter('A'));
	}
}