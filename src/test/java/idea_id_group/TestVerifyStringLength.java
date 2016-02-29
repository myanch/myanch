package idea_id_group;


import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;

public class TestVerifyStringLength {

    private String test = "myfirsttest";
    private int expectedLength = 11;

    @Test()
    public void testVerifyStringLenght() {
        int actualLength = test.length();
        assertTrue(actualLength == expectedLength);

    }

    @BeforeClass
    public void setUpFirstClass() {

    }

    @AfterClass
    public void tearDownFirstClass() {

    }

    @BeforeMethod
    public void setUpTest() {

    }

    @AfterMethod
    public void tearDownTest() {

    }
}




