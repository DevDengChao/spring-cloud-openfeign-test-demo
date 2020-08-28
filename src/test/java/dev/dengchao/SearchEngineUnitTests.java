package dev.dengchao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SearchEngineUnitTests {

    @Autowired
    private SearchEngineForUnitTest searchEngineForUnitTest;

    @Test
    void test() {
        searchEngineForUnitTest.index();
    }
}
