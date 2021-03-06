package assignment1;

/**
 * ADT for the class Identifier.
 *
 * @author Pim Dijt, Rick van Rheenen
 * 
 * @elements Characters of type char.
 * @structure Lineair
 * @domain All series of alfanumeric characters starting with a letter and
 *         containing at least one letter.
 * @constructor Identifier();
 *              <dl>
 *              <dt><b>PRE-condition</b>
 *              <dd>-
 *              <dt><b>POST-condition</b>
 *              <dd>A new Identifier object is created which contains one character
 *              </dl>
 *              <br>
 *              Identifier (Identifier src);
 *              <dl>
 *              <dt><b>PRE-condition</b>
 *              <dd>-
 *              <dt><b>POST-condition</b>
 *              <dd>The new Identifier object contains a copy of src
 *              </dl>
 **/

public interface IdentifierInterface {

	/**
	 * Initializes the Identifier object 
	 * 
	 * @precondition: c is a char from a-z, A-Z
	 * @postcondition: The Identifier object is initialized with character c
	 */
	void init(char c);


	/**
	 * Adds character c to the Identifier
	 * 
	 * @precondition: c is a char from a-z, A-Z, 0-9
	 * @postcondition: Character c is added to the Identifier at the end
	 */
	void addChar(char c);


	/**
	 * Returns a char at position index from the Identifier
	 * 
	 * @precondition: The index is less than the size of the Identifier and not negative
	 * @postcondition: The character at position index is returned
	 */
	char getChar(int index);


	/**
	 * Returns the size of the Identifier
	 * 
	 * @precondition: -
	 * @postcondition: The size of the Identifier is returned
	 */
	int getSize();

	/**
	 * Checks if the two Identifiers are equal to eachother
	 * 
	 * @precondition: -
	 * @postcondition: false: The Identifiers are not equal 
	 * 				   true: The  Identifiers are equal
	 */
	boolean isEqualTo(Identifier id);

}
