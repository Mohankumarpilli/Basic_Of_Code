package Oops;

public class Student {
    private  int id;
    private String name;
    private int psp;

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPsp(int psp) {
        this.psp = psp;
    }
    public void setters(int id,String name,int psp){
        this.id = id;
        this.name = name;
        this.psp = psp;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getPsp(){
        return psp;
    }
    public void display(){
        System.out.println(id+ " " +name+ " "+ psp);
    }
}
