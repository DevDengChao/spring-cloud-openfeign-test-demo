package dev.dengchao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SearchEngineWithFallbackStubTests {

    @Autowired
    private SearchEngineWithFallbackForStubTest searchEngineWithFallbackStubTest;

    @Test
    void test() {
        Assertions.assertTrue(searchEngineWithFallbackStubTest instanceof SearchEngineWithFallbackStub);
        Assertions.assertEquals("Stub invoked", searchEngineWithFallbackStubTest.index());
    }

}
