package pipenet.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import pipenet.diagram.providers.PipenetElementTypes;

/**
 * @generated
 */
public class ArcItemSemanticEditPolicy extends
		PipenetBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArcItemSemanticEditPolicy() {
		super(PipenetElementTypes.Arc_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
