package inflearn.spring_start;

import inflearn.spring_start.repository.JdbcTemplateMemberRepository;
import inflearn.spring_start.repository.JpaMemberRepository;
import inflearn.spring_start.repository.MemberRepository;
import inflearn.spring_start.repository.MemoryMemberRepository;
import inflearn.spring_start.service.MemberService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
}
