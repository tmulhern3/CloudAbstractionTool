package com.tmulhern3;

import com.tmulhern3.models.Id;
import com.tmulhern3.models.Token;
import com.tmulhern3.utils.TokenBuilder;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Tim on 7/30/2016.
 */
public class Lexer {
    private Logger logger = Logger.getLogger(Lexer.class.getName());

    private Set<String> reservedWords = new HashSet();
    private TokenBuilder tokenBuilder = new TokenBuilder();
    private BufferedReader bufferedReader;

    public Lexer(String filename) {
        reservedWords.add("begin");
        reservedWords.add("end");
        reservedWords.add("provider");
        reservedWords.add("server");
        reservedWords.add("id");

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Token nextToken() {
        try {
            int c;
            while ((c = bufferedReader.read()) != -1) {
                char peek = (char) c;
                if (peek == 0x20 || peek == 0x0D || peek == 0x0A) {
                    continue;
                }
                if (Character.isLetter(peek)) {
                    StringBuffer sb = new StringBuffer();
                    do {
                        sb.append(peek);
                        peek = (char) bufferedReader.read();
                    } while (Character.isLetterOrDigit(peek));
                    if (reservedWords.contains(sb.toString())) {
                        return tokenBuilder.buildTokenFromReservedWord(sb.toString());
                    }
                    return new Id(sb.toString());
                } else {
                    return tokenBuilder.buildTokenFromCharacter(peek);
                }
            }
        } catch (IOException e) {
            logger.log(Level.WARNING, e.toString());

            return null;
        }

        return null;
    }
}
