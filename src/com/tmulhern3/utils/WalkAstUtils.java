package com.tmulhern3.utils;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Tim on 8/4/2016.
 */
public class WalkAstUtils {

    private static Logger logger = Logger.getLogger(WalkAstUtils.class.getName());

    public static void printVarsInServerDecSeq(ParseTree parseTree) {
        if (parseTree.getChildCount() != 0) {
            logger.log(Level.INFO, parseTree.getChild(0).getChild(0) + " " + parseTree.getChild(0).getChild(2));
            printVarsInServerDecSeq(parseTree.getChild(1));
        }
    }
}
