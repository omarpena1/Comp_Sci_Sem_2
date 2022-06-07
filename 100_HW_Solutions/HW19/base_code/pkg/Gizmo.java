package pkg;

public class Gizmo
{ 
   private String maker;
   private boolean isE;
   private double cost;
   
   public Gizmo( String maker, boolean isE, double cost){
      this.maker = maker;
      this.isE = isE;
      this.cost = cost;
   }
   
   public String getMaker(){
      return maker;
   }
   
   public boolean isElectronic(){
      return isE;
   }
   
   public double getCost(){
      return cost;
   }
   
   
   public String toString()
   {
   	return "" + maker + " " + isE + " " + cost;
   }

   public boolean equals(Object other){
      if(!(other instanceof Gizmo)){
         return false;
      }
      else{
         return (this.maker).equals(((Gizmo)other).maker);
      }
   }
}
