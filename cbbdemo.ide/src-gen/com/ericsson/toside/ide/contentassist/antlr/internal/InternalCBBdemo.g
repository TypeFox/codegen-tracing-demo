/*
 * generated by Xtext 2.12.0-SNAPSHOT
 */
grammar InternalCBBdemo;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package com.ericsson.toside.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package com.ericsson.toside.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.ericsson.toside.services.CBBdemoGrammarAccess;

}
@parser::members {
	private CBBdemoGrammarAccess grammarAccess;

	public void setGrammarAccess(CBBdemoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleProgram
entryRuleProgram
:
{ before(grammarAccess.getProgramRule()); }
	 ruleProgram
{ after(grammarAccess.getProgramRule()); } 
	 EOF 
;

// Rule Program
ruleProgram 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProgramAccess().getStatementsAssignment()); }
		(rule__Program__StatementsAssignment)*
		{ after(grammarAccess.getProgramAccess().getStatementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStatement
entryRuleStatement
:
{ before(grammarAccess.getStatementRule()); }
	 ruleStatement
{ after(grammarAccess.getStatementRule()); } 
	 EOF 
;

// Rule Statement
ruleStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStatementAccess().getAlternatives()); }
		(rule__Statement__Alternatives)
		{ after(grammarAccess.getStatementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGreeting
entryRuleGreeting
:
{ before(grammarAccess.getGreetingRule()); }
	 ruleGreeting
{ after(grammarAccess.getGreetingRule()); } 
	 EOF 
;

// Rule Greeting
ruleGreeting 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGreetingAccess().getGroup()); }
		(rule__Greeting__Group__0)
		{ after(grammarAccess.getGreetingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGoodbye
entryRuleGoodbye
:
{ before(grammarAccess.getGoodbyeRule()); }
	 ruleGoodbye
{ after(grammarAccess.getGoodbyeRule()); } 
	 EOF 
;

// Rule Goodbye
ruleGoodbye 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGoodbyeAccess().getGroup()); }
		(rule__Goodbye__Group__0)
		{ after(grammarAccess.getGoodbyeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatementAccess().getGreetingParserRuleCall_0()); }
		ruleGreeting
		{ after(grammarAccess.getStatementAccess().getGreetingParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getStatementAccess().getGoodbyeParserRuleCall_1()); }
		ruleGoodbye
		{ after(grammarAccess.getStatementAccess().getGoodbyeParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group__0__Impl
	rule__Greeting__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); }
	'Hello'
	{ after(grammarAccess.getGreetingAccess().getHelloKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getNameAssignment_1()); }
	(rule__Greeting__NameAssignment_1)
	{ after(grammarAccess.getGreetingAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Goodbye__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Goodbye__Group__0__Impl
	rule__Goodbye__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Goodbye__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoodbyeAccess().getByeKeyword_0()); }
	'Bye'
	{ after(grammarAccess.getGoodbyeAccess().getByeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Goodbye__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Goodbye__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Goodbye__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoodbyeAccess().getNameAssignment_1()); }
	(rule__Goodbye__NameAssignment_1)
	{ after(grammarAccess.getGoodbyeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Program__StatementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); }
		ruleStatement
		{ after(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Goodbye__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGoodbyeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGoodbyeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;