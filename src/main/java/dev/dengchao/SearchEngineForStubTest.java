package dev.dengchao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "search-engine-for-stub-test", url = "https://cn.bing.com", primary = false)
interface SearchEngineForStubTest {

    @GetMapping("/")
    String index();
}
