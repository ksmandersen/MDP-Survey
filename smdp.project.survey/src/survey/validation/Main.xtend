package survey.validation

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import survey.Answer;
import survey.SurveyPackage

class Main {
	def static void main(String[] args) {
		// register the file extension to be read as XMI
		Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)

		// register our meta-model packages (we have quite a few in this exercise)
		SurveyPackage.eINSTANCE.eClass()		
		// load the file 
		val resourceSet = new ResourceSetImpl

		// change file name here to try other files
		val uri = URI::createURI("surveytest.xmi")
		val resource = resourceSet.getResource(uri, true)

		// check constraints
		if (EcoreUtil.getAllProperContents(resource, false).forall[Constraints.constraint(it)])
			println("All constraints are satisfied!")
		else
			println("Some constraint is violated")
	}
}