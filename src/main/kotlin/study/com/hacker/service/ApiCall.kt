package study.com.hacker.service

import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class ApiCall (private val restTemplate: RestTemplate){

    fun api(){

        val header = HttpHeaders()
        header.set("key","authkey")

        try {
            val res = restTemplate.exchange(
                "",
                HttpMethod.GET,
                HttpEntity<Any>(header),
                Any::class.java
            )
//        paramとかあればここに追記
        }catch(e :Exception){
            println("APIたたくの失敗した")
            println(e.message)
        }

    }



}