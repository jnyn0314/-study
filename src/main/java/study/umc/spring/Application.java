package study.umc.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import study.domain.Review;
import study.domain.mapping.MemberMission;
import study.service.memberMission.MemberMissionService;
import study.service.review.ReviewQueryService;

import java.util.List;

import static study.domain.enums.MemberStatus.ACTIVE;
import static study.domain.enums.MissionStatus.CHALLENGING;

@SpringBootApplication
@EnableJpaAuditing
@EntityScan(basePackages = "study.domain")
@EnableJpaRepositories(basePackages = "study.repository")
@ComponentScan(basePackages = "study")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// 여기에 매번 다르게 설정, 테스트
}
