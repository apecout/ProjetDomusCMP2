// CMaisonUser.java

public class CMaisonUser extends CMaison {
	public CMaisonUser() {
		super();

		//  Appareils
		CAutreAppareil ll = new CAutreAppareil(ll,TypeAppareil.AUTRE_APPAREIL_LL);
		ma_liste_appareils.add(ll);
		CAutreAppareil matv = new CAutreAppareil(matv,TypeAppareil.AUTRE_APPAREIL_TV);
		ma_liste_appareils.add(matv);
		CChauffage rad1 = new CChauffage(rad1,TypeAppareil.CHAUFFAGE);
		ma_liste_appareils.add(rad1);
		CAutreAppareil proj = new CAutreAppareil(proj,TypeAppareil.AUTRE_APPAREIL_VIDEO_PROJ);
		ma_liste_appareils.add(proj);
		CAutreAppareil lv = new CAutreAppareil(lv,TypeAppareil.AUTRE_APPAREIL_LV);
		ma_liste_appareils.add(lv);
		CAutreAppareil e1 = new CAutreAppareil(e1,TypeAppareil.ECLAIRAGE);
		ma_liste_appareils.add(e1);
		CAutreAppareil e2 = new CAutreAppareil(e2,TypeAppareil.ECLAIRAGE);
		ma_liste_appareils.add(e2);
		CAutreAppareil e3 = new CAutreAppareil(e3,TypeAppareil.ECLAIRAGE);
		ma_liste_appareils.add(e3);
		CVoletFenetre fen = new CVoletFenetre(fen,TypeAppareil.FENETRE);
		ma_liste_appareils.add(fen);
		CAutreAppareil tv1 = new CAutreAppareil(tv1,TypeAppareil.AUTRE_APPAREIL_TV);
		ma_liste_appareils.add(tv1);
		CAlarme a1 = new CAlarme(a1,TypeAppareil.ALARME);
		ma_liste_appareils.add(a1);
		CAlarme a2 = new CAlarme(a2,TypeAppareil.ALARME);
		ma_liste_appareils.add(a2);
		CAutreAppareil tv2 = new CAutreAppareil(tv2,TypeAppareil.AUTRE_APPAREIL_TV);
		ma_liste_appareils.add(tv2);
		CAlarme a3 = new CAlarme(a3,TypeAppareil.ALARME);
		ma_liste_appareils.add(a3);
		CAutreAppareil cafe = new CAutreAppareil(cafe,TypeAppareil.CAFETIERE);
		ma_liste_appareils.add(cafe);
		CAutreAppareil port = new CAutreAppareil(port,TypeAppareil.AUTRE_APPAREIL_PORTAIL);
		ma_liste_appareils.add(port);
		CVoletFenetre v1 = new CVoletFenetre(v1,TypeAppareil.VOLET);
		ma_liste_appareils.add(v1);
		CVoletFenetre v2 = new CVoletFenetre(v2,TypeAppareil.VOLET);
		ma_liste_appareils.add(v2);
		CVoletFenetre v3 = new CVoletFenetre(v3,TypeAppareil.VOLET);
		ma_liste_appareils.add(v3);
		CVoletFenetre v4 = new CVoletFenetre(v4,TypeAppareil.VOLET);
		ma_liste_appareils.add(v4);
		CAutreAppareil hf = new CAutreAppareil(hf,TypeAppareil.AUTRE_APPAREIL_HIFI);
		ma_liste_appareils.add(hf);
		CChauffage r1 = new CChauffage(r1,TypeAppareil.CHAUFFAGE);
		ma_liste_appareils.add(r1);
		CVoletFenetre v5 = new CVoletFenetre(v5,TypeAppareil.VOLET);
		ma_liste_appareils.add(v5);

		//  Interfaces
		CInterfacetel1= new CInterface(tel1,TypeInterface.TELEPHONE);
		ma_liste_interfaces.add(tel1);
		CInterfaceb2= new CInterface(b2,TypeInterface.INTERRUPTEUR);
		ma_liste_interfaces.add(b2);
		CInterfacezap= new CInterface(zap,TypeInterface.TELECOMMANDE);
		ma_liste_interfaces.add(zap);
		CInterfacetab1= new CInterface(tab1,TypeInterface.TABLETTE);
		ma_liste_interfaces.add(tab1);
		CInterfacet1= new CInterface(t1,TypeInterface.MOBILE);
		ma_liste_interfaces.add(t1);
		CInterfaceb1= new CInterface(b1,TypeInterface.INTERRUPTEUR);
		ma_liste_interfaces.add(b1);
		//  Commande associations
		tel1.addScenarioAssocie(test);
		b2.addScenarioAssocie(depart);
		zap.addScenarioAssocie(test);
		tab1.addScenarioAssocie(test);
		t1.addScenarioAssocie(depart);
		b1.addScenarioAssocie(bonjour);

		//  Commande programmation
		CProgrammation p1 = new CProgrammation(test2);
		CDate p1d1 = new CDate(-1, 1, 1, 6, 0);
		p1.addDate( p1d1);
		ma_liste_programmations.add(p1); 

		CProgrammation p2 = new CProgrammation(test);
		ma_liste_programmations.add(p2); 

		CProgrammation p3 = new CProgrammation(soiree_musique);
		CDate p3d1 = new CDate(2012, 11, 20, 19, 30);
		p3.addDate( p3d1);
		ma_liste_programmations.add(p3); 

		CProgrammation p4 = new CProgrammation(depart);
		ma_liste_programmations.add(p4); 

		CProgrammation p5 = new CProgrammation(bonjour);
		ma_liste_programmations.add(p5); 

		CProgrammation p6 = new CProgrammation(soiree);
		CDate p6d1 = new CDate(2012, -1, 1, 18, 0);
		p6.addDate( p6d1);
		ma_liste_programmations.add(p6); 

		monHabitat = new HabitatSpecific(ma_liste_appareils,
		ma_liste_ens_appareils, ma_liste_scenarios,
		ma_liste_interfaces, ma_liste_programmations);
	}
}
