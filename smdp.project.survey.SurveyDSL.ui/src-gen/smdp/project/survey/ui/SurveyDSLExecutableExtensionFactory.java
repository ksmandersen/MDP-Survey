/*
 * generated by Xtext
 */
package smdp.project.survey.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import smdp.project.survey.ui.internal.SurveyDSLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SurveyDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SurveyDSLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SurveyDSLActivator.getInstance().getInjector(SurveyDSLActivator.SMDP_PROJECT_SURVEY_SURVEYDSL);
	}
	
}
