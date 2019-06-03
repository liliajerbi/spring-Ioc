package fr.wildcodeschool.thewizardproject.models;


public class Gandalf implements WizardInterface {

    private OutfitInterface myOutfit;

    public Gandalf (OutfitInterface theOutfit) {
        myOutfit = theOutfit;
    }

    @Override
    public String giveAdvice() {
        return "Hola";
    }

    @Override
    public String changeDress() {
        return this.myOutfit.sendOutfit();
    }



}
