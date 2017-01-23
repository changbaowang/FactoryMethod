/*
* 文件名：EmailSend
* 描    述：邮件类
* 作    者：Ace
* 时    间：2017-01-23
* 版    权：Ace版权
*/
package ace.product;

import android.util.Log;

public class EmailSend implements Sender {

    /*
    * 方法名：send()
    * 功    能：发送信息
    * 参    数：无
    * 返回值：无
    */
    @Override
    public void send() {
        Log.d("Factory Method:", "Email is sending!");

    }
}
