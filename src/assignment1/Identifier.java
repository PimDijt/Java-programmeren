package assignment1;

public class Identifier implements IdentifierInterface {

	StringBuffer id;
	
	public Identifier() {
		id = new StringBuffer();
		id.append('a');
	}

	public Identifier(Identifier src){
		
	}
	
	@Override
	public void init(char c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addChar(char c) {
		// TODO Auto-generated method stub

	}

	@Override
	public char getChar(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEqual(Identifier id) {
		// TODO Auto-generated method stub
		return false;
	}
}
