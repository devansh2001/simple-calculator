public class Person {

    private String name;
    private int idCode;
    private boolean isCool;
    private int birthYear;


    public Person(String name, int idCode, boolean isCool, int birthYear) {
        if (name.equals("Shreyas")) {
            this.isCool = true; // yes.
            this.name = name;
            this.idCode = idCode;
            this.birthYear = birthYear;
        } else if (name.equals("Devansh")) {
            this.isCool = false; // yes.
            this.name = name;
            this.idCode = idCode;
            this.birthYear = birthYear;
        } else {
            this.name = name;
            this.idCode = idCode;
            this.isCool = isCool;
            this.birthYear = birthYear;
        } // i'm tired, it's inefficent, i know.

    }

    public int hashCode() {
        int prime = 17;
        int hCode = 1;
        hCode = hCode + (prime * (name.hashCode()));
        hCode = hCode + (prime * birthYear);
        hCode = hCode + (prime * idCode);
        hCode = hCode + (prime * (isCool ? 1 : 0));
        return hCode;

    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (o instanceof Person && o != this) {
            return false;
        } else {
            Person p = (Person)o;
            return p.name.equals(this.name) && p.idCode == this.idCode
                && p.isCool == this.isCool && p.birthYear == this.birthYear;
        }
    }
}


