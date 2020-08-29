package dev.dengchao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Priority;

@Priority(1)
@FeignClient(value = "search-engine-with-fallback-for-stub-test", url = "https://cn.bing.com", primary = false,
        fallback = SearchEngineWithFallbackForStubTest.Fallback.class)
interface SearchEngineWithFallbackForStubTest {

    @GetMapping("/")
    String index();

    @Component
    @Priority(2)
    class Fallback implements SearchEngineWithFallbackForStubTest {

        @Override
        public String index() {
            throw new RuntimeException("Fallback should not be triggered in this case");
        }
    }
}
