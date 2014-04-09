package survey.validation

import survey.*;
import org.eclipse.emf.ecore.EObject

class Constraints {
	def static dispatch constraint(MultipleChoice choice) {
		!choice.answers.forall[choice.requiredPreviousAnswers.contains(it)]
	}
	
	// Catch all case for dynamic dispatch resolution
	def static dispatch boolean constraint(EObject it) {
		true
	}
	
}