package dev.dengchao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SearchEngineWithFallbackUnitTests {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private SearchEngineWithFallbackForUnitTest searchEngineWithFallbackUnitTest;

    @Test
    void test() {
        Assertions.assertFalse(searchEngineWithFallbackUnitTest instanceof SearchEngineWithFallbackForUnitTest.Fallback);
        Assertions.assertEquals("Fallback triggered", searchEngineWithFallbackUnitTest.index());
    }

}
