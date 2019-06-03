package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("theWizard")
public class Gandalf implements WizardInterface {

    private OutfitInterface myOutfit;

    @Autowired
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
