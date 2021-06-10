package org.emp.gl.messages;

import java.util.Locale;

public class RemoveSpaces extends MessageDecorator {
    public RemoveSpaces(IMessage msg){super(msg);}


    @Override
    public void setMessage(String message)  {
        super.setMessage(message.replaceAll("\\s",""));
    }

}
