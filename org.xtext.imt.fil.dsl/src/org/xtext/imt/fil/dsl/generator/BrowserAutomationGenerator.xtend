/*
 * generated by Xtext 2.17.0
 */
package org.xtext.imt.fil.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.imt.fil.dsl.browserAutomation.BrowserAutomation
import org.xtext.imt.fil.dsl.browserAutomation.Statement
import org.xtext.imt.fil.dsl.browserAutomation.Get
import org.xtext.imt.fil.dsl.browserAutomation.GoTo
import org.xtext.imt.fil.dsl.browserAutomation.DoAction
import org.xtext.imt.fil.dsl.browserAutomation.Click
import org.xtext.imt.fil.dsl.browserAutomation.Insert
import org.xtext.imt.fil.dsl.browserAutomation.Verify
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectOutputStream.Check
import org.xtext.imt.fil.dsl.browserAutomation.Choose
import org.xtext.imt.fil.dsl.browserAutomation.Contains
import org.xtext.imt.fil.dsl.browserAutomation.VarReference

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class BrowserAutomationGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("BrowserAutomation.java", resource.contents.filter(BrowserAutomation).head.compile);
	}
	
	def compile(BrowserAutomation browserAutomation) '''
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class BrowserAutomation {
			public static void main(String[] args) {
				WebDriver driver = new «browserAutomation.webBrowser.toFirstUpper()»Driver();
				«FOR statement: browserAutomation.statements»
					«statement.statementType»
				«ENDFOR»
				driver.quit();
			}
		}
	'''
	
	def dispatch String statementType(Get get) '''
		«switch (get.element) {
			case 'link': {
				switch (get.attr) {
					case 'value': {
						return '''driver.findElement(By.xpath("//*[text()='«IF get.attrVal.stringVal != null»«get.attrVal.stringVal.intern»«ELSE»«get.attrVal.varRefVal»«ENDIF»']"))'''
					}
					default: {
						
					}
				}
			}
			default: {
				
			}
		}»
	'''
	
	def dispatch String statementType(GoTo goTo) '''
		driver.get("«goTo.url»");
	'''	
	
	
	def dispatch statementType(DoAction doAction) '''
		«var i = doAction.get.statementType»
		«doAction.action.actionType(i.toString)»
	'''
	
	def dispatch actionType(Click click, String element) '''
		driver.get(«element».getAttribute("href"));
	'''
	
	def dispatch actionType(Insert insert, String element) '''
	test
	'''
	
	def dispatch actionType(Verify verify, String element) '''
		WebElement element = «element»;
		System.out.println("Test passed: " + (element == null ? "false" : "true"));
	'''
	
	def dispatch actionType(Check check, String element) '''
	test
	'''
	
	def dispatch actionType(Choose choose, String element) '''
	test
	'''
	
	def dispatch actionType(Contains contains, String element) '''
	test
	'''
}
