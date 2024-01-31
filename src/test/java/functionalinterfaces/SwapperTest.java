package functionalinterfaces;

import org.junit.Test;

public class SwapperTest {
    @Test
    public void testSwapWithoutThirdVariable() {
        Swapper.swapWithoutThirdVariable(5, 10);
        Swapper.swapWithoutThirdVariable(15, 20);
        Swapper.swapWithoutThirdVariable(100, 200);
    }
}

