import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    /*
    strategy : 
    零 乘 多位数
    多位数 乘 零
    零 乘 零
    一位数 乘 多位数
    多位数 乘 一位数
    多位数 乘 多位数
    一位数 乘 一位数
    0 * ???
    ??? * 0
    0 * 0
    ? * ???
    ??? * ?
    ??? * ???
    ? * ?
    */
    @org.junit.jupiter.api.Test
    void multiply() {
        Solution sol = new Solution();
        assertEquals("0", sol.multiply("0", "123456789"));
        assertEquals("0", sol.multiply("123456789", "0"));
        assertEquals("0", sol.multiply("0", "0"));
        assertEquals("3388698", sol.multiply("6", "564783"));
        assertEquals("3388698", sol.multiply("564783", "6"));
        assertEquals("5320184060870", sol.multiply("1586795", "3352786"));
        assertEquals("63", sol.multiply("7", "9"));
    }
}