package composant.xtext.comp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import composant.xtext.comp.services.CompGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCompParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'component'", "'('", "','", "')'", "'{'", "'properties'", "'}'", "':='", "':'", "'->'", "'.'", "'in'", "'out'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCompParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCompParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCompParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComp.g"; }



     	private CompGrammarAccess grammarAccess;

        public InternalCompParser(TokenStream input, CompGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Composant";
       	}

       	@Override
       	protected CompGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComposant"
    // InternalComp.g:65:1: entryRuleComposant returns [EObject current=null] : iv_ruleComposant= ruleComposant EOF ;
    public final EObject entryRuleComposant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposant = null;


        try {
            // InternalComp.g:65:50: (iv_ruleComposant= ruleComposant EOF )
            // InternalComp.g:66:2: iv_ruleComposant= ruleComposant EOF
            {
             newCompositeNode(grammarAccess.getComposantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposant=ruleComposant();

            state._fsp--;

             current =iv_ruleComposant; 
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
    // $ANTLR end "entryRuleComposant"


    // $ANTLR start "ruleComposant"
    // InternalComp.g:72:1: ruleComposant returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_ports_3_0= rulePort ) ) (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_fils_8_0= ruleComposant ) ) ( (lv_fils_9_0= ruleComposant ) )* )? ( ( (lv_connecteurs_10_0= ruleConnecteur ) ) ( (lv_connecteurs_11_0= ruleConnecteur ) )* )? (otherlv_12= 'properties' ( (lv_properties_13_0= ruleProperty ) ) (otherlv_14= ',' ( (lv_properties_15_0= ruleProperty ) ) )* )? otherlv_16= '}' ) ;
    public final EObject ruleComposant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_ports_3_0 = null;

        EObject lv_ports_5_0 = null;

        EObject lv_fils_8_0 = null;

        EObject lv_fils_9_0 = null;

        EObject lv_connecteurs_10_0 = null;

        EObject lv_connecteurs_11_0 = null;

        EObject lv_properties_13_0 = null;

        EObject lv_properties_15_0 = null;



        	enterRule();

        try {
            // InternalComp.g:78:2: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_ports_3_0= rulePort ) ) (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_fils_8_0= ruleComposant ) ) ( (lv_fils_9_0= ruleComposant ) )* )? ( ( (lv_connecteurs_10_0= ruleConnecteur ) ) ( (lv_connecteurs_11_0= ruleConnecteur ) )* )? (otherlv_12= 'properties' ( (lv_properties_13_0= ruleProperty ) ) (otherlv_14= ',' ( (lv_properties_15_0= ruleProperty ) ) )* )? otherlv_16= '}' ) )
            // InternalComp.g:79:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_ports_3_0= rulePort ) ) (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_fils_8_0= ruleComposant ) ) ( (lv_fils_9_0= ruleComposant ) )* )? ( ( (lv_connecteurs_10_0= ruleConnecteur ) ) ( (lv_connecteurs_11_0= ruleConnecteur ) )* )? (otherlv_12= 'properties' ( (lv_properties_13_0= ruleProperty ) ) (otherlv_14= ',' ( (lv_properties_15_0= ruleProperty ) ) )* )? otherlv_16= '}' )
            {
            // InternalComp.g:79:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_ports_3_0= rulePort ) ) (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_fils_8_0= ruleComposant ) ) ( (lv_fils_9_0= ruleComposant ) )* )? ( ( (lv_connecteurs_10_0= ruleConnecteur ) ) ( (lv_connecteurs_11_0= ruleConnecteur ) )* )? (otherlv_12= 'properties' ( (lv_properties_13_0= ruleProperty ) ) (otherlv_14= ',' ( (lv_properties_15_0= ruleProperty ) ) )* )? otherlv_16= '}' )
            // InternalComp.g:80:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_ports_3_0= rulePort ) ) (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_fils_8_0= ruleComposant ) ) ( (lv_fils_9_0= ruleComposant ) )* )? ( ( (lv_connecteurs_10_0= ruleConnecteur ) ) ( (lv_connecteurs_11_0= ruleConnecteur ) )* )? (otherlv_12= 'properties' ( (lv_properties_13_0= ruleProperty ) ) (otherlv_14= ',' ( (lv_properties_15_0= ruleProperty ) ) )* )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComposantAccess().getComponentKeyword_0());
            		
            // InternalComp.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComp.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComp.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalComp.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComposantAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComposantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalComp.g:102:3: (otherlv_2= '(' ( (lv_ports_3_0= rulePort ) ) (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )* otherlv_6= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalComp.g:103:4: otherlv_2= '(' ( (lv_ports_3_0= rulePort ) ) (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getComposantAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalComp.g:107:4: ( (lv_ports_3_0= rulePort ) )
                    // InternalComp.g:108:5: (lv_ports_3_0= rulePort )
                    {
                    // InternalComp.g:108:5: (lv_ports_3_0= rulePort )
                    // InternalComp.g:109:6: lv_ports_3_0= rulePort
                    {

                    						newCompositeNode(grammarAccess.getComposantAccess().getPortsPortParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_ports_3_0=rulePort();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComposantRule());
                    						}
                    						add(
                    							current,
                    							"ports",
                    							lv_ports_3_0,
                    							"composant.xtext.comp.Comp.Port");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComp.g:126:4: (otherlv_4= ',' ( (lv_ports_5_0= rulePort ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalComp.g:127:5: otherlv_4= ',' ( (lv_ports_5_0= rulePort ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getComposantAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalComp.g:131:5: ( (lv_ports_5_0= rulePort ) )
                    	    // InternalComp.g:132:6: (lv_ports_5_0= rulePort )
                    	    {
                    	    // InternalComp.g:132:6: (lv_ports_5_0= rulePort )
                    	    // InternalComp.g:133:7: lv_ports_5_0= rulePort
                    	    {

                    	    							newCompositeNode(grammarAccess.getComposantAccess().getPortsPortParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_ports_5_0=rulePort();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComposantRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ports",
                    	    								lv_ports_5_0,
                    	    								"composant.xtext.comp.Comp.Port");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getComposantAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getComposantAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComp.g:160:3: ( ( (lv_fils_8_0= ruleComposant ) ) ( (lv_fils_9_0= ruleComposant ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComp.g:161:4: ( (lv_fils_8_0= ruleComposant ) ) ( (lv_fils_9_0= ruleComposant ) )*
                    {
                    // InternalComp.g:161:4: ( (lv_fils_8_0= ruleComposant ) )
                    // InternalComp.g:162:5: (lv_fils_8_0= ruleComposant )
                    {
                    // InternalComp.g:162:5: (lv_fils_8_0= ruleComposant )
                    // InternalComp.g:163:6: lv_fils_8_0= ruleComposant
                    {

                    						newCompositeNode(grammarAccess.getComposantAccess().getFilsComposantParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_fils_8_0=ruleComposant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComposantRule());
                    						}
                    						add(
                    							current,
                    							"fils",
                    							lv_fils_8_0,
                    							"composant.xtext.comp.Comp.Composant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComp.g:180:4: ( (lv_fils_9_0= ruleComposant ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==11) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalComp.g:181:5: (lv_fils_9_0= ruleComposant )
                    	    {
                    	    // InternalComp.g:181:5: (lv_fils_9_0= ruleComposant )
                    	    // InternalComp.g:182:6: lv_fils_9_0= ruleComposant
                    	    {

                    	    						newCompositeNode(grammarAccess.getComposantAccess().getFilsComposantParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_fils_9_0=ruleComposant();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComposantRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fils",
                    	    							lv_fils_9_0,
                    	    							"composant.xtext.comp.Comp.Composant");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalComp.g:200:3: ( ( (lv_connecteurs_10_0= ruleConnecteur ) ) ( (lv_connecteurs_11_0= ruleConnecteur ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComp.g:201:4: ( (lv_connecteurs_10_0= ruleConnecteur ) ) ( (lv_connecteurs_11_0= ruleConnecteur ) )*
                    {
                    // InternalComp.g:201:4: ( (lv_connecteurs_10_0= ruleConnecteur ) )
                    // InternalComp.g:202:5: (lv_connecteurs_10_0= ruleConnecteur )
                    {
                    // InternalComp.g:202:5: (lv_connecteurs_10_0= ruleConnecteur )
                    // InternalComp.g:203:6: lv_connecteurs_10_0= ruleConnecteur
                    {

                    						newCompositeNode(grammarAccess.getComposantAccess().getConnecteursConnecteurParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_connecteurs_10_0=ruleConnecteur();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComposantRule());
                    						}
                    						add(
                    							current,
                    							"connecteurs",
                    							lv_connecteurs_10_0,
                    							"composant.xtext.comp.Comp.Connecteur");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComp.g:220:4: ( (lv_connecteurs_11_0= ruleConnecteur ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalComp.g:221:5: (lv_connecteurs_11_0= ruleConnecteur )
                    	    {
                    	    // InternalComp.g:221:5: (lv_connecteurs_11_0= ruleConnecteur )
                    	    // InternalComp.g:222:6: lv_connecteurs_11_0= ruleConnecteur
                    	    {

                    	    						newCompositeNode(grammarAccess.getComposantAccess().getConnecteursConnecteurParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_connecteurs_11_0=ruleConnecteur();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComposantRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"connecteurs",
                    	    							lv_connecteurs_11_0,
                    	    							"composant.xtext.comp.Comp.Connecteur");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalComp.g:240:3: (otherlv_12= 'properties' ( (lv_properties_13_0= ruleProperty ) ) (otherlv_14= ',' ( (lv_properties_15_0= ruleProperty ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComp.g:241:4: otherlv_12= 'properties' ( (lv_properties_13_0= ruleProperty ) ) (otherlv_14= ',' ( (lv_properties_15_0= ruleProperty ) ) )*
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getComposantAccess().getPropertiesKeyword_6_0());
                    			
                    // InternalComp.g:245:4: ( (lv_properties_13_0= ruleProperty ) )
                    // InternalComp.g:246:5: (lv_properties_13_0= ruleProperty )
                    {
                    // InternalComp.g:246:5: (lv_properties_13_0= ruleProperty )
                    // InternalComp.g:247:6: lv_properties_13_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getComposantAccess().getPropertiesPropertyParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_properties_13_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComposantRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_13_0,
                    							"composant.xtext.comp.Comp.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComp.g:264:4: (otherlv_14= ',' ( (lv_properties_15_0= ruleProperty ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalComp.g:265:5: otherlv_14= ',' ( (lv_properties_15_0= ruleProperty ) )
                    	    {
                    	    otherlv_14=(Token)match(input,13,FOLLOW_10); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getComposantAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalComp.g:269:5: ( (lv_properties_15_0= ruleProperty ) )
                    	    // InternalComp.g:270:6: (lv_properties_15_0= ruleProperty )
                    	    {
                    	    // InternalComp.g:270:6: (lv_properties_15_0= ruleProperty )
                    	    // InternalComp.g:271:7: lv_properties_15_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getComposantAccess().getPropertiesPropertyParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_properties_15_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComposantRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_15_0,
                    	    								"composant.xtext.comp.Comp.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getComposantAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleComposant"


    // $ANTLR start "entryRuleEString"
    // InternalComp.g:298:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComp.g:298:47: (iv_ruleEString= ruleEString EOF )
            // InternalComp.g:299:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalComp.g:305:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalComp.g:311:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalComp.g:312:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalComp.g:312:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalComp.g:313:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComp.g:321:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleProperty"
    // InternalComp.g:332:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalComp.g:332:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalComp.g:333:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalComp.g:339:1: ruleProperty returns [EObject current=null] : ( ( (lv_clee_0_0= ruleEString ) ) otherlv_1= ':=' ( (lv_valeur_2_0= ruleEString ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_clee_0_0 = null;

        AntlrDatatypeRuleToken lv_valeur_2_0 = null;



        	enterRule();

        try {
            // InternalComp.g:345:2: ( ( ( (lv_clee_0_0= ruleEString ) ) otherlv_1= ':=' ( (lv_valeur_2_0= ruleEString ) ) ) )
            // InternalComp.g:346:2: ( ( (lv_clee_0_0= ruleEString ) ) otherlv_1= ':=' ( (lv_valeur_2_0= ruleEString ) ) )
            {
            // InternalComp.g:346:2: ( ( (lv_clee_0_0= ruleEString ) ) otherlv_1= ':=' ( (lv_valeur_2_0= ruleEString ) ) )
            // InternalComp.g:347:3: ( (lv_clee_0_0= ruleEString ) ) otherlv_1= ':=' ( (lv_valeur_2_0= ruleEString ) )
            {
            // InternalComp.g:347:3: ( (lv_clee_0_0= ruleEString ) )
            // InternalComp.g:348:4: (lv_clee_0_0= ruleEString )
            {
            // InternalComp.g:348:4: (lv_clee_0_0= ruleEString )
            // InternalComp.g:349:5: lv_clee_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getCleeEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_clee_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"clee",
            						lv_clee_0_0,
            						"composant.xtext.comp.Comp.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonEqualsSignKeyword_1());
            		
            // InternalComp.g:370:3: ( (lv_valeur_2_0= ruleEString ) )
            // InternalComp.g:371:4: (lv_valeur_2_0= ruleEString )
            {
            // InternalComp.g:371:4: (lv_valeur_2_0= ruleEString )
            // InternalComp.g:372:5: lv_valeur_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getValeurEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_valeur_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"valeur",
            						lv_valeur_2_0,
            						"composant.xtext.comp.Comp.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePort"
    // InternalComp.g:393:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalComp.g:393:45: (iv_rulePort= rulePort EOF )
            // InternalComp.g:394:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalComp.g:400:1: rulePort returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )? ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_direction_0_0 = null;

        EObject lv_properties_3_0 = null;

        EObject lv_properties_5_0 = null;



        	enterRule();

        try {
            // InternalComp.g:406:2: ( ( ( (lv_direction_0_0= ruleDirection ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )? ) )
            // InternalComp.g:407:2: ( ( (lv_direction_0_0= ruleDirection ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )? )
            {
            // InternalComp.g:407:2: ( ( (lv_direction_0_0= ruleDirection ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )? )
            // InternalComp.g:408:3: ( (lv_direction_0_0= ruleDirection ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )?
            {
            // InternalComp.g:408:3: ( (lv_direction_0_0= ruleDirection ) )
            // InternalComp.g:409:4: (lv_direction_0_0= ruleDirection )
            {
            // InternalComp.g:409:4: (lv_direction_0_0= ruleDirection )
            // InternalComp.g:410:5: lv_direction_0_0= ruleDirection
            {

            					newCompositeNode(grammarAccess.getPortAccess().getDirectionDirectionEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_direction_0_0=ruleDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_0_0,
            						"composant.xtext.comp.Comp.Direction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComp.g:427:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComp.g:428:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComp.g:428:4: (lv_name_1_0= RULE_ID )
            // InternalComp.g:429:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalComp.g:445:3: (otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalComp.g:446:4: otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalComp.g:450:4: ( (lv_properties_3_0= ruleProperty ) )
                    // InternalComp.g:451:5: (lv_properties_3_0= ruleProperty )
                    {
                    // InternalComp.g:451:5: (lv_properties_3_0= ruleProperty )
                    // InternalComp.g:452:6: lv_properties_3_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getPortAccess().getPropertiesPropertyParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_properties_3_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPortRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_3_0,
                    							"composant.xtext.comp.Comp.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComp.g:469:4: (otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==13) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalComp.g:470:5: otherlv_4= ',' ( (lv_properties_5_0= ruleProperty ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getPortAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalComp.g:474:5: ( (lv_properties_5_0= ruleProperty ) )
                    	    // InternalComp.g:475:6: (lv_properties_5_0= ruleProperty )
                    	    {
                    	    // InternalComp.g:475:6: (lv_properties_5_0= ruleProperty )
                    	    // InternalComp.g:476:7: lv_properties_5_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getPortAccess().getPropertiesPropertyParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_properties_5_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPortRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_5_0,
                    	    								"composant.xtext.comp.Comp.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getPortAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleConnecteur"
    // InternalComp.g:503:1: entryRuleConnecteur returns [EObject current=null] : iv_ruleConnecteur= ruleConnecteur EOF ;
    public final EObject entryRuleConnecteur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnecteur = null;


        try {
            // InternalComp.g:503:51: (iv_ruleConnecteur= ruleConnecteur EOF )
            // InternalComp.g:504:2: iv_ruleConnecteur= ruleConnecteur EOF
            {
             newCompositeNode(grammarAccess.getConnecteurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnecteur=ruleConnecteur();

            state._fsp--;

             current =iv_ruleConnecteur; 
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
    // $ANTLR end "entryRuleConnecteur"


    // $ANTLR start "ruleConnecteur"
    // InternalComp.g:510:1: ruleConnecteur returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) otherlv_3= '->' ( ( ruleQualifiedID ) ) (otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleConnecteur() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_properties_6_0 = null;

        EObject lv_properties_8_0 = null;



        	enterRule();

        try {
            // InternalComp.g:516:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) otherlv_3= '->' ( ( ruleQualifiedID ) ) (otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? ) )
            // InternalComp.g:517:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) otherlv_3= '->' ( ( ruleQualifiedID ) ) (otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? )
            {
            // InternalComp.g:517:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) otherlv_3= '->' ( ( ruleQualifiedID ) ) (otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )? )
            // InternalComp.g:518:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) otherlv_3= '->' ( ( ruleQualifiedID ) ) (otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )?
            {
            // InternalComp.g:518:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalComp.g:519:4: (lv_name_0_0= RULE_ID )
            {
            // InternalComp.g:519:4: (lv_name_0_0= RULE_ID )
            // InternalComp.g:520:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConnecteurAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnecteurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConnecteurAccess().getColonKeyword_1());
            		
            // InternalComp.g:540:3: ( ( ruleQualifiedID ) )
            // InternalComp.g:541:4: ( ruleQualifiedID )
            {
            // InternalComp.g:541:4: ( ruleQualifiedID )
            // InternalComp.g:542:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnecteurRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnecteurAccess().getSrcPortCrossReference_2_0());
            				
            pushFollow(FOLLOW_15);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getConnecteurAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalComp.g:560:3: ( ( ruleQualifiedID ) )
            // InternalComp.g:561:4: ( ruleQualifiedID )
            {
            // InternalComp.g:561:4: ( ruleQualifiedID )
            // InternalComp.g:562:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnecteurRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnecteurAccess().getDstPortCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComp.g:576:3: (otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComp.g:577:4: otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) ) (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )* otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getConnecteurAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalComp.g:581:4: ( (lv_properties_6_0= ruleProperty ) )
                    // InternalComp.g:582:5: (lv_properties_6_0= ruleProperty )
                    {
                    // InternalComp.g:582:5: (lv_properties_6_0= ruleProperty )
                    // InternalComp.g:583:6: lv_properties_6_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getConnecteurAccess().getPropertiesPropertyParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_properties_6_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnecteurRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_6_0,
                    							"composant.xtext.comp.Comp.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComp.g:600:4: (otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==13) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalComp.g:601:5: otherlv_7= ',' ( (lv_properties_8_0= ruleProperty ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getConnecteurAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalComp.g:605:5: ( (lv_properties_8_0= ruleProperty ) )
                    	    // InternalComp.g:606:6: (lv_properties_8_0= ruleProperty )
                    	    {
                    	    // InternalComp.g:606:6: (lv_properties_8_0= ruleProperty )
                    	    // InternalComp.g:607:7: lv_properties_8_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getConnecteurAccess().getPropertiesPropertyParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_properties_8_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConnecteurRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_8_0,
                    	    								"composant.xtext.comp.Comp.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getConnecteurAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleConnecteur"


    // $ANTLR start "entryRuleQualifiedID"
    // InternalComp.g:634:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // InternalComp.g:634:51: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // InternalComp.g:635:2: iv_ruleQualifiedID= ruleQualifiedID EOF
            {
             newCompositeNode(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedID=ruleQualifiedID();

            state._fsp--;

             current =iv_ruleQualifiedID.getText(); 
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
    // $ANTLR end "entryRuleQualifiedID"


    // $ANTLR start "ruleQualifiedID"
    // InternalComp.g:641:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalComp.g:647:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalComp.g:648:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalComp.g:648:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // InternalComp.g:649:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0());
            		
            // InternalComp.g:656:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComp.g:657:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,21,FOLLOW_3); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0());
                    			
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleQualifiedID"


    // $ANTLR start "ruleDirection"
    // InternalComp.g:674:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalComp.g:680:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // InternalComp.g:681:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // InternalComp.g:681:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            else if ( (LA15_0==23) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalComp.g:682:3: (enumLiteral_0= 'in' )
                    {
                    // InternalComp.g:682:3: (enumLiteral_0= 'in' )
                    // InternalComp.g:683:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalComp.g:690:3: (enumLiteral_1= 'out' )
                    {
                    // InternalComp.g:690:3: (enumLiteral_1= 'out' )
                    // InternalComp.g:691:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getOUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getOUTEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleDirection"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030810L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});

}