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
		val model = parser.parse(getStringFromFile("ptest1.survey"))
		val entity = model.questions.head instanceof MultipleChoice
		assertTrue(entity)
		val req = model.questions.get(2).requiredPreviousAnswers.head as Answer
		assertEquals("teaAnswer", req.name)
		val opt = model.questions.get(1).isOptional
		assertTrue(opt)
		val question = model.questions.get(0) as MultipleChoice
		assertTrue(question.answers.size == 3)
	}
	
	@Test
	def void nTest1() {
		SurveyPackageImpl.init()		
		val model = parser.parse(getStringFromFile("ntest1.survey"))
		val entity = model.questions.head as MultipleChoice
		assertNull(entity.description)
		assertTrue(entity.answers.empty)
		assertFalse(entity.isOptional)
		val req = model.questions.size == 3
		assertTrue(req)	
	}
	
	def String getStringFromFile(String path){
		val lines = new FileReader(path).readLines		
		var conc = ""
		for(String s : lines) 
			conc = conc + s
		return conc
	}
}