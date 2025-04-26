class subject
{
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public String getSubId()
    {
        return subId;
    }
    public String getName()
    {
        return name;
    }
    public int getMaxmarks()
    {
        return maxMarks;
    }
    public int getMarksObtain()
    {
        return marksObtain;
  
    }
    public void setMaxmarks(int m)
    {
        m=maxMarks;
    }
    public void setMarksObtain(int o)
    {
        o=marksObtain;
    }
    public subject(String subId,String name)
    {
        this.subId=subId;
        this.name=name;

    }
    public subject(String subId,String name,int maxMarks,int marksObtain)
    {
        this.subId=subId;
        this.name=name;
        this.maxMarks=maxMarks;
        this.marksObtain=marksObtain;
    }
    public subject(String subId,String name,int maxMarks)
    {
        this.subId=subId;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    public String toString()
    {
        return "\nSubject ID: "+subId+"\nName: "+name+"\nMarks obtained: "+marksObtain;
    }
}
class student
{
    private String rollNo;
    private String name;
    private String dept;
    private String sub; 
}

public class scArray_ofObj 
{
    public static void main(String[] args) 
    {
        subject sub[]=new subject[3];
        sub[0]=new subject("s101","DS",100,90);
        sub[1]=new subject("s102","AI",100,60);
        sub[2]=new subject("s103","OS",100,58);

        for(subject s:sub)
        {
            System.out.println(s);
        }
    }
}