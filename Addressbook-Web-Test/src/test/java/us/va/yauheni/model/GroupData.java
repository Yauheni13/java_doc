package us.va.yauheni.model;

public class GroupData {
    private int id;
    private final String namegroup;
    private final String header;
    private final String footer;


    public GroupData(int id, String namegroup, String header, String footer) {
        this.id = id;
        this.namegroup = namegroup;
        this.header = header;
        this.footer = footer;
    }

    public void setId(int id){
        this.id = id;
    }
    public String getNamegroup() {
        return namegroup;
    }

    public int getId() {
        return id;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

    @Override
    public String toString() {
        return "GroupData{" +
                "id=" + id +
                ", namegroup='" + namegroup + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupData groupData = (GroupData) o;

        if (id != groupData.id) return false;
        return namegroup != null ? namegroup.equals(groupData.namegroup) : groupData.namegroup == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (namegroup != null ? namegroup.hashCode() : 0);
        return result;
    }
}
