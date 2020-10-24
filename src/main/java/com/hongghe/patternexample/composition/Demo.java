package com.hongghe.patternexample.composition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe
 * @date 2018/8/15
 */
public class Demo {

    private static final Logger LOG = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {
        LOG.info("Message : ");

        LetterComposite orcMessage = new Messenger().messageFromOrcs();
        orcMessage.print();

        LOG.info("Message : ");

        LetterComposite elfMessage = new Messenger().messageFromElves();
        elfMessage.print();
    }
}
