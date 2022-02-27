package member.service;

import member.domain.CalcDTO;
import member.domain.MemberDTO;

public class MemberServiceImpl implements MemberService{
    @Override
    public String calc(CalcDTO calc) {
        int a = calc.getNum1();
        int b = calc.getNum2();
        int res = 0;
        String op = calc.getOpcode();
        switch (op) {
            case "+" : res = a + b; break;
            case "-" : res = a - b; break;
            case "*" : res = a * b; break;
            case "/" : res = a / b; break;
            case "%" : res = a % b; break;
        }
        return String.format("%d %s %d = %d", a, op, b, res);
    }

    @Override
    public String bmi(MemberDTO bmi) {
        String name = bmi.getName();
        double height = bmi.getHeight();
        double weight = bmi.getWeight();
        return String.format("이름:%s 키:%f 몸무게:%f", name, height, weight);
    }

    @Override
    public String grade(MemberDTO grade) {
        String name = grade.getName();
        int kor = grade.getKor();
        int eng = grade.getEng();
        int math = grade.getMath();
        return String.format("이름:%s 국어점수:%d점 영어점수:%d점 수학점수:%d점", name, kor, eng, math);
    }

    @Override
    public String login(MemberDTO login) {
        String userId = login.getUserId();
        String password = login.getPassword();
        return String.format("ID:%s, PW:%s  로그인 성공",userId, password);
    }
}
