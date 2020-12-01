// Specification JFlex
import java_cup.runtime.Symbol;
 
%%
%unicode
%cup
%line
%column

%{
	public int getYyLine(){
		return yyline+1;
	}
	public int getYyColumn(){
		return yycolumn+1;
	}
	public String getYyText(){
		return yytext();
	}
%}

methode = "allumer"|"allumer_eco"|"allumer_partiel"|"eteindre"|"tamiser"|"ouvrir"|"ouvrir_partiel"|"fermer"|"fermer_partiel"|"etat"

type_appareil = "eclairage"|"volet"|"chauffage"|"alarme"|"fenetre"
type_autre_appareil = "hifi"|"cafetiere"|"tv"|"video_proj"|"lave_vaisselle"|"lave_linge"|"portail"
type_interface = "interrupteur"|"mobile"|"telecommande"|"telephone"|"tablette"

enum_etat = "allume"|"allume_eco"|"eco"|"eteint"|"ouvert"|"demi"|"ferme"

chiffre = [0-9]
entier = {chiffre}+
ident = [a-z][0-9a-z_]*

chaine = \"[^\"]*~\"

inf = \<
sup = \>
slash = \/

acoouv = \{
acofer = \}
parouv = \(
parfer = \)

egal = \=

point = \.
pt_virg = \;
deux_pt = :
virgule = ,
underscore = _


commentaire = "//".*~\n
espace = [ \t\f]
finligne = [\n\r]


%%

	//-----mots clefs-----

//declarations
PROGRAMME_DOMUS { return new Symbol(sym.PROGRAMME_DOMUS, yytext()); }
DECLARATION_APPAREILS { return new Symbol(sym.DECLARATION_APPAREILS, yytext()); }
DECLARATION_INTERFACES { return new Symbol(sym.DECLARATION_INTERFACES, yytext()); }
DECLARATION_SCENARII { return new Symbol(sym.DECLARATION_SCENARII, yytext()); }
DECLARATION_COMMANDES { return new Symbol(sym.DECLARATION_COMMANDES, yytext()); }
SCENARIO { return new Symbol(sym.SCENARIO, yytext()); }

//boucles
pourtout { return new Symbol(sym.POURTOUT, yytext()); }
faire { return new Symbol(sym.FAIRE, yytext()); }
fait { return new Symbol(sym.FAIT, yytext()); }

//actions
definir { return new Symbol(sym.DEFINIR, yytext()); }
message { return new Symbol(sym.MESSAGE, yytext()); }
programmer { return new Symbol(sym.PROGRAMMER, yytext()); }
associer { return new Symbol(sym.ASSOCIER, yytext()); }
executer_scenario { return new Symbol(sym.	EXECUTER_SCENARIO, yytext()); }

//conditionnelles
si { return new Symbol(sym.SI, yytext()); }
alors { return new Symbol(sym.ALORS, yytext()); }
sinon { return new Symbol(sym.SINON, yytext()); }
fsi { return new Symbol(sym.FSI, yytext()); }

	//-----types-----

{methode} { return new Symbol(sym.METHODE, yytext()); }

	//-----types-----

{type_appareil} { return new Symbol(sym.TYPE_APPAREIL, yytext()); }
{type_autre_appareil} { return new Symbol(sym.TYPE_AUTRE_APPAREIL, yytext()); }
autre_appareil { return new Symbol(sym.AUTRE_APPAREIL, yytext()); }
{type_interface} { return new Symbol(sym.TYPE_INTERFACE, yytext()); }
{enum_etat} { return new Symbol(sym.ENUM_ETAT, yytext()); }

	//-----variables-----

{ident} { return new Symbol(sym.IDENT, yytext()); }
{chaine} { return new Symbol(sym.CHAINE, yytext()); }
{entier} { return new Symbol(sym.ENTIER, new Integer(yytext())); }

	//-----operateurs-----
{egal} { return new Symbol(sym.EGAL, yytext()); }

	//-----balises-----

{inf} { return new Symbol(sym.INF, yytext()); }
{sup} { return new Symbol(sym.SUP, yytext()); }
{slash} { return new Symbol(sym.SLASH, yytext()); }

	//-----separateurs-----

{parouv} { return new Symbol(sym.PAROUV, yytext()); }
{parfer} { return new Symbol(sym.PARFER, yytext()); }
{acoouv} { return new Symbol(sym.ACOOUV, yytext()); }
{acofer} { return new Symbol(sym.ACOFER, yytext()); }

	//-----ponctuation-----

{point} { return new Symbol(sym.POINT, yytext()); }
{pt_virg} { return new Symbol(sym.PT_VIRG, yytext()); }
{deux_pt} { return new Symbol(sym.DEUX_PT, yytext()); }
{virgule} { return new Symbol(sym.VIRGULE, yytext()); }
{underscore} { return new Symbol(sym.UNDERSCORE, yytext()); }

	//-----ignorés-----

{commentaire} {}
{espace} {}
{finligne} {} 

	//-----erreurs lexicales-----

.  {System.out.println(" Erreur ligne "+(yyline+1)+" colonne "+(yycolumn+1)+" : "+yytext()+" => caractère inconnu ! "); } 


