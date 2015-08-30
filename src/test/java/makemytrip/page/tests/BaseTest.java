package makemytrip.page.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import web.libraries.WebPageFactory;

@ContextConfiguration(locations = {"classpath:applicationContext-pages.xml"})
public abstract class BaseTest extends AbstractTestNGSpringContextTests {

    @Autowired
    protected WebPageFactory webPageFactory;

    @BeforeClass(alwaysRun = true)
    public void initTestData() {

    }

    @AfterTest
    public void endClass() {
        webPageFactory.getDriver().quit();
    }

    public void refreshPage() {
        webPageFactory.getDriver().navigate().refresh();
    }

}
