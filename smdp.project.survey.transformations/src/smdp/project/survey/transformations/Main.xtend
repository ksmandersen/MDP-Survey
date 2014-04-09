package smdp.project.survey.transformations

import survey.SurveyPackage
import smdp.project.survey.SurveyDSLStandaloneSetup
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class Main {
	def static void main(String[] args) {
		SurveyPackage.eINSTANCE.eClass
		
		val injector = new SurveyDSLStandaloneSetup().createInjectorAndDoEMFRegistration
		val resourceSet = injector.getInstance(typeof(XtextResourceSet))
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, true)
		
		val uri = URI::createURI("surveytest.survey")
//		var resource = resourceSet.getR
	}
}