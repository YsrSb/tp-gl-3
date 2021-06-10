package org.emp.gl.messages;



public class HashSimple extends MessageDecorator {
    public HashSimple(IMessage msg){super(msg);}


    @Override
    public void setMessage(String message)  {
        super.setMessage(message+"-Message Length: "+message.length());
    }
}

