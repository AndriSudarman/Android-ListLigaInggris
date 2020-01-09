package id.ac.poliban.mi.andri.listligainggris;

public class Club {
    private String club;
    private String clubName;
    private String clubDesc;

    public Club(String club, String clubName, String clubDesc) {
        this.club = club;
        this.clubName = clubName;
        this.clubDesc = clubDesc;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubDesc() {
        return clubDesc;
    }

    public void setClubDesc(String clubDesc) {
        this.clubDesc = clubDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getClubName(), getClubDesc());
    }
}
