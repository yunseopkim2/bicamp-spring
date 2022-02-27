package member.controller;

import lombok.RequiredArgsConstructor;
import member.domain.CalcDTO;
import member.domain.MemberDTO;
import member.service.MemberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequiredArgsConstructor
    @RequestMapping("/member")
    public class MemberController {

        private final MemberService service;

        @PostMapping("/calc")
        public String calc(@RequestBody CalcDTO calc) {
            return service.calc(calc);
        }
        @PostMapping("/bmi")
        public String bmi(@RequestBody MemberDTO bmi) {
            return service.bmi(bmi);
        }
        @PostMapping("/grade")
        public String grade(@RequestBody MemberDTO grade) {
            return service.grade(grade);
        }
        @PostMapping("/login")
        public String login(@RequestBody MemberDTO login) {
            return service.login(login);
        }



    }

