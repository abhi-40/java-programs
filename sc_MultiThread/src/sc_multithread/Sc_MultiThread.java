
package sc_multithread;
class WhiteBoard
{
    String text;
    int noOfStudent;
    int count=0;
    
    public void attendance()
    {
        noOfStudent++;
    }
   synchronized public void write(String txt)
    {
        System.out.println("Teacher is writing..."+txt);
        while(count!=0)
        {
        try{wait();}catch(Exception e){}
        }
        text=txt;
        count=noOfStudent;
        notifyAll();
        }
   
   synchronized public String read()
   {
       while(count==0)
       {
       try{wait();}catch(Exception e){}
       }
       String t=text;
       count--;
       if(count==0)
            notify();
       return t; 
   }
}
class Teacher extends Thread
{
    WhiteBoard e;
    String notes[]={"Java is a prog... Lang","It is a oop lang...","It supports multithreading","End"};
    public Teacher(WhiteBoard w)
    {
        e=w;
    }
    public void run()
    {
        for(int i=0;i<notes.length;i++)
        {
            e.write(notes[i]);
        }
    }
}
class student1 extends Thread
{
    String name;
    WhiteBoard e;
   public student1(String name,WhiteBoard e)
   {
       this.e=e;
       this.name=name;
      
   }
    public void run()
   {
      String text;
      e.attendance();
      do{
          text=e.read();
          System.out.println(name + "Student reading" + text);
          System.out.flush();
      }while(!text.equals("end"));
   }
}

public class Sc_MultiThread
{
    public static void main(String[] args) 
    {
        WhiteBoard w=new WhiteBoard();
        Teacher T=new Teacher(w);
        student1 one=new student1("Abhishek",w);
        student1 two=new student1("Aman",w);
        student1 three=new student1("Yash",w);
        
        T.start();
        one.start();
        two.start();
        three.start();
    }
    
}
