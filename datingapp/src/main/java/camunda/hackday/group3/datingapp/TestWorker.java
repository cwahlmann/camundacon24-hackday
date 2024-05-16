package camunda.hackday.group3.datingapp;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.stereotype.Component;

@Component
public class TestWorker {
    @JobWorker(type = "test")
    public void test(){
    }
}
