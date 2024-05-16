package camunda.hackday.group3.datingapp;

public class Matcher {
    public static int getMatchpoints(DatingProps.Preference preference, DatingProps.Profile profile) {
        var result = 0;
        if (profile.age() >= preference.ageFrom() && profile.age() <= preference.ageTo()) {
            result ++;
        }
        if (matches(preference.haircolor(), profile.haircolor() )) {
            result++;
        }
        if (matches(preference.eyecolor(), profile.eyecolor() )) {
            result++;
        }
        return result;
    }

    public static boolean matches(String preference, String profile) {
        return preference == null || preference.isEmpty() || preference.equals(profile);
    }

}
