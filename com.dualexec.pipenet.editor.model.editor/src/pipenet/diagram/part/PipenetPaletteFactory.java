package pipenet.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import pipenet.diagram.providers.PipenetElementTypes;

/**
 * @generated
 */
public class PipenetPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createPipenet1Group());
	}

	/**
	 * Creates "pipenet" palette tool group
	 * @generated
	 */
	private PaletteContainer createPipenet1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Pipenet1Group_title);
		paletteContainer.setId("createPipenet1Group"); //$NON-NLS-1$
		paletteContainer.add(createTransition1CreationTool());
		paletteContainer.add(createPlace2CreationTool());
		paletteContainer.add(createArc3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Transition1CreationTool_title,
				Messages.Transition1CreationTool_desc,
				Collections.singletonList(PipenetElementTypes.Transition_2001));
		entry.setId("createTransition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipenetElementTypes
				.getImageDescriptor(PipenetElementTypes.Transition_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlace2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Place2CreationTool_title,
				Messages.Place2CreationTool_desc,
				Collections.singletonList(PipenetElementTypes.Place_2002));
		entry.setId("createPlace2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipenetElementTypes
				.getImageDescriptor(PipenetElementTypes.Place_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArc3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Arc3CreationTool_title,
				Messages.Arc3CreationTool_desc,
				Collections.singletonList(PipenetElementTypes.Arc_4001));
		entry.setId("createArc3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipenetElementTypes
				.getImageDescriptor(PipenetElementTypes.Arc_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
