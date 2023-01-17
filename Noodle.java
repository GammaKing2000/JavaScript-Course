class Pho extends Noodle {

    Pho() {

        super(30.0, 0.64, "flat", "rice flour");

    }

    @Override
    public String getCookPrep() {

        return "Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.";

    }

}

class Ramen extends Noodle {

    Ramen() {

        super(30.0, 0.3, "flat", "wheat flour");

    }

    @Override
    public String getCookPrep() {

        return "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.";

    }

}

class Spaghetti extends Noodle {

    Spaghetti() {

        super(30.0, 0.2, "round", "semolina flour");

    }

    @Override
    public String getCookPrep() {

        return "Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.";

    }

}
class Noodle {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public String getCookPrep() {

        return "Boil noodle for 7 minutes and add sauce.";

    }


    public static void main(String[] args) {

        Noodle spaghetti, ramen, pho;

        spaghetti = new Spaghetti();
        ramen = new Ramen();
        pho = new Pho();

        // Add your code below:
        Noodle[] allTheNoodles = {spaghetti, ramen, pho};

        for(Noodle noodle : allTheNoodles){
            System.out.println(noodle.getCookPrep());
        }

    }

}
