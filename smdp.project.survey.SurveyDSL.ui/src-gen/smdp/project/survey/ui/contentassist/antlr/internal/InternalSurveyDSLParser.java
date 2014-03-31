package smdp.project.survey.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import smdp.project.survey.services.SurveyDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'answer'", "'open:'", "'requires'", "','", "'multiple:'", "'single:'", "'text'", "'optional'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalSurveyDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSurveyDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSurveyDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g"; }


     
     	private SurveyDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SurveyDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSurvey"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:60:1: entryRuleSurvey : ruleSurvey EOF ;
    public final void entryRuleSurvey() throws RecognitionException {
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:61:1: ( ruleSurvey EOF )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:62:1: ruleSurvey EOF
            {
             before(grammarAccess.getSurveyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_entryRuleSurvey61);
            ruleSurvey();

            state._fsp--;

             after(grammarAccess.getSurveyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSurvey68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:69:1: ruleSurvey : ( ( ( rule__Survey__QuestionsAssignment ) ) ( ( rule__Survey__QuestionsAssignment )* ) ) ;
    public final void ruleSurvey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:73:2: ( ( ( ( rule__Survey__QuestionsAssignment ) ) ( ( rule__Survey__QuestionsAssignment )* ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:74:1: ( ( ( rule__Survey__QuestionsAssignment ) ) ( ( rule__Survey__QuestionsAssignment )* ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:74:1: ( ( ( rule__Survey__QuestionsAssignment ) ) ( ( rule__Survey__QuestionsAssignment )* ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:75:1: ( ( rule__Survey__QuestionsAssignment ) ) ( ( rule__Survey__QuestionsAssignment )* )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:75:1: ( ( rule__Survey__QuestionsAssignment ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:76:1: ( rule__Survey__QuestionsAssignment )
            {
             before(grammarAccess.getSurveyAccess().getQuestionsAssignment()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:77:1: ( rule__Survey__QuestionsAssignment )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:77:2: rule__Survey__QuestionsAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__QuestionsAssignment_in_ruleSurvey96);
            rule__Survey__QuestionsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getQuestionsAssignment()); 

            }

            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:80:1: ( ( rule__Survey__QuestionsAssignment )* )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:81:1: ( rule__Survey__QuestionsAssignment )*
            {
             before(grammarAccess.getSurveyAccess().getQuestionsAssignment()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:82:1: ( rule__Survey__QuestionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:82:2: rule__Survey__QuestionsAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Survey__QuestionsAssignment_in_ruleSurvey108);
            	    rule__Survey__QuestionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSurveyAccess().getQuestionsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRuleQuestion"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:95:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:96:1: ( ruleQuestion EOF )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:97:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion138);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion145); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:104:1: ruleQuestion : ( ( rule__Question__Alternatives ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:108:2: ( ( ( rule__Question__Alternatives ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:109:1: ( ( rule__Question__Alternatives ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:109:1: ( ( rule__Question__Alternatives ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:110:1: ( rule__Question__Alternatives )
            {
             before(grammarAccess.getQuestionAccess().getAlternatives()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:111:1: ( rule__Question__Alternatives )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:111:2: rule__Question__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Alternatives_in_ruleQuestion171);
            rule__Question__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleAnswer"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:123:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:124:1: ( ruleAnswer EOF )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:125:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer198);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer205); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:132:1: ruleAnswer : ( ( rule__Answer__Alternatives ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:136:2: ( ( ( rule__Answer__Alternatives ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:137:1: ( ( rule__Answer__Alternatives ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:137:1: ( ( rule__Answer__Alternatives ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:138:1: ( rule__Answer__Alternatives )
            {
             before(grammarAccess.getAnswerAccess().getAlternatives()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:139:1: ( rule__Answer__Alternatives )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:139:2: rule__Answer__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Alternatives_in_ruleAnswer231);
            rule__Answer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleEString"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:151:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:152:1: ( ruleEString EOF )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:153:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString258);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString265); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:160:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:164:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:165:1: ( ( rule__EString__Alternatives ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:165:1: ( ( rule__EString__Alternatives ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:166:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:167:1: ( rule__EString__Alternatives )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:167:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString291);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAnswer_Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:179:1: entryRuleAnswer_Impl : ruleAnswer_Impl EOF ;
    public final void entryRuleAnswer_Impl() throws RecognitionException {
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:180:1: ( ruleAnswer_Impl EOF )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:181:1: ruleAnswer_Impl EOF
            {
             before(grammarAccess.getAnswer_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_Impl_in_entryRuleAnswer_Impl318);
            ruleAnswer_Impl();

            state._fsp--;

             after(grammarAccess.getAnswer_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer_Impl325); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnswer_Impl"


    // $ANTLR start "ruleAnswer_Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:188:1: ruleAnswer_Impl : ( ( rule__Answer_Impl__Group__0 ) ) ;
    public final void ruleAnswer_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:192:2: ( ( ( rule__Answer_Impl__Group__0 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:193:1: ( ( rule__Answer_Impl__Group__0 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:193:1: ( ( rule__Answer_Impl__Group__0 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:194:1: ( rule__Answer_Impl__Group__0 )
            {
             before(grammarAccess.getAnswer_ImplAccess().getGroup()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:195:1: ( rule__Answer_Impl__Group__0 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:195:2: rule__Answer_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer_Impl__Group__0_in_ruleAnswer_Impl351);
            rule__Answer_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnswer_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnswer_Impl"


    // $ANTLR start "entryRuleOpenQuestion"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:209:1: entryRuleOpenQuestion : ruleOpenQuestion EOF ;
    public final void entryRuleOpenQuestion() throws RecognitionException {
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:210:1: ( ruleOpenQuestion EOF )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:211:1: ruleOpenQuestion EOF
            {
             before(grammarAccess.getOpenQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpenQuestion_in_entryRuleOpenQuestion380);
            ruleOpenQuestion();

            state._fsp--;

             after(grammarAccess.getOpenQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpenQuestion387); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpenQuestion"


    // $ANTLR start "ruleOpenQuestion"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:218:1: ruleOpenQuestion : ( ( rule__OpenQuestion__Group__0 ) ) ;
    public final void ruleOpenQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:222:2: ( ( ( rule__OpenQuestion__Group__0 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:223:1: ( ( rule__OpenQuestion__Group__0 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:223:1: ( ( rule__OpenQuestion__Group__0 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:224:1: ( rule__OpenQuestion__Group__0 )
            {
             before(grammarAccess.getOpenQuestionAccess().getGroup()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:225:1: ( rule__OpenQuestion__Group__0 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:225:2: rule__OpenQuestion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group__0_in_ruleOpenQuestion413);
            rule__OpenQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpenQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpenQuestion"


    // $ANTLR start "entryRuleMultipleChoice"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:237:1: entryRuleMultipleChoice : ruleMultipleChoice EOF ;
    public final void entryRuleMultipleChoice() throws RecognitionException {
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:238:1: ( ruleMultipleChoice EOF )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:239:1: ruleMultipleChoice EOF
            {
             before(grammarAccess.getMultipleChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice440);
            ruleMultipleChoice();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleChoice447); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultipleChoice"


    // $ANTLR start "ruleMultipleChoice"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:246:1: ruleMultipleChoice : ( ( rule__MultipleChoice__Group__0 ) ) ;
    public final void ruleMultipleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:250:2: ( ( ( rule__MultipleChoice__Group__0 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:251:1: ( ( rule__MultipleChoice__Group__0 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:251:1: ( ( rule__MultipleChoice__Group__0 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:252:1: ( rule__MultipleChoice__Group__0 )
            {
             before(grammarAccess.getMultipleChoiceAccess().getGroup()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:253:1: ( rule__MultipleChoice__Group__0 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:253:2: rule__MultipleChoice__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__0_in_ruleMultipleChoice473);
            rule__MultipleChoice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultipleChoice"


    // $ANTLR start "entryRuleRadioChoice"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:265:1: entryRuleRadioChoice : ruleRadioChoice EOF ;
    public final void entryRuleRadioChoice() throws RecognitionException {
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:266:1: ( ruleRadioChoice EOF )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:267:1: ruleRadioChoice EOF
            {
             before(grammarAccess.getRadioChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRadioChoice_in_entryRuleRadioChoice500);
            ruleRadioChoice();

            state._fsp--;

             after(grammarAccess.getRadioChoiceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRadioChoice507); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRadioChoice"


    // $ANTLR start "ruleRadioChoice"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:274:1: ruleRadioChoice : ( ( rule__RadioChoice__Group__0 ) ) ;
    public final void ruleRadioChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:278:2: ( ( ( rule__RadioChoice__Group__0 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:279:1: ( ( rule__RadioChoice__Group__0 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:279:1: ( ( rule__RadioChoice__Group__0 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:280:1: ( rule__RadioChoice__Group__0 )
            {
             before(grammarAccess.getRadioChoiceAccess().getGroup()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:281:1: ( rule__RadioChoice__Group__0 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:281:2: rule__RadioChoice__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group__0_in_ruleRadioChoice533);
            rule__RadioChoice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRadioChoiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRadioChoice"


    // $ANTLR start "entryRuleOpenAnswer"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:293:1: entryRuleOpenAnswer : ruleOpenAnswer EOF ;
    public final void entryRuleOpenAnswer() throws RecognitionException {
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:294:1: ( ruleOpenAnswer EOF )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:295:1: ruleOpenAnswer EOF
            {
             before(grammarAccess.getOpenAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpenAnswer_in_entryRuleOpenAnswer560);
            ruleOpenAnswer();

            state._fsp--;

             after(grammarAccess.getOpenAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpenAnswer567); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpenAnswer"


    // $ANTLR start "ruleOpenAnswer"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:302:1: ruleOpenAnswer : ( ( rule__OpenAnswer__Group__0 ) ) ;
    public final void ruleOpenAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:306:2: ( ( ( rule__OpenAnswer__Group__0 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:307:1: ( ( rule__OpenAnswer__Group__0 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:307:1: ( ( rule__OpenAnswer__Group__0 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:308:1: ( rule__OpenAnswer__Group__0 )
            {
             before(grammarAccess.getOpenAnswerAccess().getGroup()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:309:1: ( rule__OpenAnswer__Group__0 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:309:2: rule__OpenAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenAnswer__Group__0_in_ruleOpenAnswer593);
            rule__OpenAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpenAnswerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpenAnswer"


    // $ANTLR start "rule__Question__Alternatives"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:321:1: rule__Question__Alternatives : ( ( ruleOpenQuestion ) | ( ruleMultipleChoice ) | ( ruleRadioChoice ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:325:1: ( ( ruleOpenQuestion ) | ( ruleMultipleChoice ) | ( ruleRadioChoice ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:326:1: ( ruleOpenQuestion )
                    {
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:326:1: ( ruleOpenQuestion )
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:327:1: ruleOpenQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getOpenQuestionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOpenQuestion_in_rule__Question__Alternatives629);
                    ruleOpenQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getOpenQuestionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:332:6: ( ruleMultipleChoice )
                    {
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:332:6: ( ruleMultipleChoice )
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:333:1: ruleMultipleChoice
                    {
                     before(grammarAccess.getQuestionAccess().getMultipleChoiceParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_rule__Question__Alternatives646);
                    ruleMultipleChoice();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getMultipleChoiceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:338:6: ( ruleRadioChoice )
                    {
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:338:6: ( ruleRadioChoice )
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:339:1: ruleRadioChoice
                    {
                     before(grammarAccess.getQuestionAccess().getRadioChoiceParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRadioChoice_in_rule__Question__Alternatives663);
                    ruleRadioChoice();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getRadioChoiceParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Alternatives"


    // $ANTLR start "rule__Answer__Alternatives"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:349:1: rule__Answer__Alternatives : ( ( ruleAnswer_Impl ) | ( ruleOpenAnswer ) );
    public final void rule__Answer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:353:1: ( ( ruleAnswer_Impl ) | ( ruleOpenAnswer ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:354:1: ( ruleAnswer_Impl )
                    {
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:354:1: ( ruleAnswer_Impl )
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:355:1: ruleAnswer_Impl
                    {
                     before(grammarAccess.getAnswerAccess().getAnswer_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAnswer_Impl_in_rule__Answer__Alternatives695);
                    ruleAnswer_Impl();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getAnswer_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:360:6: ( ruleOpenAnswer )
                    {
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:360:6: ( ruleOpenAnswer )
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:361:1: ruleOpenAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getOpenAnswerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOpenAnswer_in_rule__Answer__Alternatives712);
                    ruleOpenAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getOpenAnswerParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:371:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:375:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:376:1: ( RULE_STRING )
                    {
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:376:1: ( RULE_STRING )
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:377:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives744); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:382:6: ( RULE_ID )
                    {
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:382:6: ( RULE_ID )
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:383:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives761); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Answer_Impl__Group__0"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:396:1: rule__Answer_Impl__Group__0 : rule__Answer_Impl__Group__0__Impl rule__Answer_Impl__Group__1 ;
    public final void rule__Answer_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:400:1: ( rule__Answer_Impl__Group__0__Impl rule__Answer_Impl__Group__1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:401:2: rule__Answer_Impl__Group__0__Impl rule__Answer_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer_Impl__Group__0__Impl_in_rule__Answer_Impl__Group__0792);
            rule__Answer_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer_Impl__Group__1_in_rule__Answer_Impl__Group__0795);
            rule__Answer_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer_Impl__Group__0"


    // $ANTLR start "rule__Answer_Impl__Group__0__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:408:1: rule__Answer_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Answer_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:412:1: ( ( () ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:413:1: ( () )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:413:1: ( () )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:414:1: ()
            {
             before(grammarAccess.getAnswer_ImplAccess().getAnswerAction_0()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:415:1: ()
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:417:1: 
            {
            }

             after(grammarAccess.getAnswer_ImplAccess().getAnswerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer_Impl__Group__0__Impl"


    // $ANTLR start "rule__Answer_Impl__Group__1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:427:1: rule__Answer_Impl__Group__1 : rule__Answer_Impl__Group__1__Impl rule__Answer_Impl__Group__2 ;
    public final void rule__Answer_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:431:1: ( rule__Answer_Impl__Group__1__Impl rule__Answer_Impl__Group__2 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:432:2: rule__Answer_Impl__Group__1__Impl rule__Answer_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer_Impl__Group__1__Impl_in_rule__Answer_Impl__Group__1853);
            rule__Answer_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer_Impl__Group__2_in_rule__Answer_Impl__Group__1856);
            rule__Answer_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer_Impl__Group__1"


    // $ANTLR start "rule__Answer_Impl__Group__1__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:439:1: rule__Answer_Impl__Group__1__Impl : ( 'answer' ) ;
    public final void rule__Answer_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:443:1: ( ( 'answer' ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:444:1: ( 'answer' )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:444:1: ( 'answer' )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:445:1: 'answer'
            {
             before(grammarAccess.getAnswer_ImplAccess().getAnswerKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Answer_Impl__Group__1__Impl884); 
             after(grammarAccess.getAnswer_ImplAccess().getAnswerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer_Impl__Group__1__Impl"


    // $ANTLR start "rule__Answer_Impl__Group__2"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:458:1: rule__Answer_Impl__Group__2 : rule__Answer_Impl__Group__2__Impl rule__Answer_Impl__Group__3 ;
    public final void rule__Answer_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:462:1: ( rule__Answer_Impl__Group__2__Impl rule__Answer_Impl__Group__3 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:463:2: rule__Answer_Impl__Group__2__Impl rule__Answer_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer_Impl__Group__2__Impl_in_rule__Answer_Impl__Group__2915);
            rule__Answer_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer_Impl__Group__3_in_rule__Answer_Impl__Group__2918);
            rule__Answer_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer_Impl__Group__2"


    // $ANTLR start "rule__Answer_Impl__Group__2__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:470:1: rule__Answer_Impl__Group__2__Impl : ( ( rule__Answer_Impl__NameAssignment_2 ) ) ;
    public final void rule__Answer_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:474:1: ( ( ( rule__Answer_Impl__NameAssignment_2 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:475:1: ( ( rule__Answer_Impl__NameAssignment_2 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:475:1: ( ( rule__Answer_Impl__NameAssignment_2 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:476:1: ( rule__Answer_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getAnswer_ImplAccess().getNameAssignment_2()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:477:1: ( rule__Answer_Impl__NameAssignment_2 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:477:2: rule__Answer_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer_Impl__NameAssignment_2_in_rule__Answer_Impl__Group__2__Impl945);
            rule__Answer_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnswer_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer_Impl__Group__2__Impl"


    // $ANTLR start "rule__Answer_Impl__Group__3"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:487:1: rule__Answer_Impl__Group__3 : rule__Answer_Impl__Group__3__Impl ;
    public final void rule__Answer_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:491:1: ( rule__Answer_Impl__Group__3__Impl )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:492:2: rule__Answer_Impl__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer_Impl__Group__3__Impl_in_rule__Answer_Impl__Group__3975);
            rule__Answer_Impl__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer_Impl__Group__3"


    // $ANTLR start "rule__Answer_Impl__Group__3__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:498:1: rule__Answer_Impl__Group__3__Impl : ( ( rule__Answer_Impl__DescriptionAssignment_3 ) ) ;
    public final void rule__Answer_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:502:1: ( ( ( rule__Answer_Impl__DescriptionAssignment_3 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:503:1: ( ( rule__Answer_Impl__DescriptionAssignment_3 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:503:1: ( ( rule__Answer_Impl__DescriptionAssignment_3 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:504:1: ( rule__Answer_Impl__DescriptionAssignment_3 )
            {
             before(grammarAccess.getAnswer_ImplAccess().getDescriptionAssignment_3()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:505:1: ( rule__Answer_Impl__DescriptionAssignment_3 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:505:2: rule__Answer_Impl__DescriptionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer_Impl__DescriptionAssignment_3_in_rule__Answer_Impl__Group__3__Impl1002);
            rule__Answer_Impl__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAnswer_ImplAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer_Impl__Group__3__Impl"


    // $ANTLR start "rule__OpenQuestion__Group__0"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:523:1: rule__OpenQuestion__Group__0 : rule__OpenQuestion__Group__0__Impl rule__OpenQuestion__Group__1 ;
    public final void rule__OpenQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:527:1: ( rule__OpenQuestion__Group__0__Impl rule__OpenQuestion__Group__1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:528:2: rule__OpenQuestion__Group__0__Impl rule__OpenQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group__0__Impl_in_rule__OpenQuestion__Group__01040);
            rule__OpenQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group__1_in_rule__OpenQuestion__Group__01043);
            rule__OpenQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group__0"


    // $ANTLR start "rule__OpenQuestion__Group__0__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:535:1: rule__OpenQuestion__Group__0__Impl : ( 'open:' ) ;
    public final void rule__OpenQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:539:1: ( ( 'open:' ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:540:1: ( 'open:' )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:540:1: ( 'open:' )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:541:1: 'open:'
            {
             before(grammarAccess.getOpenQuestionAccess().getOpenKeyword_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OpenQuestion__Group__0__Impl1071); 
             after(grammarAccess.getOpenQuestionAccess().getOpenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group__0__Impl"


    // $ANTLR start "rule__OpenQuestion__Group__1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:554:1: rule__OpenQuestion__Group__1 : rule__OpenQuestion__Group__1__Impl rule__OpenQuestion__Group__2 ;
    public final void rule__OpenQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:558:1: ( rule__OpenQuestion__Group__1__Impl rule__OpenQuestion__Group__2 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:559:2: rule__OpenQuestion__Group__1__Impl rule__OpenQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group__1__Impl_in_rule__OpenQuestion__Group__11102);
            rule__OpenQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group__2_in_rule__OpenQuestion__Group__11105);
            rule__OpenQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group__1"


    // $ANTLR start "rule__OpenQuestion__Group__1__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:566:1: rule__OpenQuestion__Group__1__Impl : ( ( rule__OpenQuestion__DescriptionAssignment_1 ) ) ;
    public final void rule__OpenQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:570:1: ( ( ( rule__OpenQuestion__DescriptionAssignment_1 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:571:1: ( ( rule__OpenQuestion__DescriptionAssignment_1 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:571:1: ( ( rule__OpenQuestion__DescriptionAssignment_1 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:572:1: ( rule__OpenQuestion__DescriptionAssignment_1 )
            {
             before(grammarAccess.getOpenQuestionAccess().getDescriptionAssignment_1()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:573:1: ( rule__OpenQuestion__DescriptionAssignment_1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:573:2: rule__OpenQuestion__DescriptionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__DescriptionAssignment_1_in_rule__OpenQuestion__Group__1__Impl1132);
            rule__OpenQuestion__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOpenQuestionAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group__1__Impl"


    // $ANTLR start "rule__OpenQuestion__Group__2"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:583:1: rule__OpenQuestion__Group__2 : rule__OpenQuestion__Group__2__Impl rule__OpenQuestion__Group__3 ;
    public final void rule__OpenQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:587:1: ( rule__OpenQuestion__Group__2__Impl rule__OpenQuestion__Group__3 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:588:2: rule__OpenQuestion__Group__2__Impl rule__OpenQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group__2__Impl_in_rule__OpenQuestion__Group__21162);
            rule__OpenQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group__3_in_rule__OpenQuestion__Group__21165);
            rule__OpenQuestion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group__2"


    // $ANTLR start "rule__OpenQuestion__Group__2__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:595:1: rule__OpenQuestion__Group__2__Impl : ( ( rule__OpenQuestion__IsOptionalAssignment_2 )? ) ;
    public final void rule__OpenQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:599:1: ( ( ( rule__OpenQuestion__IsOptionalAssignment_2 )? ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:600:1: ( ( rule__OpenQuestion__IsOptionalAssignment_2 )? )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:600:1: ( ( rule__OpenQuestion__IsOptionalAssignment_2 )? )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:601:1: ( rule__OpenQuestion__IsOptionalAssignment_2 )?
            {
             before(grammarAccess.getOpenQuestionAccess().getIsOptionalAssignment_2()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:602:1: ( rule__OpenQuestion__IsOptionalAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:602:2: rule__OpenQuestion__IsOptionalAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__IsOptionalAssignment_2_in_rule__OpenQuestion__Group__2__Impl1192);
                    rule__OpenQuestion__IsOptionalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpenQuestionAccess().getIsOptionalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group__2__Impl"


    // $ANTLR start "rule__OpenQuestion__Group__3"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:612:1: rule__OpenQuestion__Group__3 : rule__OpenQuestion__Group__3__Impl rule__OpenQuestion__Group__4 ;
    public final void rule__OpenQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:616:1: ( rule__OpenQuestion__Group__3__Impl rule__OpenQuestion__Group__4 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:617:2: rule__OpenQuestion__Group__3__Impl rule__OpenQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group__3__Impl_in_rule__OpenQuestion__Group__31223);
            rule__OpenQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group__4_in_rule__OpenQuestion__Group__31226);
            rule__OpenQuestion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group__3"


    // $ANTLR start "rule__OpenQuestion__Group__3__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:624:1: rule__OpenQuestion__Group__3__Impl : ( ( rule__OpenQuestion__Group_3__0 )? ) ;
    public final void rule__OpenQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:628:1: ( ( ( rule__OpenQuestion__Group_3__0 )? ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:629:1: ( ( rule__OpenQuestion__Group_3__0 )? )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:629:1: ( ( rule__OpenQuestion__Group_3__0 )? )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:630:1: ( rule__OpenQuestion__Group_3__0 )?
            {
             before(grammarAccess.getOpenQuestionAccess().getGroup_3()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:631:1: ( rule__OpenQuestion__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:631:2: rule__OpenQuestion__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group_3__0_in_rule__OpenQuestion__Group__3__Impl1253);
                    rule__OpenQuestion__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpenQuestionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group__3__Impl"


    // $ANTLR start "rule__OpenQuestion__Group__4"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:641:1: rule__OpenQuestion__Group__4 : rule__OpenQuestion__Group__4__Impl ;
    public final void rule__OpenQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:645:1: ( rule__OpenQuestion__Group__4__Impl )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:646:2: rule__OpenQuestion__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group__4__Impl_in_rule__OpenQuestion__Group__41284);
            rule__OpenQuestion__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group__4"


    // $ANTLR start "rule__OpenQuestion__Group__4__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:652:1: rule__OpenQuestion__Group__4__Impl : ( ( rule__OpenQuestion__OpenAnswerAssignment_4 ) ) ;
    public final void rule__OpenQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:656:1: ( ( ( rule__OpenQuestion__OpenAnswerAssignment_4 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:657:1: ( ( rule__OpenQuestion__OpenAnswerAssignment_4 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:657:1: ( ( rule__OpenQuestion__OpenAnswerAssignment_4 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:658:1: ( rule__OpenQuestion__OpenAnswerAssignment_4 )
            {
             before(grammarAccess.getOpenQuestionAccess().getOpenAnswerAssignment_4()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:659:1: ( rule__OpenQuestion__OpenAnswerAssignment_4 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:659:2: rule__OpenQuestion__OpenAnswerAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__OpenAnswerAssignment_4_in_rule__OpenQuestion__Group__4__Impl1311);
            rule__OpenQuestion__OpenAnswerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOpenQuestionAccess().getOpenAnswerAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group__4__Impl"


    // $ANTLR start "rule__OpenQuestion__Group_3__0"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:679:1: rule__OpenQuestion__Group_3__0 : rule__OpenQuestion__Group_3__0__Impl rule__OpenQuestion__Group_3__1 ;
    public final void rule__OpenQuestion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:683:1: ( rule__OpenQuestion__Group_3__0__Impl rule__OpenQuestion__Group_3__1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:684:2: rule__OpenQuestion__Group_3__0__Impl rule__OpenQuestion__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group_3__0__Impl_in_rule__OpenQuestion__Group_3__01351);
            rule__OpenQuestion__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group_3__1_in_rule__OpenQuestion__Group_3__01354);
            rule__OpenQuestion__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group_3__0"


    // $ANTLR start "rule__OpenQuestion__Group_3__0__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:691:1: rule__OpenQuestion__Group_3__0__Impl : ( 'requires' ) ;
    public final void rule__OpenQuestion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:695:1: ( ( 'requires' ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:696:1: ( 'requires' )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:696:1: ( 'requires' )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:697:1: 'requires'
            {
             before(grammarAccess.getOpenQuestionAccess().getRequiresKeyword_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__OpenQuestion__Group_3__0__Impl1382); 
             after(grammarAccess.getOpenQuestionAccess().getRequiresKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group_3__0__Impl"


    // $ANTLR start "rule__OpenQuestion__Group_3__1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:710:1: rule__OpenQuestion__Group_3__1 : rule__OpenQuestion__Group_3__1__Impl rule__OpenQuestion__Group_3__2 ;
    public final void rule__OpenQuestion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:714:1: ( rule__OpenQuestion__Group_3__1__Impl rule__OpenQuestion__Group_3__2 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:715:2: rule__OpenQuestion__Group_3__1__Impl rule__OpenQuestion__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group_3__1__Impl_in_rule__OpenQuestion__Group_3__11413);
            rule__OpenQuestion__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group_3__2_in_rule__OpenQuestion__Group_3__11416);
            rule__OpenQuestion__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group_3__1"


    // $ANTLR start "rule__OpenQuestion__Group_3__1__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:722:1: rule__OpenQuestion__Group_3__1__Impl : ( ( rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_1 ) ) ;
    public final void rule__OpenQuestion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:726:1: ( ( ( rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_1 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:727:1: ( ( rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_1 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:727:1: ( ( rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_1 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:728:1: ( rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_1 )
            {
             before(grammarAccess.getOpenQuestionAccess().getRequiredPreviousAnswersAssignment_3_1()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:729:1: ( rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:729:2: rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_1_in_rule__OpenQuestion__Group_3__1__Impl1443);
            rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOpenQuestionAccess().getRequiredPreviousAnswersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group_3__1__Impl"


    // $ANTLR start "rule__OpenQuestion__Group_3__2"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:739:1: rule__OpenQuestion__Group_3__2 : rule__OpenQuestion__Group_3__2__Impl ;
    public final void rule__OpenQuestion__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:743:1: ( rule__OpenQuestion__Group_3__2__Impl )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:744:2: rule__OpenQuestion__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group_3__2__Impl_in_rule__OpenQuestion__Group_3__21473);
            rule__OpenQuestion__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group_3__2"


    // $ANTLR start "rule__OpenQuestion__Group_3__2__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:750:1: rule__OpenQuestion__Group_3__2__Impl : ( ( rule__OpenQuestion__Group_3_2__0 )* ) ;
    public final void rule__OpenQuestion__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:754:1: ( ( ( rule__OpenQuestion__Group_3_2__0 )* ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:755:1: ( ( rule__OpenQuestion__Group_3_2__0 )* )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:755:1: ( ( rule__OpenQuestion__Group_3_2__0 )* )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:756:1: ( rule__OpenQuestion__Group_3_2__0 )*
            {
             before(grammarAccess.getOpenQuestionAccess().getGroup_3_2()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:757:1: ( rule__OpenQuestion__Group_3_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:757:2: rule__OpenQuestion__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group_3_2__0_in_rule__OpenQuestion__Group_3__2__Impl1500);
            	    rule__OpenQuestion__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getOpenQuestionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group_3__2__Impl"


    // $ANTLR start "rule__OpenQuestion__Group_3_2__0"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:773:1: rule__OpenQuestion__Group_3_2__0 : rule__OpenQuestion__Group_3_2__0__Impl rule__OpenQuestion__Group_3_2__1 ;
    public final void rule__OpenQuestion__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:777:1: ( rule__OpenQuestion__Group_3_2__0__Impl rule__OpenQuestion__Group_3_2__1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:778:2: rule__OpenQuestion__Group_3_2__0__Impl rule__OpenQuestion__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group_3_2__0__Impl_in_rule__OpenQuestion__Group_3_2__01537);
            rule__OpenQuestion__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group_3_2__1_in_rule__OpenQuestion__Group_3_2__01540);
            rule__OpenQuestion__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group_3_2__0"


    // $ANTLR start "rule__OpenQuestion__Group_3_2__0__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:785:1: rule__OpenQuestion__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__OpenQuestion__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:789:1: ( ( ',' ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:790:1: ( ',' )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:790:1: ( ',' )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:791:1: ','
            {
             before(grammarAccess.getOpenQuestionAccess().getCommaKeyword_3_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OpenQuestion__Group_3_2__0__Impl1568); 
             after(grammarAccess.getOpenQuestionAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group_3_2__0__Impl"


    // $ANTLR start "rule__OpenQuestion__Group_3_2__1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:804:1: rule__OpenQuestion__Group_3_2__1 : rule__OpenQuestion__Group_3_2__1__Impl ;
    public final void rule__OpenQuestion__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:808:1: ( rule__OpenQuestion__Group_3_2__1__Impl )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:809:2: rule__OpenQuestion__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__Group_3_2__1__Impl_in_rule__OpenQuestion__Group_3_2__11599);
            rule__OpenQuestion__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group_3_2__1"


    // $ANTLR start "rule__OpenQuestion__Group_3_2__1__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:815:1: rule__OpenQuestion__Group_3_2__1__Impl : ( ( rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_2_1 ) ) ;
    public final void rule__OpenQuestion__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:819:1: ( ( ( rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_2_1 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:820:1: ( ( rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_2_1 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:820:1: ( ( rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_2_1 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:821:1: ( rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_2_1 )
            {
             before(grammarAccess.getOpenQuestionAccess().getRequiredPreviousAnswersAssignment_3_2_1()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:822:1: ( rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_2_1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:822:2: rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_2_1_in_rule__OpenQuestion__Group_3_2__1__Impl1626);
            rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOpenQuestionAccess().getRequiredPreviousAnswersAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group_3_2__1__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__0"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:836:1: rule__MultipleChoice__Group__0 : rule__MultipleChoice__Group__0__Impl rule__MultipleChoice__Group__1 ;
    public final void rule__MultipleChoice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:840:1: ( rule__MultipleChoice__Group__0__Impl rule__MultipleChoice__Group__1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:841:2: rule__MultipleChoice__Group__0__Impl rule__MultipleChoice__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__0__Impl_in_rule__MultipleChoice__Group__01660);
            rule__MultipleChoice__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__1_in_rule__MultipleChoice__Group__01663);
            rule__MultipleChoice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__0"


    // $ANTLR start "rule__MultipleChoice__Group__0__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:848:1: rule__MultipleChoice__Group__0__Impl : ( 'multiple:' ) ;
    public final void rule__MultipleChoice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:852:1: ( ( 'multiple:' ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:853:1: ( 'multiple:' )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:853:1: ( 'multiple:' )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:854:1: 'multiple:'
            {
             before(grammarAccess.getMultipleChoiceAccess().getMultipleKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__MultipleChoice__Group__0__Impl1691); 
             after(grammarAccess.getMultipleChoiceAccess().getMultipleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__0__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:867:1: rule__MultipleChoice__Group__1 : rule__MultipleChoice__Group__1__Impl rule__MultipleChoice__Group__2 ;
    public final void rule__MultipleChoice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:871:1: ( rule__MultipleChoice__Group__1__Impl rule__MultipleChoice__Group__2 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:872:2: rule__MultipleChoice__Group__1__Impl rule__MultipleChoice__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__1__Impl_in_rule__MultipleChoice__Group__11722);
            rule__MultipleChoice__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__2_in_rule__MultipleChoice__Group__11725);
            rule__MultipleChoice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__1"


    // $ANTLR start "rule__MultipleChoice__Group__1__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:879:1: rule__MultipleChoice__Group__1__Impl : ( ( rule__MultipleChoice__DescriptionAssignment_1 ) ) ;
    public final void rule__MultipleChoice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:883:1: ( ( ( rule__MultipleChoice__DescriptionAssignment_1 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:884:1: ( ( rule__MultipleChoice__DescriptionAssignment_1 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:884:1: ( ( rule__MultipleChoice__DescriptionAssignment_1 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:885:1: ( rule__MultipleChoice__DescriptionAssignment_1 )
            {
             before(grammarAccess.getMultipleChoiceAccess().getDescriptionAssignment_1()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:886:1: ( rule__MultipleChoice__DescriptionAssignment_1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:886:2: rule__MultipleChoice__DescriptionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__DescriptionAssignment_1_in_rule__MultipleChoice__Group__1__Impl1752);
            rule__MultipleChoice__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__1__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__2"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:896:1: rule__MultipleChoice__Group__2 : rule__MultipleChoice__Group__2__Impl rule__MultipleChoice__Group__3 ;
    public final void rule__MultipleChoice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:900:1: ( rule__MultipleChoice__Group__2__Impl rule__MultipleChoice__Group__3 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:901:2: rule__MultipleChoice__Group__2__Impl rule__MultipleChoice__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__2__Impl_in_rule__MultipleChoice__Group__21782);
            rule__MultipleChoice__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__3_in_rule__MultipleChoice__Group__21785);
            rule__MultipleChoice__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__2"


    // $ANTLR start "rule__MultipleChoice__Group__2__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:908:1: rule__MultipleChoice__Group__2__Impl : ( ( rule__MultipleChoice__IsOptionalAssignment_2 )? ) ;
    public final void rule__MultipleChoice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:912:1: ( ( ( rule__MultipleChoice__IsOptionalAssignment_2 )? ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:913:1: ( ( rule__MultipleChoice__IsOptionalAssignment_2 )? )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:913:1: ( ( rule__MultipleChoice__IsOptionalAssignment_2 )? )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:914:1: ( rule__MultipleChoice__IsOptionalAssignment_2 )?
            {
             before(grammarAccess.getMultipleChoiceAccess().getIsOptionalAssignment_2()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:915:1: ( rule__MultipleChoice__IsOptionalAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:915:2: rule__MultipleChoice__IsOptionalAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__IsOptionalAssignment_2_in_rule__MultipleChoice__Group__2__Impl1812);
                    rule__MultipleChoice__IsOptionalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleChoiceAccess().getIsOptionalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__2__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__3"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:925:1: rule__MultipleChoice__Group__3 : rule__MultipleChoice__Group__3__Impl rule__MultipleChoice__Group__4 ;
    public final void rule__MultipleChoice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:929:1: ( rule__MultipleChoice__Group__3__Impl rule__MultipleChoice__Group__4 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:930:2: rule__MultipleChoice__Group__3__Impl rule__MultipleChoice__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__3__Impl_in_rule__MultipleChoice__Group__31843);
            rule__MultipleChoice__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__4_in_rule__MultipleChoice__Group__31846);
            rule__MultipleChoice__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__3"


    // $ANTLR start "rule__MultipleChoice__Group__3__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:937:1: rule__MultipleChoice__Group__3__Impl : ( ( rule__MultipleChoice__Group_3__0 )? ) ;
    public final void rule__MultipleChoice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:941:1: ( ( ( rule__MultipleChoice__Group_3__0 )? ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:942:1: ( ( rule__MultipleChoice__Group_3__0 )? )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:942:1: ( ( rule__MultipleChoice__Group_3__0 )? )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:943:1: ( rule__MultipleChoice__Group_3__0 )?
            {
             before(grammarAccess.getMultipleChoiceAccess().getGroup_3()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:944:1: ( rule__MultipleChoice__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:944:2: rule__MultipleChoice__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_3__0_in_rule__MultipleChoice__Group__3__Impl1873);
                    rule__MultipleChoice__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleChoiceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__3__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__4"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:954:1: rule__MultipleChoice__Group__4 : rule__MultipleChoice__Group__4__Impl ;
    public final void rule__MultipleChoice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:958:1: ( rule__MultipleChoice__Group__4__Impl )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:959:2: rule__MultipleChoice__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__4__Impl_in_rule__MultipleChoice__Group__41904);
            rule__MultipleChoice__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__4"


    // $ANTLR start "rule__MultipleChoice__Group__4__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:965:1: rule__MultipleChoice__Group__4__Impl : ( ( ( rule__MultipleChoice__AnswersAssignment_4 ) ) ( ( rule__MultipleChoice__AnswersAssignment_4 )* ) ) ;
    public final void rule__MultipleChoice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:969:1: ( ( ( ( rule__MultipleChoice__AnswersAssignment_4 ) ) ( ( rule__MultipleChoice__AnswersAssignment_4 )* ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:970:1: ( ( ( rule__MultipleChoice__AnswersAssignment_4 ) ) ( ( rule__MultipleChoice__AnswersAssignment_4 )* ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:970:1: ( ( ( rule__MultipleChoice__AnswersAssignment_4 ) ) ( ( rule__MultipleChoice__AnswersAssignment_4 )* ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:971:1: ( ( rule__MultipleChoice__AnswersAssignment_4 ) ) ( ( rule__MultipleChoice__AnswersAssignment_4 )* )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:971:1: ( ( rule__MultipleChoice__AnswersAssignment_4 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:972:1: ( rule__MultipleChoice__AnswersAssignment_4 )
            {
             before(grammarAccess.getMultipleChoiceAccess().getAnswersAssignment_4()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:973:1: ( rule__MultipleChoice__AnswersAssignment_4 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:973:2: rule__MultipleChoice__AnswersAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__AnswersAssignment_4_in_rule__MultipleChoice__Group__4__Impl1933);
            rule__MultipleChoice__AnswersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAccess().getAnswersAssignment_4()); 

            }

            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:976:1: ( ( rule__MultipleChoice__AnswersAssignment_4 )* )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:977:1: ( rule__MultipleChoice__AnswersAssignment_4 )*
            {
             before(grammarAccess.getMultipleChoiceAccess().getAnswersAssignment_4()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:978:1: ( rule__MultipleChoice__AnswersAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==11||LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:978:2: rule__MultipleChoice__AnswersAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__AnswersAssignment_4_in_rule__MultipleChoice__Group__4__Impl1945);
            	    rule__MultipleChoice__AnswersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMultipleChoiceAccess().getAnswersAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__4__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_3__0"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:999:1: rule__MultipleChoice__Group_3__0 : rule__MultipleChoice__Group_3__0__Impl rule__MultipleChoice__Group_3__1 ;
    public final void rule__MultipleChoice__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1003:1: ( rule__MultipleChoice__Group_3__0__Impl rule__MultipleChoice__Group_3__1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1004:2: rule__MultipleChoice__Group_3__0__Impl rule__MultipleChoice__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_3__0__Impl_in_rule__MultipleChoice__Group_3__01988);
            rule__MultipleChoice__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_3__1_in_rule__MultipleChoice__Group_3__01991);
            rule__MultipleChoice__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_3__0"


    // $ANTLR start "rule__MultipleChoice__Group_3__0__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1011:1: rule__MultipleChoice__Group_3__0__Impl : ( 'requires' ) ;
    public final void rule__MultipleChoice__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1015:1: ( ( 'requires' ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1016:1: ( 'requires' )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1016:1: ( 'requires' )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1017:1: 'requires'
            {
             before(grammarAccess.getMultipleChoiceAccess().getRequiresKeyword_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__MultipleChoice__Group_3__0__Impl2019); 
             after(grammarAccess.getMultipleChoiceAccess().getRequiresKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_3__0__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_3__1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1030:1: rule__MultipleChoice__Group_3__1 : rule__MultipleChoice__Group_3__1__Impl rule__MultipleChoice__Group_3__2 ;
    public final void rule__MultipleChoice__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1034:1: ( rule__MultipleChoice__Group_3__1__Impl rule__MultipleChoice__Group_3__2 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1035:2: rule__MultipleChoice__Group_3__1__Impl rule__MultipleChoice__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_3__1__Impl_in_rule__MultipleChoice__Group_3__12050);
            rule__MultipleChoice__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_3__2_in_rule__MultipleChoice__Group_3__12053);
            rule__MultipleChoice__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_3__1"


    // $ANTLR start "rule__MultipleChoice__Group_3__1__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1042:1: rule__MultipleChoice__Group_3__1__Impl : ( ( rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_1 ) ) ;
    public final void rule__MultipleChoice__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1046:1: ( ( ( rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_1 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1047:1: ( ( rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_1 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1047:1: ( ( rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_1 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1048:1: ( rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_1 )
            {
             before(grammarAccess.getMultipleChoiceAccess().getRequiredPreviousAnswersAssignment_3_1()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1049:1: ( rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1049:2: rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_1_in_rule__MultipleChoice__Group_3__1__Impl2080);
            rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAccess().getRequiredPreviousAnswersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_3__1__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_3__2"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1059:1: rule__MultipleChoice__Group_3__2 : rule__MultipleChoice__Group_3__2__Impl ;
    public final void rule__MultipleChoice__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1063:1: ( rule__MultipleChoice__Group_3__2__Impl )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1064:2: rule__MultipleChoice__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_3__2__Impl_in_rule__MultipleChoice__Group_3__22110);
            rule__MultipleChoice__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_3__2"


    // $ANTLR start "rule__MultipleChoice__Group_3__2__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1070:1: rule__MultipleChoice__Group_3__2__Impl : ( ( rule__MultipleChoice__Group_3_2__0 )* ) ;
    public final void rule__MultipleChoice__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1074:1: ( ( ( rule__MultipleChoice__Group_3_2__0 )* ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1075:1: ( ( rule__MultipleChoice__Group_3_2__0 )* )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1075:1: ( ( rule__MultipleChoice__Group_3_2__0 )* )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1076:1: ( rule__MultipleChoice__Group_3_2__0 )*
            {
             before(grammarAccess.getMultipleChoiceAccess().getGroup_3_2()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1077:1: ( rule__MultipleChoice__Group_3_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1077:2: rule__MultipleChoice__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_3_2__0_in_rule__MultipleChoice__Group_3__2__Impl2137);
            	    rule__MultipleChoice__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMultipleChoiceAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_3__2__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_3_2__0"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1093:1: rule__MultipleChoice__Group_3_2__0 : rule__MultipleChoice__Group_3_2__0__Impl rule__MultipleChoice__Group_3_2__1 ;
    public final void rule__MultipleChoice__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1097:1: ( rule__MultipleChoice__Group_3_2__0__Impl rule__MultipleChoice__Group_3_2__1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1098:2: rule__MultipleChoice__Group_3_2__0__Impl rule__MultipleChoice__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_3_2__0__Impl_in_rule__MultipleChoice__Group_3_2__02174);
            rule__MultipleChoice__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_3_2__1_in_rule__MultipleChoice__Group_3_2__02177);
            rule__MultipleChoice__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_3_2__0"


    // $ANTLR start "rule__MultipleChoice__Group_3_2__0__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1105:1: rule__MultipleChoice__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__MultipleChoice__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1109:1: ( ( ',' ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1110:1: ( ',' )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1110:1: ( ',' )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1111:1: ','
            {
             before(grammarAccess.getMultipleChoiceAccess().getCommaKeyword_3_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__MultipleChoice__Group_3_2__0__Impl2205); 
             after(grammarAccess.getMultipleChoiceAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_3_2__0__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_3_2__1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1124:1: rule__MultipleChoice__Group_3_2__1 : rule__MultipleChoice__Group_3_2__1__Impl ;
    public final void rule__MultipleChoice__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1128:1: ( rule__MultipleChoice__Group_3_2__1__Impl )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1129:2: rule__MultipleChoice__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_3_2__1__Impl_in_rule__MultipleChoice__Group_3_2__12236);
            rule__MultipleChoice__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_3_2__1"


    // $ANTLR start "rule__MultipleChoice__Group_3_2__1__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1135:1: rule__MultipleChoice__Group_3_2__1__Impl : ( ( rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_2_1 ) ) ;
    public final void rule__MultipleChoice__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1139:1: ( ( ( rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_2_1 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1140:1: ( ( rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_2_1 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1140:1: ( ( rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_2_1 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1141:1: ( rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_2_1 )
            {
             before(grammarAccess.getMultipleChoiceAccess().getRequiredPreviousAnswersAssignment_3_2_1()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1142:1: ( rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_2_1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1142:2: rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_2_1_in_rule__MultipleChoice__Group_3_2__1__Impl2263);
            rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAccess().getRequiredPreviousAnswersAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_3_2__1__Impl"


    // $ANTLR start "rule__RadioChoice__Group__0"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1156:1: rule__RadioChoice__Group__0 : rule__RadioChoice__Group__0__Impl rule__RadioChoice__Group__1 ;
    public final void rule__RadioChoice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1160:1: ( rule__RadioChoice__Group__0__Impl rule__RadioChoice__Group__1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1161:2: rule__RadioChoice__Group__0__Impl rule__RadioChoice__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group__0__Impl_in_rule__RadioChoice__Group__02297);
            rule__RadioChoice__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group__1_in_rule__RadioChoice__Group__02300);
            rule__RadioChoice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group__0"


    // $ANTLR start "rule__RadioChoice__Group__0__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1168:1: rule__RadioChoice__Group__0__Impl : ( 'single:' ) ;
    public final void rule__RadioChoice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1172:1: ( ( 'single:' ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1173:1: ( 'single:' )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1173:1: ( 'single:' )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1174:1: 'single:'
            {
             before(grammarAccess.getRadioChoiceAccess().getSingleKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__RadioChoice__Group__0__Impl2328); 
             after(grammarAccess.getRadioChoiceAccess().getSingleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group__0__Impl"


    // $ANTLR start "rule__RadioChoice__Group__1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1187:1: rule__RadioChoice__Group__1 : rule__RadioChoice__Group__1__Impl rule__RadioChoice__Group__2 ;
    public final void rule__RadioChoice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1191:1: ( rule__RadioChoice__Group__1__Impl rule__RadioChoice__Group__2 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1192:2: rule__RadioChoice__Group__1__Impl rule__RadioChoice__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group__1__Impl_in_rule__RadioChoice__Group__12359);
            rule__RadioChoice__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group__2_in_rule__RadioChoice__Group__12362);
            rule__RadioChoice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group__1"


    // $ANTLR start "rule__RadioChoice__Group__1__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1199:1: rule__RadioChoice__Group__1__Impl : ( ( rule__RadioChoice__DescriptionAssignment_1 ) ) ;
    public final void rule__RadioChoice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1203:1: ( ( ( rule__RadioChoice__DescriptionAssignment_1 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1204:1: ( ( rule__RadioChoice__DescriptionAssignment_1 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1204:1: ( ( rule__RadioChoice__DescriptionAssignment_1 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1205:1: ( rule__RadioChoice__DescriptionAssignment_1 )
            {
             before(grammarAccess.getRadioChoiceAccess().getDescriptionAssignment_1()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1206:1: ( rule__RadioChoice__DescriptionAssignment_1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1206:2: rule__RadioChoice__DescriptionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__DescriptionAssignment_1_in_rule__RadioChoice__Group__1__Impl2389);
            rule__RadioChoice__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRadioChoiceAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group__1__Impl"


    // $ANTLR start "rule__RadioChoice__Group__2"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1216:1: rule__RadioChoice__Group__2 : rule__RadioChoice__Group__2__Impl rule__RadioChoice__Group__3 ;
    public final void rule__RadioChoice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1220:1: ( rule__RadioChoice__Group__2__Impl rule__RadioChoice__Group__3 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1221:2: rule__RadioChoice__Group__2__Impl rule__RadioChoice__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group__2__Impl_in_rule__RadioChoice__Group__22419);
            rule__RadioChoice__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group__3_in_rule__RadioChoice__Group__22422);
            rule__RadioChoice__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group__2"


    // $ANTLR start "rule__RadioChoice__Group__2__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1228:1: rule__RadioChoice__Group__2__Impl : ( ( rule__RadioChoice__IsOptionalAssignment_2 )? ) ;
    public final void rule__RadioChoice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1232:1: ( ( ( rule__RadioChoice__IsOptionalAssignment_2 )? ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1233:1: ( ( rule__RadioChoice__IsOptionalAssignment_2 )? )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1233:1: ( ( rule__RadioChoice__IsOptionalAssignment_2 )? )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1234:1: ( rule__RadioChoice__IsOptionalAssignment_2 )?
            {
             before(grammarAccess.getRadioChoiceAccess().getIsOptionalAssignment_2()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1235:1: ( rule__RadioChoice__IsOptionalAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1235:2: rule__RadioChoice__IsOptionalAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__IsOptionalAssignment_2_in_rule__RadioChoice__Group__2__Impl2449);
                    rule__RadioChoice__IsOptionalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRadioChoiceAccess().getIsOptionalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group__2__Impl"


    // $ANTLR start "rule__RadioChoice__Group__3"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1245:1: rule__RadioChoice__Group__3 : rule__RadioChoice__Group__3__Impl rule__RadioChoice__Group__4 ;
    public final void rule__RadioChoice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1249:1: ( rule__RadioChoice__Group__3__Impl rule__RadioChoice__Group__4 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1250:2: rule__RadioChoice__Group__3__Impl rule__RadioChoice__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group__3__Impl_in_rule__RadioChoice__Group__32480);
            rule__RadioChoice__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group__4_in_rule__RadioChoice__Group__32483);
            rule__RadioChoice__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group__3"


    // $ANTLR start "rule__RadioChoice__Group__3__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1257:1: rule__RadioChoice__Group__3__Impl : ( ( rule__RadioChoice__Group_3__0 )? ) ;
    public final void rule__RadioChoice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1261:1: ( ( ( rule__RadioChoice__Group_3__0 )? ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1262:1: ( ( rule__RadioChoice__Group_3__0 )? )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1262:1: ( ( rule__RadioChoice__Group_3__0 )? )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1263:1: ( rule__RadioChoice__Group_3__0 )?
            {
             before(grammarAccess.getRadioChoiceAccess().getGroup_3()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1264:1: ( rule__RadioChoice__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1264:2: rule__RadioChoice__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group_3__0_in_rule__RadioChoice__Group__3__Impl2510);
                    rule__RadioChoice__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRadioChoiceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group__3__Impl"


    // $ANTLR start "rule__RadioChoice__Group__4"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1274:1: rule__RadioChoice__Group__4 : rule__RadioChoice__Group__4__Impl ;
    public final void rule__RadioChoice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1278:1: ( rule__RadioChoice__Group__4__Impl )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1279:2: rule__RadioChoice__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group__4__Impl_in_rule__RadioChoice__Group__42541);
            rule__RadioChoice__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group__4"


    // $ANTLR start "rule__RadioChoice__Group__4__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1285:1: rule__RadioChoice__Group__4__Impl : ( ( ( rule__RadioChoice__AnswersAssignment_4 ) ) ( ( rule__RadioChoice__AnswersAssignment_4 )* ) ) ;
    public final void rule__RadioChoice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1289:1: ( ( ( ( rule__RadioChoice__AnswersAssignment_4 ) ) ( ( rule__RadioChoice__AnswersAssignment_4 )* ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1290:1: ( ( ( rule__RadioChoice__AnswersAssignment_4 ) ) ( ( rule__RadioChoice__AnswersAssignment_4 )* ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1290:1: ( ( ( rule__RadioChoice__AnswersAssignment_4 ) ) ( ( rule__RadioChoice__AnswersAssignment_4 )* ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1291:1: ( ( rule__RadioChoice__AnswersAssignment_4 ) ) ( ( rule__RadioChoice__AnswersAssignment_4 )* )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1291:1: ( ( rule__RadioChoice__AnswersAssignment_4 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1292:1: ( rule__RadioChoice__AnswersAssignment_4 )
            {
             before(grammarAccess.getRadioChoiceAccess().getAnswersAssignment_4()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1293:1: ( rule__RadioChoice__AnswersAssignment_4 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1293:2: rule__RadioChoice__AnswersAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__AnswersAssignment_4_in_rule__RadioChoice__Group__4__Impl2570);
            rule__RadioChoice__AnswersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRadioChoiceAccess().getAnswersAssignment_4()); 

            }

            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1296:1: ( ( rule__RadioChoice__AnswersAssignment_4 )* )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1297:1: ( rule__RadioChoice__AnswersAssignment_4 )*
            {
             before(grammarAccess.getRadioChoiceAccess().getAnswersAssignment_4()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1298:1: ( rule__RadioChoice__AnswersAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==11||LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1298:2: rule__RadioChoice__AnswersAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__AnswersAssignment_4_in_rule__RadioChoice__Group__4__Impl2582);
            	    rule__RadioChoice__AnswersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRadioChoiceAccess().getAnswersAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group__4__Impl"


    // $ANTLR start "rule__RadioChoice__Group_3__0"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1319:1: rule__RadioChoice__Group_3__0 : rule__RadioChoice__Group_3__0__Impl rule__RadioChoice__Group_3__1 ;
    public final void rule__RadioChoice__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1323:1: ( rule__RadioChoice__Group_3__0__Impl rule__RadioChoice__Group_3__1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1324:2: rule__RadioChoice__Group_3__0__Impl rule__RadioChoice__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group_3__0__Impl_in_rule__RadioChoice__Group_3__02625);
            rule__RadioChoice__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group_3__1_in_rule__RadioChoice__Group_3__02628);
            rule__RadioChoice__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group_3__0"


    // $ANTLR start "rule__RadioChoice__Group_3__0__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1331:1: rule__RadioChoice__Group_3__0__Impl : ( 'requires' ) ;
    public final void rule__RadioChoice__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1335:1: ( ( 'requires' ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1336:1: ( 'requires' )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1336:1: ( 'requires' )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1337:1: 'requires'
            {
             before(grammarAccess.getRadioChoiceAccess().getRequiresKeyword_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__RadioChoice__Group_3__0__Impl2656); 
             after(grammarAccess.getRadioChoiceAccess().getRequiresKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group_3__0__Impl"


    // $ANTLR start "rule__RadioChoice__Group_3__1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1350:1: rule__RadioChoice__Group_3__1 : rule__RadioChoice__Group_3__1__Impl rule__RadioChoice__Group_3__2 ;
    public final void rule__RadioChoice__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1354:1: ( rule__RadioChoice__Group_3__1__Impl rule__RadioChoice__Group_3__2 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1355:2: rule__RadioChoice__Group_3__1__Impl rule__RadioChoice__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group_3__1__Impl_in_rule__RadioChoice__Group_3__12687);
            rule__RadioChoice__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group_3__2_in_rule__RadioChoice__Group_3__12690);
            rule__RadioChoice__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group_3__1"


    // $ANTLR start "rule__RadioChoice__Group_3__1__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1362:1: rule__RadioChoice__Group_3__1__Impl : ( ( rule__RadioChoice__RequiredPreviousAnswersAssignment_3_1 ) ) ;
    public final void rule__RadioChoice__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1366:1: ( ( ( rule__RadioChoice__RequiredPreviousAnswersAssignment_3_1 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1367:1: ( ( rule__RadioChoice__RequiredPreviousAnswersAssignment_3_1 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1367:1: ( ( rule__RadioChoice__RequiredPreviousAnswersAssignment_3_1 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1368:1: ( rule__RadioChoice__RequiredPreviousAnswersAssignment_3_1 )
            {
             before(grammarAccess.getRadioChoiceAccess().getRequiredPreviousAnswersAssignment_3_1()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1369:1: ( rule__RadioChoice__RequiredPreviousAnswersAssignment_3_1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1369:2: rule__RadioChoice__RequiredPreviousAnswersAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__RequiredPreviousAnswersAssignment_3_1_in_rule__RadioChoice__Group_3__1__Impl2717);
            rule__RadioChoice__RequiredPreviousAnswersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRadioChoiceAccess().getRequiredPreviousAnswersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group_3__1__Impl"


    // $ANTLR start "rule__RadioChoice__Group_3__2"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1379:1: rule__RadioChoice__Group_3__2 : rule__RadioChoice__Group_3__2__Impl ;
    public final void rule__RadioChoice__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1383:1: ( rule__RadioChoice__Group_3__2__Impl )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1384:2: rule__RadioChoice__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group_3__2__Impl_in_rule__RadioChoice__Group_3__22747);
            rule__RadioChoice__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group_3__2"


    // $ANTLR start "rule__RadioChoice__Group_3__2__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1390:1: rule__RadioChoice__Group_3__2__Impl : ( ( rule__RadioChoice__Group_3_2__0 )* ) ;
    public final void rule__RadioChoice__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1394:1: ( ( ( rule__RadioChoice__Group_3_2__0 )* ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1395:1: ( ( rule__RadioChoice__Group_3_2__0 )* )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1395:1: ( ( rule__RadioChoice__Group_3_2__0 )* )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1396:1: ( rule__RadioChoice__Group_3_2__0 )*
            {
             before(grammarAccess.getRadioChoiceAccess().getGroup_3_2()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1397:1: ( rule__RadioChoice__Group_3_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==14) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1397:2: rule__RadioChoice__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group_3_2__0_in_rule__RadioChoice__Group_3__2__Impl2774);
            	    rule__RadioChoice__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRadioChoiceAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group_3__2__Impl"


    // $ANTLR start "rule__RadioChoice__Group_3_2__0"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1413:1: rule__RadioChoice__Group_3_2__0 : rule__RadioChoice__Group_3_2__0__Impl rule__RadioChoice__Group_3_2__1 ;
    public final void rule__RadioChoice__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1417:1: ( rule__RadioChoice__Group_3_2__0__Impl rule__RadioChoice__Group_3_2__1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1418:2: rule__RadioChoice__Group_3_2__0__Impl rule__RadioChoice__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group_3_2__0__Impl_in_rule__RadioChoice__Group_3_2__02811);
            rule__RadioChoice__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group_3_2__1_in_rule__RadioChoice__Group_3_2__02814);
            rule__RadioChoice__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group_3_2__0"


    // $ANTLR start "rule__RadioChoice__Group_3_2__0__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1425:1: rule__RadioChoice__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__RadioChoice__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1429:1: ( ( ',' ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1430:1: ( ',' )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1430:1: ( ',' )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1431:1: ','
            {
             before(grammarAccess.getRadioChoiceAccess().getCommaKeyword_3_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RadioChoice__Group_3_2__0__Impl2842); 
             after(grammarAccess.getRadioChoiceAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group_3_2__0__Impl"


    // $ANTLR start "rule__RadioChoice__Group_3_2__1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1444:1: rule__RadioChoice__Group_3_2__1 : rule__RadioChoice__Group_3_2__1__Impl ;
    public final void rule__RadioChoice__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1448:1: ( rule__RadioChoice__Group_3_2__1__Impl )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1449:2: rule__RadioChoice__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__Group_3_2__1__Impl_in_rule__RadioChoice__Group_3_2__12873);
            rule__RadioChoice__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group_3_2__1"


    // $ANTLR start "rule__RadioChoice__Group_3_2__1__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1455:1: rule__RadioChoice__Group_3_2__1__Impl : ( ( rule__RadioChoice__RequiredPreviousAnswersAssignment_3_2_1 ) ) ;
    public final void rule__RadioChoice__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1459:1: ( ( ( rule__RadioChoice__RequiredPreviousAnswersAssignment_3_2_1 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1460:1: ( ( rule__RadioChoice__RequiredPreviousAnswersAssignment_3_2_1 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1460:1: ( ( rule__RadioChoice__RequiredPreviousAnswersAssignment_3_2_1 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1461:1: ( rule__RadioChoice__RequiredPreviousAnswersAssignment_3_2_1 )
            {
             before(grammarAccess.getRadioChoiceAccess().getRequiredPreviousAnswersAssignment_3_2_1()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1462:1: ( rule__RadioChoice__RequiredPreviousAnswersAssignment_3_2_1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1462:2: rule__RadioChoice__RequiredPreviousAnswersAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RadioChoice__RequiredPreviousAnswersAssignment_3_2_1_in_rule__RadioChoice__Group_3_2__1__Impl2900);
            rule__RadioChoice__RequiredPreviousAnswersAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRadioChoiceAccess().getRequiredPreviousAnswersAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__Group_3_2__1__Impl"


    // $ANTLR start "rule__OpenAnswer__Group__0"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1476:1: rule__OpenAnswer__Group__0 : rule__OpenAnswer__Group__0__Impl rule__OpenAnswer__Group__1 ;
    public final void rule__OpenAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1480:1: ( rule__OpenAnswer__Group__0__Impl rule__OpenAnswer__Group__1 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1481:2: rule__OpenAnswer__Group__0__Impl rule__OpenAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenAnswer__Group__0__Impl_in_rule__OpenAnswer__Group__02934);
            rule__OpenAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OpenAnswer__Group__1_in_rule__OpenAnswer__Group__02937);
            rule__OpenAnswer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenAnswer__Group__0"


    // $ANTLR start "rule__OpenAnswer__Group__0__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1488:1: rule__OpenAnswer__Group__0__Impl : ( () ) ;
    public final void rule__OpenAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1492:1: ( ( () ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1493:1: ( () )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1493:1: ( () )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1494:1: ()
            {
             before(grammarAccess.getOpenAnswerAccess().getOpenAnswerAction_0()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1495:1: ()
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1497:1: 
            {
            }

             after(grammarAccess.getOpenAnswerAccess().getOpenAnswerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenAnswer__Group__0__Impl"


    // $ANTLR start "rule__OpenAnswer__Group__1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1507:1: rule__OpenAnswer__Group__1 : rule__OpenAnswer__Group__1__Impl rule__OpenAnswer__Group__2 ;
    public final void rule__OpenAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1511:1: ( rule__OpenAnswer__Group__1__Impl rule__OpenAnswer__Group__2 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1512:2: rule__OpenAnswer__Group__1__Impl rule__OpenAnswer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenAnswer__Group__1__Impl_in_rule__OpenAnswer__Group__12995);
            rule__OpenAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OpenAnswer__Group__2_in_rule__OpenAnswer__Group__12998);
            rule__OpenAnswer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenAnswer__Group__1"


    // $ANTLR start "rule__OpenAnswer__Group__1__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1519:1: rule__OpenAnswer__Group__1__Impl : ( 'text' ) ;
    public final void rule__OpenAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1523:1: ( ( 'text' ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1524:1: ( 'text' )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1524:1: ( 'text' )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1525:1: 'text'
            {
             before(grammarAccess.getOpenAnswerAccess().getTextKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__OpenAnswer__Group__1__Impl3026); 
             after(grammarAccess.getOpenAnswerAccess().getTextKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenAnswer__Group__1__Impl"


    // $ANTLR start "rule__OpenAnswer__Group__2"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1538:1: rule__OpenAnswer__Group__2 : rule__OpenAnswer__Group__2__Impl rule__OpenAnswer__Group__3 ;
    public final void rule__OpenAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1542:1: ( rule__OpenAnswer__Group__2__Impl rule__OpenAnswer__Group__3 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1543:2: rule__OpenAnswer__Group__2__Impl rule__OpenAnswer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenAnswer__Group__2__Impl_in_rule__OpenAnswer__Group__23057);
            rule__OpenAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OpenAnswer__Group__3_in_rule__OpenAnswer__Group__23060);
            rule__OpenAnswer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenAnswer__Group__2"


    // $ANTLR start "rule__OpenAnswer__Group__2__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1550:1: rule__OpenAnswer__Group__2__Impl : ( ( rule__OpenAnswer__NameAssignment_2 ) ) ;
    public final void rule__OpenAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1554:1: ( ( ( rule__OpenAnswer__NameAssignment_2 ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1555:1: ( ( rule__OpenAnswer__NameAssignment_2 ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1555:1: ( ( rule__OpenAnswer__NameAssignment_2 ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1556:1: ( rule__OpenAnswer__NameAssignment_2 )
            {
             before(grammarAccess.getOpenAnswerAccess().getNameAssignment_2()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1557:1: ( rule__OpenAnswer__NameAssignment_2 )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1557:2: rule__OpenAnswer__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenAnswer__NameAssignment_2_in_rule__OpenAnswer__Group__2__Impl3087);
            rule__OpenAnswer__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOpenAnswerAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenAnswer__Group__2__Impl"


    // $ANTLR start "rule__OpenAnswer__Group__3"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1567:1: rule__OpenAnswer__Group__3 : rule__OpenAnswer__Group__3__Impl ;
    public final void rule__OpenAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1571:1: ( rule__OpenAnswer__Group__3__Impl )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1572:2: rule__OpenAnswer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenAnswer__Group__3__Impl_in_rule__OpenAnswer__Group__33117);
            rule__OpenAnswer__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenAnswer__Group__3"


    // $ANTLR start "rule__OpenAnswer__Group__3__Impl"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1578:1: rule__OpenAnswer__Group__3__Impl : ( ( rule__OpenAnswer__DescriptionAssignment_3 )? ) ;
    public final void rule__OpenAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1582:1: ( ( ( rule__OpenAnswer__DescriptionAssignment_3 )? ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1583:1: ( ( rule__OpenAnswer__DescriptionAssignment_3 )? )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1583:1: ( ( rule__OpenAnswer__DescriptionAssignment_3 )? )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1584:1: ( rule__OpenAnswer__DescriptionAssignment_3 )?
            {
             before(grammarAccess.getOpenAnswerAccess().getDescriptionAssignment_3()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1585:1: ( rule__OpenAnswer__DescriptionAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1585:2: rule__OpenAnswer__DescriptionAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OpenAnswer__DescriptionAssignment_3_in_rule__OpenAnswer__Group__3__Impl3144);
                    rule__OpenAnswer__DescriptionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpenAnswerAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenAnswer__Group__3__Impl"


    // $ANTLR start "rule__Survey__QuestionsAssignment"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1604:1: rule__Survey__QuestionsAssignment : ( ruleQuestion ) ;
    public final void rule__Survey__QuestionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1608:1: ( ( ruleQuestion ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1609:1: ( ruleQuestion )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1609:1: ( ruleQuestion )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1610:1: ruleQuestion
            {
             before(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment3188);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__QuestionsAssignment"


    // $ANTLR start "rule__Answer_Impl__NameAssignment_2"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1619:1: rule__Answer_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Answer_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1623:1: ( ( ruleEString ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1624:1: ( ruleEString )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1624:1: ( ruleEString )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1625:1: ruleEString
            {
             before(grammarAccess.getAnswer_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Answer_Impl__NameAssignment_23219);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnswer_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer_Impl__NameAssignment_2"


    // $ANTLR start "rule__Answer_Impl__DescriptionAssignment_3"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1634:1: rule__Answer_Impl__DescriptionAssignment_3 : ( ruleEString ) ;
    public final void rule__Answer_Impl__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1638:1: ( ( ruleEString ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1639:1: ( ruleEString )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1639:1: ( ruleEString )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1640:1: ruleEString
            {
             before(grammarAccess.getAnswer_ImplAccess().getDescriptionEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Answer_Impl__DescriptionAssignment_33250);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnswer_ImplAccess().getDescriptionEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer_Impl__DescriptionAssignment_3"


    // $ANTLR start "rule__OpenQuestion__DescriptionAssignment_1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1649:1: rule__OpenQuestion__DescriptionAssignment_1 : ( ruleEString ) ;
    public final void rule__OpenQuestion__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1653:1: ( ( ruleEString ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1654:1: ( ruleEString )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1654:1: ( ruleEString )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1655:1: ruleEString
            {
             before(grammarAccess.getOpenQuestionAccess().getDescriptionEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OpenQuestion__DescriptionAssignment_13281);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpenQuestionAccess().getDescriptionEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__DescriptionAssignment_1"


    // $ANTLR start "rule__OpenQuestion__IsOptionalAssignment_2"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1664:1: rule__OpenQuestion__IsOptionalAssignment_2 : ( ( 'optional' ) ) ;
    public final void rule__OpenQuestion__IsOptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1668:1: ( ( ( 'optional' ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1669:1: ( ( 'optional' ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1669:1: ( ( 'optional' ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1670:1: ( 'optional' )
            {
             before(grammarAccess.getOpenQuestionAccess().getIsOptionalOptionalKeyword_2_0()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1671:1: ( 'optional' )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1672:1: 'optional'
            {
             before(grammarAccess.getOpenQuestionAccess().getIsOptionalOptionalKeyword_2_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__OpenQuestion__IsOptionalAssignment_23317); 
             after(grammarAccess.getOpenQuestionAccess().getIsOptionalOptionalKeyword_2_0()); 

            }

             after(grammarAccess.getOpenQuestionAccess().getIsOptionalOptionalKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__IsOptionalAssignment_2"


    // $ANTLR start "rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1687:1: rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1691:1: ( ( ( ruleEString ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1692:1: ( ( ruleEString ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1692:1: ( ( ruleEString ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1693:1: ( ruleEString )
            {
             before(grammarAccess.getOpenQuestionAccess().getRequiredPreviousAnswersAnswerCrossReference_3_1_0()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1694:1: ( ruleEString )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1695:1: ruleEString
            {
             before(grammarAccess.getOpenQuestionAccess().getRequiredPreviousAnswersAnswerEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_13360);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpenQuestionAccess().getRequiredPreviousAnswersAnswerEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getOpenQuestionAccess().getRequiredPreviousAnswersAnswerCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_1"


    // $ANTLR start "rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_2_1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1706:1: rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_2_1 : ( ( ruleEString ) ) ;
    public final void rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1710:1: ( ( ( ruleEString ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1711:1: ( ( ruleEString ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1711:1: ( ( ruleEString ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1712:1: ( ruleEString )
            {
             before(grammarAccess.getOpenQuestionAccess().getRequiredPreviousAnswersAnswerCrossReference_3_2_1_0()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1713:1: ( ruleEString )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1714:1: ruleEString
            {
             before(grammarAccess.getOpenQuestionAccess().getRequiredPreviousAnswersAnswerEStringParserRuleCall_3_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_2_13399);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpenQuestionAccess().getRequiredPreviousAnswersAnswerEStringParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getOpenQuestionAccess().getRequiredPreviousAnswersAnswerCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_2_1"


    // $ANTLR start "rule__OpenQuestion__OpenAnswerAssignment_4"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1725:1: rule__OpenQuestion__OpenAnswerAssignment_4 : ( ruleOpenAnswer ) ;
    public final void rule__OpenQuestion__OpenAnswerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1729:1: ( ( ruleOpenAnswer ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1730:1: ( ruleOpenAnswer )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1730:1: ( ruleOpenAnswer )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1731:1: ruleOpenAnswer
            {
             before(grammarAccess.getOpenQuestionAccess().getOpenAnswerOpenAnswerParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpenAnswer_in_rule__OpenQuestion__OpenAnswerAssignment_43434);
            ruleOpenAnswer();

            state._fsp--;

             after(grammarAccess.getOpenQuestionAccess().getOpenAnswerOpenAnswerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__OpenAnswerAssignment_4"


    // $ANTLR start "rule__MultipleChoice__DescriptionAssignment_1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1740:1: rule__MultipleChoice__DescriptionAssignment_1 : ( ruleEString ) ;
    public final void rule__MultipleChoice__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1744:1: ( ( ruleEString ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1745:1: ( ruleEString )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1745:1: ( ruleEString )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1746:1: ruleEString
            {
             before(grammarAccess.getMultipleChoiceAccess().getDescriptionEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultipleChoice__DescriptionAssignment_13465);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceAccess().getDescriptionEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__DescriptionAssignment_1"


    // $ANTLR start "rule__MultipleChoice__IsOptionalAssignment_2"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1755:1: rule__MultipleChoice__IsOptionalAssignment_2 : ( ( 'optional' ) ) ;
    public final void rule__MultipleChoice__IsOptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1759:1: ( ( ( 'optional' ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1760:1: ( ( 'optional' ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1760:1: ( ( 'optional' ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1761:1: ( 'optional' )
            {
             before(grammarAccess.getMultipleChoiceAccess().getIsOptionalOptionalKeyword_2_0()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1762:1: ( 'optional' )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1763:1: 'optional'
            {
             before(grammarAccess.getMultipleChoiceAccess().getIsOptionalOptionalKeyword_2_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__MultipleChoice__IsOptionalAssignment_23501); 
             after(grammarAccess.getMultipleChoiceAccess().getIsOptionalOptionalKeyword_2_0()); 

            }

             after(grammarAccess.getMultipleChoiceAccess().getIsOptionalOptionalKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__IsOptionalAssignment_2"


    // $ANTLR start "rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1778:1: rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1782:1: ( ( ( ruleEString ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1783:1: ( ( ruleEString ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1783:1: ( ( ruleEString ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1784:1: ( ruleEString )
            {
             before(grammarAccess.getMultipleChoiceAccess().getRequiredPreviousAnswersAnswerCrossReference_3_1_0()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1785:1: ( ruleEString )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1786:1: ruleEString
            {
             before(grammarAccess.getMultipleChoiceAccess().getRequiredPreviousAnswersAnswerEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_13544);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceAccess().getRequiredPreviousAnswersAnswerEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getMultipleChoiceAccess().getRequiredPreviousAnswersAnswerCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_1"


    // $ANTLR start "rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_2_1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1797:1: rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_2_1 : ( ( ruleEString ) ) ;
    public final void rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1801:1: ( ( ( ruleEString ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1802:1: ( ( ruleEString ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1802:1: ( ( ruleEString ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1803:1: ( ruleEString )
            {
             before(grammarAccess.getMultipleChoiceAccess().getRequiredPreviousAnswersAnswerCrossReference_3_2_1_0()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1804:1: ( ruleEString )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1805:1: ruleEString
            {
             before(grammarAccess.getMultipleChoiceAccess().getRequiredPreviousAnswersAnswerEStringParserRuleCall_3_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_2_13583);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceAccess().getRequiredPreviousAnswersAnswerEStringParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getMultipleChoiceAccess().getRequiredPreviousAnswersAnswerCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_2_1"


    // $ANTLR start "rule__MultipleChoice__AnswersAssignment_4"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1816:1: rule__MultipleChoice__AnswersAssignment_4 : ( ruleAnswer ) ;
    public final void rule__MultipleChoice__AnswersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1820:1: ( ( ruleAnswer ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1821:1: ( ruleAnswer )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1821:1: ( ruleAnswer )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1822:1: ruleAnswer
            {
             before(grammarAccess.getMultipleChoiceAccess().getAnswersAnswerParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MultipleChoice__AnswersAssignment_43618);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceAccess().getAnswersAnswerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__AnswersAssignment_4"


    // $ANTLR start "rule__RadioChoice__DescriptionAssignment_1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1831:1: rule__RadioChoice__DescriptionAssignment_1 : ( ruleEString ) ;
    public final void rule__RadioChoice__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1835:1: ( ( ruleEString ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1836:1: ( ruleEString )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1836:1: ( ruleEString )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1837:1: ruleEString
            {
             before(grammarAccess.getRadioChoiceAccess().getDescriptionEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RadioChoice__DescriptionAssignment_13649);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRadioChoiceAccess().getDescriptionEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__DescriptionAssignment_1"


    // $ANTLR start "rule__RadioChoice__IsOptionalAssignment_2"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1846:1: rule__RadioChoice__IsOptionalAssignment_2 : ( ( 'optional' ) ) ;
    public final void rule__RadioChoice__IsOptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1850:1: ( ( ( 'optional' ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1851:1: ( ( 'optional' ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1851:1: ( ( 'optional' ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1852:1: ( 'optional' )
            {
             before(grammarAccess.getRadioChoiceAccess().getIsOptionalOptionalKeyword_2_0()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1853:1: ( 'optional' )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1854:1: 'optional'
            {
             before(grammarAccess.getRadioChoiceAccess().getIsOptionalOptionalKeyword_2_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RadioChoice__IsOptionalAssignment_23685); 
             after(grammarAccess.getRadioChoiceAccess().getIsOptionalOptionalKeyword_2_0()); 

            }

             after(grammarAccess.getRadioChoiceAccess().getIsOptionalOptionalKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__IsOptionalAssignment_2"


    // $ANTLR start "rule__RadioChoice__RequiredPreviousAnswersAssignment_3_1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1869:1: rule__RadioChoice__RequiredPreviousAnswersAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__RadioChoice__RequiredPreviousAnswersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1873:1: ( ( ( ruleEString ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1874:1: ( ( ruleEString ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1874:1: ( ( ruleEString ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1875:1: ( ruleEString )
            {
             before(grammarAccess.getRadioChoiceAccess().getRequiredPreviousAnswersAnswerCrossReference_3_1_0()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1876:1: ( ruleEString )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1877:1: ruleEString
            {
             before(grammarAccess.getRadioChoiceAccess().getRequiredPreviousAnswersAnswerEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RadioChoice__RequiredPreviousAnswersAssignment_3_13728);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRadioChoiceAccess().getRequiredPreviousAnswersAnswerEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getRadioChoiceAccess().getRequiredPreviousAnswersAnswerCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__RequiredPreviousAnswersAssignment_3_1"


    // $ANTLR start "rule__RadioChoice__RequiredPreviousAnswersAssignment_3_2_1"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1888:1: rule__RadioChoice__RequiredPreviousAnswersAssignment_3_2_1 : ( ( ruleEString ) ) ;
    public final void rule__RadioChoice__RequiredPreviousAnswersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1892:1: ( ( ( ruleEString ) ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1893:1: ( ( ruleEString ) )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1893:1: ( ( ruleEString ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1894:1: ( ruleEString )
            {
             before(grammarAccess.getRadioChoiceAccess().getRequiredPreviousAnswersAnswerCrossReference_3_2_1_0()); 
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1895:1: ( ruleEString )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1896:1: ruleEString
            {
             before(grammarAccess.getRadioChoiceAccess().getRequiredPreviousAnswersAnswerEStringParserRuleCall_3_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RadioChoice__RequiredPreviousAnswersAssignment_3_2_13767);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRadioChoiceAccess().getRequiredPreviousAnswersAnswerEStringParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getRadioChoiceAccess().getRequiredPreviousAnswersAnswerCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__RequiredPreviousAnswersAssignment_3_2_1"


    // $ANTLR start "rule__RadioChoice__AnswersAssignment_4"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1907:1: rule__RadioChoice__AnswersAssignment_4 : ( ruleAnswer ) ;
    public final void rule__RadioChoice__AnswersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1911:1: ( ( ruleAnswer ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1912:1: ( ruleAnswer )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1912:1: ( ruleAnswer )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1913:1: ruleAnswer
            {
             before(grammarAccess.getRadioChoiceAccess().getAnswersAnswerParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__RadioChoice__AnswersAssignment_43802);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getRadioChoiceAccess().getAnswersAnswerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioChoice__AnswersAssignment_4"


    // $ANTLR start "rule__OpenAnswer__NameAssignment_2"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1922:1: rule__OpenAnswer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__OpenAnswer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1926:1: ( ( ruleEString ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1927:1: ( ruleEString )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1927:1: ( ruleEString )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1928:1: ruleEString
            {
             before(grammarAccess.getOpenAnswerAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OpenAnswer__NameAssignment_23833);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpenAnswerAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenAnswer__NameAssignment_2"


    // $ANTLR start "rule__OpenAnswer__DescriptionAssignment_3"
    // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1937:1: rule__OpenAnswer__DescriptionAssignment_3 : ( ruleEString ) ;
    public final void rule__OpenAnswer__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1941:1: ( ( ruleEString ) )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1942:1: ( ruleEString )
            {
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1942:1: ( ruleEString )
            // ../smdp.project.survey.SurveyDSL.ui/src-gen/smdp/project/survey/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1943:1: ruleEString
            {
             before(grammarAccess.getOpenAnswerAccess().getDescriptionEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OpenAnswer__DescriptionAssignment_33864);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpenAnswerAccess().getDescriptionEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenAnswer__DescriptionAssignment_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__QuestionsAssignment_in_ruleSurvey96 = new BitSet(new long[]{0x0000000000019002L});
        public static final BitSet FOLLOW_rule__Survey__QuestionsAssignment_in_ruleSurvey108 = new BitSet(new long[]{0x0000000000019002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion138 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Alternatives_in_ruleQuestion171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer198 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Alternatives_in_ruleAnswer231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString258 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_Impl_in_entryRuleAnswer_Impl318 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer_Impl325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer_Impl__Group__0_in_ruleAnswer_Impl351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpenQuestion_in_entryRuleOpenQuestion380 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpenQuestion387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group__0_in_ruleOpenQuestion413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice440 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoice447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__0_in_ruleMultipleChoice473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadioChoice_in_entryRuleRadioChoice500 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRadioChoice507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group__0_in_ruleRadioChoice533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpenAnswer_in_entryRuleOpenAnswer560 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpenAnswer567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenAnswer__Group__0_in_ruleOpenAnswer593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpenQuestion_in_rule__Question__Alternatives629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_rule__Question__Alternatives646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadioChoice_in_rule__Question__Alternatives663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_Impl_in_rule__Answer__Alternatives695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpenAnswer_in_rule__Answer__Alternatives712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer_Impl__Group__0__Impl_in_rule__Answer_Impl__Group__0792 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Answer_Impl__Group__1_in_rule__Answer_Impl__Group__0795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer_Impl__Group__1__Impl_in_rule__Answer_Impl__Group__1853 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Answer_Impl__Group__2_in_rule__Answer_Impl__Group__1856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Answer_Impl__Group__1__Impl884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer_Impl__Group__2__Impl_in_rule__Answer_Impl__Group__2915 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Answer_Impl__Group__3_in_rule__Answer_Impl__Group__2918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer_Impl__NameAssignment_2_in_rule__Answer_Impl__Group__2__Impl945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer_Impl__Group__3__Impl_in_rule__Answer_Impl__Group__3975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer_Impl__DescriptionAssignment_3_in_rule__Answer_Impl__Group__3__Impl1002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group__0__Impl_in_rule__OpenQuestion__Group__01040 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group__1_in_rule__OpenQuestion__Group__01043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OpenQuestion__Group__0__Impl1071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group__1__Impl_in_rule__OpenQuestion__Group__11102 = new BitSet(new long[]{0x0000000000062000L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group__2_in_rule__OpenQuestion__Group__11105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__DescriptionAssignment_1_in_rule__OpenQuestion__Group__1__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group__2__Impl_in_rule__OpenQuestion__Group__21162 = new BitSet(new long[]{0x0000000000062000L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group__3_in_rule__OpenQuestion__Group__21165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__IsOptionalAssignment_2_in_rule__OpenQuestion__Group__2__Impl1192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group__3__Impl_in_rule__OpenQuestion__Group__31223 = new BitSet(new long[]{0x0000000000062000L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group__4_in_rule__OpenQuestion__Group__31226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group_3__0_in_rule__OpenQuestion__Group__3__Impl1253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group__4__Impl_in_rule__OpenQuestion__Group__41284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__OpenAnswerAssignment_4_in_rule__OpenQuestion__Group__4__Impl1311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group_3__0__Impl_in_rule__OpenQuestion__Group_3__01351 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group_3__1_in_rule__OpenQuestion__Group_3__01354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__OpenQuestion__Group_3__0__Impl1382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group_3__1__Impl_in_rule__OpenQuestion__Group_3__11413 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group_3__2_in_rule__OpenQuestion__Group_3__11416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_1_in_rule__OpenQuestion__Group_3__1__Impl1443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group_3__2__Impl_in_rule__OpenQuestion__Group_3__21473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group_3_2__0_in_rule__OpenQuestion__Group_3__2__Impl1500 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group_3_2__0__Impl_in_rule__OpenQuestion__Group_3_2__01537 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group_3_2__1_in_rule__OpenQuestion__Group_3_2__01540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OpenQuestion__Group_3_2__0__Impl1568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__Group_3_2__1__Impl_in_rule__OpenQuestion__Group_3_2__11599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_2_1_in_rule__OpenQuestion__Group_3_2__1__Impl1626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__0__Impl_in_rule__MultipleChoice__Group__01660 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__1_in_rule__MultipleChoice__Group__01663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__MultipleChoice__Group__0__Impl1691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__1__Impl_in_rule__MultipleChoice__Group__11722 = new BitSet(new long[]{0x0000000000062800L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__2_in_rule__MultipleChoice__Group__11725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__DescriptionAssignment_1_in_rule__MultipleChoice__Group__1__Impl1752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__2__Impl_in_rule__MultipleChoice__Group__21782 = new BitSet(new long[]{0x0000000000062800L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__3_in_rule__MultipleChoice__Group__21785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__IsOptionalAssignment_2_in_rule__MultipleChoice__Group__2__Impl1812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__3__Impl_in_rule__MultipleChoice__Group__31843 = new BitSet(new long[]{0x0000000000062800L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__4_in_rule__MultipleChoice__Group__31846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_3__0_in_rule__MultipleChoice__Group__3__Impl1873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__4__Impl_in_rule__MultipleChoice__Group__41904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__AnswersAssignment_4_in_rule__MultipleChoice__Group__4__Impl1933 = new BitSet(new long[]{0x0000000000062802L});
        public static final BitSet FOLLOW_rule__MultipleChoice__AnswersAssignment_4_in_rule__MultipleChoice__Group__4__Impl1945 = new BitSet(new long[]{0x0000000000062802L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_3__0__Impl_in_rule__MultipleChoice__Group_3__01988 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_3__1_in_rule__MultipleChoice__Group_3__01991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__MultipleChoice__Group_3__0__Impl2019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_3__1__Impl_in_rule__MultipleChoice__Group_3__12050 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_3__2_in_rule__MultipleChoice__Group_3__12053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_1_in_rule__MultipleChoice__Group_3__1__Impl2080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_3__2__Impl_in_rule__MultipleChoice__Group_3__22110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_3_2__0_in_rule__MultipleChoice__Group_3__2__Impl2137 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_3_2__0__Impl_in_rule__MultipleChoice__Group_3_2__02174 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_3_2__1_in_rule__MultipleChoice__Group_3_2__02177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__MultipleChoice__Group_3_2__0__Impl2205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_3_2__1__Impl_in_rule__MultipleChoice__Group_3_2__12236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_2_1_in_rule__MultipleChoice__Group_3_2__1__Impl2263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group__0__Impl_in_rule__RadioChoice__Group__02297 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group__1_in_rule__RadioChoice__Group__02300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__RadioChoice__Group__0__Impl2328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group__1__Impl_in_rule__RadioChoice__Group__12359 = new BitSet(new long[]{0x0000000000062800L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group__2_in_rule__RadioChoice__Group__12362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RadioChoice__DescriptionAssignment_1_in_rule__RadioChoice__Group__1__Impl2389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group__2__Impl_in_rule__RadioChoice__Group__22419 = new BitSet(new long[]{0x0000000000062800L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group__3_in_rule__RadioChoice__Group__22422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RadioChoice__IsOptionalAssignment_2_in_rule__RadioChoice__Group__2__Impl2449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group__3__Impl_in_rule__RadioChoice__Group__32480 = new BitSet(new long[]{0x0000000000062800L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group__4_in_rule__RadioChoice__Group__32483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group_3__0_in_rule__RadioChoice__Group__3__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group__4__Impl_in_rule__RadioChoice__Group__42541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RadioChoice__AnswersAssignment_4_in_rule__RadioChoice__Group__4__Impl2570 = new BitSet(new long[]{0x0000000000062802L});
        public static final BitSet FOLLOW_rule__RadioChoice__AnswersAssignment_4_in_rule__RadioChoice__Group__4__Impl2582 = new BitSet(new long[]{0x0000000000062802L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group_3__0__Impl_in_rule__RadioChoice__Group_3__02625 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group_3__1_in_rule__RadioChoice__Group_3__02628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__RadioChoice__Group_3__0__Impl2656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group_3__1__Impl_in_rule__RadioChoice__Group_3__12687 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group_3__2_in_rule__RadioChoice__Group_3__12690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RadioChoice__RequiredPreviousAnswersAssignment_3_1_in_rule__RadioChoice__Group_3__1__Impl2717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group_3__2__Impl_in_rule__RadioChoice__Group_3__22747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group_3_2__0_in_rule__RadioChoice__Group_3__2__Impl2774 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group_3_2__0__Impl_in_rule__RadioChoice__Group_3_2__02811 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group_3_2__1_in_rule__RadioChoice__Group_3_2__02814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RadioChoice__Group_3_2__0__Impl2842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RadioChoice__Group_3_2__1__Impl_in_rule__RadioChoice__Group_3_2__12873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RadioChoice__RequiredPreviousAnswersAssignment_3_2_1_in_rule__RadioChoice__Group_3_2__1__Impl2900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenAnswer__Group__0__Impl_in_rule__OpenAnswer__Group__02934 = new BitSet(new long[]{0x0000000000062000L});
        public static final BitSet FOLLOW_rule__OpenAnswer__Group__1_in_rule__OpenAnswer__Group__02937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenAnswer__Group__1__Impl_in_rule__OpenAnswer__Group__12995 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OpenAnswer__Group__2_in_rule__OpenAnswer__Group__12998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__OpenAnswer__Group__1__Impl3026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenAnswer__Group__2__Impl_in_rule__OpenAnswer__Group__23057 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OpenAnswer__Group__3_in_rule__OpenAnswer__Group__23060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenAnswer__NameAssignment_2_in_rule__OpenAnswer__Group__2__Impl3087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenAnswer__Group__3__Impl_in_rule__OpenAnswer__Group__33117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenAnswer__DescriptionAssignment_3_in_rule__OpenAnswer__Group__3__Impl3144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment3188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Answer_Impl__NameAssignment_23219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Answer_Impl__DescriptionAssignment_33250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OpenQuestion__DescriptionAssignment_13281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__OpenQuestion__IsOptionalAssignment_23317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_13360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OpenQuestion__RequiredPreviousAnswersAssignment_3_2_13399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpenAnswer_in_rule__OpenQuestion__OpenAnswerAssignment_43434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultipleChoice__DescriptionAssignment_13465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MultipleChoice__IsOptionalAssignment_23501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_13544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultipleChoice__RequiredPreviousAnswersAssignment_3_2_13583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MultipleChoice__AnswersAssignment_43618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RadioChoice__DescriptionAssignment_13649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RadioChoice__IsOptionalAssignment_23685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RadioChoice__RequiredPreviousAnswersAssignment_3_13728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RadioChoice__RequiredPreviousAnswersAssignment_3_2_13767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__RadioChoice__AnswersAssignment_43802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OpenAnswer__NameAssignment_23833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OpenAnswer__DescriptionAssignment_33864 = new BitSet(new long[]{0x0000000000000002L});
    }


}