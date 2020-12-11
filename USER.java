
public class USER {
    private String id;
    private String password;
    private int type;
    private String name;
    private String unit;
    private String telephone;
    private int count;
    public USER() {}
    public USER(String id, String password, int type, String name, String unit, String telephone, int count)
    {
        this.id = id;
        this.password = password;
        this.type = type;
        this.name = name;
        this.unit = unit;
        this.telephone = telephone;
        this.count = count;
    }

    public USER(int i, String password, String s, String 丁一, String 网络中心, String telephone, String s1) {
    }

    public void setId(String id)
    {
        this.id = id;
    }
    public void setPassword(String  password)
    {
        this.password = password;
    }
    public void setType(int type)
    {
        this.type = type;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setUnit(String unit)
    {
        this.unit = unit;
    }
    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }
    public void setCount(int count)
    {
        this.count = count;
    }
    public String getId()
    {
        return id;
    }
    public String getPassword()
    {
        return password;
    }
    public int getType()
    {
        return type;
    }
    public String getName()
    {
        return name;
    }
    public String getUnit()
    {
        return unit;
    }
    public String getTelephone()
    {
        return telephone;
    }
    public int getCount()
    {
        return count;
    }
}
