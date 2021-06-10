package org.emp.gl.messages;

import java.util.Locale;

public class Anonyme extends MessageDecorator {
    public Anonyme(IMessage msg){super(msg);}



    @Override
    public void setSender(String sender) {
        super.setSender("Anonyme");
    }
}
