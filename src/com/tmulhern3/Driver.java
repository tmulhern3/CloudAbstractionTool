package com.tmulhern3;

import com.tmulhern3.utils.CloudBaseListener;
import com.tmulhern3.parser.CloudLexer;
import com.tmulhern3.parser.CloudParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
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

        String fileText = null;
        try {
            fileText = readFile(args[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        CloudLexer cloudLexer = new CloudLexer(new ANTLRInputStream(fileText));
        CommonTokenStream tokens = new CommonTokenStream(cloudLexer);
        CloudParser cloudParser = new CloudParser(tokens);
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(new CloudBaseListener(), cloudParser.program());
    }

    private static String readFile(String path)
            throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, Charset.defaultCharset());
    }
}