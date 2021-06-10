package org.emp.gl.messages;

import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public class Majiscule extends MessageDecorator {
    public Majiscule(IMessage msg){super(msg);}


    @Override
    public void setMessage(String message)  {
        super.setMessage(message.toUpperCase(Locale.ROOT));
    }
}
