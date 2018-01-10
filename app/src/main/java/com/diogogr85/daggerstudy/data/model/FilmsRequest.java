package com.diogogr85.daggerstudy.data.model;

import java.util.List;

/**
 * Created by diogoribeiro on 04/01/18.
 */

public class FilmsRequest {

    private List<Film> results;

    public List<Film> getResults() {
        return results;
    }

    public void setResults(List<Film> results) {
        this.results = results;
    }
}
