package smdp.project.survey.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import smdp.project.survey.services.SurveyDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'answer'", "'open:'", "'optional'", "'requires'", "','", "'multiple:'", "'single:'", "'text'"
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
    public String getGrammarFileName() { return "../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g"; }



     	private SurveyDSLGrammarAccess grammarAccess;
     	
        public InternalSurveyDSLParser(TokenStream input, SurveyDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Survey";	
       	}
       	
       	@Override
       	protected SurveyDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSurvey"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:67:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:68:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:69:2: iv_ruleSurvey= ruleSurvey EOF
            {
             newCompositeNode(grammarAccess.getSurveyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_entryRuleSurvey75);
            iv_ruleSurvey=ruleSurvey();

            state._fsp--;

             current =iv_ruleSurvey; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSurvey85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:76:1: ruleSurvey returns [EObject current=null] : ( (lv_questions_0_0= ruleQuestion ) )+ ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        EObject lv_questions_0_0 = null;


         enterRule(); 
            
        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:79:28: ( ( (lv_questions_0_0= ruleQuestion ) )+ )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:80:1: ( (lv_questions_0_0= ruleQuestion ) )+
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:80:1: ( (lv_questions_0_0= ruleQuestion ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=16 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:81:1: (lv_questions_0_0= ruleQuestion )
            	    {
            	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:81:1: (lv_questions_0_0= ruleQuestion )
            	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:82:3: lv_questions_0_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey130);
            	    lv_questions_0_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_0_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRuleQuestion"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:106:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:107:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:108:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion166);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:115:1: ruleQuestion returns [EObject current=null] : (this_OpenQuestion_0= ruleOpenQuestion | this_MultipleChoice_1= ruleMultipleChoice | this_RadioChoice_2= ruleRadioChoice ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_OpenQuestion_0 = null;

        EObject this_MultipleChoice_1 = null;

        EObject this_RadioChoice_2 = null;


         enterRule(); 
            
        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:118:28: ( (this_OpenQuestion_0= ruleOpenQuestion | this_MultipleChoice_1= ruleMultipleChoice | this_RadioChoice_2= ruleRadioChoice ) )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:119:1: (this_OpenQuestion_0= ruleOpenQuestion | this_MultipleChoice_1= ruleMultipleChoice | this_RadioChoice_2= ruleRadioChoice )
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:119:1: (this_OpenQuestion_0= ruleOpenQuestion | this_MultipleChoice_1= ruleMultipleChoice | this_RadioChoice_2= ruleRadioChoice )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
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
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:120:5: this_OpenQuestion_0= ruleOpenQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getOpenQuestionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOpenQuestion_in_ruleQuestion223);
                    this_OpenQuestion_0=ruleOpenQuestion();

                    state._fsp--;

                     
                            current = this_OpenQuestion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:130:5: this_MultipleChoice_1= ruleMultipleChoice
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultipleChoiceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_ruleQuestion250);
                    this_MultipleChoice_1=ruleMultipleChoice();

                    state._fsp--;

                     
                            current = this_MultipleChoice_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:140:5: this_RadioChoice_2= ruleRadioChoice
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getRadioChoiceParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRadioChoice_in_ruleQuestion277);
                    this_RadioChoice_2=ruleRadioChoice();

                    state._fsp--;

                     
                            current = this_RadioChoice_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleAnswer"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:156:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:157:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:158:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer312);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer322); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:165:1: ruleAnswer returns [EObject current=null] : (this_Answer_Impl_0= ruleAnswer_Impl | this_OpenAnswer_1= ruleOpenAnswer ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_Answer_Impl_0 = null;

        EObject this_OpenAnswer_1 = null;


         enterRule(); 
            
        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:168:28: ( (this_Answer_Impl_0= ruleAnswer_Impl | this_OpenAnswer_1= ruleOpenAnswer ) )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:169:1: (this_Answer_Impl_0= ruleAnswer_Impl | this_OpenAnswer_1= ruleOpenAnswer )
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:169:1: (this_Answer_Impl_0= ruleAnswer_Impl | this_OpenAnswer_1= ruleOpenAnswer )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:170:5: this_Answer_Impl_0= ruleAnswer_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getAnswer_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnswer_Impl_in_ruleAnswer369);
                    this_Answer_Impl_0=ruleAnswer_Impl();

                    state._fsp--;

                     
                            current = this_Answer_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:180:5: this_OpenAnswer_1= ruleOpenAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getOpenAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOpenAnswer_in_ruleAnswer396);
                    this_OpenAnswer_1=ruleOpenAnswer();

                    state._fsp--;

                     
                            current = this_OpenAnswer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleEString"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:196:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:197:2: (iv_ruleEString= ruleEString EOF )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:198:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString432);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString443); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:205:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:208:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:209:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:209:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:209:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString483); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:217:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString509); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAnswer_Impl"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:232:1: entryRuleAnswer_Impl returns [EObject current=null] : iv_ruleAnswer_Impl= ruleAnswer_Impl EOF ;
    public final EObject entryRuleAnswer_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer_Impl = null;


        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:233:2: (iv_ruleAnswer_Impl= ruleAnswer_Impl EOF )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:234:2: iv_ruleAnswer_Impl= ruleAnswer_Impl EOF
            {
             newCompositeNode(grammarAccess.getAnswer_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_Impl_in_entryRuleAnswer_Impl554);
            iv_ruleAnswer_Impl=ruleAnswer_Impl();

            state._fsp--;

             current =iv_ruleAnswer_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer_Impl564); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnswer_Impl"


    // $ANTLR start "ruleAnswer_Impl"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:241:1: ruleAnswer_Impl returns [EObject current=null] : ( () otherlv_1= 'answer' ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) ) ) ;
    public final EObject ruleAnswer_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;


         enterRule(); 
            
        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:244:28: ( ( () otherlv_1= 'answer' ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) ) ) )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:245:1: ( () otherlv_1= 'answer' ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) ) )
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:245:1: ( () otherlv_1= 'answer' ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) ) )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:245:2: () otherlv_1= 'answer' ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:245:2: ()
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:246:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnswer_ImplAccess().getAnswerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAnswer_Impl610); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswer_ImplAccess().getAnswerKeyword_1());
                
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:255:1: ( (lv_name_2_0= ruleEString ) )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:256:1: (lv_name_2_0= ruleEString )
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:256:1: (lv_name_2_0= ruleEString )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:257:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnswer_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer_Impl631);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnswer_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:273:2: ( (lv_description_3_0= ruleEString ) )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:274:1: (lv_description_3_0= ruleEString )
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:274:1: (lv_description_3_0= ruleEString )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:275:3: lv_description_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnswer_ImplAccess().getDescriptionEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer_Impl652);
            lv_description_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnswer_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnswer_Impl"


    // $ANTLR start "entryRuleOpenQuestion"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:301:1: entryRuleOpenQuestion returns [EObject current=null] : iv_ruleOpenQuestion= ruleOpenQuestion EOF ;
    public final EObject entryRuleOpenQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenQuestion = null;


        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:302:2: (iv_ruleOpenQuestion= ruleOpenQuestion EOF )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:303:2: iv_ruleOpenQuestion= ruleOpenQuestion EOF
            {
             newCompositeNode(grammarAccess.getOpenQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpenQuestion_in_entryRuleOpenQuestion690);
            iv_ruleOpenQuestion=ruleOpenQuestion();

            state._fsp--;

             current =iv_ruleOpenQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpenQuestion700); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpenQuestion"


    // $ANTLR start "ruleOpenQuestion"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:310:1: ruleOpenQuestion returns [EObject current=null] : (otherlv_0= 'open:' ( (lv_description_1_0= ruleEString ) ) ( (lv_isOptional_2_0= 'optional' ) )? (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (lv_openAnswer_7_0= ruleOpenAnswer ) ) ) ;
    public final EObject ruleOpenQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isOptional_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_description_1_0 = null;

        EObject lv_openAnswer_7_0 = null;


         enterRule(); 
            
        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:313:28: ( (otherlv_0= 'open:' ( (lv_description_1_0= ruleEString ) ) ( (lv_isOptional_2_0= 'optional' ) )? (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (lv_openAnswer_7_0= ruleOpenAnswer ) ) ) )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:314:1: (otherlv_0= 'open:' ( (lv_description_1_0= ruleEString ) ) ( (lv_isOptional_2_0= 'optional' ) )? (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (lv_openAnswer_7_0= ruleOpenAnswer ) ) )
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:314:1: (otherlv_0= 'open:' ( (lv_description_1_0= ruleEString ) ) ( (lv_isOptional_2_0= 'optional' ) )? (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (lv_openAnswer_7_0= ruleOpenAnswer ) ) )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:314:3: otherlv_0= 'open:' ( (lv_description_1_0= ruleEString ) ) ( (lv_isOptional_2_0= 'optional' ) )? (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (lv_openAnswer_7_0= ruleOpenAnswer ) )
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOpenQuestion737); 

                	newLeafNode(otherlv_0, grammarAccess.getOpenQuestionAccess().getOpenKeyword_0());
                
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:318:1: ( (lv_description_1_0= ruleEString ) )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:319:1: (lv_description_1_0= ruleEString )
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:319:1: (lv_description_1_0= ruleEString )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:320:3: lv_description_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOpenQuestionAccess().getDescriptionEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpenQuestion758);
            lv_description_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOpenQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:336:2: ( (lv_isOptional_2_0= 'optional' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:337:1: (lv_isOptional_2_0= 'optional' )
                    {
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:337:1: (lv_isOptional_2_0= 'optional' )
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:338:3: lv_isOptional_2_0= 'optional'
                    {
                    lv_isOptional_2_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleOpenQuestion776); 

                            newLeafNode(lv_isOptional_2_0, grammarAccess.getOpenQuestionAccess().getIsOptionalOptionalKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOpenQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "isOptional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:351:3: (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:351:5: otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOpenQuestion803); 

                        	newLeafNode(otherlv_3, grammarAccess.getOpenQuestionAccess().getRequiresKeyword_3_0());
                        
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:355:1: ( ( ruleEString ) )
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:356:1: ( ruleEString )
                    {
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:356:1: ( ruleEString )
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:357:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOpenQuestionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getOpenQuestionAccess().getRequiredPreviousAnswersAnswerCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpenQuestion826);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:370:2: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:370:4: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOpenQuestion839); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getOpenQuestionAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:374:1: ( ( ruleEString ) )
                    	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:375:1: ( ruleEString )
                    	    {
                    	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:375:1: ( ruleEString )
                    	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:376:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getOpenQuestionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getOpenQuestionAccess().getRequiredPreviousAnswersAnswerCrossReference_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpenQuestion862);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:389:6: ( (lv_openAnswer_7_0= ruleOpenAnswer ) )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:390:1: (lv_openAnswer_7_0= ruleOpenAnswer )
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:390:1: (lv_openAnswer_7_0= ruleOpenAnswer )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:391:3: lv_openAnswer_7_0= ruleOpenAnswer
            {
             
            	        newCompositeNode(grammarAccess.getOpenQuestionAccess().getOpenAnswerOpenAnswerParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOpenAnswer_in_ruleOpenQuestion887);
            lv_openAnswer_7_0=ruleOpenAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOpenQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"openAnswer",
                    		lv_openAnswer_7_0, 
                    		"OpenAnswer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpenQuestion"


    // $ANTLR start "entryRuleMultipleChoice"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:415:1: entryRuleMultipleChoice returns [EObject current=null] : iv_ruleMultipleChoice= ruleMultipleChoice EOF ;
    public final EObject entryRuleMultipleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleChoice = null;


        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:416:2: (iv_ruleMultipleChoice= ruleMultipleChoice EOF )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:417:2: iv_ruleMultipleChoice= ruleMultipleChoice EOF
            {
             newCompositeNode(grammarAccess.getMultipleChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice923);
            iv_ruleMultipleChoice=ruleMultipleChoice();

            state._fsp--;

             current =iv_ruleMultipleChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleChoice933); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleChoice"


    // $ANTLR start "ruleMultipleChoice"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:424:1: ruleMultipleChoice returns [EObject current=null] : (otherlv_0= 'multiple:' ( (lv_description_1_0= ruleEString ) ) ( (lv_isOptional_2_0= 'optional' ) )? (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (lv_answers_7_0= ruleAnswer ) )+ ) ;
    public final EObject ruleMultipleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isOptional_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_description_1_0 = null;

        EObject lv_answers_7_0 = null;


         enterRule(); 
            
        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:427:28: ( (otherlv_0= 'multiple:' ( (lv_description_1_0= ruleEString ) ) ( (lv_isOptional_2_0= 'optional' ) )? (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (lv_answers_7_0= ruleAnswer ) )+ ) )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:428:1: (otherlv_0= 'multiple:' ( (lv_description_1_0= ruleEString ) ) ( (lv_isOptional_2_0= 'optional' ) )? (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (lv_answers_7_0= ruleAnswer ) )+ )
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:428:1: (otherlv_0= 'multiple:' ( (lv_description_1_0= ruleEString ) ) ( (lv_isOptional_2_0= 'optional' ) )? (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (lv_answers_7_0= ruleAnswer ) )+ )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:428:3: otherlv_0= 'multiple:' ( (lv_description_1_0= ruleEString ) ) ( (lv_isOptional_2_0= 'optional' ) )? (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (lv_answers_7_0= ruleAnswer ) )+
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultipleChoice970); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleChoiceAccess().getMultipleKeyword_0());
                
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:432:1: ( (lv_description_1_0= ruleEString ) )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:433:1: (lv_description_1_0= ruleEString )
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:433:1: (lv_description_1_0= ruleEString )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:434:3: lv_description_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getDescriptionEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice991);
            lv_description_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:450:2: ( (lv_isOptional_2_0= 'optional' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:451:1: (lv_isOptional_2_0= 'optional' )
                    {
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:451:1: (lv_isOptional_2_0= 'optional' )
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:452:3: lv_isOptional_2_0= 'optional'
                    {
                    lv_isOptional_2_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultipleChoice1009); 

                            newLeafNode(lv_isOptional_2_0, grammarAccess.getMultipleChoiceAccess().getIsOptionalOptionalKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		setWithLastConsumed(current, "isOptional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:465:3: (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:465:5: otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleChoice1036); 

                        	newLeafNode(otherlv_3, grammarAccess.getMultipleChoiceAccess().getRequiresKeyword_3_0());
                        
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:469:1: ( ( ruleEString ) )
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:470:1: ( ruleEString )
                    {
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:470:1: ( ruleEString )
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:471:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultipleChoiceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getRequiredPreviousAnswersAnswerCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice1059);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:484:2: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:484:4: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultipleChoice1072); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getMultipleChoiceAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:488:1: ( ( ruleEString ) )
                    	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:489:1: ( ruleEString )
                    	    {
                    	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:489:1: ( ruleEString )
                    	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:490:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMultipleChoiceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getRequiredPreviousAnswersAnswerCrossReference_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice1095);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:503:6: ( (lv_answers_7_0= ruleAnswer ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==11||LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:504:1: (lv_answers_7_0= ruleAnswer )
            	    {
            	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:504:1: (lv_answers_7_0= ruleAnswer )
            	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:505:3: lv_answers_7_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getAnswersAnswerParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleMultipleChoice1120);
            	    lv_answers_7_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_7_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultipleChoice"


    // $ANTLR start "entryRuleRadioChoice"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:529:1: entryRuleRadioChoice returns [EObject current=null] : iv_ruleRadioChoice= ruleRadioChoice EOF ;
    public final EObject entryRuleRadioChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioChoice = null;


        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:530:2: (iv_ruleRadioChoice= ruleRadioChoice EOF )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:531:2: iv_ruleRadioChoice= ruleRadioChoice EOF
            {
             newCompositeNode(grammarAccess.getRadioChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRadioChoice_in_entryRuleRadioChoice1157);
            iv_ruleRadioChoice=ruleRadioChoice();

            state._fsp--;

             current =iv_ruleRadioChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRadioChoice1167); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRadioChoice"


    // $ANTLR start "ruleRadioChoice"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:538:1: ruleRadioChoice returns [EObject current=null] : (otherlv_0= 'single:' ( (lv_description_1_0= ruleEString ) ) ( (lv_isOptional_2_0= 'optional' ) )? (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (lv_answers_7_0= ruleAnswer ) )+ ) ;
    public final EObject ruleRadioChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isOptional_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_description_1_0 = null;

        EObject lv_answers_7_0 = null;


         enterRule(); 
            
        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:541:28: ( (otherlv_0= 'single:' ( (lv_description_1_0= ruleEString ) ) ( (lv_isOptional_2_0= 'optional' ) )? (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (lv_answers_7_0= ruleAnswer ) )+ ) )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:542:1: (otherlv_0= 'single:' ( (lv_description_1_0= ruleEString ) ) ( (lv_isOptional_2_0= 'optional' ) )? (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (lv_answers_7_0= ruleAnswer ) )+ )
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:542:1: (otherlv_0= 'single:' ( (lv_description_1_0= ruleEString ) ) ( (lv_isOptional_2_0= 'optional' ) )? (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (lv_answers_7_0= ruleAnswer ) )+ )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:542:3: otherlv_0= 'single:' ( (lv_description_1_0= ruleEString ) ) ( (lv_isOptional_2_0= 'optional' ) )? (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? ( (lv_answers_7_0= ruleAnswer ) )+
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRadioChoice1204); 

                	newLeafNode(otherlv_0, grammarAccess.getRadioChoiceAccess().getSingleKeyword_0());
                
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:546:1: ( (lv_description_1_0= ruleEString ) )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:547:1: (lv_description_1_0= ruleEString )
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:547:1: (lv_description_1_0= ruleEString )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:548:3: lv_description_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRadioChoiceAccess().getDescriptionEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRadioChoice1225);
            lv_description_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRadioChoiceRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:564:2: ( (lv_isOptional_2_0= 'optional' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:565:1: (lv_isOptional_2_0= 'optional' )
                    {
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:565:1: (lv_isOptional_2_0= 'optional' )
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:566:3: lv_isOptional_2_0= 'optional'
                    {
                    lv_isOptional_2_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRadioChoice1243); 

                            newLeafNode(lv_isOptional_2_0, grammarAccess.getRadioChoiceAccess().getIsOptionalOptionalKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRadioChoiceRule());
                    	        }
                           		setWithLastConsumed(current, "isOptional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:579:3: (otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:579:5: otherlv_3= 'requires' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRadioChoice1270); 

                        	newLeafNode(otherlv_3, grammarAccess.getRadioChoiceAccess().getRequiresKeyword_3_0());
                        
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:583:1: ( ( ruleEString ) )
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:584:1: ( ruleEString )
                    {
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:584:1: ( ruleEString )
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:585:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRadioChoiceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRadioChoiceAccess().getRequiredPreviousAnswersAnswerCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRadioChoice1293);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:598:2: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:598:4: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRadioChoice1306); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getRadioChoiceAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:602:1: ( ( ruleEString ) )
                    	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:603:1: ( ruleEString )
                    	    {
                    	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:603:1: ( ruleEString )
                    	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:604:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRadioChoiceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRadioChoiceAccess().getRequiredPreviousAnswersAnswerCrossReference_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRadioChoice1329);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:617:6: ( (lv_answers_7_0= ruleAnswer ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==11||LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:618:1: (lv_answers_7_0= ruleAnswer )
            	    {
            	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:618:1: (lv_answers_7_0= ruleAnswer )
            	    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:619:3: lv_answers_7_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRadioChoiceAccess().getAnswersAnswerParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleRadioChoice1354);
            	    lv_answers_7_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRadioChoiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_7_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRadioChoice"


    // $ANTLR start "entryRuleOpenAnswer"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:643:1: entryRuleOpenAnswer returns [EObject current=null] : iv_ruleOpenAnswer= ruleOpenAnswer EOF ;
    public final EObject entryRuleOpenAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenAnswer = null;


        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:644:2: (iv_ruleOpenAnswer= ruleOpenAnswer EOF )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:645:2: iv_ruleOpenAnswer= ruleOpenAnswer EOF
            {
             newCompositeNode(grammarAccess.getOpenAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpenAnswer_in_entryRuleOpenAnswer1391);
            iv_ruleOpenAnswer=ruleOpenAnswer();

            state._fsp--;

             current =iv_ruleOpenAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpenAnswer1401); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpenAnswer"


    // $ANTLR start "ruleOpenAnswer"
    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:652:1: ruleOpenAnswer returns [EObject current=null] : ( () otherlv_1= 'text' ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? ) ;
    public final EObject ruleOpenAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;


         enterRule(); 
            
        try {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:655:28: ( ( () otherlv_1= 'text' ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? ) )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:656:1: ( () otherlv_1= 'text' ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? )
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:656:1: ( () otherlv_1= 'text' ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )? )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:656:2: () otherlv_1= 'text' ( (lv_name_2_0= ruleEString ) ) ( (lv_description_3_0= ruleEString ) )?
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:656:2: ()
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:657:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOpenAnswerAccess().getOpenAnswerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOpenAnswer1447); 

                	newLeafNode(otherlv_1, grammarAccess.getOpenAnswerAccess().getTextKeyword_1());
                
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:666:1: ( (lv_name_2_0= ruleEString ) )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:667:1: (lv_name_2_0= ruleEString )
            {
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:667:1: (lv_name_2_0= ruleEString )
            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:668:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOpenAnswerAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpenAnswer1468);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOpenAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:684:2: ( (lv_description_3_0= ruleEString ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:685:1: (lv_description_3_0= ruleEString )
                    {
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:685:1: (lv_description_3_0= ruleEString )
                    // ../smdp.project.survey.SurveyDSL/src-gen/smdp/project/survey/parser/antlr/internal/InternalSurveyDSL.g:686:3: lv_description_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpenAnswerAccess().getDescriptionEStringParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpenAnswer1489);
                    lv_description_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOpenAnswerRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpenAnswer"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey130 = new BitSet(new long[]{0x0000000000031002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion166 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpenQuestion_in_ruleQuestion223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_ruleQuestion250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadioChoice_in_ruleQuestion277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer312 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_Impl_in_ruleAnswer369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpenAnswer_in_ruleAnswer396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString432 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_Impl_in_entryRuleAnswer_Impl554 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer_Impl564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleAnswer_Impl610 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer_Impl631 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer_Impl652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpenQuestion_in_entryRuleOpenQuestion690 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpenQuestion700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleOpenQuestion737 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpenQuestion758 = new BitSet(new long[]{0x0000000000046000L});
        public static final BitSet FOLLOW_13_in_ruleOpenQuestion776 = new BitSet(new long[]{0x0000000000046000L});
        public static final BitSet FOLLOW_14_in_ruleOpenQuestion803 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpenQuestion826 = new BitSet(new long[]{0x000000000004E000L});
        public static final BitSet FOLLOW_15_in_ruleOpenQuestion839 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpenQuestion862 = new BitSet(new long[]{0x000000000004E000L});
        public static final BitSet FOLLOW_ruleOpenAnswer_in_ruleOpenQuestion887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice923 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoice933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleMultipleChoice970 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice991 = new BitSet(new long[]{0x0000000000046800L});
        public static final BitSet FOLLOW_13_in_ruleMultipleChoice1009 = new BitSet(new long[]{0x0000000000046800L});
        public static final BitSet FOLLOW_14_in_ruleMultipleChoice1036 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice1059 = new BitSet(new long[]{0x000000000004E800L});
        public static final BitSet FOLLOW_15_in_ruleMultipleChoice1072 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice1095 = new BitSet(new long[]{0x000000000004E800L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleMultipleChoice1120 = new BitSet(new long[]{0x0000000000046802L});
        public static final BitSet FOLLOW_ruleRadioChoice_in_entryRuleRadioChoice1157 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRadioChoice1167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleRadioChoice1204 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRadioChoice1225 = new BitSet(new long[]{0x0000000000046800L});
        public static final BitSet FOLLOW_13_in_ruleRadioChoice1243 = new BitSet(new long[]{0x0000000000046800L});
        public static final BitSet FOLLOW_14_in_ruleRadioChoice1270 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRadioChoice1293 = new BitSet(new long[]{0x000000000004E800L});
        public static final BitSet FOLLOW_15_in_ruleRadioChoice1306 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRadioChoice1329 = new BitSet(new long[]{0x000000000004E800L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleRadioChoice1354 = new BitSet(new long[]{0x0000000000046802L});
        public static final BitSet FOLLOW_ruleOpenAnswer_in_entryRuleOpenAnswer1391 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpenAnswer1401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleOpenAnswer1447 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpenAnswer1468 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpenAnswer1489 = new BitSet(new long[]{0x0000000000000002L});
    }


}