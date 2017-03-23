/*
 * generated by Xtext 2.12.0-SNAPSHOT
 */
grammar InternalCBBdemo;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.ericsson.toside.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.ericsson.toside.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.ericsson.toside.services.CBBdemoGrammarAccess;

}

@parser::members {

 	private CBBdemoGrammarAccess grammarAccess;

    public InternalCBBdemoParser(TokenStream input, CBBdemoGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Program";
   	}

   	@Override
   	protected CBBdemoGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0());
			}
			lv_statements_0_0=ruleStatement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getProgramRule());
				}
				add(
					$current,
					"statements",
					lv_statements_0_0,
					"com.ericsson.toside.CBBdemo.Statement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getGreetingParserRuleCall_0());
		}
		this_Greeting_0=ruleGreeting
		{
			$current = $this_Greeting_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getGoodbyeParserRuleCall_1());
		}
		this_Goodbye_1=ruleGoodbye
		{
			$current = $this_Goodbye_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGreeting
entryRuleGreeting returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGreetingRule()); }
	iv_ruleGreeting=ruleGreeting
	{ $current=$iv_ruleGreeting.current; }
	EOF;

// Rule Greeting
ruleGreeting returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Hello'
		{
			newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGreetingRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleGoodbye
entryRuleGoodbye returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGoodbyeRule()); }
	iv_ruleGoodbye=ruleGoodbye
	{ $current=$iv_ruleGoodbye.current; }
	EOF;

// Rule Goodbye
ruleGoodbye returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Bye'
		{
			newLeafNode(otherlv_0, grammarAccess.getGoodbyeAccess().getByeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGoodbyeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGoodbyeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;