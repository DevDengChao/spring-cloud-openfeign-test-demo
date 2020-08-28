package dev.dengchao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "search-engine-with-fallback-for-unit-test", url = "http://localhost",
        fallback = SearchEngineWithFallbackForUnitTest.Fallback.class)
interface SearchEngineWithFallbackForUnitTest {

    @GetMapping("/")
    String index();

    @Component
    class Fallback implements SearchEngineWithFallbackForUnitTest {

        @Override
        public String index() {
            return "Fallback triggered";
        }
    }

}
