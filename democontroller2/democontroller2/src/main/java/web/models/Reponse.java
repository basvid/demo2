package web.models;

public class Reponse {
	
	// ----------------- propriétés 6. // statut de l'opération
private int status;
// la réponse JSON
private Object data;
private Object data1;
private Object data2;
// ---------------constructeurs
public Reponse() {
}
public Reponse(int status, Object data, Object data1, Object data2) {
this.status = status;
this.data = data;
this.data1 = data1;
this.data2 = data2;
}
// méthodes
public void incrStatusBy(int increment) {
status += increment;
}

// ---getters et setters : DOIT IMPERATIVEMENT ETRE CREE POUR ENVOYER LES DONNEES AUTOMATIQUEMENT par springboot

public long getStatus() {
    return status;
}
public Object getData() {
    return data;
}

public Object getData1() {
    return data1;
}

public Object getData2() {
    return data2;
}
}
