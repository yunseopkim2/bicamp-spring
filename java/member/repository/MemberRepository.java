package member.repository;


import member.domain.CalcDTO;
import member.domain.MemberDTO;

public interface MemberRepository {
    String calc(CalcDTO calc);

    String bmi(MemberDTO bmi);

    String grade(MemberDTO grade);

    String login(MemberDTO login);
}
