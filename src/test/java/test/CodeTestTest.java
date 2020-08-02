package test;

import org.junit.Test;

import java.util.List;


public class CodeTestTest {
    @Test
    public void tt1() {
        CodeTest codeTest = new CodeTest();
        List<String> strings = codeTest.phone(new int[]{22,9,432});
        for (String string : strings) {
            System.out.println(string);
        }
    }
    @Test
    public void tt2() {
        CodeTest codeTest = new CodeTest();
        List<String> strings = codeTest.phone(new int[]{-2,9});
        for (String string : strings) {
            System.out.println(string);
        }
    }
    @Test
    public void tt3() {
        CodeTest codeTest = new CodeTest();
        List<String> strings = codeTest.phone(new int[]{});
        for (String string : strings) {
            System.out.println(string);
        }
    }
}