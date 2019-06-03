package fr.wildcodeschool.thewizardproject.models;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("theMagician")
public class Dumbledore implements WizardInterface {

    private OutfitInterface myOutfit;

    @Autowired
    public Dumbledore (OutfitInterface theOutfit) {
        myOutfit = theOutfit;
    }

    @Override
    public String giveAdvice() {
        return "Roar";
    }

    @Override
    public String changeDress() {
        return this.myOutfit.sendOutfit();
    }
}
