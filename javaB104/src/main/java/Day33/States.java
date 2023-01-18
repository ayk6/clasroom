package Day33;

import java.util.Arrays;

public enum States {
    ALABAMA("Alabama","Al","Montgomery"),
    ALASKA("Alaska","Ak","Juneau"),
    ARIZONA("Arizona","Az","Phoenix"),
    ARKANSAS("Arkansas","Ar","Lil Rock");

    private final String stateName;
    private final String abbreviation;
    private final String capital;

    States(String stateName, String abbreviation, String capital) {
        this.stateName = stateName;
        this.abbreviation = abbreviation;
        this.capital = capital;
    }

    public String getStateName() {
        return stateName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getCapital() {
        return capital;
    }


    public static String getStateNameFromCapital(String capital) {
        return Arrays.stream(values()).filter
                (States->States.getCapital().equals(capital))
                .findFirst().get().getStateName();
    }
}
