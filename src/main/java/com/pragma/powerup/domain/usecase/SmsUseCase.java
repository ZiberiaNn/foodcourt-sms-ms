package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.ISmsServicePort;
import com.pragma.powerup.domain.model.SmsModel;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;

public class SmsUseCase implements ISmsServicePort {
    @Value("${twilio.accountSid}")
    private String accountSID;
    @Value("${twilio.authToken}")
    private String authToken;
    @Value("${twilio.trialNumber}")
    private String phoneNumber;
    @Override
    public String sendSms(SmsModel smsModel) {
        Twilio.init(accountSID,authToken);

        Message.creator(new PhoneNumber(smsModel.getDestinationPhoneNumber()),
                new PhoneNumber(phoneNumber), smsModel.getMessage()).create();
        return "Message sent successfully";
    }
}
