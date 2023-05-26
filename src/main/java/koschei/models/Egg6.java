package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    @Autowired
    @Override
    public String toString() {
        Needle7 needle7 = new Needle7();
        return ", в яйце иголка " + ""+ needle7.toString();
    }
}
