package Oops;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();

        st.setId(1);
        st.setName("Mohan");
        st.setPsp(98);
        st.display();

        st.setId(2);

        int id = st.getId();
        String name = st.getName();
        int psp = st.getPsp();
        System.out.println(id+ " " + name + " "+ psp);
    }
}
