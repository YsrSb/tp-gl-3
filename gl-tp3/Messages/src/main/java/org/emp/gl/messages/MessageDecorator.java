package org.emp.gl.messages;

import java.security.NoSuchAlgorithmException;

/**
 * Hello world!
 *
 */
public  abstract  class MessageDecorator implements IMessage
{
    IMessage imessage;

    public MessageDecorator(IMessage msg) {
        this.imessage=msg;
    }

    @Override
    public String getTitle() {
        return imessage.getTitle();

    }

    @Override
    public String getSender() {
        return imessage.getSender();
    }

    @Override
    public String getMessage() {
        return imessage.getMessage();
    }

    @Override
    public void setTitle(String title) {
        imessage.setTitle(title);
    }


    @Override
    public void setSender(String sender) {
        imessage.setSender(sender);
    }

    @Override
    public void setMessage(String message)  {
        imessage.setMessage(message);
    }
    public String toString(){
        return imessage.toString();
    }
}
