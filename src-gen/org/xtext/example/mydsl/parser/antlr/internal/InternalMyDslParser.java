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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VALID_ID", "RULE_STRING", "RULE_LETTER", "RULE_DIGIT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'identify'", "','", "'on'", "'apply'", "'\\n'", "'{'", "'}'", "'instance'", "'repo'", "'project'", "'file'", "'token '", "'\\t'"
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

        EObject lv_loops_2_0 = null;

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
                case 25:
                    {
                    alt1=1;
                    }
                    break;
                case 21:
                case 22:
                case 23:
                case 24:
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

            if ( (LA2_0==19) ) {
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
    // InternalMyDsl.g:240:1: entryRuleloop returns [EObject current=null] : iv_ruleloop= ruleloop EOF ;
    public final EObject entryRuleloop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleloop = null;


        try {
            // InternalMyDsl.g:240:45: (iv_ruleloop= ruleloop EOF )
            // InternalMyDsl.g:241:2: iv_ruleloop= ruleloop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleloop=ruleloop();

            state._fsp--;

             current =iv_ruleloop; 
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
    // InternalMyDsl.g:247:1: ruleloop returns [EObject current=null] : (otherlv_0= 'on' ( (lv_loop_array_1_0= rulearray ) ) ruledo ) ;
    public final EObject ruleloop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_loop_array_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:253:2: ( (otherlv_0= 'on' ( (lv_loop_array_1_0= rulearray ) ) ruledo ) )
            // InternalMyDsl.g:254:2: (otherlv_0= 'on' ( (lv_loop_array_1_0= rulearray ) ) ruledo )
            {
            // InternalMyDsl.g:254:2: (otherlv_0= 'on' ( (lv_loop_array_1_0= rulearray ) ) ruledo )
            // InternalMyDsl.g:255:3: otherlv_0= 'on' ( (lv_loop_array_1_0= rulearray ) ) ruledo
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getOnKeyword_0());
            		
            // InternalMyDsl.g:259:3: ( (lv_loop_array_1_0= rulearray ) )
            // InternalMyDsl.g:260:4: (lv_loop_array_1_0= rulearray )
            {
            // InternalMyDsl.g:260:4: (lv_loop_array_1_0= rulearray )
            // InternalMyDsl.g:261:5: lv_loop_array_1_0= rulearray
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getLoop_arrayArrayParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_loop_array_1_0=rulearray();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					add(
            						current,
            						"loop_array",
            						lv_loop_array_1_0,
            						"org.xtext.example.mydsl.MyDsl.array");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getLoopAccess().getDoParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            ruledo();

            state._fsp--;


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
    // InternalMyDsl.g:289:1: entryRuledo returns [String current=null] : iv_ruledo= ruledo EOF ;
    public final String entryRuledo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledo = null;


        try {
            // InternalMyDsl.g:289:42: (iv_ruledo= ruledo EOF )
            // InternalMyDsl.g:290:2: iv_ruledo= ruledo EOF
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
    // InternalMyDsl.g:296:1: ruledo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_apply_0= ruleapply ;
    public final AntlrDatatypeRuleToken ruledo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_apply_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:302:2: (this_apply_0= ruleapply )
            // InternalMyDsl.g:303:2: this_apply_0= ruleapply
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
    // InternalMyDsl.g:316:1: entryRuleapply returns [String current=null] : iv_ruleapply= ruleapply EOF ;
    public final String entryRuleapply() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleapply = null;


        try {
            // InternalMyDsl.g:316:45: (iv_ruleapply= ruleapply EOF )
            // InternalMyDsl.g:317:2: iv_ruleapply= ruleapply EOF
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
    // InternalMyDsl.g:323:1: ruleapply returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'apply' this_action_1= ruleaction ) ;
    public final AntlrDatatypeRuleToken ruleapply() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_action_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:329:2: ( (kw= 'apply' this_action_1= ruleaction ) )
            // InternalMyDsl.g:330:2: (kw= 'apply' this_action_1= ruleaction )
            {
            // InternalMyDsl.g:330:2: (kw= 'apply' this_action_1= ruleaction )
            // InternalMyDsl.g:331:3: kw= 'apply' this_action_1= ruleaction
            {
            kw=(Token)match(input,17,FOLLOW_9); 

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
    // InternalMyDsl.g:350:1: entryRuleaction returns [String current=null] : iv_ruleaction= ruleaction EOF ;
    public final String entryRuleaction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleaction = null;


        try {
            // InternalMyDsl.g:350:46: (iv_ruleaction= ruleaction EOF )
            // InternalMyDsl.g:351:2: iv_ruleaction= ruleaction EOF
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
    // InternalMyDsl.g:357:1: ruleaction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_linespace_0= rulelinespace ;
    public final AntlrDatatypeRuleToken ruleaction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_linespace_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:363:2: (this_linespace_0= rulelinespace )
            // InternalMyDsl.g:364:2: this_linespace_0= rulelinespace
            {

            		newCompositeNode(grammarAccess.getActionAccess().getLinespaceParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_linespace_0=rulelinespace();

            state._fsp--;


            		current.merge(this_linespace_0);
            	

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
    // $ANTLR end "ruleaction"


    // $ANTLR start "entryRulearray"
    // InternalMyDsl.g:377:1: entryRulearray returns [EObject current=null] : iv_rulearray= rulearray EOF ;
    public final EObject entryRulearray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray = null;


        try {
            // InternalMyDsl.g:377:46: (iv_rulearray= rulearray EOF )
            // InternalMyDsl.g:378:2: iv_rulearray= rulearray EOF
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
    // InternalMyDsl.g:384:1: rulearray returns [EObject current=null] : ( ( (lv_targets_0_0= ruletarget ) ) ( (lv_array_names_1_0= RULE_VALID_ID ) ) ( (lv_array_contents_2_0= rulearray_content ) ) otherlv_3= '\\n' ) ;
    public final EObject rulearray() throws RecognitionException {
        EObject current = null;

        Token lv_array_names_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_targets_0_0 = null;

        EObject lv_array_contents_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:390:2: ( ( ( (lv_targets_0_0= ruletarget ) ) ( (lv_array_names_1_0= RULE_VALID_ID ) ) ( (lv_array_contents_2_0= rulearray_content ) ) otherlv_3= '\\n' ) )
            // InternalMyDsl.g:391:2: ( ( (lv_targets_0_0= ruletarget ) ) ( (lv_array_names_1_0= RULE_VALID_ID ) ) ( (lv_array_contents_2_0= rulearray_content ) ) otherlv_3= '\\n' )
            {
            // InternalMyDsl.g:391:2: ( ( (lv_targets_0_0= ruletarget ) ) ( (lv_array_names_1_0= RULE_VALID_ID ) ) ( (lv_array_contents_2_0= rulearray_content ) ) otherlv_3= '\\n' )
            // InternalMyDsl.g:392:3: ( (lv_targets_0_0= ruletarget ) ) ( (lv_array_names_1_0= RULE_VALID_ID ) ) ( (lv_array_contents_2_0= rulearray_content ) ) otherlv_3= '\\n'
            {
            // InternalMyDsl.g:392:3: ( (lv_targets_0_0= ruletarget ) )
            // InternalMyDsl.g:393:4: (lv_targets_0_0= ruletarget )
            {
            // InternalMyDsl.g:393:4: (lv_targets_0_0= ruletarget )
            // InternalMyDsl.g:394:5: lv_targets_0_0= ruletarget
            {

            					newCompositeNode(grammarAccess.getArrayAccess().getTargetsTargetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalMyDsl.g:411:3: ( (lv_array_names_1_0= RULE_VALID_ID ) )
            // InternalMyDsl.g:412:4: (lv_array_names_1_0= RULE_VALID_ID )
            {
            // InternalMyDsl.g:412:4: (lv_array_names_1_0= RULE_VALID_ID )
            // InternalMyDsl.g:413:5: lv_array_names_1_0= RULE_VALID_ID
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

            // InternalMyDsl.g:429:3: ( (lv_array_contents_2_0= rulearray_content ) )
            // InternalMyDsl.g:430:4: (lv_array_contents_2_0= rulearray_content )
            {
            // InternalMyDsl.g:430:4: (lv_array_contents_2_0= rulearray_content )
            // InternalMyDsl.g:431:5: lv_array_contents_2_0= rulearray_content
            {

            					newCompositeNode(grammarAccess.getArrayAccess().getArray_contentsArray_contentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

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
    // InternalMyDsl.g:456:1: entryRulearray_content returns [EObject current=null] : iv_rulearray_content= rulearray_content EOF ;
    public final EObject entryRulearray_content() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_content = null;


        try {
            // InternalMyDsl.g:456:54: (iv_rulearray_content= rulearray_content EOF )
            // InternalMyDsl.g:457:2: iv_rulearray_content= rulearray_content EOF
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
    // InternalMyDsl.g:463:1: rulearray_content returns [EObject current=null] : (otherlv_0= '{' ( (lv_Array_1_0= rulearrayElement ) ) (otherlv_2= ',' ( (lv_Array_3_0= rulearrayElement ) ) )* otherlv_4= '}' ) ;
    public final EObject rulearray_content() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_Array_1_0 = null;

        EObject lv_Array_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:469:2: ( (otherlv_0= '{' ( (lv_Array_1_0= rulearrayElement ) ) (otherlv_2= ',' ( (lv_Array_3_0= rulearrayElement ) ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:470:2: (otherlv_0= '{' ( (lv_Array_1_0= rulearrayElement ) ) (otherlv_2= ',' ( (lv_Array_3_0= rulearrayElement ) ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:470:2: (otherlv_0= '{' ( (lv_Array_1_0= rulearrayElement ) ) (otherlv_2= ',' ( (lv_Array_3_0= rulearrayElement ) ) )* otherlv_4= '}' )
            // InternalMyDsl.g:471:3: otherlv_0= '{' ( (lv_Array_1_0= rulearrayElement ) ) (otherlv_2= ',' ( (lv_Array_3_0= rulearrayElement ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getArray_contentAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:475:3: ( (lv_Array_1_0= rulearrayElement ) )
            // InternalMyDsl.g:476:4: (lv_Array_1_0= rulearrayElement )
            {
            // InternalMyDsl.g:476:4: (lv_Array_1_0= rulearrayElement )
            // InternalMyDsl.g:477:5: lv_Array_1_0= rulearrayElement
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

            // InternalMyDsl.g:494:3: (otherlv_2= ',' ( (lv_Array_3_0= rulearrayElement ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:495:4: otherlv_2= ',' ( (lv_Array_3_0= rulearrayElement ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArray_contentAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:499:4: ( (lv_Array_3_0= rulearrayElement ) )
            	    // InternalMyDsl.g:500:5: (lv_Array_3_0= rulearrayElement )
            	    {
            	    // InternalMyDsl.g:500:5: (lv_Array_3_0= rulearrayElement )
            	    // InternalMyDsl.g:501:6: lv_Array_3_0= rulearrayElement
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
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalMyDsl.g:527:1: entryRulearrayElement returns [EObject current=null] : iv_rulearrayElement= rulearrayElement EOF ;
    public final EObject entryRulearrayElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearrayElement = null;


        try {
            // InternalMyDsl.g:527:53: (iv_rulearrayElement= rulearrayElement EOF )
            // InternalMyDsl.g:528:2: iv_rulearrayElement= rulearrayElement EOF
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
    // InternalMyDsl.g:534:1: rulearrayElement returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject rulearrayElement() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:540:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:541:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:541:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:542:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:542:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:543:4: lv_value_0_0= RULE_STRING
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
    // InternalMyDsl.g:562:1: entryRuletarget returns [String current=null] : iv_ruletarget= ruletarget EOF ;
    public final String entryRuletarget() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletarget = null;


        try {
            // InternalMyDsl.g:562:46: (iv_ruletarget= ruletarget EOF )
            // InternalMyDsl.g:563:2: iv_ruletarget= ruletarget EOF
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
    // InternalMyDsl.g:569:1: ruletarget returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Instance_0= ruleInstance | this_Repo_1= ruleRepo | this_Project_2= ruleProject | this_File_3= ruleFile ) ;
    public final AntlrDatatypeRuleToken ruletarget() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Instance_0 = null;

        AntlrDatatypeRuleToken this_Repo_1 = null;

        AntlrDatatypeRuleToken this_Project_2 = null;

        AntlrDatatypeRuleToken this_File_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:575:2: ( (this_Instance_0= ruleInstance | this_Repo_1= ruleRepo | this_Project_2= ruleProject | this_File_3= ruleFile ) )
            // InternalMyDsl.g:576:2: (this_Instance_0= ruleInstance | this_Repo_1= ruleRepo | this_Project_2= ruleProject | this_File_3= ruleFile )
            {
            // InternalMyDsl.g:576:2: (this_Instance_0= ruleInstance | this_Repo_1= ruleRepo | this_Project_2= ruleProject | this_File_3= ruleFile )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case 24:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:577:3: this_Instance_0= ruleInstance
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
                    // InternalMyDsl.g:588:3: this_Repo_1= ruleRepo
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
                    // InternalMyDsl.g:599:3: this_Project_2= ruleProject
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
                    // InternalMyDsl.g:610:3: this_File_3= ruleFile
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
    // InternalMyDsl.g:624:1: entryRuleInstance returns [String current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final String entryRuleInstance() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInstance = null;


        try {
            // InternalMyDsl.g:624:48: (iv_ruleInstance= ruleInstance EOF )
            // InternalMyDsl.g:625:2: iv_ruleInstance= ruleInstance EOF
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
    // InternalMyDsl.g:631:1: ruleInstance returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'instance' ;
    public final AntlrDatatypeRuleToken ruleInstance() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:637:2: (kw= 'instance' )
            // InternalMyDsl.g:638:2: kw= 'instance'
            {
            kw=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMyDsl.g:646:1: entryRuleRepo returns [String current=null] : iv_ruleRepo= ruleRepo EOF ;
    public final String entryRuleRepo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRepo = null;


        try {
            // InternalMyDsl.g:646:44: (iv_ruleRepo= ruleRepo EOF )
            // InternalMyDsl.g:647:2: iv_ruleRepo= ruleRepo EOF
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
    // InternalMyDsl.g:653:1: ruleRepo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'repo' ;
    public final AntlrDatatypeRuleToken ruleRepo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:659:2: (kw= 'repo' )
            // InternalMyDsl.g:660:2: kw= 'repo'
            {
            kw=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:668:1: entryRuleProject returns [String current=null] : iv_ruleProject= ruleProject EOF ;
    public final String entryRuleProject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProject = null;


        try {
            // InternalMyDsl.g:668:47: (iv_ruleProject= ruleProject EOF )
            // InternalMyDsl.g:669:2: iv_ruleProject= ruleProject EOF
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
    // InternalMyDsl.g:675:1: ruleProject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'project' ;
    public final AntlrDatatypeRuleToken ruleProject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:681:2: (kw= 'project' )
            // InternalMyDsl.g:682:2: kw= 'project'
            {
            kw=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMyDsl.g:690:1: entryRuleFile returns [String current=null] : iv_ruleFile= ruleFile EOF ;
    public final String entryRuleFile() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFile = null;


        try {
            // InternalMyDsl.g:690:44: (iv_ruleFile= ruleFile EOF )
            // InternalMyDsl.g:691:2: iv_ruleFile= ruleFile EOF
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
    // InternalMyDsl.g:697:1: ruleFile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'file' ;
    public final AntlrDatatypeRuleToken ruleFile() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:703:2: (kw= 'file' )
            // InternalMyDsl.g:704:2: kw= 'file'
            {
            kw=(Token)match(input,24,FOLLOW_2); 

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
    // InternalMyDsl.g:712:1: entryRuleapi_token returns [EObject current=null] : iv_ruleapi_token= ruleapi_token EOF ;
    public final EObject entryRuleapi_token() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleapi_token = null;


        try {
            // InternalMyDsl.g:712:50: (iv_ruleapi_token= ruleapi_token EOF )
            // InternalMyDsl.g:713:2: iv_ruleapi_token= ruleapi_token EOF
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
    // InternalMyDsl.g:719:1: ruleapi_token returns [EObject current=null] : (otherlv_0= 'token ' ( (lv_nom_token_1_0= RULE_VALID_ID ) ) ( (lv_token_2_0= RULE_STRING ) ) ( rulelinejump )* ) ;
    public final EObject ruleapi_token() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_token_1_0=null;
        Token lv_token_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:725:2: ( (otherlv_0= 'token ' ( (lv_nom_token_1_0= RULE_VALID_ID ) ) ( (lv_token_2_0= RULE_STRING ) ) ( rulelinejump )* ) )
            // InternalMyDsl.g:726:2: (otherlv_0= 'token ' ( (lv_nom_token_1_0= RULE_VALID_ID ) ) ( (lv_token_2_0= RULE_STRING ) ) ( rulelinejump )* )
            {
            // InternalMyDsl.g:726:2: (otherlv_0= 'token ' ( (lv_nom_token_1_0= RULE_VALID_ID ) ) ( (lv_token_2_0= RULE_STRING ) ) ( rulelinejump )* )
            // InternalMyDsl.g:727:3: otherlv_0= 'token ' ( (lv_nom_token_1_0= RULE_VALID_ID ) ) ( (lv_token_2_0= RULE_STRING ) ) ( rulelinejump )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getApi_tokenAccess().getTokenKeyword_0());
            		
            // InternalMyDsl.g:731:3: ( (lv_nom_token_1_0= RULE_VALID_ID ) )
            // InternalMyDsl.g:732:4: (lv_nom_token_1_0= RULE_VALID_ID )
            {
            // InternalMyDsl.g:732:4: (lv_nom_token_1_0= RULE_VALID_ID )
            // InternalMyDsl.g:733:5: lv_nom_token_1_0= RULE_VALID_ID
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

            // InternalMyDsl.g:749:3: ( (lv_token_2_0= RULE_STRING ) )
            // InternalMyDsl.g:750:4: (lv_token_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:750:4: (lv_token_2_0= RULE_STRING )
            // InternalMyDsl.g:751:5: lv_token_2_0= RULE_STRING
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

            // InternalMyDsl.g:767:3: ( rulelinejump )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:768:4: rulelinejump
            	    {

            	    				newCompositeNode(grammarAccess.getApi_tokenAccess().getLinejumpParserRuleCall_3());
            	    			
            	    pushFollow(FOLLOW_14);
            	    rulelinejump();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalMyDsl.g:780:1: entryRulelinespace returns [String current=null] : iv_rulelinespace= rulelinespace EOF ;
    public final String entryRulelinespace() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelinespace = null;


        try {
            // InternalMyDsl.g:780:49: (iv_rulelinespace= rulelinespace EOF )
            // InternalMyDsl.g:781:2: iv_rulelinespace= rulelinespace EOF
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
    // InternalMyDsl.g:787:1: rulelinespace returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\t' ;
    public final AntlrDatatypeRuleToken rulelinespace() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:793:2: (kw= '\\t' )
            // InternalMyDsl.g:794:2: kw= '\\t'
            {
            kw=(Token)match(input,26,FOLLOW_2); 

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
    // InternalMyDsl.g:802:1: entryRulelinejump returns [String current=null] : iv_rulelinejump= rulelinejump EOF ;
    public final String entryRulelinejump() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelinejump = null;


        try {
            // InternalMyDsl.g:802:48: (iv_rulelinejump= rulelinejump EOF )
            // InternalMyDsl.g:803:2: iv_rulelinejump= rulelinejump EOF
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
    // InternalMyDsl.g:809:1: rulelinejump returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\n' ;
    public final AntlrDatatypeRuleToken rulelinejump() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:815:2: (kw= '\\n' )
            // InternalMyDsl.g:816:2: kw= '\\n'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003E14002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});

}