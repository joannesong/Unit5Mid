package nyc.c4q.unit5midassesssment.model;

import java.util.List;

/**
 * Created by joannesong on 1/24/18.
 */

public abstract class User {

    private Info info;
    private List<Results> results;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }
}
