package smdp.project.survey.Transformation;

import com.google.inject.Injector;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import smdp.project.survey.SurveyDSLStandaloneSetup;
import survey.SurveyPackage;
import survey.validation.Constraints;

@SuppressWarnings("all")
public class MainSolution {
  public static void main(final String[] args) {
    try {
      SurveyPackage.eINSTANCE.eClass();
      SurveyDSLStandaloneSetup _surveyDSLStandaloneSetup = new SurveyDSLStandaloneSetup();
      final Injector injector = _surveyDSLStandaloneSetup.createInjectorAndDoEMFRegistration();
      final XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
      resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.valueOf(true));
      final URI uri = URI.createURI("surveytest.survey");
      Resource surveyResource = resourceSet.getResource(uri, true);
      final URI outputURI = URI.createURI("surveytest.xmi");
      final Resource xmlResource = resourceSet.createResource(outputURI);
      EList<EObject> _contents = surveyResource.getContents();
      final EObject root = _contents.get(0);
      EList<EObject> _contents_1 = xmlResource.getContents();
      _contents_1.add(root);
      xmlResource.save(null);
      Map<String,Object> _extensionToFactoryMap = Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
      SurveyPackage.eINSTANCE.eClass();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      final ResourceSetImpl xmiResourceSet = _resourceSetImpl;
      final URI xmiUri = URI.createURI("surveytest.xmi");
      final Resource resource = xmiResourceSet.getResource(xmiUri, true);
      TreeIterator<EObject> _allProperContents = EcoreUtil.<EObject>getAllProperContents(resource, false);
      final Function1<EObject,Boolean> _function = new Function1<EObject,Boolean>() {
        public Boolean apply(final EObject it) {
          boolean _constraint = Constraints.constraint(it);
          return Boolean.valueOf(_constraint);
        }
      };
      boolean _forall = IteratorExtensions.<EObject>forall(_allProperContents, _function);
      if (_forall) {
        InputOutput.<String>println("All constraints are satisfied!");
      } else {
        InputOutput.<String>println("Some constraint is violated");
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
