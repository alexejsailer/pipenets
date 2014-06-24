/**
 */
package pipenet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pipenet.Node;
import pipenet.PipenetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pipenet.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link pipenet.impl.NodeImpl#getPresetNodes <em>Preset Nodes</em>}</li>
 *   <li>{@link pipenet.impl.NodeImpl#getPostsetNodes <em>Postset Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends PipenetImpl implements Node {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPresetNodes() <em>Preset Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresetNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> presetNodes;

	/**
	 * The cached value of the '{@link #getPostsetNodes() <em>Postset Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostsetNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> postsetNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipenetPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipenetPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getPresetNodes() {
		if (presetNodes == null) {
			presetNodes = new EObjectResolvingEList<Node>(Node.class, this, PipenetPackage.NODE__PRESET_NODES);
		}
		return presetNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getPostsetNodes() {
		if (postsetNodes == null) {
			postsetNodes = new EObjectResolvingEList<Node>(Node.class, this, PipenetPackage.NODE__POSTSET_NODES);
		}
		return postsetNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipenetPackage.NODE__NAME:
				return getName();
			case PipenetPackage.NODE__PRESET_NODES:
				return getPresetNodes();
			case PipenetPackage.NODE__POSTSET_NODES:
				return getPostsetNodes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PipenetPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case PipenetPackage.NODE__PRESET_NODES:
				getPresetNodes().clear();
				getPresetNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case PipenetPackage.NODE__POSTSET_NODES:
				getPostsetNodes().clear();
				getPostsetNodes().addAll((Collection<? extends Node>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PipenetPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PipenetPackage.NODE__PRESET_NODES:
				getPresetNodes().clear();
				return;
			case PipenetPackage.NODE__POSTSET_NODES:
				getPostsetNodes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PipenetPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PipenetPackage.NODE__PRESET_NODES:
				return presetNodes != null && !presetNodes.isEmpty();
			case PipenetPackage.NODE__POSTSET_NODES:
				return postsetNodes != null && !postsetNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
