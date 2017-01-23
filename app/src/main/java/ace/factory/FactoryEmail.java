package ace.factory;

import ace.product.EmailSend;
import ace.product.Sender;

/**
 * Created by Ace on 17/1/23.
 */
public class FactoryEmail implements Provider {
    @Override
    public Sender produce() {
        return new EmailSend();
    }
}
