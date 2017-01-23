package ace.factory;

import ace.product.Sender;

/*
* 文件名：Provider
* 描    述：抽象工厂类类
* 作    者：Ace
* 时    间：2017-01-23
* 版    权：Ace版权
*/
public interface Provider {
    public Sender produce();
}
