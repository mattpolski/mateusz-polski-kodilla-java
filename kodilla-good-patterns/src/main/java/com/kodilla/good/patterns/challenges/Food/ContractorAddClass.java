package com.kodilla.good.patterns.challenges.Food;

import java.util.HashMap;
import java.util.Map;

public final class ContractorAddClass implements ContractorAdd {

    private final Map<Integer, Contractor> contractorAdd = new HashMap<>();

    @Override
    public void addContractor(int id, Contractor contractor) {
        contractorAdd.put(id, contractor);
    }

    @Override
    public Contractor getContractor(int id) {
        final Contractor contractor = contractorAdd.get(id);
        return contractor;
    }
}
