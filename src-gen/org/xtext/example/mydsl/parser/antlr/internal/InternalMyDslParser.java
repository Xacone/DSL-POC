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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VALID_ID", "RULE_STRING", "RULE_LETTER", "RULE_DIGIT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}\\n'", "'instance'", "'repo'", "'project'", "'file'"
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
    public static final int RULE_INT=9;
    public static final int RULE_VALID_ID=4;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__20=20;

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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_arrays_0_0= rulearray ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_arrays_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_arrays_0_0= rulearray ) )* )
            // InternalMyDsl.g:78:2: ( (lv_arrays_0_0= rulearray ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_arrays_0_0= rulearray ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_arrays_0_0= rulearray )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_arrays_0_0= rulearray )
            	    // InternalMyDsl.g:80:4: lv_arrays_0_0= rulearray
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getArraysArrayParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_arrays_0_0=rulearray();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"arrays",
            	    					lv_arrays_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.array");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulearray"
    // InternalMyDsl.g:100:1: entryRulearray returns [EObject current=null] : iv_rulearray= rulearray EOF ;
    public final EObject entryRulearray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray = null;


        try {
            // InternalMyDsl.g:100:46: (iv_rulearray= rulearray EOF )
            // InternalMyDsl.g:101:2: iv_rulearray= rulearray EOF
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
    // InternalMyDsl.g:107:1: rulearray returns [EObject current=null] : ( ( (lv_targets_0_0= ruletarget ) ) ( (lv_array_names_1_0= RULE_VALID_ID ) ) otherlv_2= '{' ( (lv_Array_3_0= rulearrayElement ) ) (otherlv_4= ',' ( (lv_Array_5_0= rulearrayElement ) ) )* otherlv_6= '}\\n' ) ;
    public final EObject rulearray() throws RecognitionException {
        EObject current = null;

        Token lv_array_names_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_targets_0_0 = null;

        EObject lv_Array_3_0 = null;

        EObject lv_Array_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( ( ( (lv_targets_0_0= ruletarget ) ) ( (lv_array_names_1_0= RULE_VALID_ID ) ) otherlv_2= '{' ( (lv_Array_3_0= rulearrayElement ) ) (otherlv_4= ',' ( (lv_Array_5_0= rulearrayElement ) ) )* otherlv_6= '}\\n' ) )
            // InternalMyDsl.g:114:2: ( ( (lv_targets_0_0= ruletarget ) ) ( (lv_array_names_1_0= RULE_VALID_ID ) ) otherlv_2= '{' ( (lv_Array_3_0= rulearrayElement ) ) (otherlv_4= ',' ( (lv_Array_5_0= rulearrayElement ) ) )* otherlv_6= '}\\n' )
            {
            // InternalMyDsl.g:114:2: ( ( (lv_targets_0_0= ruletarget ) ) ( (lv_array_names_1_0= RULE_VALID_ID ) ) otherlv_2= '{' ( (lv_Array_3_0= rulearrayElement ) ) (otherlv_4= ',' ( (lv_Array_5_0= rulearrayElement ) ) )* otherlv_6= '}\\n' )
            // InternalMyDsl.g:115:3: ( (lv_targets_0_0= ruletarget ) ) ( (lv_array_names_1_0= RULE_VALID_ID ) ) otherlv_2= '{' ( (lv_Array_3_0= rulearrayElement ) ) (otherlv_4= ',' ( (lv_Array_5_0= rulearrayElement ) ) )* otherlv_6= '}\\n'
            {
            // InternalMyDsl.g:115:3: ( (lv_targets_0_0= ruletarget ) )
            // InternalMyDsl.g:116:4: (lv_targets_0_0= ruletarget )
            {
            // InternalMyDsl.g:116:4: (lv_targets_0_0= ruletarget )
            // InternalMyDsl.g:117:5: lv_targets_0_0= ruletarget
            {

            					newCompositeNode(grammarAccess.getArrayAccess().getTargetsTargetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
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

            // InternalMyDsl.g:134:3: ( (lv_array_names_1_0= RULE_VALID_ID ) )
            // InternalMyDsl.g:135:4: (lv_array_names_1_0= RULE_VALID_ID )
            {
            // InternalMyDsl.g:135:4: (lv_array_names_1_0= RULE_VALID_ID )
            // InternalMyDsl.g:136:5: lv_array_names_1_0= RULE_VALID_ID
            {
            lv_array_names_1_0=(Token)match(input,RULE_VALID_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getArrayAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:156:3: ( (lv_Array_3_0= rulearrayElement ) )
            // InternalMyDsl.g:157:4: (lv_Array_3_0= rulearrayElement )
            {
            // InternalMyDsl.g:157:4: (lv_Array_3_0= rulearrayElement )
            // InternalMyDsl.g:158:5: lv_Array_3_0= rulearrayElement
            {

            					newCompositeNode(grammarAccess.getArrayAccess().getArrayArrayElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_Array_3_0=rulearrayElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrayRule());
            					}
            					add(
            						current,
            						"Array",
            						lv_Array_3_0,
            						"org.xtext.example.mydsl.MyDsl.arrayElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:175:3: (otherlv_4= ',' ( (lv_Array_5_0= rulearrayElement ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:176:4: otherlv_4= ',' ( (lv_Array_5_0= rulearrayElement ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getArrayAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:180:4: ( (lv_Array_5_0= rulearrayElement ) )
            	    // InternalMyDsl.g:181:5: (lv_Array_5_0= rulearrayElement )
            	    {
            	    // InternalMyDsl.g:181:5: (lv_Array_5_0= rulearrayElement )
            	    // InternalMyDsl.g:182:6: lv_Array_5_0= rulearrayElement
            	    {

            	    						newCompositeNode(grammarAccess.getArrayAccess().getArrayArrayElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_Array_5_0=rulearrayElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArrayRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Array",
            	    							lv_Array_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.arrayElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getArrayAccess().getRightCurlyBracketLineFeedLfKeyword_5());
            		

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


    // $ANTLR start "entryRulearrayElement"
    // InternalMyDsl.g:208:1: entryRulearrayElement returns [EObject current=null] : iv_rulearrayElement= rulearrayElement EOF ;
    public final EObject entryRulearrayElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearrayElement = null;


        try {
            // InternalMyDsl.g:208:53: (iv_rulearrayElement= rulearrayElement EOF )
            // InternalMyDsl.g:209:2: iv_rulearrayElement= rulearrayElement EOF
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
    // InternalMyDsl.g:215:1: rulearrayElement returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject rulearrayElement() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:221:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:222:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:222:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:223:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:223:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:224:4: lv_value_0_0= RULE_STRING
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
    // InternalMyDsl.g:243:1: entryRuletarget returns [String current=null] : iv_ruletarget= ruletarget EOF ;
    public final String entryRuletarget() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletarget = null;


        try {
            // InternalMyDsl.g:243:46: (iv_ruletarget= ruletarget EOF )
            // InternalMyDsl.g:244:2: iv_ruletarget= ruletarget EOF
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
    // InternalMyDsl.g:250:1: ruletarget returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Instance_0= ruleInstance | this_Repo_1= ruleRepo | this_Project_2= ruleProject | this_File_3= ruleFile ) ;
    public final AntlrDatatypeRuleToken ruletarget() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Instance_0 = null;

        AntlrDatatypeRuleToken this_Repo_1 = null;

        AntlrDatatypeRuleToken this_Project_2 = null;

        AntlrDatatypeRuleToken this_File_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:256:2: ( (this_Instance_0= ruleInstance | this_Repo_1= ruleRepo | this_Project_2= ruleProject | this_File_3= ruleFile ) )
            // InternalMyDsl.g:257:2: (this_Instance_0= ruleInstance | this_Repo_1= ruleRepo | this_Project_2= ruleProject | this_File_3= ruleFile )
            {
            // InternalMyDsl.g:257:2: (this_Instance_0= ruleInstance | this_Repo_1= ruleRepo | this_Project_2= ruleProject | this_File_3= ruleFile )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:258:3: this_Instance_0= ruleInstance
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
                    // InternalMyDsl.g:269:3: this_Repo_1= ruleRepo
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
                    // InternalMyDsl.g:280:3: this_Project_2= ruleProject
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
                    // InternalMyDsl.g:291:3: this_File_3= ruleFile
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
    // InternalMyDsl.g:305:1: entryRuleInstance returns [String current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final String entryRuleInstance() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInstance = null;


        try {
            // InternalMyDsl.g:305:48: (iv_ruleInstance= ruleInstance EOF )
            // InternalMyDsl.g:306:2: iv_ruleInstance= ruleInstance EOF
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
    // InternalMyDsl.g:312:1: ruleInstance returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'instance' ;
    public final AntlrDatatypeRuleToken ruleInstance() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:318:2: (kw= 'instance' )
            // InternalMyDsl.g:319:2: kw= 'instance'
            {
            kw=(Token)match(input,17,FOLLOW_2); 

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
    // InternalMyDsl.g:327:1: entryRuleRepo returns [String current=null] : iv_ruleRepo= ruleRepo EOF ;
    public final String entryRuleRepo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRepo = null;


        try {
            // InternalMyDsl.g:327:44: (iv_ruleRepo= ruleRepo EOF )
            // InternalMyDsl.g:328:2: iv_ruleRepo= ruleRepo EOF
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
    // InternalMyDsl.g:334:1: ruleRepo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'repo' ;
    public final AntlrDatatypeRuleToken ruleRepo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:340:2: (kw= 'repo' )
            // InternalMyDsl.g:341:2: kw= 'repo'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

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
    // InternalMyDsl.g:349:1: entryRuleProject returns [String current=null] : iv_ruleProject= ruleProject EOF ;
    public final String entryRuleProject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProject = null;


        try {
            // InternalMyDsl.g:349:47: (iv_ruleProject= ruleProject EOF )
            // InternalMyDsl.g:350:2: iv_ruleProject= ruleProject EOF
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
    // InternalMyDsl.g:356:1: ruleProject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'project' ;
    public final AntlrDatatypeRuleToken ruleProject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:362:2: (kw= 'project' )
            // InternalMyDsl.g:363:2: kw= 'project'
            {
            kw=(Token)match(input,19,FOLLOW_2); 

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
    // InternalMyDsl.g:371:1: entryRuleFile returns [String current=null] : iv_ruleFile= ruleFile EOF ;
    public final String entryRuleFile() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFile = null;


        try {
            // InternalMyDsl.g:371:44: (iv_ruleFile= ruleFile EOF )
            // InternalMyDsl.g:372:2: iv_ruleFile= ruleFile EOF
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
    // InternalMyDsl.g:378:1: ruleFile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'file' ;
    public final AntlrDatatypeRuleToken ruleFile() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:384:2: (kw= 'file' )
            // InternalMyDsl.g:385:2: kw= 'file'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});

}