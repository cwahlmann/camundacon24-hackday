package camundacon24.hackday.group3.contig;

import java.util.List;

public record DatingProps(String name, String firstName, String mobile) {
    public record Profile(int age, String haircolor, String eyecolor, String gender, String location, List<String> hobbies, String description) {
    }
    public record Preference(int ageFrom, int ageTo, String haircolor, String eyecolor, String gender, String location, List<String> hobbies, String description) {
    }
}
