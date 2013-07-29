/**
 */
package pipenet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pipenet.Place#getTokenCount <em>Token Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see pipenet.PipenetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends Node {
	/**
	 * Returns the value of the '<em><b>Token Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Count</em>' attribute.
	 * @see #setTokenCount(int)
	 * @see pipenet.PipenetPackage#getPlace_TokenCount()
	 * @model
	 * @generated
	 */
	int getTokenCount();

	/**
	 * Sets the value of the '{@link pipenet.Place#getTokenCount <em>Token Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Count</em>' attribute.
	 * @see #getTokenCount()
	 * @generated
	 */
	void setTokenCount(int value);

} // Place
