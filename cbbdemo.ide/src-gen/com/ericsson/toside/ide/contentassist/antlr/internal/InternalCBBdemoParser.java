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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCBBdemoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'Bye'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalCBBdemoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCBBdemoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCBBdemoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCBBdemo.g"; }


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



    // $ANTLR start "entryRuleProgram"
    // InternalCBBdemo.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalCBBdemo.g:54:1: ( ruleProgram EOF )
            // InternalCBBdemo.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalCBBdemo.g:62:1: ruleProgram : ( ( rule__Program__StatementsAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBBdemo.g:66:2: ( ( ( rule__Program__StatementsAssignment )* ) )
            // InternalCBBdemo.g:67:2: ( ( rule__Program__StatementsAssignment )* )
            {
            // InternalCBBdemo.g:67:2: ( ( rule__Program__StatementsAssignment )* )
            // InternalCBBdemo.g:68:3: ( rule__Program__StatementsAssignment )*
            {
             before(grammarAccess.getProgramAccess().getStatementsAssignment()); 
            // InternalCBBdemo.g:69:3: ( rule__Program__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCBBdemo.g:69:4: rule__Program__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalCBBdemo.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalCBBdemo.g:79:1: ( ruleStatement EOF )
            // InternalCBBdemo.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalCBBdemo.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBBdemo.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalCBBdemo.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalCBBdemo.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalCBBdemo.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalCBBdemo.g:94:3: ( rule__Statement__Alternatives )
            // InternalCBBdemo.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleGreeting"
    // InternalCBBdemo.g:103:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // InternalCBBdemo.g:104:1: ( ruleGreeting EOF )
            // InternalCBBdemo.g:105:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalCBBdemo.g:112:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBBdemo.g:116:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // InternalCBBdemo.g:117:2: ( ( rule__Greeting__Group__0 ) )
            {
            // InternalCBBdemo.g:117:2: ( ( rule__Greeting__Group__0 ) )
            // InternalCBBdemo.g:118:3: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // InternalCBBdemo.g:119:3: ( rule__Greeting__Group__0 )
            // InternalCBBdemo.g:119:4: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleGoodbye"
    // InternalCBBdemo.g:128:1: entryRuleGoodbye : ruleGoodbye EOF ;
    public final void entryRuleGoodbye() throws RecognitionException {
        try {
            // InternalCBBdemo.g:129:1: ( ruleGoodbye EOF )
            // InternalCBBdemo.g:130:1: ruleGoodbye EOF
            {
             before(grammarAccess.getGoodbyeRule()); 
            pushFollow(FOLLOW_1);
            ruleGoodbye();

            state._fsp--;

             after(grammarAccess.getGoodbyeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoodbye"


    // $ANTLR start "ruleGoodbye"
    // InternalCBBdemo.g:137:1: ruleGoodbye : ( ( rule__Goodbye__Group__0 ) ) ;
    public final void ruleGoodbye() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBBdemo.g:141:2: ( ( ( rule__Goodbye__Group__0 ) ) )
            // InternalCBBdemo.g:142:2: ( ( rule__Goodbye__Group__0 ) )
            {
            // InternalCBBdemo.g:142:2: ( ( rule__Goodbye__Group__0 ) )
            // InternalCBBdemo.g:143:3: ( rule__Goodbye__Group__0 )
            {
             before(grammarAccess.getGoodbyeAccess().getGroup()); 
            // InternalCBBdemo.g:144:3: ( rule__Goodbye__Group__0 )
            // InternalCBBdemo.g:144:4: rule__Goodbye__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Goodbye__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoodbyeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoodbye"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalCBBdemo.g:152:1: rule__Statement__Alternatives : ( ( ruleGreeting ) | ( ruleGoodbye ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBBdemo.g:156:1: ( ( ruleGreeting ) | ( ruleGoodbye ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCBBdemo.g:157:2: ( ruleGreeting )
                    {
                    // InternalCBBdemo.g:157:2: ( ruleGreeting )
                    // InternalCBBdemo.g:158:3: ruleGreeting
                    {
                     before(grammarAccess.getStatementAccess().getGreetingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGreeting();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getGreetingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCBBdemo.g:163:2: ( ruleGoodbye )
                    {
                    // InternalCBBdemo.g:163:2: ( ruleGoodbye )
                    // InternalCBBdemo.g:164:3: ruleGoodbye
                    {
                     before(grammarAccess.getStatementAccess().getGoodbyeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGoodbye();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getGoodbyeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Greeting__Group__0"
    // InternalCBBdemo.g:173:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBBdemo.g:177:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // InternalCBBdemo.g:178:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0"


    // $ANTLR start "rule__Greeting__Group__0__Impl"
    // InternalCBBdemo.g:185:1: rule__Greeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBBdemo.g:189:1: ( ( 'Hello' ) )
            // InternalCBBdemo.g:190:1: ( 'Hello' )
            {
            // InternalCBBdemo.g:190:1: ( 'Hello' )
            // InternalCBBdemo.g:191:2: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0__Impl"


    // $ANTLR start "rule__Greeting__Group__1"
    // InternalCBBdemo.g:200:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBBdemo.g:204:1: ( rule__Greeting__Group__1__Impl )
            // InternalCBBdemo.g:205:2: rule__Greeting__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1"


    // $ANTLR start "rule__Greeting__Group__1__Impl"
    // InternalCBBdemo.g:211:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBBdemo.g:215:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // InternalCBBdemo.g:216:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // InternalCBBdemo.g:216:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // InternalCBBdemo.g:217:2: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // InternalCBBdemo.g:218:2: ( rule__Greeting__NameAssignment_1 )
            // InternalCBBdemo.g:218:3: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1__Impl"


    // $ANTLR start "rule__Goodbye__Group__0"
    // InternalCBBdemo.g:227:1: rule__Goodbye__Group__0 : rule__Goodbye__Group__0__Impl rule__Goodbye__Group__1 ;
    public final void rule__Goodbye__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBBdemo.g:231:1: ( rule__Goodbye__Group__0__Impl rule__Goodbye__Group__1 )
            // InternalCBBdemo.g:232:2: rule__Goodbye__Group__0__Impl rule__Goodbye__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Goodbye__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goodbye__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goodbye__Group__0"


    // $ANTLR start "rule__Goodbye__Group__0__Impl"
    // InternalCBBdemo.g:239:1: rule__Goodbye__Group__0__Impl : ( 'Bye' ) ;
    public final void rule__Goodbye__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBBdemo.g:243:1: ( ( 'Bye' ) )
            // InternalCBBdemo.g:244:1: ( 'Bye' )
            {
            // InternalCBBdemo.g:244:1: ( 'Bye' )
            // InternalCBBdemo.g:245:2: 'Bye'
            {
             before(grammarAccess.getGoodbyeAccess().getByeKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGoodbyeAccess().getByeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goodbye__Group__0__Impl"


    // $ANTLR start "rule__Goodbye__Group__1"
    // InternalCBBdemo.g:254:1: rule__Goodbye__Group__1 : rule__Goodbye__Group__1__Impl ;
    public final void rule__Goodbye__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBBdemo.g:258:1: ( rule__Goodbye__Group__1__Impl )
            // InternalCBBdemo.g:259:2: rule__Goodbye__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goodbye__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goodbye__Group__1"


    // $ANTLR start "rule__Goodbye__Group__1__Impl"
    // InternalCBBdemo.g:265:1: rule__Goodbye__Group__1__Impl : ( ( rule__Goodbye__NameAssignment_1 ) ) ;
    public final void rule__Goodbye__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBBdemo.g:269:1: ( ( ( rule__Goodbye__NameAssignment_1 ) ) )
            // InternalCBBdemo.g:270:1: ( ( rule__Goodbye__NameAssignment_1 ) )
            {
            // InternalCBBdemo.g:270:1: ( ( rule__Goodbye__NameAssignment_1 ) )
            // InternalCBBdemo.g:271:2: ( rule__Goodbye__NameAssignment_1 )
            {
             before(grammarAccess.getGoodbyeAccess().getNameAssignment_1()); 
            // InternalCBBdemo.g:272:2: ( rule__Goodbye__NameAssignment_1 )
            // InternalCBBdemo.g:272:3: rule__Goodbye__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Goodbye__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGoodbyeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goodbye__Group__1__Impl"


    // $ANTLR start "rule__Program__StatementsAssignment"
    // InternalCBBdemo.g:281:1: rule__Program__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Program__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBBdemo.g:285:1: ( ( ruleStatement ) )
            // InternalCBBdemo.g:286:2: ( ruleStatement )
            {
            // InternalCBBdemo.g:286:2: ( ruleStatement )
            // InternalCBBdemo.g:287:3: ruleStatement
            {
             before(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__StatementsAssignment"


    // $ANTLR start "rule__Greeting__NameAssignment_1"
    // InternalCBBdemo.g:296:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBBdemo.g:300:1: ( ( RULE_ID ) )
            // InternalCBBdemo.g:301:2: ( RULE_ID )
            {
            // InternalCBBdemo.g:301:2: ( RULE_ID )
            // InternalCBBdemo.g:302:3: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__NameAssignment_1"


    // $ANTLR start "rule__Goodbye__NameAssignment_1"
    // InternalCBBdemo.g:311:1: rule__Goodbye__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Goodbye__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCBBdemo.g:315:1: ( ( RULE_ID ) )
            // InternalCBBdemo.g:316:2: ( RULE_ID )
            {
            // InternalCBBdemo.g:316:2: ( RULE_ID )
            // InternalCBBdemo.g:317:3: RULE_ID
            {
             before(grammarAccess.getGoodbyeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGoodbyeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goodbye__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});

}