class SinoTibetan extends Language{
    public SinoTibetan(String n, int numSpeakers){
        super(n, numSpeakers, "Asia", "subject-object-verb");
        if(n.contains("Chinese")){
            this.wordOrder =  "subject-verb-object";
        }
    }
}

class Mayan extends Language{
    public Mayan(String n, int numSpeakers){
        super(n, numSpeakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo(){
        System.out.println(this.name+ " is spoken by "+this.numSpeakers+" people mainly in "+this.regionsSpoken+".");
        System.out.println("The language follows the word order: "+this.wordOrder+".");
        System.out.println("Fun fact: "+this.name+" is an ergative language.");
    }
}

public class Language{
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
    public Language(String n, int ns, String rs, String wo){
        name = n;
        numSpeakers = ns;
        regionsSpoken = rs;
        wordOrder = wo;
    }
    public void getInfo(){
        System.out.println(this.name+ " is spoken by "+this.numSpeakers+" people mainly in "+this.regionsSpoken+".");
        System.out.println("The language follows the word order: "+this.wordOrder+".");
    }

    public static void main(String[] args){
        Language l1 = new Language("Hindi", 12000000, "MP, UP, HR, BR, HP and PJ", "subject-object-verb");
        l1.getInfo();
        Mayan m1 = new Mayan("Tzotzil", 404704);
        m1.getInfo();

        SinoTibetan t1 = new SinoTibetan("Mandarin Chinese", 9812320);
        SinoTibetan t2 = new SinoTibetan("Burmese", 1212098);
        t2.getInfo();
        t1.getInfo();
    }
}
