package dev.dengchao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "search-engine-for-unit-test", url = "https://cn.bing.com")
  interface SearchEngineForUnitTest {

    @GetMapping("/")
    void index();
}
