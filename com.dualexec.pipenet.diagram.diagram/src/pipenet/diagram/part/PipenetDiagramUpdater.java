package pipenet.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import pipenet.Arc;
import pipenet.Node;
import pipenet.Pipenet;
import pipenet.PipenetPackage;
import pipenet.Place;
import pipenet.Transition;
import pipenet.diagram.edit.parts.ArcEditPart;
import pipenet.diagram.edit.parts.PipenetEditPart;
import pipenet.diagram.edit.parts.PlaceEditPart;
import pipenet.diagram.edit.parts.TransitionEditPart;
import pipenet.diagram.providers.PipenetElementTypes;

/**
 * @generated
 */
public class PipenetDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<PipenetNodeDescriptor> getSemanticChildren(View view) {
		switch (PipenetVisualIDRegistry.getVisualID(view)) {
		case PipenetEditPart.VISUAL_ID:
			return getPipenet_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipenetNodeDescriptor> getPipenet_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Pipenet modelElement = (Pipenet) view.getElement();
		LinkedList<PipenetNodeDescriptor> result = new LinkedList<PipenetNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = PipenetVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TransitionEditPart.VISUAL_ID) {
				result.add(new PipenetNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PlaceEditPart.VISUAL_ID) {
				result.add(new PipenetNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipenetLinkDescriptor> getContainedLinks(View view) {
		switch (PipenetVisualIDRegistry.getVisualID(view)) {
		case PipenetEditPart.VISUAL_ID:
			return getPipenet_1000ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2001ContainedLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2002ContainedLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipenetLinkDescriptor> getIncomingLinks(View view) {
		switch (PipenetVisualIDRegistry.getVisualID(view)) {
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2001IncomingLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2002IncomingLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipenetLinkDescriptor> getOutgoingLinks(View view) {
		switch (PipenetVisualIDRegistry.getVisualID(view)) {
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2001OutgoingLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2002OutgoingLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipenetLinkDescriptor> getPipenet_1000ContainedLinks(
			View view) {
		Pipenet modelElement = (Pipenet) view.getElement();
		LinkedList<PipenetLinkDescriptor> result = new LinkedList<PipenetLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipenetLinkDescriptor> getTransition_2001ContainedLinks(
			View view) {
		Transition modelElement = (Transition) view.getElement();
		LinkedList<PipenetLinkDescriptor> result = new LinkedList<PipenetLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipenetLinkDescriptor> getPlace_2002ContainedLinks(
			View view) {
		Place modelElement = (Place) view.getElement();
		LinkedList<PipenetLinkDescriptor> result = new LinkedList<PipenetLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipenetLinkDescriptor> getArc_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipenetLinkDescriptor> getTransition_2001IncomingLinks(
			View view) {
		Transition modelElement = (Transition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipenetLinkDescriptor> result = new LinkedList<PipenetLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipenetLinkDescriptor> getPlace_2002IncomingLinks(
			View view) {
		Place modelElement = (Place) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipenetLinkDescriptor> result = new LinkedList<PipenetLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipenetLinkDescriptor> getArc_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipenetLinkDescriptor> getTransition_2001OutgoingLinks(
			View view) {
		Transition modelElement = (Transition) view.getElement();
		LinkedList<PipenetLinkDescriptor> result = new LinkedList<PipenetLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipenetLinkDescriptor> getPlace_2002OutgoingLinks(
			View view) {
		Place modelElement = (Place) view.getElement();
		LinkedList<PipenetLinkDescriptor> result = new LinkedList<PipenetLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipenetLinkDescriptor> getArc_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<PipenetLinkDescriptor> getContainedTypeModelFacetLinks_Arc_4001(
			Pipenet container) {
		LinkedList<PipenetLinkDescriptor> result = new LinkedList<PipenetLinkDescriptor>();
		for (Iterator<?> links = container.getArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Arc) {
				continue;
			}
			Arc link = (Arc) linkObject;
			if (ArcEditPart.VISUAL_ID != PipenetVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			result.add(new PipenetLinkDescriptor(src, dst, link,
					PipenetElementTypes.Arc_4001, ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipenetLinkDescriptor> getIncomingTypeModelFacetLinks_Arc_4001(
			Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipenetLinkDescriptor> result = new LinkedList<PipenetLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PipenetPackage.eINSTANCE
					.getArc_Target()
					|| false == setting.getEObject() instanceof Arc) {
				continue;
			}
			Arc link = (Arc) setting.getEObject();
			if (ArcEditPart.VISUAL_ID != PipenetVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSource();
			result.add(new PipenetLinkDescriptor(src, target, link,
					PipenetElementTypes.Arc_4001, ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipenetLinkDescriptor> getOutgoingTypeModelFacetLinks_Arc_4001(
			Node source) {
		Pipenet container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Pipenet) {
				container = (Pipenet) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<PipenetLinkDescriptor> result = new LinkedList<PipenetLinkDescriptor>();
		for (Iterator<?> links = container.getArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Arc) {
				continue;
			}
			Arc link = (Arc) linkObject;
			if (ArcEditPart.VISUAL_ID != PipenetVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new PipenetLinkDescriptor(src, dst, link,
					PipenetElementTypes.Arc_4001, ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<PipenetNodeDescriptor> getSemanticChildren(View view) {
			return PipenetDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<PipenetLinkDescriptor> getContainedLinks(View view) {
			return PipenetDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<PipenetLinkDescriptor> getIncomingLinks(View view) {
			return PipenetDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<PipenetLinkDescriptor> getOutgoingLinks(View view) {
			return PipenetDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
