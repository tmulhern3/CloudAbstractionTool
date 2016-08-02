grammar Cloud;

program  : BEGIN provider statement_sequence END;
provider : PROVIDER EQ ID;

statement_sequence : statement statement_sequence_prime;
statement_sequence_prime : statement statement_sequence_prime |;

statement : SERVER EQ LPAREN server_dec_seq RPAREN;

server_dec_seq : server_dec server_dec_seq_prime;
server_dec_seq_prime : server_dec server_dec_seq_prime |;

server_dec : ID EQ ID;

BEGIN      : 'begin';
END        : 'end';
SERVER     : 'server';
PROVIDER   : 'provider';
EQ         : '=';
LPAREN     : '(';
RPAREN     : ')';
ID         : ('a'..'z')+;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;