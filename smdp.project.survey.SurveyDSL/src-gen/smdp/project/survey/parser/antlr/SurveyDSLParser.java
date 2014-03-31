/*
* generated by Xtext
*/
package smdp.project.survey.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import smdp.project.survey.services.SurveyDSLGrammarAccess;

public class SurveyDSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SurveyDSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected smdp.project.survey.parser.antlr.internal.InternalSurveyDSLParser createParser(XtextTokenStream stream) {
		return new smdp.project.survey.parser.antlr.internal.InternalSurveyDSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Survey";
	}
	
	public SurveyDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SurveyDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
