package com.demo.emailSend.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Setter
public class MailerInfo {

    private String emailId;
    private String subject;
    private String body;
}
