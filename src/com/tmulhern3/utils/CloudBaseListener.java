package com.tmulhern3.utils;

// Generated from C:\Users\Tim\IdeaProjects\CloudAbstractionTool\resources\Cloud.g4 by ANTLR 4.5.3

import com.tmulhern3.Driver;
import com.tmulhern3.exceptions.CompilationException;
import com.tmulhern3.parser.CloudLexer;
import com.tmulhern3.parser.CloudListener;
import com.tmulhern3.parser.CloudParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class provides an empty implementation of {@link CloudListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class CloudBaseListener implements CloudListener {
    private Set<String> serverSet = new HashSet();

    private static Logger logger = Logger.getLogger(CloudBaseListener.class.getName());

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProgram(CloudParser.ProgramContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(CloudParser.ProgramContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProvider(CloudParser.ProviderContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProvider(CloudParser.ProviderContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement_sequence(CloudParser.Statement_sequenceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement_sequence(CloudParser.Statement_sequenceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement_sequence_prime(CloudParser.Statement_sequence_primeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement_sequence_prime(CloudParser.Statement_sequence_primeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(CloudParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(CloudParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterServer_dec_seq(CloudParser.Server_dec_seqContext ctx) {
	    if (ctx.start.getType() == CloudLexer.ID && ctx.start.getText().equals("id")) {
	        if (serverSet.contains(ctx.stop.getText())) {
                fatalError(ctx.stop.getText() + " at line " + ctx.start.getLine() + " is already defined!");
            }
            serverSet.add(ctx.stop.getText());
        } else {
            fatalError("Must specify ID!");
        }
    }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitServer_dec_seq(CloudParser.Server_dec_seqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterServer_dec_seq_prime(CloudParser.Server_dec_seq_primeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitServer_dec_seq_prime(CloudParser.Server_dec_seq_primeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterServer_dec(CloudParser.Server_decContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitServer_dec(CloudParser.Server_decContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }

	private void fatalError(String message) {
	    logger.log(Level.SEVERE, message);
        System.exit(1);
    }
}