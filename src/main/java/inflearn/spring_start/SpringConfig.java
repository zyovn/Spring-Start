package inflearn.spring_start;

import inflearn.spring_start.repository.MemberRepository;
import inflearn.spring_start.repository.MemoryMemberRepository;
import inflearn.spring_start.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
