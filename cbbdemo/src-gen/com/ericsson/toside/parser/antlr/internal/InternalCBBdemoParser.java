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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCBBdemoParser extends AbstractInternalAntlrParser {
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




    // $ANTLR start "entryRuleProgram"
    // InternalCBBdemo.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalCBBdemo.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalCBBdemo.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalCBBdemo.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalCBBdemo.g:77:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalCBBdemo.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalCBBdemo.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCBBdemo.g:79:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalCBBdemo.g:79:3: (lv_statements_0_0= ruleStatement )
            	    // InternalCBBdemo.g:80:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"com.ericsson.toside.CBBdemo.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalCBBdemo.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalCBBdemo.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalCBBdemo.g:101:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalCBBdemo.g:107:1: ruleStatement returns [EObject current=null] : (this_Greeting_0= ruleGreeting | this_Goodbye_1= ruleGoodbye ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Greeting_0 = null;

        EObject this_Goodbye_1 = null;



        	enterRule();

        try {
            // InternalCBBdemo.g:113:2: ( (this_Greeting_0= ruleGreeting | this_Goodbye_1= ruleGoodbye ) )
            // InternalCBBdemo.g:114:2: (this_Greeting_0= ruleGreeting | this_Goodbye_1= ruleGoodbye )
            {
            // InternalCBBdemo.g:114:2: (this_Greeting_0= ruleGreeting | this_Goodbye_1= ruleGoodbye )
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
                    // InternalCBBdemo.g:115:3: this_Greeting_0= ruleGreeting
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getGreetingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Greeting_0=ruleGreeting();

                    state._fsp--;


                    			current = this_Greeting_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCBBdemo.g:124:3: this_Goodbye_1= ruleGoodbye
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getGoodbyeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Goodbye_1=ruleGoodbye();

                    state._fsp--;


                    			current = this_Goodbye_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleGreeting"
    // InternalCBBdemo.g:136:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // InternalCBBdemo.g:136:49: (iv_ruleGreeting= ruleGreeting EOF )
            // InternalCBBdemo.g:137:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalCBBdemo.g:143:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCBBdemo.g:149:2: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCBBdemo.g:150:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCBBdemo.g:150:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCBBdemo.g:151:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
            		
            // InternalCBBdemo.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCBBdemo.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCBBdemo.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalCBBdemo.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreetingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleGoodbye"
    // InternalCBBdemo.g:177:1: entryRuleGoodbye returns [EObject current=null] : iv_ruleGoodbye= ruleGoodbye EOF ;
    public final EObject entryRuleGoodbye() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoodbye = null;


        try {
            // InternalCBBdemo.g:177:48: (iv_ruleGoodbye= ruleGoodbye EOF )
            // InternalCBBdemo.g:178:2: iv_ruleGoodbye= ruleGoodbye EOF
            {
             newCompositeNode(grammarAccess.getGoodbyeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoodbye=ruleGoodbye();

            state._fsp--;

             current =iv_ruleGoodbye; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoodbye"


    // $ANTLR start "ruleGoodbye"
    // InternalCBBdemo.g:184:1: ruleGoodbye returns [EObject current=null] : (otherlv_0= 'Bye' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGoodbye() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCBBdemo.g:190:2: ( (otherlv_0= 'Bye' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCBBdemo.g:191:2: (otherlv_0= 'Bye' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCBBdemo.g:191:2: (otherlv_0= 'Bye' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCBBdemo.g:192:3: otherlv_0= 'Bye' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGoodbyeAccess().getByeKeyword_0());
            		
            // InternalCBBdemo.g:196:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCBBdemo.g:197:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCBBdemo.g:197:4: (lv_name_1_0= RULE_ID )
            // InternalCBBdemo.g:198:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGoodbyeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoodbyeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoodbye"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});

}