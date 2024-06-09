// Date.java
class Date {
    private int day;
    private String month;
    private int year;

    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day + "-" + month + "-" + year;
    }
}

// Member.java
class Member {
    private int memberID;
    private String lastName;
    private String firstName;
    private int handicap;
    private char gender;
    private String team;
    private String memberType;
    private int coach;
    private long phone;
    private Date joinDate;

    public Member(int memberID, String lastName, String firstName, int handicap, char gender, String team, String memberType, int coach, long phone, Date joinDate) {
        this.memberID = memberID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.handicap = handicap;
        this.gender = gender;
        this.team = team;
        this.memberType = memberType;
        this.coach = coach;
        this.phone = phone;
        this.joinDate = joinDate;
    }

    public void display() {
        System.out.println(String.format("%-10d %-10s %-10s %-8d %-10c %-10s %-8s %-10d %-15d %-12s",
                memberID, lastName, firstName, handicap, gender, (team != null ? team : "N/A"), (memberType != null ? memberType : "N/A"), coach, phone, joinDate));
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public String getMemberType() {
        return memberType;
    }

    public int getHandicap() {
        return handicap;
    }

    public char getGender() {
        return gender;
    }

    public String getTeam() {
        return team;
    }
}

// Minor.java
public class Minor {
    public static void main(String[] args) {
        Member[] members = {
            new Member(118, "McKenzie", "Melissa", 30, 'F', null, null, 0, 963270, new Date(28, "May", 2005)),
            new Member(138, "Stone", "Michael", 30, 'M', "Junior", "Senior", 0, 983223, new Date(31, "May", 2009)),
            new Member(153, "Nolan", "Brenda", 11, 'F', "TeamB", "Senior", 442649, 0, new Date(12, "Aug", 2006)),
            new Member(176, "Branch", "Helen", 0, 'F', "Social", null, 0, 589419, new Date(6, "Dec", 2011)),
            new Member(178, "Beck", "Sarah", 0, 'F', "Social", null, 0, 226596, new Date(24, "Jan", 2010)),
            new Member(228, "Burton", "Sandra", 26, 'F', "Junior", null, 0, 244493, new Date(9, "Jul", 2013)),
            new Member(235, "Cooper", "William", 14, 'M', "TeamB", "Senior", 153, 722954, new Date(5, "Mar", 2008)),
            new Member(239, "Spence", "Thomas", 10, 'M', null, "Senior", 697720, 0, new Date(22, "Jun", 2006)),
            new Member(258, "Olson", "Barbara", 16, 'F', null, "Senior", 370186, 0, null),
            new Member(286, "Pollard", "Robert", 19, 'M', null, null, 0, 0, null),
            new Member(290, "Sexton", "Thomas", 26, 'M', "TeamB", "Junior Senior", 235, 617681, new Date(29, "Jul", 2013)),
            new Member(323, "Wilcox", "Daniel", 3, 'M', "TeamA", "Senior", 665393, 0, new Date(28, "Jul", 2008)),
            new Member(331, "Schmidt", "Thomas", 25, 'M', null, "Senior", 153, 867492, new Date(7, "Apr", 2009)),
            new Member(332, "Bridges", "Deborah", 12, 'F', null, "Senior", 235, 279087, null),
            new Member(339, "Young", "Betty", 21, 'F', "TeamB", "Senior", 507813, 0, null),
            new Member(414, "Gilmore", "Jane", 5, 'F', "TeamA", "Junior", 153, 459558, new Date(23, "Mar", 2007)),
            new Member(415, "Taylor", "William", 7, 'M', "TeamA", "Senior", 235, 137353, new Date(27, "Nov", 2007)),
            new Member(461, "Reed", "Robert", 3, 'M', "TeamA", "Senior", 235, 994664, new Date(5, "Aug", 2005)),
            new Member(469, "Willis", "Carolyn", 29, 'F', null, null, 0, 688378, new Date(14, "Jan", 2011)),
            new Member(487, "Kent", "Susan", 0, 'F', "Social", null, 0, 707217, new Date(7, "Oct", 2010))
        };

        // Display the records where the member’s JoinDate is earlier than 07-Apr-09
        System.out.println("Members joined before 07-Apr-2009:");
        System.out.println(String.format("%-10s %-10s %-10s %-8s %-10s %-10s %-8s %-10s %-15s %-12s",
                "Member ID", "Last Name", "First Name", "Handicap", "Gender", "Team", "Member Type", "Coach", "Phone", "Join Date"));
        Date targetDate = new Date(7, "Apr", 2009);
        for (Member member : members) {
            if (member.getJoinDate().toString().compareTo(targetDate.toString()) < 0) {
                member.display();
            }
        }
        System.out.println();

        // Display the records of all senior members whose handicap score is less than 12
        System.out.println("Senior members with handicap less than 12:");
        System.out.println(String.format("%-10s %-10s %-10s %-8s %-10s %-10s %-8s %-10s %-15s %-12s",
                "Member ID", "Last Name", "First Name", "Handicap", "Gender", "Team", "Member Type", "Coach", "Phone", "Join Date"));
        for (Member member : members) {
            if ("Senior".equals(member.getMemberType()) && member.getHandicap() < 12) {
                member.display();
            }
        }
        System.out.println();

        // Display the records of all the female senior members who are part of TeamB
        System.out.println("Female senior members part of TeamB:");
        System.out.println(String.format("%-10s %-10s %-10s %-8s %-10s %-10s %-8s %-10s %-15s %-12s",
                "Member ID", "Last Name", "First Name", "Handicap", "Gender", "Team", "Member Type", "Coach", "Phone", "Join Date"));
        for (Member member : members) {
            if ('F' == member.getGender() && "Senior".equals(member.getMemberType()) && "TeamB".equals(member.getTeam())) {
                member.display();
            }
        }
    }
}
