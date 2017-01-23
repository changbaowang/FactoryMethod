/*
* 文件名：SmsSend
* 描    述：短信类
* 作    者：Ace
* 时    间：2017-01-23
* 版    权：Ace版权
*/
package ace.product;

import android.util.Log;


public class SmsSend implements Sender {

    /*
    * 方法名：send()
    * 功    能：发送信息
    * 参    数：无
    * 返回值：无
    */
    @Override
    public void send() {
        Log.d("Factory Method:", "Sms is sending!");//打印日志
    }
}
