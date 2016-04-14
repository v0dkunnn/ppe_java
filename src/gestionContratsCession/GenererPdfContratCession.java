/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionContratsCession;


 
import classesMetier.ContratCession;
import classesMetier.Representation;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Section;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import nezdames.serialisation.NezDamesSerialisation;
 

/**
 * Création d'un contrat de cession en PDF
 */
public class GenererPdfContratCession {
 
  private String FILE;
  private static final Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
  private static final Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.RED);
  private static final Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
  private static final Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
  public static final String imageBanniere = "src/images/banniere.png";
  public static final String entete = "src/images/entete.png";
  
  private static ContratCession leContrat;
  
  public GenererPdfContratCession(int indiceDuContratCessionAEditer) {
    try {
      leContrat = NezDamesSerialisation.lesContratsCession.get(indiceDuContratCessionAEditer);
      FILE = "ContratsCession/ContratDeCession-"+NezDamesSerialisation.lesContratsCession.get(indiceDuContratCessionAEditer).getNumeroContratCession()+".pdf";
      Document document = new Document();
      PdfWriter.getInstance(document, new FileOutputStream(FILE));
      document.open();
      ajoutContenu(document);
      document.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void ajoutContenu(Document document) throws DocumentException, BadElementException, IOException {
 
    Chapter catPart = new Chapter(new Paragraph(/*contenu*/),1);
    catPart.add(Image.getInstance(entete));
    catPart.setNumberDepth(0); //on supprime la numerotation du titre du paragraphe
    
    //on formate la date du jour
    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    String date = format.format(new Date());
    
    Paragraph subPara = new Paragraph("CONTRAT DE CESSION", subFont);
    subPara.setAlignment(Element.ALIGN_CENTER);
    Section subCatPart = catPart.addSection(subPara,0); //on affiche le sous titre sans numérotation
    subCatPart.add(Image.getInstance(imageBanniere));
    subCatPart.add(new Paragraph(" ")); //on insère une ligne vide
    subCatPart.add(new Paragraph("ENTRE LES SOUSSIGNES : ",subFont));
    subCatPart.add(new Paragraph("       Raison sociale de l'entreprise : Compagnie  NEZDAMES & NEZSIEURS")); 
    subCatPart.add(new Paragraph("       S.I.R.E.T. N° :  491 378 766 000 27           APE/NAF : 9001Z"));
    subCatPart.add(new Paragraph("       Licence : 2-1034518"));
    subCatPart.add(new Paragraph("       Adresse : LES AIGLADINES      30140 MIALET"));
    subCatPart.add(new Paragraph("       Représentée par : Nicolas DUPREY   -     	Tél :  0 610 333 555"));
    subCatPart.add(new Paragraph("       en sa qualité de Président   -  	Mail : cie.nezdames@gmail.com"));
    subCatPart.add(new Paragraph("               Ci-après dénommé « LE PRODUCTEUR » d’une part,"));
    subCatPart.add(new Paragraph("ET : ",subFont));
    subCatPart.add(new Paragraph("       Raison sociale : "));
    subCatPart.add(new Paragraph("       S.I.R.E.T. N° : "+"     NAF : "));
    subCatPart.add(new Paragraph("       Adresse : "));
    subCatPart.add(new Paragraph("       Représenté par : "+"    Tél. :"));
    subCatPart.add(new Paragraph("       En sa qualité de : "+"    Fax. : "));
    subCatPart.add(new Paragraph("               Ci-après dénommé « L'ORGANISATEUR » d’autre part,"));
    subCatPart.add(new Paragraph(" "));
    subCatPart.add(new Paragraph("IL EST PREALABLEMENT EXPOSE CE QUI SUIT : ",subFont));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subCatPart.add(new Paragraph("1 - LE PRODUCTEUR dispose du droit de présentation en France et dans les pays concernés par la présente, du spectacle suivant, pour lequel il s’est assuré le concours des artistes nécessaires à sa présentation."));
    subCatPart.add(new Paragraph("    Titre du Spectacle : "+leContrat.getLeSpectacleDuContratDeCession().getTitre(),smallBold));
    subCatPart.add(new Paragraph("    Numéro d'objet : "+leContrat.getLeSpectacleDuContratDeCession().getNumeroObjet(),smallBold));    
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subCatPart.add(new Paragraph("2 - L’ORGANISATEUR s’est assuré de disposer des autorisations administratives en vigueur pour présenter le spectacle susnommé et il s’est assuré de la disponibilité du(des) lieu(x) précisé(s) dans l'article 1er du présent contrat,"));
    subCatPart.add(new Paragraph("dont le producteur déclare connaître et accepter les caractéristiques techniques."));
    subCatPart.add(new Paragraph(" "));
    subCatPart.add(new Paragraph("CECI ETANT EXPOSE, IL EST CONVENU ET ARRETE CE QUI SUIT:", subFont));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subPara = new Paragraph("Article 1er. OBJET", subFont);
    subCatPart = catPart.addSection(subPara,0); //on affiche le sous titre sans numérotation
    subCatPart.add(new Paragraph("L’ORGANISATEUR et le PRODUCTEUR s’associeront pour réaliser en commun, dans les conditions définies ci-après et dans le cadre du présent contrat de cession de droit, "+leContrat.getLesRepresentations().size()+" représentation(s)"));
    for (Representation uneRepresentation : leContrat.getLesRepresentations()) {
        subCatPart.add(new Paragraph("-  Date : "+uneRepresentation.getDate(),smallBold)); 
        subCatPart.add(new Paragraph("   Horaire  : "+uneRepresentation.getHeureDebut()));
        subCatPart.add(new Paragraph("   Lieu de la représentation : "+uneRepresentation.getLeLieu().getNom()+" "+uneRepresentation.getLeLieu().getAdresseRue()+" "+uneRepresentation.getLeLieu().getAdresseVille(),smallBold)); 
        subCatPart.add(new Paragraph("   Durée du jeu  : "+leContrat.getLeSpectacleDuContratDeCession().getDuree()+" minutes "));
    }

    subCatPart.add(new Paragraph("Cette collaboration ne constitue aucune forme d’association ou de société entre les parties."));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subPara = new Paragraph("Article 2. OBLIGATIONS DU PRODUCTEUR", subFont);
    subCatPart = catPart.addSection(subPara,0); //on affiche le sous titre sans numérotation
    subCatPart.add(new Paragraph("2.1. GENERALITES : LE PRODUCTEUR s’engage à fournir le spectacle décrit entièrement monté et assumera la responsabilité artistique de la prestation.\n"));
    subCatPart.add(new Paragraph("Le spectacle comprendra les costumes et accessoires et d’une manière générale tous les éléments nécessaires à sa représentation. En qualité d’employeur"));
    subCatPart.add(new Paragraph("2.2 CONDITIONS TECHNIQUES : LE PRODUCTEUR adressera à L’ORGANISATEUR la fiche technique du spectacle et les conditions de cantine et de restauration de son personnel sur le lieu de représentation en même temps que le présent contrat. L’ORGANISATEUR déclare en avoir pris connaissance et en accepter l’ensemble des clauses"));
    subCatPart.add(new Paragraph("2.3. PUBLICITE : Le PRODUCTEUR fournira les éléments nécessaires à la publicité et à la promotion du spectacle : les dossiers de presse et photos seront envoyés gracieusement au nombre d’exemplaires convenus avec L’ORGANISATEUR"));
    subCatPart.add(new Paragraph("2.4. SECURITE : Le PRODUCTEUR s’engage à respecter et/ou à faire respecter la législation et la réglementation en vigueur relatives à la sécurité du spectacle qu’il fournit."));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subPara = new Paragraph("Article 3. OBLIGATIONS DE L’ORGANISATEUR", subFont);
    subCatPart = catPart.addSection(subPara,0); //on affiche le sous titre sans numérotation
    subCatPart.add(new Paragraph("3.1. GENERALITES : L’ORGANISATEUR fournira le lieu de représentation en ordre de marche, y compris la sonorisation et les éclairages (selon fiche technique), et le personnel nécessaire au déchargement et au rechargement, au montage et au démontage, et au service des représentations. Il assurera en outre le service général du lieu : location, accueil, billetterie, encaissement et comptabilité des recettes et service de sécurité éventuel. En sa qualité d’employeur, il assumera les rémunérations, charges sociales et fiscales comprises, de son personnel attaché au spectacle. Le lieu de représentation ne pourra être modifié par l’organisateur sans l’accord écrit du producteur."));
    subCatPart.add(new Paragraph("3.2. CONDITIONS TECHNIQUES : L’ORGANISATEUR s’engage à respecter les conditions techniques définies globalement par la fiche technique annexée et modulée en fonction de la visite préalable du lieu de représentation, ou à l’issue d’un contact téléphonique, par un interlocuteur technique de la Cie NEZDAMES&NEZSIEURS au moins un mois avant la première représentation; besoins qu’il déclare connaître et accepter. Dans le cas où il serait dans l’impossibilité d’honorer une ou plusieurs conditions de cette fiche technique, il devra contacter LE PRODUCTEUR. La non-observation de ces conditions sans accord de ce dernier entraînerait la responsabilité de L’ORGANISATEUR."));
    subCatPart.add(new Paragraph("L’ORGANISATEUR adressera au PRODUCTEUR, avec le contrat signé, le plan de ville portant les indications suivantes : lieu du spectacle, hôtel, restaurant, gare."));
    subCatPart.add(new Paragraph("3.3. LOGE : Afin de présenter le spectacle dans des conditions de qualité optimum, les comédiens disposeront d’une loge propre et chauffée, elles comporteront : tables, chaises, lavabos, miroirs, éclairages et prise de courant. Elles devront fermer à clé. L’ORGANISATEUR mettra dans ces loges, à disposition des artistes et de l’équipe technique, dès leur arrivée : eau, coca cola, café, thé, fruits, un catering et si possible des serviettes de bain"));
    subCatPart.add(new Paragraph("3.4. MONTAGE-DEMONTAGE : L’ORGANISATEUR tiendra les lieux de représentation à la disposition du PRODUCTEUR au moins 2 heures avant la première représentation pour permettre d’effectuer le montage, les réglages et d’éventuels raccords."));
    subCatPart.add(new Paragraph("Le démontage sera effectué à l’issue de la dernière représentation"));
    subCatPart.add(new Paragraph("3.5. JAUGE : L’ORGANISATEUR s’engage à ce que le nombre des spectateurs admis dans le lieu de représentation soir strictement inférieur aux quotas définis dans les prescriptions de sécurité déterminée par la commission de sécurité compétente. D’une manière générale, il s’engage à respecter et/ou à faire respecter la législation et la réglementation en vigueur relatives à la sécurité. L’ORGANISATEUR assurera le service de sécurité sur le lieu du spectacle et fera en sorte qu’il n’y ait pas de nuisances sonores pouvant porter préjudice au jeu des acteurs."));
    subCatPart.add(new Paragraph("3.6. BILLETTERIE : L’organisateur sera responsable de l’établissement de la billetterie et en supportera le coût. Il sera également responsable de sa mise en vente, de l’encaissement de la recette correspondante et de la mise en place des services et personnels de contrôle. Dans le cas où l’image de l’artiste serait reproduite sur les billets, l’organisateur devra impérativement obtenir l’accord préalable du producteur (bon à tirer)."));
    subCatPart.add(new Paragraph("Les droits d’auteur liés aux représentations du spectacle sont à la charge de l’ORGANISATEUR qui en assurera le paiement."));
    subCatPart.add(new Paragraph("3.7. AUTORISATIONS : L’organisateur sera responsable de la demande et de l’obtention des éventuelles autorisations administratives relatives à la représentation : taxes, impôts, droits d’auteurs (SACEM) ou autres. Il communiquera au producteur lesdites autorisations avant le spectacle. Il s’assurera, par ailleurs, de la mise en place des services de secours médical et d’aménagement de la circulation automobile."));
    subCatPart.add(new Paragraph("3.8. PUBLICITE : L’ORGANISATEUR aura à sa charge la publicité, la promotion, l’affichage, ainsi que les frais qui en résultent. Il s’efforcera, en matière de publicité, de respecter l’esprit général de la documentation fournie par LE PRODUCTEUR et observera scrupuleusement les éventuelles mentions obligatoires."));
    subCatPart.add(new Paragraph("3.9. PROMOTION : Aucune enseigne de partenaires médiatiques ou commerciaux ne pourra apparaître devant et dans le lieu de représentation, et en particulier sur la scène ou sur les enceintes de diffusion, autre que celles contractuellement agréées par le PRODUCTEUR."));
    subCatPart.add(new Paragraph("3.10. PREMIERE PARTIE : Aucune première partie au spectacle objet au présent contrat ne pourra être programmée sans autorisation préalable écrite par le PRODUCTEUR."));
    subCatPart.add(new Paragraph("3.11. INVITATIONS : L’organisateur s’engage à mettre à la disposition du PRODUCTEUR jusqu’à 2 places exonérées pour la/les représentation(s) objet du présent contrat."));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subPara = new Paragraph("Article 4. HEBERGEMENT, RESTAURATION, TRANSPORT", subFont);
    subCatPart = catPart.addSection(subPara,0); //on affiche le sous titre sans numérotation
    subCatPart.add(new Paragraph("4.1 FRAIS D’HEBERGEMENT ET DE RESTAURATION"));
    subCatPart.add(new Paragraph("Ils seront à la charge de l’organisateur, suivant les modalités définies :"));
    subCatPart.add(new Paragraph("Restauration : RAS"));
    subCatPart.add(new Paragraph("Hébergement : RAS"));
    subCatPart.add(new Paragraph("4.2. TRANSPORT : RAS"));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subPara = new Paragraph("Article 5. PAIEMENT", subFont);
    subCatPart = catPart.addSection(subPara,0); //on affiche le sous titre sans numérotation
    subCatPart.add(new Paragraph("PRIX DU SPECTACLE – PAIEMENT"));
    subCatPart.add(new Paragraph("5.1. PRIX : A titre exceptionnel cette représentation est réalisée à titre gratuit."));
    subCatPart.add(new Paragraph("L’ORGANISATEUR s’acquittera néanmoins en sus de toute taxe qui viendrait à être créée par la puissance publique"));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subPara = new Paragraph("Article 6. ASSURANCES", subFont);
    subCatPart = catPart.addSection(subPara,0); //on affiche le sous titre sans numérotation
    subCatPart.add(new Paragraph("Le PRODUCTEUR est tenu d’assurer contre tous les risques pouvant subvenir à l’occasion des transports et entreposages exécutés entre deux représentations tout objet lui appartenant ou appartenant à son personnel. Il déclare en outre avoir souscrit toutes les assurances nécessaires à ses dispositifs techniques."));
    subCatPart.add(new Paragraph("L’ORGANISATEUR déclare avoir souscrit les assurances nécessaires à la couverture des risques liés à l’exploitation du spectacle dans son lieu, notamment en matière de responsabilité civile ainsi que les assurances nécessaires à la couverture des risques liés aux présentations de l’intervention spectaculaire sur le parcours en question."));
    subCatPart.add(new Paragraph("Il mettra à la disposition du producteur des loges fermant à clé et sera responsable de la protection et du gardiennage de tout objet appartenant au producteur."));
    subCatPart.add(new Paragraph("Dans le cas d’un spectacle en plein air, le producteur et l’organisateur s’engagent à souscrire une assurance couvrant les risques d’intempéries pour les frais incombant à chacun, étant entendu que cette assurance nécessite une couverture de scène."));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));    
    
    subPara = new Paragraph("Article 7. RESPONSABILITE", subFont);
    subCatPart = catPart.addSection(subPara,0); //on affiche le sous titre sans numérotation
    subCatPart.add(new Paragraph("Chaque partie garantie l’autre contre tous recours des personnels, fournisseurs et prestataires dont elle a personnellement la charge au titre des obligations respectives définies au présent contrat."));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subPara = new Paragraph("Article 8. ENREGISTREMENT - DIFFUSION - PHOTOS - VIDEOS", subFont);
    subCatPart = catPart.addSection(subPara,0); //on affiche le sous titre sans numérotation
    subCatPart.add(new Paragraph("8.1. LE PRODUCTEUR aura la possibilité d’organiser une séance photo ou un tournage vidéo de son spectacle sur le parcours de L’ORGANISATEUR."));
    subCatPart.add(new Paragraph("8.2. En dehors des émissions d’informations radiophoniques ou télévisées d’une durée de trois minutes au plus, tout enregistrement ou diffusion, même partiel, des représentations, objet du présent contrat, devra faire l’objet d’un accord écrit de la part du producteur."));
    subCatPart.add(new Paragraph("8.3. L’ORGANISATEUR s’engage à faire figurer le nom « Cie Nezdames et Nezsieurs» dans ses communiqués de presse et à lui faire parvenir tout article de presse mentionnant la ou les prestation(s) en question."));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subPara = new Paragraph("Article 9. EXTERIEUR", subFont);
    subCatPart = catPart.addSection(subPara,0); //on affiche le sous titre sans numérotation
    subCatPart.add(new Paragraph("9.1. Il est précisé que la pluie ou le mauvais temps ne constituent pas un cas de force majeure. Toutefois, en cas de pluie ou de mauvais temps, L’ORGANISATEUR se doit d’avoir prévu une salle couverte de repli, le prix de la représentation reste dû au PRODUCTEUR que la prestation ait lieu ou non."));
    subCatPart.add(new Paragraph("9.2. En cas de spectacle en plein air, L’ORGANISATEUR veillera tout particulièrement à la totale isolation du matériel électrique du lieu tant vis à vis du sol que des intempéries. Le non-respect de cette clause justifiera à elle seule le refus de jouer sans qu’il soit alors possible de rechercher la responsabilité du PRODUCTEUR."));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subPara = new Paragraph("Article 10. ANNULATION - FORCE MAJEURE", subFont);
    subCatPart = catPart.addSection(subPara,0); //on affiche le sous titre sans numérotation
    subCatPart.add(new Paragraph("10.1. Le présent contrat se trouverait annulé de plein droit et sans indemnités d’aucune sorte dans tous les cas de force majeure entraînant l’impossibilité de représenter l’intervention spectaculaire visé, sauf à étudier préalablement la possibilité d’en repousser l’application dans le temps pour la plus proche saison."));
    subCatPart.add(new Paragraph("10.2. Les parties conviennent d’entendre comme cas de force majeure au sens du présent contrat : guerre, révolution, inondation, grève générale tant du point de vue géographique que du point de vue des catégories socio-professionnelles concernées, émeutes, accident de la route des artistes se rendant au(x) intervention(s) sus-mentionnée(s), épidémies, maladie dûment constatée de l’un des artistes vedettes ou tout événement présentant cumulativement les caractères d’irréfutabilité et d’imprévisibilité."));
    subCatPart.add(new Paragraph("10.3. Tout autre cas d’annulation du fait de l’une des parties défaillantes entraîne l’obligation de verser à l’autre à titre de clause pénale une indemnité égale à la totalité des cachets dus en vertu de l’article 5 supra.  "));
    subCatPart.add(new Paragraph("Additionellement, toute annulation de fait de l’une des parties entraînerait pour la partie défaillante, l’obligation de verser à l’autre une indemnité calculée en fonction des frais effectivement engagés par cette dernière au moment de la rupture. A titre d’exemple, si L’ORGANISATEUR rompt le contrat alors que l’équipe est en route ou se trouve déjà sur le lieux, LE PRODUCTEUR recevra en sus des droits de cession convenus la somme totale des frais de transport et les défraiements fixés à l’annexe N°1."));
    subCatPart.add(new Paragraph("Le présent contrat se trouverait suspendu ou annulé de plein droit et sans aucune indemnité d’aucune sorte, dans tous les cas reconnus de force majeure :"));
    subCatPart.add(new Paragraph("-	à titre d’exemple, la maladie de membres très importants du groupe dont L’ORGANISATEUR est informé avant le début du spectacle est considéré comme tel,"));
    subCatPart.add(new Paragraph("-	par contre, l’interdiction de présenter le spectacle prononcée ultérieurement à la signature du contrat par les autorités locales n’est pas considéré comme tel."));
    subCatPart.add(new Paragraph(""));
    subCatPart.add(new Paragraph(""));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subPara = new Paragraph("Article 11. SIGNATURE", subFont);
    subCatPart = catPart.addSection(subPara,0); //on affiche le sous titre sans numérotation
    subCatPart.add(new Paragraph("Le présent engagement n’est valable que revêtu de la signature des deux parties, sans aucun rajout ni rature sauf à ce que ceux-ci fassent l’objet d’un paraphe de chacune des parties dans leur marge avec mention exacte des types d’opérations effectuées et que le récapitulatif de ces rajouts ou suppressions soit mentionné sous le dernier article des présentes."));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subPara = new Paragraph("Article 12. REGLEMENT DES CONFLITS", subFont);
    subCatPart = catPart.addSection(subPara,0); //on affiche le sous titre sans numérotation
    subCatPart.add(new Paragraph("En cas de désaccord, de contestation, ou de non-respect du présent accord, les deux parties s’efforceront de trouver un arrangement à l’amiable avant de porter le litige devant le tribunal de commerce de MONTPELLIER. Le présent contrat est soumis exclusivement au droit français."));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subPara = new Paragraph("Article 13. RETOUR DU CONTRAT", subFont);
    subCatPart = catPart.addSection(subPara,0); //on affiche le sous titre sans numérotation
    subCatPart.add(new Paragraph("Un exemplaire du présent contrat devra être signé et retourné au PRODUCTEUR dans les 10 jours, dernier délai. "));
    subCatPart.add(new Paragraph("Au delà du délai indiqué, en cas de non signature par l’une des parties, le signataire sera dégagé de toute obligation à l’égard de l’autre partie."));
    subCatPart.add(new Paragraph(" "));
    subCatPart.add(new Paragraph(" "));
    subCatPart.add(new Paragraph("Fait à Montpellier le "+date+", en deux exemplaires"));
    subCatPart.add(new Paragraph(" "));
    subCatPart.add(new Paragraph("Nombre de pages (y compris les annexes) : "));
    subCatPart.add(new Paragraph("Nombre de mots rayés ou nuls : "));
    subCatPart.add(new Paragraph("Nombre de mots rajoutés :"));
    subCatPart.add(new Paragraph(" "));
    subCatPart.add(new Paragraph("LE PRODUCTEUR                                                             L’ORGANISATEUR"));
    subCatPart.add(new Paragraph("Nicolas DUPREY                                         "));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    document.add(catPart);

  }
  
}