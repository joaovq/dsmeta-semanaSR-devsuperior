package com.bloomin.dsmeta.service.impl;

import com.bloomin.dsmeta.entity.Sale;
import com.bloomin.dsmeta.repository.SaleRepository;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl {

    @Value("${twilio.sid}")
    private String twilioSid;

    @Value("${twilio.key}")
    private String twilioKey;

    @Value("${twilio.phone.from}")
    private String twilioPhoneFrom;

    @Value("${twilio.phone.to}")
    private String twilioPhoneTo;

    @Autowired
    private SaleRepository repository;
    public void sendSms(Long id) {

        Sale sale = repository.findById(id).orElseThrow();

        String date = sale.getDate().getMonthValue() +"/" + sale.getDate().getYear();

        String msg = "O vendedor " + sale.getName()+ " foi destaque em "+date+ "com um total de R$ " + String.format("%.2f",sale.getAmount());

        Twilio.init(twilioSid, twilioKey);

        PhoneNumber to = new PhoneNumber(twilioPhoneTo);
        PhoneNumber from = new PhoneNumber(twilioPhoneFrom);

        Message message = Message.creator(to, from, msg).create();

        System.out.println(message.getSid());
    }
}
