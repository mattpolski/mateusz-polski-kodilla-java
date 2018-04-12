package com.kodilla.good.patterns.challenges.Food;

interface ContractorAdd {

    Contractor getContractor(final int id);
    void addContractor(final int id, final Contractor contractor);

}
