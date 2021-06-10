package org.emp.gl.messages;

public class CryptageCesar extends MessageDecorator{
    public CryptageCesar(IMessage msg) {
        super(msg);
    }

    public static String encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();
            for (int i=0; i<text.length(); i++)
            {   if(Character.isWhitespace(text.charAt(i))){
                result.append(text.charAt(i));
                i++;
                if(i==text.length()){
                    break;
                }
            }
                if (Character.isUpperCase(text.charAt(i)))
                {
                    char ch = (char)(((int)text.charAt(i) +
                            s - 65) % 26 + 65);
                    result.append(ch);
                }
                else
                {
                    char ch = (char)(((int)text.charAt(i) +
                            s - 97) % 26 + 97);
                    result.append(ch);
                }
            }
            return result.toString();
        }

    @Override
    public void setMessage(String message) {
        super.setMessage(encrypt(message,1));
    }
}


