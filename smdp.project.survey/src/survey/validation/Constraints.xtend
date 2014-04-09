package survey.validation

import survey.*;
import org.eclipse.emf.ecore.EObject

class Constraints {
	
	// A question must not require a previous answer that is one of
	// its own answers 
	def static dispatch constraint(MultipleChoice choice) {
		choice.answers.forall[!choice.requiredPreviousAnswers.contains(it)]
	}
	
	// Catch all case for dynamic dispatch resolution
	def static dispatch boolean constraint(EObject it) {
		true
	}
	
}