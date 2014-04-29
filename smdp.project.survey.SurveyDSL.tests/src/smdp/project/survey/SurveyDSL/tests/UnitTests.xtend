package smdp.project.survey.SurveyDSL.tests

import org.eclipse.xtext.junit4.XtextRunner
import smdp.project.survey.SurveyDSLInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.util.ParseHelper
import static org.junit.Assert.*
import com.google.inject.Inject
import org.junit.Test
import survey.Survey
import survey.Question
import survey.MultipleChoice
import survey.*
import survey.impl.SurveyPackageImpl
import java.io.FileReader
import static extension com.google.common.io.CharStreams.*
import org.eclipse.xtend2.lib.StringConcatenation

@InjectWith(SurveyDSLInjectorProvider)
@RunWith(XtextRunner)
class UnitTests {
	@Inject
	ParseHelper<Survey> parser
 
	@Test
	def void pTest1() {
		SurveyPackageImpl.init()
		val model = parser.parse("multiple:
		\"What is your favourite pet?\"		
		answer dogAnswer \"I like dogs\"
		answer catAnswer \"I hate dogs, but I like cats\"
		text otherAnswer \"What else?\"
		single:
		\"What is better? Coffee or tea?\"
		optional
		requires dogAnswer		
		answer teaAnswer \"Tea\"
		answer coffeeAnswer \"Coffee\"
		open:
		\"Describe how you feel about Windows XP\"
		optional
		text xpAnswer ")
		val lines = new FileReader("surveytest.survey").readLines
		//model2.forEach[model3 += it]
		val entity = model.questions.head instanceof MultipleChoice
		assertTrue(entity)
		val req = model.questions.get(1).requiredPreviousAnswers.head as Answer
		assertEquals("dogAnswer", req.name)
		val opt = model.questions.get(1).isOptional
		assertTrue(opt)
	}
}