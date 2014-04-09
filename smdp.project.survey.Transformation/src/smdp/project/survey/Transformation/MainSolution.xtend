package smdp.project.survey.Transformation

import survey.SurveyPackage
import smdp.project.survey.SurveyDSLStandaloneSetup
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import survey.validation.Constraints

class MainSolution {
	def static void main(String[] args) {
		SurveyPackage.eINSTANCE.eClass();
		val injector = new SurveyDSLStandaloneSetup().createInjectorAndDoEMFRegistration
		val resourceSet = injector.getInstance(typeof(XtextResourceSet))
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, true)
		
		val uri = URI::createURI("surveytest.survey")
		var surveyResource = resourceSet.getResource(uri, true)
		
		val outputURI = URI.createURI("surveytest.xmi")
		val xmlResource = resourceSet.createResource(outputURI)
		val root = surveyResource.getContents().get(0)
		xmlResource.getContents().add(root)
		
		xmlResource.save(null)
		
		// register the file extension to be read as XMI
		Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)

		// register our meta-model packages (we have quite a few in this exercise)
		SurveyPackage.eINSTANCE.eClass()		
		// load the file 
		
		
		val xmiResourceSet = new ResourceSetImpl

		// change file name here to try other files
		val xmiUri = URI::createURI("surveytest.xmi")
		val resource = xmiResourceSet.getResource(xmiUri, true)

		// check constraints
		if (EcoreUtil.getAllProperContents(resource, false).forall[Constraints.constraint(it)])
			println("All constraints are satisfied!")
		else
			println("Some constraint is violated")
	}
}