package pipenet.diagram.providers;

import pipenet.diagram.part.PipenetDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = PipenetDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			PipenetDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
