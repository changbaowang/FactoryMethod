package ace.factory;

import ace.product.Sender;
import ace.product.SmsSend;

/**
 * Created by Ace on 17/1/23.
 */
public class FactorySms implements Provider {
    @Override
    public Sender produce() {
        return new SmsSend();
    }
}
