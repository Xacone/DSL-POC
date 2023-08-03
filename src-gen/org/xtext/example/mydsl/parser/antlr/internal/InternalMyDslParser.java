package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VALID_ID", "RULE_STRING", "RULE_LETTER", "RULE_DIGIT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'identify'", "','", "'on'", "'apply'", "'scan'", "'report'", "'\\n'", "'{'", "'}'", "'instance'", "'repo'", "'project'", "'file'", "'token '", "'\\t'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=8;
    public static final int RULE_WS=12;
    public static final int RULE_DIGIT=7;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_LETTER=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__22=22;
    public static final int RULE_VALID_ID=4;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_tokens_0_0= ruleapi_token ) ) | ( (lv_arrays_1_0= rulearray ) ) | ( (lv_loops_2_0= ruleloop ) ) | ( (lv_identifications_3_0= ruleidentify ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_tokens_0_0 = null;

        EObject lv_arrays_1_0 = null;

        AntlrDatatypeRuleToken lv_loops_2_0 = null;

        EObject lv_identifications_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_tokens_0_0= ruleapi_token ) ) | ( (lv_arrays_1_0= rulearray ) ) | ( (lv_loops_2_0= ruleloop ) ) | ( (lv_identifications_3_0= ruleidentify ) ) )* )
            // InternalMyDsl.g:78:2: ( ( (lv_tokens_0_0= ruleapi_token ) ) | ( (lv_arrays_1_0= rulearray ) ) | ( (lv_loops_2_0= ruleloop ) ) | ( (lv_identifications_3_0= ruleidentify ) ) )*
            {
            // InternalMyDsl.g:78:2: ( ( (lv_tokens_0_0= ruleapi_token ) ) | ( (lv_arrays_1_0= rulearray ) ) | ( (lv_loops_2_0= ruleloop ) ) | ( (lv_identifications_3_0= ruleidentify ) ) )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 27:
                    {
                    alt1=1;
                    }
                    break;
                case 23:
                case 24:
                case 25:
                case 26:
                    {
                    alt1=2;
                    }
                    break;
                case 16:
                    {
                    alt1=3;
                    }
                    break;
                case 14:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: ( (lv_tokens_0_0= ruleapi_token ) )
            	    {
            	    // InternalMyDsl.g:79:3: ( (lv_tokens_0_0= ruleapi_token ) )
            	    // InternalMyDsl.g:80:4: (lv_tokens_0_0= ruleapi_token )
            	    {
            	    // InternalMyDsl.g:80:4: (lv_tokens_0_0= ruleapi_token )
            	    // InternalMyDsl.g:81:5: lv_tokens_0_0= ruleapi_token
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTokensApi_tokenParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_tokens_0_0=ruleapi_token();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tokens",
            	    						lv_tokens_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.api_token");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:99:3: ( (lv_arrays_1_0= rulearray ) )
            	    {
            	    // InternalMyDsl.g:99:3: ( (lv_arrays_1_0= rulearray ) )
            	    // InternalMyDsl.g:100:4: (lv_arrays_1_0= rulearray )
            	    {
            	    // InternalMyDsl.g:100:4: (lv_arrays_1_0= rulearray )
            	    // InternalMyDsl.g:101:5: lv_arrays_1_0= rulearray
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getArraysArrayParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_arrays_1_0=rulearray();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"arrays",
            	    						lv_arrays_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.array");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:119:3: ( (lv_loops_2_0= ruleloop ) )
            	    {
            	    // InternalMyDsl.g:119:3: ( (lv_loops_2_0= ruleloop ) )
            	    // InternalMyDsl.g:120:4: (lv_loops_2_0= ruleloop )
            	    {
            	    // InternalMyDsl.g:120:4: (lv_loops_2_0= ruleloop )
            	    // InternalMyDsl.g:121:5: lv_loops_2_0= ruleloop
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getLoopsLoopParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_loops_2_0=ruleloop();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"loops",
            	    						lv_loops_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.loop");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:139:3: ( (lv_identifications_3_0= ruleidentify ) )
            	    {
            	    // InternalMyDsl.g:139:3: ( (lv_identifications_3_0= ruleidentify ) )
            	    // InternalMyDsl.g:140:4: (lv_identifications_3_0= ruleidentify )
            	    {
            	    // InternalMyDsl.g:140:4: (lv_identifications_3_0= ruleidentify )
            	    // InternalMyDsl.g:141:5: lv_identifications_3_0= ruleidentify
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getIdentificationsIdentifyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_identifications_3_0=ruleidentify();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"identifications",
            	    						lv_identifications_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.identify");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleidentify"
    // InternalMyDsl.g:162:1: entryRuleidentify returns [EObject current=null] : iv_ruleidentify= ruleidentify EOF ;
    public final EObject entryRuleidentify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentify = null;


        try {
            // InternalMyDsl.g:162:49: (iv_ruleidentify= ruleidentify EOF )
            // InternalMyDsl.g:163:2: iv_ruleidentify= ruleidentify EOF
            {
             newCompositeNode(grammarAccess.getIdentifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleidentify=ruleidentify();

            state._fsp--;

             current =iv_ruleidentify; 
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
    // $ANTLR end "entryRuleidentify"


    // $ANTLR start "ruleidentify"
    // InternalMyDsl.g:169:1: ruleidentify returns [EObject current=null] : (otherlv_0= 'identify' ( ( (lv_identify_array_1_0= rulearray_content ) ) | this_arrayElement_2= rulearrayElement ) (otherlv_3= ',' ( (lv_identify_array_4_0= rulearray_content ) ) )* ) ;
    public final EObject ruleidentify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_identify_array_1_0 = null;

        EObject this_arrayElement_2 = null;

        EObject lv_identify_array_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:175:2: ( (otherlv_0= 'identify' ( ( (lv_identify_array_1_0= rulearray_content ) ) | this_arrayElement_2= rulearrayElement ) (otherlv_3= ',' ( (lv_identify_array_4_0= rulearray_content ) ) )* ) )
            // InternalMyDsl.g:176:2: (otherlv_0= 'identify' ( ( (lv_identify_array_1_0= rulearray_content ) ) | this_arrayElement_2= rulearrayElement ) (otherlv_3= ',' ( (lv_identify_array_4_0= rulearray_content ) ) )* )
            {
            // InternalMyDsl.g:176:2: (otherlv_0= 'identify' ( ( (lv_identify_array_1_0= rulearray_content ) ) | this_arrayElement_2= rulearrayElement ) (otherlv_3= ',' ( (lv_identify_array_4_0= rulearray_content ) ) )* )
            // InternalMyDsl.g:177:3: otherlv_0= 'identify' ( ( (lv_identify_array_1_0= rulearray_content ) ) | this_arrayElement_2= rulearrayElement ) (otherlv_3= ',' ( (lv_identify_array_4_0= rulearray_content ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIdentifyAccess().getIdentifyKeyword_0());
            		
            // InternalMyDsl.g:181:3: ( ( (lv_identify_array_1_0= rulearray_content ) ) | this_arrayElement_2= rulearrayElement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:182:4: ( (lv_identify_array_1_0= rulearray_content ) )
                    {
                    // InternalMyDsl.g:182:4: ( (lv_identify_array_1_0= rulearray_content ) )
                    // InternalMyDsl.g:183:5: (lv_identify_array_1_0= rulearray_content )
                    {
                    // InternalMyDsl.g:183:5: (lv_identify_array_1_0= rulearray_content )
                    // InternalMyDsl.g:184:6: lv_identify_array_1_0= rulearray_content
                    {

                    						newCompositeNode(grammarAccess.getIdentifyAccess().getIdentify_arrayArray_contentParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_identify_array_1_0=rulearray_content();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIdentifyRule());
                    						}
                    						add(
                    							current,
                    							"identify_array",
                    							lv_identify_array_1_0,
                    							"org.xtext.example.mydsl.MyDsl.array_content");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:202:4: this_arrayElement_2= rulearrayElement
                    {

                    				newCompositeNode(grammarAccess.getIdentifyAccess().getArrayElementParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_arrayElement_2=rulearrayElement();

                    state._fsp--;


                    				current = this_arrayElement_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:211:3: (otherlv_3= ',' ( (lv_identify_array_4_0= rulearray_content ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:212:4: otherlv_3= ',' ( (lv_identify_array_4_0= rulearray_content ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getIdentifyAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:216:4: ( (lv_identify_array_4_0= rulearray_content ) )
            	    // InternalMyDsl.g:217:5: (lv_identify_array_4_0= rulearray_content )
            	    {
            	    // InternalMyDsl.g:217:5: (lv_identify_array_4_0= rulearray_content )
            	    // InternalMyDsl.g:218:6: lv_identify_array_4_0= rulearray_content
            	    {

            	    						newCompositeNode(grammarAccess.getIdentifyAccess().getIdentify_arrayArray_contentParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_identify_array_4_0=rulearray_content();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIdentifyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"identify_array",
            	    							lv_identify_array_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.array_content");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleidentify"


    // $ANTLR start "entryRuleloop"
    // InternalMyDsl.g:240:1: entryRuleloop returns [String current=null] : iv_ruleloop= ruleloop EOF ;
    public final String entryRuleloop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleloop = null;


        try {
            // InternalMyDsl.g:240:44: (iv_ruleloop= ruleloop EOF )
            // InternalMyDsl.g:241:2: iv_ruleloop= ruleloop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleloop=ruleloop();

            state._fsp--;

             current =iv_ruleloop.getText(); 
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
    // $ANTLR end "entryRuleloop"


    // $ANTLR start "ruleloop"
    // InternalMyDsl.g:247:1: ruleloop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'on' this_VALID_ID_1= RULE_VALID_ID this_do_2= ruledo this_linejump_3= rulelinejump this_linespace_4= rulelinespace ) ;
    public final AntlrDatatypeRuleToken ruleloop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_VALID_ID_1=null;
        AntlrDatatypeRuleToken this_do_2 = null;

        AntlrDatatypeRuleToken this_linejump_3 = null;

        AntlrDatatypeRuleToken this_linespace_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:253:2: ( (kw= 'on' this_VALID_ID_1= RULE_VALID_ID this_do_2= ruledo this_linejump_3= rulelinejump this_linespace_4= rulelinespace ) )
            // InternalMyDsl.g:254:2: (kw= 'on' this_VALID_ID_1= RULE_VALID_ID this_do_2= ruledo this_linejump_3= rulelinejump this_linespace_4= rulelinespace )
            {
            // InternalMyDsl.g:254:2: (kw= 'on' this_VALID_ID_1= RULE_VALID_ID this_do_2= ruledo this_linejump_3= rulelinejump this_linespace_4= rulelinespace )
            // InternalMyDsl.g:255:3: kw= 'on' this_VALID_ID_1= RULE_VALID_ID this_do_2= ruledo this_linejump_3= rulelinejump this_linespace_4= rulelinespace
            {
            kw=(Token)match(input,16,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLoopAccess().getOnKeyword_0());
            		
            this_VALID_ID_1=(Token)match(input,RULE_VALID_ID,FOLLOW_8); 

            			current.merge(this_VALID_ID_1);
            		

            			newLeafNode(this_VALID_ID_1, grammarAccess.getLoopAccess().getVALID_IDTerminalRuleCall_1());
            		

            			newCompositeNode(grammarAccess.getLoopAccess().getDoParserRuleCall_2());
            		
            pushFollow(FOLLOW_9);
            this_do_2=ruledo();

            state._fsp--;


            			current.merge(this_do_2);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getLoopAccess().getLinejumpParserRuleCall_3());
            		
            pushFollow(FOLLOW_10);
            this_linejump_3=rulelinejump();

            state._fsp--;


            			current.merge(this_linejump_3);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getLoopAccess().getLinespaceParserRuleCall_4());
            		
            pushFollow(FOLLOW_2);
            this_linespace_4=rulelinespace();

            state._fsp--;


            			current.merge(this_linespace_4);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleloop"


    // $ANTLR start "entryRuledo"
    // InternalMyDsl.g:301:1: entryRuledo returns [String current=null] : iv_ruledo= ruledo EOF ;
    public final String entryRuledo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledo = null;


        try {
            // InternalMyDsl.g:301:42: (iv_ruledo= ruledo EOF )
            // InternalMyDsl.g:302:2: iv_ruledo= ruledo EOF
            {
             newCompositeNode(grammarAccess.getDoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledo=ruledo();

            state._fsp--;

             current =iv_ruledo.getText(); 
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
    // $ANTLR end "entryRuledo"


    // $ANTLR start "ruledo"
    // InternalMyDsl.g:308:1: ruledo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_apply_0= ruleapply ;
    public final AntlrDatatypeRuleToken ruledo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_apply_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:314:2: (this_apply_0= ruleapply )
            // InternalMyDsl.g:315:2: this_apply_0= ruleapply
            {

            		newCompositeNode(grammarAccess.getDoAccess().getApplyParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_apply_0=ruleapply();

            state._fsp--;


            		current.merge(this_apply_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruledo"


    // $ANTLR start "entryRuleapply"
    // InternalMyDsl.g:328:1: entryRuleapply returns [String current=null] : iv_ruleapply= ruleapply EOF ;
    public final String entryRuleapply() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleapply = null;


        try {
            // InternalMyDsl.g:328:45: (iv_ruleapply= ruleapply EOF )
            // InternalMyDsl.g:329:2: iv_ruleapply= ruleapply EOF
            {
             newCompositeNode(grammarAccess.getApplyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleapply=ruleapply();

            state._fsp--;

             current =iv_ruleapply.getText(); 
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
    // $ANTLR end "entryRuleapply"


    // $ANTLR start "ruleapply"
    // InternalMyDsl.g:335:1: ruleapply returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'apply' this_action_1= ruleaction ) ;
    public final AntlrDatatypeRuleToken ruleapply() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_action_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:341:2: ( (kw= 'apply' this_action_1= ruleaction ) )
            // InternalMyDsl.g:342:2: (kw= 'apply' this_action_1= ruleaction )
            {
            // InternalMyDsl.g:342:2: (kw= 'apply' this_action_1= ruleaction )
            // InternalMyDsl.g:343:3: kw= 'apply' this_action_1= ruleaction
            {
            kw=(Token)match(input,17,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getApplyAccess().getApplyKeyword_0());
            		

            			newCompositeNode(grammarAccess.getApplyAccess().getActionParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_action_1=ruleaction();

            state._fsp--;


            			current.merge(this_action_1);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleapply"


    // $ANTLR start "entryRuleaction"
    // InternalMyDsl.g:362:1: entryRuleaction returns [String current=null] : iv_ruleaction= ruleaction EOF ;
    public final String entryRuleaction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleaction = null;


        try {
            // InternalMyDsl.g:362:46: (iv_ruleaction= ruleaction EOF )
            // InternalMyDsl.g:363:2: iv_ruleaction= ruleaction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleaction=ruleaction();

            state._fsp--;

             current =iv_ruleaction.getText(); 
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
    // $ANTLR end "entryRuleaction"


    // $ANTLR start "ruleaction"
    // InternalMyDsl.g:369:1: ruleaction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'scan' | kw= 'report' ) this_linejump_2= rulelinejump ) ;
    public final AntlrDatatypeRuleToken ruleaction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_linejump_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:375:2: ( ( (kw= 'scan' | kw= 'report' ) this_linejump_2= rulelinejump ) )
            // InternalMyDsl.g:376:2: ( (kw= 'scan' | kw= 'report' ) this_linejump_2= rulelinejump )
            {
            // InternalMyDsl.g:376:2: ( (kw= 'scan' | kw= 'report' ) this_linejump_2= rulelinejump )
            // InternalMyDsl.g:377:3: (kw= 'scan' | kw= 'report' ) this_linejump_2= rulelinejump
            {
            // InternalMyDsl.g:377:3: (kw= 'scan' | kw= 'report' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:378:4: kw= 'scan'
                    {
                    kw=(Token)match(input,18,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getActionAccess().getScanKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:384:4: kw= 'report'
                    {
                    kw=(Token)match(input,19,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getActionAccess().getReportKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getActionAccess().getLinejumpParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_linejump_2=rulelinejump();

            state._fsp--;


            			current.merge(this_linejump_2);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleaction"


    // $ANTLR start "entryRulearray"
    // InternalMyDsl.g:404:1: entryRulearray returns [EObject current=null] : iv_rulearray= rulearray EOF ;
    public final EObject entryRulearray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray = null;


        try {
            // InternalMyDsl.g:404:46: (iv_rulearray= rulearray EOF )
            // InternalMyDsl.g:405:2: iv_rulearray= rulearray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_rulearray=rulearray();

            state._fsp--;

             current =iv_rulearray; 
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
    // $ANTLR end "entryRulearray"


    // $ANTLR start "rulearray"
    // InternalMyDsl.g:411:1: rulearray returns [EObject current=null] : ( ( (lv_targets_0_0= ruletarget ) ) ( (lv_array_names_1_0= RULE_VALID_ID ) ) ( (lv_array_contents_2_0= rulearray_content ) ) otherlv_3= '\\n' ) ;
    public final EObject rulearray() throws RecognitionException {
        EObject current = null;

        Token lv_array_names_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_targets_0_0 = null;

        EObject lv_array_contents_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:417:2: ( ( ( (lv_targets_0_0= ruletarget ) ) ( (lv_array_names_1_0= RULE_VALID_ID ) ) ( (lv_array_contents_2_0= rulearray_content ) ) otherlv_3= '\\n' ) )
            // InternalMyDsl.g:418:2: ( ( (lv_targets_0_0= ruletarget ) ) ( (lv_array_names_1_0= RULE_VALID_ID ) ) ( (lv_array_contents_2_0= rulearray_content ) ) otherlv_3= '\\n' )
            {
            // InternalMyDsl.g:418:2: ( ( (lv_targets_0_0= ruletarget ) ) ( (lv_array_names_1_0= RULE_VALID_ID ) ) ( (lv_array_contents_2_0= rulearray_content ) ) otherlv_3= '\\n' )
            // InternalMyDsl.g:419:3: ( (lv_targets_0_0= ruletarget ) ) ( (lv_array_names_1_0= RULE_VALID_ID ) ) ( (lv_array_contents_2_0= rulearray_content ) ) otherlv_3= '\\n'
            {
            // InternalMyDsl.g:419:3: ( (lv_targets_0_0= ruletarget ) )
            // InternalMyDsl.g:420:4: (lv_targets_0_0= ruletarget )
            {
            // InternalMyDsl.g:420:4: (lv_targets_0_0= ruletarget )
            // InternalMyDsl.g:421:5: lv_targets_0_0= ruletarget
            {

            					newCompositeNode(grammarAccess.getArrayAccess().getTargetsTargetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_targets_0_0=ruletarget();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrayRule());
            					}
            					add(
            						current,
            						"targets",
            						lv_targets_0_0,
            						"org.xtext.example.mydsl.MyDsl.target");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:438:3: ( (lv_array_names_1_0= RULE_VALID_ID ) )
            // InternalMyDsl.g:439:4: (lv_array_names_1_0= RULE_VALID_ID )
            {
            // InternalMyDsl.g:439:4: (lv_array_names_1_0= RULE_VALID_ID )
            // InternalMyDsl.g:440:5: lv_array_names_1_0= RULE_VALID_ID
            {
            lv_array_names_1_0=(Token)match(input,RULE_VALID_ID,FOLLOW_6); 

            					newLeafNode(lv_array_names_1_0, grammarAccess.getArrayAccess().getArray_namesVALID_IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayRule());
            					}
            					addWithLastConsumed(
            						current,
            						"array_names",
            						lv_array_names_1_0,
            						"org.xtext.example.mydsl.MyDsl.VALID_ID");
            				

            }


            }

            // InternalMyDsl.g:456:3: ( (lv_array_contents_2_0= rulearray_content ) )
            // InternalMyDsl.g:457:4: (lv_array_contents_2_0= rulearray_content )
            {
            // InternalMyDsl.g:457:4: (lv_array_contents_2_0= rulearray_content )
            // InternalMyDsl.g:458:5: lv_array_contents_2_0= rulearray_content
            {

            					newCompositeNode(grammarAccess.getArrayAccess().getArray_contentsArray_contentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_array_contents_2_0=rulearray_content();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrayRule());
            					}
            					add(
            						current,
            						"array_contents",
            						lv_array_contents_2_0,
            						"org.xtext.example.mydsl.MyDsl.array_content");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getLineFeedKeyword_3());
            		

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
    // $ANTLR end "rulearray"


    // $ANTLR start "entryRulearray_content"
    // InternalMyDsl.g:483:1: entryRulearray_content returns [EObject current=null] : iv_rulearray_content= rulearray_content EOF ;
    public final EObject entryRulearray_content() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_content = null;


        try {
            // InternalMyDsl.g:483:54: (iv_rulearray_content= rulearray_content EOF )
            // InternalMyDsl.g:484:2: iv_rulearray_content= rulearray_content EOF
            {
             newCompositeNode(grammarAccess.getArray_contentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulearray_content=rulearray_content();

            state._fsp--;

             current =iv_rulearray_content; 
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
    // $ANTLR end "entryRulearray_content"


    // $ANTLR start "rulearray_content"
    // InternalMyDsl.g:490:1: rulearray_content returns [EObject current=null] : (otherlv_0= '{' ( (lv_Array_1_0= rulearrayElement ) ) (otherlv_2= ',' ( (lv_Array_3_0= rulearrayElement ) ) )* otherlv_4= '}' ) ;
    public final EObject rulearray_content() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_Array_1_0 = null;

        EObject lv_Array_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:496:2: ( (otherlv_0= '{' ( (lv_Array_1_0= rulearrayElement ) ) (otherlv_2= ',' ( (lv_Array_3_0= rulearrayElement ) ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:497:2: (otherlv_0= '{' ( (lv_Array_1_0= rulearrayElement ) ) (otherlv_2= ',' ( (lv_Array_3_0= rulearrayElement ) ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:497:2: (otherlv_0= '{' ( (lv_Array_1_0= rulearrayElement ) ) (otherlv_2= ',' ( (lv_Array_3_0= rulearrayElement ) ) )* otherlv_4= '}' )
            // InternalMyDsl.g:498:3: otherlv_0= '{' ( (lv_Array_1_0= rulearrayElement ) ) (otherlv_2= ',' ( (lv_Array_3_0= rulearrayElement ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getArray_contentAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:502:3: ( (lv_Array_1_0= rulearrayElement ) )
            // InternalMyDsl.g:503:4: (lv_Array_1_0= rulearrayElement )
            {
            // InternalMyDsl.g:503:4: (lv_Array_1_0= rulearrayElement )
            // InternalMyDsl.g:504:5: lv_Array_1_0= rulearrayElement
            {

            					newCompositeNode(grammarAccess.getArray_contentAccess().getArrayArrayElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_Array_1_0=rulearrayElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArray_contentRule());
            					}
            					add(
            						current,
            						"Array",
            						lv_Array_1_0,
            						"org.xtext.example.mydsl.MyDsl.arrayElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:521:3: (otherlv_2= ',' ( (lv_Array_3_0= rulearrayElement ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:522:4: otherlv_2= ',' ( (lv_Array_3_0= rulearrayElement ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArray_contentAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:526:4: ( (lv_Array_3_0= rulearrayElement ) )
            	    // InternalMyDsl.g:527:5: (lv_Array_3_0= rulearrayElement )
            	    {
            	    // InternalMyDsl.g:527:5: (lv_Array_3_0= rulearrayElement )
            	    // InternalMyDsl.g:528:6: lv_Array_3_0= rulearrayElement
            	    {

            	    						newCompositeNode(grammarAccess.getArray_contentAccess().getArrayArrayElementParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_Array_3_0=rulearrayElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArray_contentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Array",
            	    							lv_Array_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.arrayElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArray_contentAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulearray_content"


    // $ANTLR start "entryRulearrayElement"
    // InternalMyDsl.g:554:1: entryRulearrayElement returns [EObject current=null] : iv_rulearrayElement= rulearrayElement EOF ;
    public final EObject entryRulearrayElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearrayElement = null;


        try {
            // InternalMyDsl.g:554:53: (iv_rulearrayElement= rulearrayElement EOF )
            // InternalMyDsl.g:555:2: iv_rulearrayElement= rulearrayElement EOF
            {
             newCompositeNode(grammarAccess.getArrayElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulearrayElement=rulearrayElement();

            state._fsp--;

             current =iv_rulearrayElement; 
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
    // $ANTLR end "entryRulearrayElement"


    // $ANTLR start "rulearrayElement"
    // InternalMyDsl.g:561:1: rulearrayElement returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject rulearrayElement() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:567:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:568:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:568:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:569:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:569:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:570:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getArrayElementAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getArrayElementRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "rulearrayElement"


    // $ANTLR start "entryRuletarget"
    // InternalMyDsl.g:589:1: entryRuletarget returns [String current=null] : iv_ruletarget= ruletarget EOF ;
    public final String entryRuletarget() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletarget = null;


        try {
            // InternalMyDsl.g:589:46: (iv_ruletarget= ruletarget EOF )
            // InternalMyDsl.g:590:2: iv_ruletarget= ruletarget EOF
            {
             newCompositeNode(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletarget=ruletarget();

            state._fsp--;

             current =iv_ruletarget.getText(); 
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
    // $ANTLR end "entryRuletarget"


    // $ANTLR start "ruletarget"
    // InternalMyDsl.g:596:1: ruletarget returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Instance_0= ruleInstance | this_Repo_1= ruleRepo | this_Project_2= ruleProject | this_File_3= ruleFile ) ;
    public final AntlrDatatypeRuleToken ruletarget() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Instance_0 = null;

        AntlrDatatypeRuleToken this_Repo_1 = null;

        AntlrDatatypeRuleToken this_Project_2 = null;

        AntlrDatatypeRuleToken this_File_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:602:2: ( (this_Instance_0= ruleInstance | this_Repo_1= ruleRepo | this_Project_2= ruleProject | this_File_3= ruleFile ) )
            // InternalMyDsl.g:603:2: (this_Instance_0= ruleInstance | this_Repo_1= ruleRepo | this_Project_2= ruleProject | this_File_3= ruleFile )
            {
            // InternalMyDsl.g:603:2: (this_Instance_0= ruleInstance | this_Repo_1= ruleRepo | this_Project_2= ruleProject | this_File_3= ruleFile )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:604:3: this_Instance_0= ruleInstance
                    {

                    			newCompositeNode(grammarAccess.getTargetAccess().getInstanceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Instance_0=ruleInstance();

                    state._fsp--;


                    			current.merge(this_Instance_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:615:3: this_Repo_1= ruleRepo
                    {

                    			newCompositeNode(grammarAccess.getTargetAccess().getRepoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Repo_1=ruleRepo();

                    state._fsp--;


                    			current.merge(this_Repo_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:626:3: this_Project_2= ruleProject
                    {

                    			newCompositeNode(grammarAccess.getTargetAccess().getProjectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Project_2=ruleProject();

                    state._fsp--;


                    			current.merge(this_Project_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:637:3: this_File_3= ruleFile
                    {

                    			newCompositeNode(grammarAccess.getTargetAccess().getFileParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_File_3=ruleFile();

                    state._fsp--;


                    			current.merge(this_File_3);
                    		

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
    // $ANTLR end "ruletarget"


    // $ANTLR start "entryRuleInstance"
    // InternalMyDsl.g:651:1: entryRuleInstance returns [String current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final String entryRuleInstance() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInstance = null;


        try {
            // InternalMyDsl.g:651:48: (iv_ruleInstance= ruleInstance EOF )
            // InternalMyDsl.g:652:2: iv_ruleInstance= ruleInstance EOF
            {
             newCompositeNode(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstance=ruleInstance();

            state._fsp--;

             current =iv_ruleInstance.getText(); 
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
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // InternalMyDsl.g:658:1: ruleInstance returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'instance' ;
    public final AntlrDatatypeRuleToken ruleInstance() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:664:2: (kw= 'instance' )
            // InternalMyDsl.g:665:2: kw= 'instance'
            {
            kw=(Token)match(input,23,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getInstanceAccess().getInstanceKeyword());
            	

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
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleRepo"
    // InternalMyDsl.g:673:1: entryRuleRepo returns [String current=null] : iv_ruleRepo= ruleRepo EOF ;
    public final String entryRuleRepo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRepo = null;


        try {
            // InternalMyDsl.g:673:44: (iv_ruleRepo= ruleRepo EOF )
            // InternalMyDsl.g:674:2: iv_ruleRepo= ruleRepo EOF
            {
             newCompositeNode(grammarAccess.getRepoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepo=ruleRepo();

            state._fsp--;

             current =iv_ruleRepo.getText(); 
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
    // $ANTLR end "entryRuleRepo"


    // $ANTLR start "ruleRepo"
    // InternalMyDsl.g:680:1: ruleRepo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'repo' ;
    public final AntlrDatatypeRuleToken ruleRepo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:686:2: (kw= 'repo' )
            // InternalMyDsl.g:687:2: kw= 'repo'
            {
            kw=(Token)match(input,24,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getRepoAccess().getRepoKeyword());
            	

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
    // $ANTLR end "ruleRepo"


    // $ANTLR start "entryRuleProject"
    // InternalMyDsl.g:695:1: entryRuleProject returns [String current=null] : iv_ruleProject= ruleProject EOF ;
    public final String entryRuleProject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProject = null;


        try {
            // InternalMyDsl.g:695:47: (iv_ruleProject= ruleProject EOF )
            // InternalMyDsl.g:696:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject.getText(); 
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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalMyDsl.g:702:1: ruleProject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'project' ;
    public final AntlrDatatypeRuleToken ruleProject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:708:2: (kw= 'project' )
            // InternalMyDsl.g:709:2: kw= 'project'
            {
            kw=(Token)match(input,25,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getProjectAccess().getProjectKeyword());
            	

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleFile"
    // InternalMyDsl.g:717:1: entryRuleFile returns [String current=null] : iv_ruleFile= ruleFile EOF ;
    public final String entryRuleFile() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFile = null;


        try {
            // InternalMyDsl.g:717:44: (iv_ruleFile= ruleFile EOF )
            // InternalMyDsl.g:718:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile.getText(); 
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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalMyDsl.g:724:1: ruleFile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'file' ;
    public final AntlrDatatypeRuleToken ruleFile() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:730:2: (kw= 'file' )
            // InternalMyDsl.g:731:2: kw= 'file'
            {
            kw=(Token)match(input,26,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFileAccess().getFileKeyword());
            	

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
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleapi_token"
    // InternalMyDsl.g:739:1: entryRuleapi_token returns [EObject current=null] : iv_ruleapi_token= ruleapi_token EOF ;
    public final EObject entryRuleapi_token() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleapi_token = null;


        try {
            // InternalMyDsl.g:739:50: (iv_ruleapi_token= ruleapi_token EOF )
            // InternalMyDsl.g:740:2: iv_ruleapi_token= ruleapi_token EOF
            {
             newCompositeNode(grammarAccess.getApi_tokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleapi_token=ruleapi_token();

            state._fsp--;

             current =iv_ruleapi_token; 
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
    // $ANTLR end "entryRuleapi_token"


    // $ANTLR start "ruleapi_token"
    // InternalMyDsl.g:746:1: ruleapi_token returns [EObject current=null] : (otherlv_0= 'token ' ( (lv_nom_token_1_0= RULE_VALID_ID ) ) ( (lv_token_2_0= RULE_STRING ) ) ( rulelinejump )* ) ;
    public final EObject ruleapi_token() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_token_1_0=null;
        Token lv_token_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:752:2: ( (otherlv_0= 'token ' ( (lv_nom_token_1_0= RULE_VALID_ID ) ) ( (lv_token_2_0= RULE_STRING ) ) ( rulelinejump )* ) )
            // InternalMyDsl.g:753:2: (otherlv_0= 'token ' ( (lv_nom_token_1_0= RULE_VALID_ID ) ) ( (lv_token_2_0= RULE_STRING ) ) ( rulelinejump )* )
            {
            // InternalMyDsl.g:753:2: (otherlv_0= 'token ' ( (lv_nom_token_1_0= RULE_VALID_ID ) ) ( (lv_token_2_0= RULE_STRING ) ) ( rulelinejump )* )
            // InternalMyDsl.g:754:3: otherlv_0= 'token ' ( (lv_nom_token_1_0= RULE_VALID_ID ) ) ( (lv_token_2_0= RULE_STRING ) ) ( rulelinejump )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getApi_tokenAccess().getTokenKeyword_0());
            		
            // InternalMyDsl.g:758:3: ( (lv_nom_token_1_0= RULE_VALID_ID ) )
            // InternalMyDsl.g:759:4: (lv_nom_token_1_0= RULE_VALID_ID )
            {
            // InternalMyDsl.g:759:4: (lv_nom_token_1_0= RULE_VALID_ID )
            // InternalMyDsl.g:760:5: lv_nom_token_1_0= RULE_VALID_ID
            {
            lv_nom_token_1_0=(Token)match(input,RULE_VALID_ID,FOLLOW_13); 

            					newLeafNode(lv_nom_token_1_0, grammarAccess.getApi_tokenAccess().getNom_tokenVALID_IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApi_tokenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom_token",
            						lv_nom_token_1_0,
            						"org.xtext.example.mydsl.MyDsl.VALID_ID");
            				

            }


            }

            // InternalMyDsl.g:776:3: ( (lv_token_2_0= RULE_STRING ) )
            // InternalMyDsl.g:777:4: (lv_token_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:777:4: (lv_token_2_0= RULE_STRING )
            // InternalMyDsl.g:778:5: lv_token_2_0= RULE_STRING
            {
            lv_token_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_token_2_0, grammarAccess.getApi_tokenAccess().getTokenSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApi_tokenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"token",
            						lv_token_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:794:3: ( rulelinejump )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:795:4: rulelinejump
            	    {

            	    				newCompositeNode(grammarAccess.getApi_tokenAccess().getLinejumpParserRuleCall_3());
            	    			
            	    pushFollow(FOLLOW_14);
            	    rulelinejump();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleapi_token"


    // $ANTLR start "entryRulelinespace"
    // InternalMyDsl.g:807:1: entryRulelinespace returns [String current=null] : iv_rulelinespace= rulelinespace EOF ;
    public final String entryRulelinespace() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelinespace = null;


        try {
            // InternalMyDsl.g:807:49: (iv_rulelinespace= rulelinespace EOF )
            // InternalMyDsl.g:808:2: iv_rulelinespace= rulelinespace EOF
            {
             newCompositeNode(grammarAccess.getLinespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelinespace=rulelinespace();

            state._fsp--;

             current =iv_rulelinespace.getText(); 
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
    // $ANTLR end "entryRulelinespace"


    // $ANTLR start "rulelinespace"
    // InternalMyDsl.g:814:1: rulelinespace returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\t' ;
    public final AntlrDatatypeRuleToken rulelinespace() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:820:2: (kw= '\\t' )
            // InternalMyDsl.g:821:2: kw= '\\t'
            {
            kw=(Token)match(input,28,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getLinespaceAccess().getTabKeyword());
            	

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
    // $ANTLR end "rulelinespace"


    // $ANTLR start "entryRulelinejump"
    // InternalMyDsl.g:829:1: entryRulelinejump returns [String current=null] : iv_rulelinejump= rulelinejump EOF ;
    public final String entryRulelinejump() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelinejump = null;


        try {
            // InternalMyDsl.g:829:48: (iv_rulelinejump= rulelinejump EOF )
            // InternalMyDsl.g:830:2: iv_rulelinejump= rulelinejump EOF
            {
             newCompositeNode(grammarAccess.getLinejumpRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelinejump=rulelinejump();

            state._fsp--;

             current =iv_rulelinejump.getText(); 
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
    // $ANTLR end "entryRulelinejump"


    // $ANTLR start "rulelinejump"
    // InternalMyDsl.g:836:1: rulelinejump returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\n' ;
    public final AntlrDatatypeRuleToken rulelinejump() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:842:2: (kw= '\\n' )
            // InternalMyDsl.g:843:2: kw= '\\n'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getLinejumpAccess().getLineFeedKeyword());
            	

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
    // $ANTLR end "rulelinejump"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000F814002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});

}