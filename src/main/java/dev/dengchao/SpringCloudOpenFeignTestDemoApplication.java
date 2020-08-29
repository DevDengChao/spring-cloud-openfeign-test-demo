package dev.dengchao;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.lang.NonNull;

import javax.annotation.PostConstruct;

import static java.util.Objects.requireNonNull;

@Slf4j
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
    @NonNull
    private final SearchEngineWithFallbackForStubTest searchEngineWithFallbackForStubTest;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOpenFeignTestDemoApplication.class, args);
    }

    @PostConstruct
    private void postConstruct() {
        requireNonNull(searchEngineForUnitTest);
        requireNonNull(searchEngineForStubTest);
        requireNonNull(searchEngineWithFallbackForUnitTest);
        requireNonNull(searchEngineWithFallbackForStubTest);
        log.info("============================================================");
        log.info("============= Feign client inject Successfully =============");
        log.info("============================================================");
    }
}
