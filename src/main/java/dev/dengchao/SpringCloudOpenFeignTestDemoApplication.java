package dev.dengchao;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.lang.NonNull;

import javax.annotation.PostConstruct;

@EnableFeignClients
@SpringBootApplication
@RequiredArgsConstructor
public class SpringCloudOpenFeignTestDemoApplication {

    @NonNull
    private final SearchEngineForUnitTest searchEngineForUnitTest;
    @NonNull
    private final SearchEngineForStubTest searchEngineForStubTest;
    @NonNull
    private final SearchEngineWithFallbackForUnitTest searchEngineWithFallbackForUnitTest;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOpenFeignTestDemoApplication.class, args);
    }

    @PostConstruct
    private void postConstruct() {
        searchEngineForUnitTest.index();
        searchEngineForStubTest.index();
        if (!searchEngineWithFallbackForUnitTest.index().equals("Fallback triggered")) {
            throw new RuntimeException("Unexpected fallback triggered");
        }
    }
}
