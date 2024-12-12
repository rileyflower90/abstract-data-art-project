/**
 * Represents a Dog with a breed and minimum age of life span
 */

import org.code.theater.*;
import org.code.media.*;


public class Dogs {
private String breed;
private String bredfor;
private int minagespan;
private int minheight;

  
  /** Constructor */
  public Dogs(String breed, String bredfor, int minagespan, int minheight) {
    this.breed = breed;
    this.bredfor = bredfor;
    this.minagespan = minagespan;
    this.minheight = minheight;
  }

  
  /** Accessor Method for breed */
  public String getBreed() {
    return breed;
  }

  /** Accessor Method for bredfor */
  public String bredfor() {
    return bredfor;
  }

    /** Accessor Method for minagespan */
  public int minagespan() {
    return minagespan;
  }

  /** Accessor Method for minheight */
  public int minheight() {
    return minheight;
  }

  
  /** toString Method displaying breed */

  
  public String toStringBreed(){
    return "Breed: "+ breed;
  }
    

  /** toString Method displaying breedfor */
public String toStringBreed(){
    return "Bred For: "+ bredfor;
}

  /** toString Method displaying minagespan */
public int toStringMinAgeSpan(){
  return "Minimum Age Life Span: "+ minagespan;
}

  /** toString Method displaying minheight */
public int toStringMinHeight(){
  return "Minimum Height: " + minheight;
}
}