package com.demo.emailSend.config;

import com.demo.emailSend.model.MailerInfo;
import com.demo.emailSend.service.MailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmailScheduler {

    @Autowired
    private MailerService mailerService;


    @Scheduled(cron = "* * */2 * * *")
    private void ScheduleEmail(){
        List<String> listofEmail= List.of("xyz@gmail.com","pqr@gmail.com");
        for (String email: listofEmail) {
            MailerInfo mailerInfo=new MailerInfo();
            mailerInfo.setEmailId(email);
            mailerInfo.setSubject("Scheduled Email");
            mailerInfo.setBody("Testing Schedule email");
            mailerService.sendEmail(mailerInfo);
        }

    }


}
