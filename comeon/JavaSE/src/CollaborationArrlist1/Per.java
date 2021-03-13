package CollaborationArrlist1;

/**
 * @author shkstart
 * @create 2019 上午 10:50
 */
public class Per {

     int id;
     String name;

    public Per(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Per() {}
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Per per = (Per) o;

        if (id != per.id) return false;
        return name != null ? name.equals(per.name) : per.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
