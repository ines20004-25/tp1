package lifeleft;


import javax.jws.WebService;
import javax.jws.WebMethod;
import java.time.Year;
@WebService(serviceName = "LifeLeft")
public class lifeLeftService {
    private static final Integer ESPERANCE_VIE_HOMME = 79;
    private static final Integer ESPERANCE_VIE_FEMME = 85;
    String homme = "homme";
    String femme = "femme ";
    Integer evDeReference = 0 ;


    @WebMethod
    public String anneeRestantesAVivre(
            String prenom,
            String sexe,
            Integer anneeNaissance) {

        if (sexe.equals(homme)) evDeReference = ESPERANCE_VIE_HOMME;
        else evDeReference = ESPERANCE_VIE_FEMME;

        Integer anneeRestantes = evDeReference - (Year.now().getValue() - anneeNaissance);
        return "Bonjour " + prenom + ",il vous reste " + anneeRestantes + " ans a vivre,profitez-en au maximum !";
    }}