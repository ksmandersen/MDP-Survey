package smdp.project.survey.SurveyDSL.tests;

import com.google.common.io.CharStreams;
import com.google.inject.Inject;
import java.io.FileReader;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import smdp.project.survey.SurveyDSLInjectorProvider;
import survey.Answer;
import survey.MultipleChoice;
import survey.Question;
import survey.Survey;
import survey.impl.SurveyPackageImpl;

@InjectWith(SurveyDSLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class UnitTests {
  @Inject
  private ParseHelper<Survey> parser;
  
  @Test
  public void pTest1() {
    try {
      SurveyPackageImpl.init();
      final Survey model = this.parser.parse("multiple:\r\n\t\t\"What is your favourite pet?\"\t\t\r\n\t\tanswer dogAnswer \"I like dogs\"\r\n\t\tanswer catAnswer \"I hate dogs, but I like cats\"\r\n\t\ttext otherAnswer \"What else?\"\r\n\t\tsingle:\r\n\t\t\"What is better? Coffee or tea?\"\r\n\t\toptional\r\n\t\trequires dogAnswer\t\t\r\n\t\tanswer teaAnswer \"Tea\"\r\n\t\tanswer coffeeAnswer \"Coffee\"\r\n\t\topen:\r\n\t\t\"Describe how you feel about Windows XP\"\r\n\t\toptional\r\n\t\ttext xpAnswer ");
      FileReader _fileReader = new FileReader("surveytest.survey");
      final List<String> lines = CharStreams.readLines(_fileReader);
      EList<Question> _questions = model.getQuestions();
      Question _head = IterableExtensions.<Question>head(_questions);
      final boolean entity = (_head instanceof MultipleChoice);
      Assert.assertTrue(entity);
      EList<Question> _questions_1 = model.getQuestions();
      Question _get = _questions_1.get(1);
      EList<Answer> _requiredPreviousAnswers = _get.getRequiredPreviousAnswers();
      Answer _head_1 = IterableExtensions.<Answer>head(_requiredPreviousAnswers);
      final Answer req = ((Answer) _head_1);
      String _name = req.getName();
      Assert.assertEquals("dogAnswer", _name);
      EList<Question> _questions_2 = model.getQuestions();
      Question _get_1 = _questions_2.get(1);
      final boolean opt = _get_1.isIsOptional();
      Assert.assertTrue(opt);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
