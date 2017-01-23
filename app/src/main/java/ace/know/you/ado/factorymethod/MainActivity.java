/*
* 文件名：MainActivity
* 描    述：测试抽象工厂类
* 作    者：Ace
* 时    间：2017-01-23
* 版    权：Ace版权
*/
package ace.know.you.ado.factorymethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ace.factory.FactoryEmail;
import ace.factory.FactorySms;
import ace.factory.Provider;
import ace.product.Sender;
import ace.factory.FactorySend;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        FactorySend factorySend = new FactorySend();
//        factorySend.produce("sms");
//        factorySend.produce("Email");
//        factorySend.produce("apple");
//        Sender sender = FactorySend.produceSmS();
//        sender.send();
//        sender = FactorySend.produceEmail();
//        sender.send();
        Provider provider = new FactorySms();
        Sender sender = provider.produce();
        sender.send();
        provider = new FactoryEmail();
        sender = provider.produce();
        sender.send();

    }
}
