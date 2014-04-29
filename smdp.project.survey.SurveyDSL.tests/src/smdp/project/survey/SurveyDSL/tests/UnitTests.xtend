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
		val lines = new FileReader("ptest1.survey").readLines		
		var conc = ""
		for(String s : lines) 
			conc = conc + s
		val model = parser.parse(conc)
		val entity = model.questions.head instanceof MultipleChoice
		assertTrue(entity)
		val req = model.questions.get(2).requiredPreviousAnswers.head as Answer
		assertEquals("teaAnswer", req.name)
		val opt = model.questions.get(1).isOptional
		assertTrue(opt)
	}
}