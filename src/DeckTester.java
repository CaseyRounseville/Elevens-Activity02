/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
  
  /**
   * The main method in this class checks the Deck operations for consistency.
   * @param args is not used.
   */
  public static void main(String[] args) {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
    String[]ranks=new String[]{"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};
    String[]suits=new String[]{"clubs","hearts","spades","daimonds"};
    int[]values=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13};
    Deck a=new Deck(ranks,suits,values);
    Deck b=new Deck(ranks,suits,values);
    Deck c=new Deck(ranks,suits,values);
    System.out.println("-----deck a-----");
    System.out.println("isEmpty: "+a.isEmpty());
    System.out.println("size: "+a.size());
    System.out.println("deal: "+a.deal());
    System.out.println("isEmpty: "+a.isEmpty());
    System.out.println("toString: "+a.toString());
    int size=a.size();
    for(int i=0;i<size;i++){
      a.deal();
    }
    System.out.println("isEmpty after dealing all the cards: "+a.isEmpty());
    System.out.println("-----deck b-----");
    System.out.println("isEmpty: "+b.isEmpty());
    System.out.println("size: "+b.size());
    System.out.println("deal: "+b.deal());
    System.out.println("isEmpty: "+b.isEmpty());
    System.out.println("toString: "+b.toString());
    System.out.println("-----deck c-----");
    System.out.println("isEmpty: "+c.isEmpty());
    System.out.println("size: "+c.size());
    System.out.println("deal: "+c.deal());
    System.out.println("isEmpty: "+c.isEmpty());
    System.out.println("toString: "+c.toString());
  }
}
