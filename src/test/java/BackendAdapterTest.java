import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@RunWith(SpringRunner.class)
@Import(FilterGatewayTestConfiguration.class)
@RequiredArgsConstructor
public class BackendAdapterTest {
//    @Autowired
//    private BackendAdapter backendAdapter;
    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void outputTest() {
//        log.info("[request body] - " + backendAdapter.getRequests().getBody());
//        assertThat(backendAdapter.getRequests().getStatusCode()).isEqualTo(HttpStatus.OK);
    }

}
