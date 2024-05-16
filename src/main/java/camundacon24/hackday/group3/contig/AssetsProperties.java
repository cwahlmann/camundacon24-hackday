package camundacon24.hackday.group3.contig;


import java.util.List;


@ConfigurationProperties("assets")
public class AssetsProperties {
    private List<String> haircolor;
    private List<String> eyecolor;
    private List<String> body;
    private List<String> gender;
    private List<String> locations;
    private List<String> hobbies;

    public List<String> getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(List<String> haircolor) {
        this.haircolor = haircolor;
    }

    public List<String> getEyecolor() {
        return eyecolor;
    }

    public void setEyecolor(List<String> eyecolor) {
        this.eyecolor = eyecolor;
    }

    public List<String> getBody() {
        return body;
    }

    public void setBody(List<String> body) {
        this.body = body;
    }

    public List<String> getGender() {
        return gender;
    }

    public void setGender(List<String> gender) {
        this.gender = gender;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
