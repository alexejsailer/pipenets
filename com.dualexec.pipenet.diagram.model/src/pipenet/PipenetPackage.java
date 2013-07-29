/**
 */
package pipenet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pipenet.PipenetFactory
 * @model kind="package"
 * @generated
 */
public interface PipenetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pipenet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://pipenets.dualexec.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PipenetPackage eINSTANCE = pipenet.impl.PipenetPackageImpl.init();

	/**
	 * The meta object id for the '{@link pipenet.impl.PipenetImpl <em>Pipenet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipenet.impl.PipenetImpl
	 * @see pipenet.impl.PipenetPackageImpl#getPipenet()
	 * @generated
	 */
	int PIPENET = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPENET__NODES = 0;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPENET__ARCS = 1;

	/**
	 * The number of structural features of the '<em>Pipenet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPENET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pipenet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPENET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pipenet.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipenet.impl.NodeImpl
	 * @see pipenet.impl.PipenetPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODES = PIPENET__NODES;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ARCS = PIPENET__ARCS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = PIPENET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preset Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PRESET_NODES = PIPENET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Postset Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__POSTSET_NODES = PIPENET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = PIPENET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = PIPENET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipenet.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipenet.impl.TransitionImpl
	 * @see pipenet.impl.PipenetPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NODES = NODE__NODES;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ARCS = NODE__ARCS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Preset Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PRESET_NODES = NODE__PRESET_NODES;

	/**
	 * The feature id for the '<em><b>Postset Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__POSTSET_NODES = NODE__POSTSET_NODES;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipenet.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipenet.impl.PlaceImpl
	 * @see pipenet.impl.PipenetPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 2;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NODES = NODE__NODES;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ARCS = NODE__ARCS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Preset Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__PRESET_NODES = NODE__PRESET_NODES;

	/**
	 * The feature id for the '<em><b>Postset Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__POSTSET_NODES = NODE__POSTSET_NODES;

	/**
	 * The feature id for the '<em><b>Token Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOKEN_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipenet.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipenet.impl.ArcImpl
	 * @see pipenet.impl.PipenetPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link pipenet.Pipenet <em>Pipenet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipenet</em>'.
	 * @see pipenet.Pipenet
	 * @generated
	 */
	EClass getPipenet();

	/**
	 * Returns the meta object for the reference list '{@link pipenet.Pipenet#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see pipenet.Pipenet#getNodes()
	 * @see #getPipenet()
	 * @generated
	 */
	EReference getPipenet_Nodes();

	/**
	 * Returns the meta object for the reference list '{@link pipenet.Pipenet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arcs</em>'.
	 * @see pipenet.Pipenet#getArcs()
	 * @see #getPipenet()
	 * @generated
	 */
	EReference getPipenet_Arcs();

	/**
	 * Returns the meta object for class '{@link pipenet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see pipenet.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for class '{@link pipenet.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see pipenet.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link pipenet.Place#getTokenCount <em>Token Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Count</em>'.
	 * @see pipenet.Place#getTokenCount()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_TokenCount();

	/**
	 * Returns the meta object for class '{@link pipenet.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see pipenet.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link pipenet.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pipenet.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the reference list '{@link pipenet.Node#getPresetNodes <em>Preset Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Preset Nodes</em>'.
	 * @see pipenet.Node#getPresetNodes()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_PresetNodes();

	/**
	 * Returns the meta object for the reference list '{@link pipenet.Node#getPostsetNodes <em>Postset Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Postset Nodes</em>'.
	 * @see pipenet.Node#getPostsetNodes()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_PostsetNodes();

	/**
	 * Returns the meta object for class '{@link pipenet.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see pipenet.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link pipenet.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see pipenet.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Source();

	/**
	 * Returns the meta object for the reference '{@link pipenet.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see pipenet.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PipenetFactory getPipenetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pipenet.impl.PipenetImpl <em>Pipenet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipenet.impl.PipenetImpl
		 * @see pipenet.impl.PipenetPackageImpl#getPipenet()
		 * @generated
		 */
		EClass PIPENET = eINSTANCE.getPipenet();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPENET__NODES = eINSTANCE.getPipenet_Nodes();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPENET__ARCS = eINSTANCE.getPipenet_Arcs();

		/**
		 * The meta object literal for the '{@link pipenet.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipenet.impl.TransitionImpl
		 * @see pipenet.impl.PipenetPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link pipenet.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipenet.impl.PlaceImpl
		 * @see pipenet.impl.PipenetPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Token Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__TOKEN_COUNT = eINSTANCE.getPlace_TokenCount();

		/**
		 * The meta object literal for the '{@link pipenet.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipenet.impl.NodeImpl
		 * @see pipenet.impl.PipenetPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Preset Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PRESET_NODES = eINSTANCE.getNode_PresetNodes();

		/**
		 * The meta object literal for the '<em><b>Postset Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__POSTSET_NODES = eINSTANCE.getNode_PostsetNodes();

		/**
		 * The meta object literal for the '{@link pipenet.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipenet.impl.ArcImpl
		 * @see pipenet.impl.PipenetPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TARGET = eINSTANCE.getArc_Target();

	}

} //PipenetPackage
