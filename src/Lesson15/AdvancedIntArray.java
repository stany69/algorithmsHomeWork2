package Lesson15;

public class AdvancedIntArray {
    private int[] source;
    public AdvancedIntArray(int numberOfElements)
    {
        source= new int[numberOfElements];
    }


    public int get(int index)
    {
        return source[index];
    }

    public void set(int index,int value)
    {
        source[index]=value;
    }

    public int size()
    {
        return source.length;
    }

    public void append(int value)
    {
       // int[] newSource = new int[size()+1];
        int[] newSource = new int[source.length+1];
       for(int i = 0;i<source.length;i++){
           newSource[i]=source[i];
       }
       newSource[size()]= value;
       source = newSource;
    }
    public void insert(int index,int value)
    {

    }
    public void delete(int index)
    {

    }
   // public boolean contains(int value)
    {

    }
          //    for(i:source){

    }

//}

