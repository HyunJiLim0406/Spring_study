package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core", //탐색할 패키지의 시작 위치
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) //기존 예제 유지하기 위해
) //default는 이 설정 정보 클래스의 패키지가 시작 위치가 됨(여기서는 hello.core)
public class AutoAppConfig {
}