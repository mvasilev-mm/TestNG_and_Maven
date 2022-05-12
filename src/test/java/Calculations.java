import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Calculations {

    @Parameters({"paramA", "paramB"})
    @Test(groups = "Addition")
    public void calcAddition(float a, float b) {
        Assert.assertEquals(a + b, 15, "calcAddition test");
    }

    @Parameters({"paramA", "paramB"})
    @Test(groups = "Substraction")
    public void calcSubtraction(float a, float b) {
        Assert.assertEquals(a - b, 5, "calcSubtraction test");
    }

    @Parameters({"paramA", "paramB"})
    @Test(groups = "Multiplication")
    public void calcMultiplication(float a, float b) {
        Assert.assertEquals(a * b, 50, "calcMultiplication test");
    }

    @Parameters({"paramA", "paramB"})
    @Test(groups = "Division")
    public void calcDivision(float a, float b) {
        Assert.assertEquals(a / b, 2, "calcDivision test");
    }

    @Parameters({"paramA", "paramB"})
    @Test(groups = "Modolo Division")
    public void calcModDivision(float a, float b) {
        Assert.assertEquals(a % b, 0, "calcModDivision test");
    }
}
