package dev.dengchao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
class SearchEngineStub implements SearchEngineForStubTest {

    @Override
    public String index() {
        return "Stub invoked";
    }
}
