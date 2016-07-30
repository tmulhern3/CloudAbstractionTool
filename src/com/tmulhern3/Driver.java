package com.tmulhern3;

import com.tmulhern3.models.Token;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Tim on 7/30/2016.
 */
public class Driver {
    private static Logger logger = Logger.getLogger(Driver.class.getName());

    public static void main(String[] args) {
        if (args.length != 1) {
            logger.log(Level.SEVERE, "Must specify input source");

            System.exit(1);
        }

        String filename = args[0];
        Lexer lexer = new Lexer(filename);

        Token token;
        while((token = lexer.nextToken()) != null) {
            logger.log(Level.INFO, token.toString());
        }
    }
}