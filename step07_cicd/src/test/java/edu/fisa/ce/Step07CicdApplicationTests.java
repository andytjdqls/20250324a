package edu.fisa.ce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Step07CicdApplicationTests {

    // 스프링 부트 애플리케이션이 정상 로드되는지 확인
    @Test
    void contextLoads() {
    }

    // 기능 테스트: 단순한 덧셈 확인
    @Test
    void testAddition() {
        int result = 1 + 3;
        System.out.println("비교 전 ************************************");
        assertEquals(15, result);  // 성공: 5 == 5
        System.out.println("비교 후 ************************************");
    }
}
