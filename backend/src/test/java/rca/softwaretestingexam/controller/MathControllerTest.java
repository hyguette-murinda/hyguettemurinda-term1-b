package rca.softwaretestingexam.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import rca.softwaretestingexam.v1.dtos.DoMathRequestDto;
import rca.softwaretestingexam.v1.payload.ApiResponse;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MathControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void whenRequest_getResponse(){
        DoMathRequestDto dto = new DoMathRequestDto(3, 1, "+");

        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/api/v1/do_math",dto,ApiResponse.class);

        assertEquals(200, response.getStatusCode().value());
    }
    @Test
    public void WhenAdd_returnAddition(){
        DoMathRequestDto dto = new DoMathRequestDto(3, 1, "+");

        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/api/v1/do_math",dto,ApiResponse.class);

        assertEquals(4.0, response.getBody().getData());
    }

    @Test
    public void whenDivide_returnDivision(){
        DoMathRequestDto dto = new DoMathRequestDto(3, 1, "/");

        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/api/v1/do_math",dto,ApiResponse.class);

        assertEquals(3.0, response.getBody().getData());
    }
    @Test
    public void whenMult_returnMultiplication(){
        DoMathRequestDto dto = new DoMathRequestDto(3, 1, "*");

        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/api/v1/do_math",dto,ApiResponse.class);

        assertEquals(3.0, response.getBody().getData());
    }
    @Test
    public void whenSub_returnSubtraction(){
        DoMathRequestDto dto = new DoMathRequestDto(3, 1, "-");

        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/api/v1/do_math",dto,ApiResponse.class);

        assertEquals(2.0, response.getBody().getData());
    }
}
