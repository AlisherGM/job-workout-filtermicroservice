import com.alisher.filter.adapter.BackendAdapter;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@TestConfiguration
public class FilterGatewayTestConfiguration {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public BackendAdapter backendAdapter(RestTemplate restTemplate) {
        return new BackendAdapter(restTemplate);
    }
}
