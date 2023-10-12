package Scripts;

import org.testng.annotations.Test;

import POM.SkillraryHomePage;
import POM.TestingPage;
import POM.demoSkillraryPage;
import genericLibrary.BaseClass;

public class TeseCase1_1 extends BaseClass {
	@Test
	public void tc1() throws Throwable {
		SkillraryHomePage s=new SkillraryHomePage(driver);
	
		s.gearsButton();
		s.skillrarydemoappWebElement();
		utiles.childBrowser(driver);
		demoSkillraryPage dS=new demoSkillraryPage(driver);
		utiles.dropDown(dS.getSearchDd(),pdata.getPropertydata("coursedd"));
		TestingPage tp=new TestingPage(driver);
		utiles.Scrolling(driver, tp.getFb());
		tp.FbWebElement();
		
		
		
	}

}
