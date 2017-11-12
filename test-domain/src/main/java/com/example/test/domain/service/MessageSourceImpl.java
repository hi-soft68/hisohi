package com.example.test.domain.service;

import java.util.Locale;

import org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Component;

@Component
public class MessageSourceImpl implements MessageSource {

    private MessageSource message = new MessageSourceAutoConfiguration().messageSource();

    public String getMessage(String code) {
        return message.getMessage(code, null, Locale.getDefault());
    }

    public String getMessage(String code, Object[] args) {
        return message.getMessage(code, args, Locale.getDefault());
    }

    /**
     * @inheritDoc
     */
    @Override
    public String getMessage(MessageSourceResolvable arg0, Locale arg1)
            throws NoSuchMessageException {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public String getMessage(String arg0, Object[] arg1, Locale arg2)
            throws NoSuchMessageException {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @inheritDoc
     */
    @Override
    public String getMessage(String arg0, Object[] arg1, String arg2, Locale arg3) {
        // TODO Auto-generated method stub
        return null;
    }

}
