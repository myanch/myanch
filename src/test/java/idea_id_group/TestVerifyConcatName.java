package idea_id_group;


import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class TestVerifyConcatName {

    private String name = "Masha";
    private String firstPart = "Ma";
    private String secondPart = "sha";

    @Test
    public void testVerifyConcatName() {
        assertEquals(name, firstPart + secondPart);
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




