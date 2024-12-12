import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a Scene to be played in the Theater using data from
 * a choses dataset
 */
public class DataScene extends Scene {
  private Dogs[] Dog;      // 1D array of Person objects
private String soundFile1;

/** Constructor */
// sound files displayed in the video
  
public DataScene(String soundFile1){
this.soundFile1 = soundFile1;
Dogs = createDogs();
}

  
  
  /** Returns a 1D array of Person objects using the txt files in this project */
  public Dog[] createDogs() {
    String[] breedArray = FileReader.toStringArray("breed.txt");
    String[] bredForArray = FileReader.toStringArray("bredfor.txt");
    int[] minAgeSpanArray = FileReader.toIntArray("minagespan.txt");
    int[] minHeightArray = FileReader.toIntArray("minheight.txt");

    

    Dogs[] dogsArray = new Dogs[breedArray.length];
    for (int i = 0; i < dogsArray.length; i++) {
    dogsArray[i] = new Dogs(breedArray[i], bredForArray[i], minAgeSpanArray[i], minHeightArray[i]);
}
    return dogsArray;
  }

  /**
   * Top-level method to draw the animation
   */
  public void drawScene() {
  //Displays the dog breeds
  for(int i = 0; i < Dogs.length; i++){

    pause (1.0);
    clear("green");

if (i==0){
  drawImage ("cute-dog.png", 300, 100, 150);
  text(Dogs[i]);
  )else if (i==1)
  drawImage ("cute-dog.png", 300, 100, 100);
  text(Dogs[i]);
  )else if (i==2)
  drawImage ("cute-dog.png", 300, 100, 100);
  text(Dogs[i]);
  )else if (i==3)
  drawImage ("cute-dog.png", 300, 100, 100);
  text(Dogs[i]);
  )else if (i==4)
  drawImage ("cute-dog.png", 300, 100, 100);
  text(Dogs[i]);
}
    clear("purple");

    pause (0.5);

    drawImage("cute-dog.png", 100, 60, 200);
  }
    
    

    
    setTextStyle(Font.MONO, FontStyle.BOLD);
    setTextColor("white");
    drawText("Hello! I'm a Golden Retriever", 30, 310);
    
 
    
  }

  /** Other Methods */

//plays the sounds
public void text(Dogs d) {
  playSound(soundFile1);
  pause(0.5);
  drawText(d.toStringBreed(), 20, 50);
  drawText(d.toStringBredFor(), 20, 70);
  drawText(d.toStringMinAgeSpan(), 20, 90);
  drawText(d.toStringMinHeight(), 20, 110);


  

}

  
}