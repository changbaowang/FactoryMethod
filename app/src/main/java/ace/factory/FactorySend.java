/*
* 文件名：FactorySend
* 描    述：Send工厂类
* 作    者：Ace
* 时    间：2017-01-23
* 版    权：Ace版权
*/
package ace.factory;

import android.util.Log;

import ace.product.Sender;
import ace.product.EmailSend;
import ace.product.SmsSend;

public class FactorySend {

    /*
    * 方法名：简单工厂模式之produce
    * 功    能：根据参数,生产不同的商品
    * 参    数：商品类型
    * 返回值：商品
    */
    public  Sender produce(String strSendType) {
        Sender retSender = null;
        //Send工厂根据外界参数产生不同对象
        if (strSendType.toUpperCase().equals("SMS")) {
            retSender = new SmsSend();
        } else if (strSendType.toUpperCase().equals("EMAIL")) {
            retSender = new EmailSend();
        } else {
            Log.d("Factory Method:", "param of produce is error!");
        }
        if (retSender != null) {
            retSender.send();
        }
        return retSender;
    }


    /*
    * 方法名：静态多个工厂模式之produceSmS
    * 功    能：产生Sms
    * 参    数：无
    * 返回值：Sms
    */
    public static Sender produceSmS()
    {
        Sender retSender = null;
        retSender = new SmsSend();
        return retSender;
    }

    /*
   * 方法名：静态多个工厂模式之produceEmail
   * 功    能：产生Email
   * 参    数：无
   * 返回值：Email
   */
    public static Sender produceEmail()
    {
        Sender retSender = null;
        retSender = new EmailSend();
        return  retSender;
    }
}
