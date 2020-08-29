package dev.dengchao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
class SearchEngineWithFallbackStub implements SearchEngineWithFallbackForStubTest {

    @Override
    public String index() {
        return "Stub invoked";
    }
}
