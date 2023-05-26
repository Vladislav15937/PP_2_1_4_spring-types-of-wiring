package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {
    @Autowired
    @Override
    public String toString() {
        Egg6 egg6 = new Egg6();
        return ", в утке яйцо " + ""+ egg6.toString();
    }
}
