package study.com.hacker.service

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate
import java.time.Duration

@Configuration
class Bean {

    @Bean
    fun restTemplate(restTemplateBuilder: RestTemplateBuilder): RestTemplate {
        return restTemplateBuilder.rootUri("").setConnectTimeout(Duration.ofMillis(30000))
            .setReadTimeout(Duration.ofMillis(40000)).build()
    }

}