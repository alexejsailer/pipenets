/**
 */
package pipenet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pipenet.Node#getName <em>Name</em>}</li>
 *   <li>{@link pipenet.Node#getPresetNodes <em>Preset Nodes</em>}</li>
 *   <li>{@link pipenet.Node#getPostsetNodes <em>Postset Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see pipenet.PipenetPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Pipenet {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pipenet.PipenetPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pipenet.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Preset Nodes</b></em>' reference list.
	 * The list contents are of type {@link pipenet.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preset Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preset Nodes</em>' reference list.
	 * @see pipenet.PipenetPackage#getNode_PresetNodes()
	 * @model
	 * @generated
	 */
	EList<Node> getPresetNodes();

	/**
	 * Returns the value of the '<em><b>Postset Nodes</b></em>' reference list.
	 * The list contents are of type {@link pipenet.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postset Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postset Nodes</em>' reference list.
	 * @see pipenet.PipenetPackage#getNode_PostsetNodes()
	 * @model
	 * @generated
	 */
	EList<Node> getPostsetNodes();

} // Node
