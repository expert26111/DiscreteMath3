
package discretemathhomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestClass {

    public static void main(String... args) throws Exception {

        List<String> list2 = new ArrayList<String>(Arrays.asList("B", "C", "D", "E", "F","A"));
        List<String> list1 = new ArrayList<String>(Arrays.asList("B", "C", "D", "E", "F","A"));
        System.out.println(new TestClass().intersection(list1, list2));
        System.out.println(new TestClass().union(list1, list2));
        System.out.println(new TestClass().membership(list1, list2));
        System.out.println(new TestClass().difference(list1, list2));
        System.out.println(new TestClass().complement(list1, list2));
        System.out.println("Are the sets subsets or equal or undeterminable? : " + new TestClass().membershiRelation(list1, list2));
    }

    public <T> List<T> union(List<T> list1, List<T> list2) {
        Set<T> set = new HashSet<T>();
        set.addAll(list1);
        set.addAll(list2);
        return new ArrayList<T>(set);
    }

       public <T> List<T> difference(List<T> list1, List<T> list2) 
       {
            Set<T> set = new HashSet<T>();
            set.addAll(list1);
            set.removeAll(list2);
            return new ArrayList<T>(set);
       }
       
        public <T> List<T> complement(List<T> list1, List<T> list2) 
       {
            Set<T> set = new HashSet<T>();
            set.addAll(list2);
            set.removeAll(list1);
            return new ArrayList<T>(set);
       }
    
    public <T> List<T> intersection(List<T> list1, List<T> list2) 
    {
        List<T> list = new ArrayList<T>();
        for (T t : list1) 
        {
            if(list2.contains(t)) 
            {
                list.add(t);
            }
        }
        return list;
    }
    
    
    
    public <T> int undertiminable(List<T> list1, List<T> list2) 
    {
        int big = Integer.MAX_VALUE ;
        int small = Integer.MIN_VALUE ;
        
        if((list1.size() > big) || (list1.size() < small) || (list2.size() > big) || (list2.size() < small))
            {
                  return 2;
            }
        else
        {
            return 3;
        }
    }
    
      public <T> int membershiRelation(List<T> list1, List<T> list2) 
      {
            //which one is the bigger list
        int result = undertiminable(list1,list2);
        if(result == 2)
        {
            return 2;
        }else
        {
                            List<T> list;
                            list = intersection(list1,list2);
                            if(list1.size() == list2.size() && list.size() == list1.size())
                        {
                            //for loop for checking same elemnts
                      
                            return 0;
                        }

                            
                     
                           if(list1.size() == list.size() && list1.size() < list2.size())
                          {
                               return -1;
                          }
                           else if (list2.size() == list.size() && list1.size() > list2.size())
                          {
                            return 1;  
                          }

               
        }
        
          
          return -2;
      }
      
      
    
    
        public <T> int membership(List<T> list1, List<T> list2) {
               List<T> list;
            if(list1.size() > list2.size())
            {
                 list =  intersection(list1,list2);
            }
            else
            {
                list =  intersection(list2,list1);
            }
       
       if(!list.isEmpty())
       {
           if(list.size() == list1.size())
           {
               
               return 1;
               
           }else
           {
               return -1;
           }
            
       }else
       {
           return -1;
       }

       
       
        }
}


