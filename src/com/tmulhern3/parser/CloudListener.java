package com.tmulhern3.parser;

// Generated from C:\Users\Tim\IdeaProjects\CloudAbstractionTool\resources\Cloud.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CloudParser}.
 */
public interface CloudListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CloudParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CloudParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CloudParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CloudParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CloudParser#provider}.
	 * @param ctx the parse tree
	 */
	void enterProvider(CloudParser.ProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CloudParser#provider}.
	 * @param ctx the parse tree
	 */
	void exitProvider(CloudParser.ProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CloudParser#statement_sequence}.
	 * @param ctx the parse tree
	 */
	void enterStatement_sequence(CloudParser.Statement_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CloudParser#statement_sequence}.
	 * @param ctx the parse tree
	 */
	void exitStatement_sequence(CloudParser.Statement_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CloudParser#statement_sequence_prime}.
	 * @param ctx the parse tree
	 */
	void enterStatement_sequence_prime(CloudParser.Statement_sequence_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CloudParser#statement_sequence_prime}.
	 * @param ctx the parse tree
	 */
	void exitStatement_sequence_prime(CloudParser.Statement_sequence_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CloudParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CloudParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CloudParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CloudParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CloudParser#server_dec_seq}.
	 * @param ctx the parse tree
	 */
	void enterServer_dec_seq(CloudParser.Server_dec_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CloudParser#server_dec_seq}.
	 * @param ctx the parse tree
	 */
	void exitServer_dec_seq(CloudParser.Server_dec_seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CloudParser#server_dec_seq_prime}.
	 * @param ctx the parse tree
	 */
	void enterServer_dec_seq_prime(CloudParser.Server_dec_seq_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CloudParser#server_dec_seq_prime}.
	 * @param ctx the parse tree
	 */
	void exitServer_dec_seq_prime(CloudParser.Server_dec_seq_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CloudParser#server_dec}.
	 * @param ctx the parse tree
	 */
	void enterServer_dec(CloudParser.Server_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link CloudParser#server_dec}.
	 * @param ctx the parse tree
	 */
	void exitServer_dec(CloudParser.Server_decContext ctx);
}