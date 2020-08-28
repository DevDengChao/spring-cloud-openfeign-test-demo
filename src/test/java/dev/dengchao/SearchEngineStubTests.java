package dev.dengchao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SearchEngineStubTests {

    @Autowired
    private SearchEngineForStubTest searchEngineForStubTest;

    @Test
    void test() {
        Assertions.assertTrue(searchEngineForStubTest instanceof SearchEngineStub);
        Assertions.assertEquals("Stub invoked", searchEngineForStubTest.index());
    }
}
