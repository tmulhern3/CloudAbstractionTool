package com.tmulhern3.utils;

import com.tmulhern3.factories.ServerFactory;
import com.tmulhern3.models.resources.Server;
import com.tmulhern3.parser.CloudParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Tim on 8/4/2016.
 */
public class WalkAstUtils {

    private static Logger logger = Logger.getLogger(WalkAstUtils.class.getName());
    private String provider;

    public WalkAstUtils(String provider) {
        this.provider = provider;
    }

    public void walkServerSecDecSeq(ParseTree parseTree, Set<Server> serverSet) {
        if (!(parseTree instanceof CloudParser.Server_dec_seqContext)) {
            throw new RuntimeException("Expected Server_dec_seqContext");
        }
        if (parseTree.getChildCount() != 0) {
            getAttributesFromSecDec(parseTree, serverSet);
            walkServerSecDecSeqPrime(parseTree.getChild(1), serverSet);
        }
    }

    private void walkServerSecDecSeqPrime(ParseTree parseTree, Set<Server> serverSet) {
        if (!(parseTree instanceof CloudParser.Server_dec_seq_primeContext)) {
            throw new RuntimeException("Expected Server_dec_seq_primeContext");
        }
        if (parseTree.getChildCount() != 0) {
            getAttributesFromSecDec(parseTree, serverSet);
            walkServerSecDecSeqPrime(parseTree.getChild(1), serverSet);
        }
    }

    private void getAttributesFromSecDec(ParseTree parseTree, Set<Server> serverSet) {
        if (parseTree.getChildCount() < 2 && !(parseTree.getChild(0) instanceof CloudParser.Server_decContext)) {
            throw new RuntimeException("Expected chile to be server_decContext");
        }
        logger.log(Level.INFO, parseTree.getChild(0).getChild(0) + " " + parseTree.getChild(0).getChild(2));
        if (parseTree.getChild(0).getChild(0).getText().equals("id")) {
            serverSet.add(ServerFactory.buildServer(provider, parseTree.getChild(0).getChild(2).getText()));
        }
    }
}
