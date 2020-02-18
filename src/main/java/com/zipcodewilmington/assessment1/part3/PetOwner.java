package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    private String name;
    private ArrayList<Pet> pets = new ArrayList<>();

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {

        this.name = name;

        if(pets != null) {
            for(Pet element : pets) {
                this.pets.add(element);
                element.setOwner(this);
            }
        }
        /*if (pets != null) {
            this.pets = new Pet[pets.length];
        }

        int index = 0;
        if(pets != null) {
            for (Pet element : pets) {
                this.pets[index] = element;
                index++;
            }
        }

        for(Pet element : this.pets) {
            element.setOwner(this);
        }*/

    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

        /*Pet[] newPets = new Pet[1];
        newPets[0] = pet;
        this.pets = newPets;*/
        pets.add(pet);

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        pets.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        /*for (Pet element : pets) {
            if (element.equals(pet)) {
                return true;
            }
        }
        return false;*/
        return pets.contains(pet);

    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {

        Integer youngestPet = pets.get(0).getAge();
        for (int i = 0; i < pets.size() ; i++) {
            if(pets.get(i).getAge() < youngestPet) {
                youngestPet = pets.get(i).getAge();
            }
        }
        return youngestPet;

    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {

        Integer oldestPet = pets.get(0).getAge();
        for (int i = 0; i < pets.size() ; i++) {
            if(pets.get(i).getAge() > oldestPet) {
                oldestPet = pets.get(i).getAge();
            }
        }
        return oldestPet;

    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {

        int sum = 0;
        for (int i = 0; i < pets.size(); i++) {
            sum += pets.get(i).getAge();
        }
        Float average = Float.valueOf(sum / pets.size());
        return average;

    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.pets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {

        if(pets.size() == 0) {
            Pet[] noPets = new Pet[1];
            noPets[0] = null;
            return noPets;
        }

        Pet[] ownsPets = new Pet[pets.size()];
        for (int i = 0; i < ownsPets.length; i++) {
            ownsPets[i] = pets.get(i);
        }

        return ownsPets;
    }
}
