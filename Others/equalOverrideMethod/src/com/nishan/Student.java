package com.nishan;

public class Student {
    private int id ;
    private String name;

    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Student))
            return false;
        if (obj == this)
            return true;

        return
                this.getId() == ((Student) obj).getId()&&
                this.getName() == ((Student) obj).getName();

        //To match only ID need to execute below mentioned code:
        //return this.getId() == ((Student) obj).getId()
    }
}

