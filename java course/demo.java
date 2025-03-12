class human 
{
    private int age;
    private String  name;

    public human()
    {
         age = 21;
         name = "naveen";
        System.out.println(" in constructor");
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }



}













class demo
{
    public static void main(String args[])
    {
        human obj = new human();
        human obj1 = new human();
        //obj.setAge(21);
        //obj.setName("naveen");
        System.out.println(obj.getAge()+":"+obj.getName());
    }
}