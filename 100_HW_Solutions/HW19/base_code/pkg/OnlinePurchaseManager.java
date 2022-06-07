package pkg;
import java.util.ArrayList;

public class OnlinePurchaseManager
{
   private ArrayList <Gizmo> purchases;
   
   public OnlinePurchaseManager(){
    purchases = new ArrayList<Gizmo>();
   }
   
   public void add(String n, boolean p, double r){
      Gizmo local = new Gizmo(n, p, r);
      
      purchases.add(local);
   }

   
   public Gizmo getCheapestGizmoByMaker( String mkr )
   {
   double compare = Integer.MAX_VALUE;
   int minindex = -1;
   
   	for(int index=0; index < purchases.size() ; index++){
   	   Gizmo test = purchases.get(index);
   	   if((test.getCost() < compare) &&((test.getMaker()).equals(mkr))){
   	      compare = test.getCost();
   	      minindex = index;
   	   }
   	}
   	
   return purchases.get(minindex);
   
   }
   
   public int countElectronicsByMaker(String mkr){
      int count = 0;
      for(int index = 0; index < purchases.size(); index++){
         Gizmo test = purchases.get(index);
         
         if((test.getMaker()).equals(mkr)){
            count++;
         }
      }
      return count;
   }
   
  public boolean hasAdjacentEqualPair(){
     int j = 0;
     
     for(int i = 0; i < purchases.size(); i++){
     j = i+1;
     
     if((purchases.get(i)).equals(purchases.get(j))){
       return true;
     }
     
     }
 
     return false;
     
  }

   
   public String toString()
   {
   	return "" + purchases;
   }
}
