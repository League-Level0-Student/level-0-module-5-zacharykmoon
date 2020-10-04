int x = 250;
int y = 250;
int speed = 2;
int x2 =  300;
int y2 = 250;
int speed2 = -2;
void setup() {
  size(500, 500);
noFill();

}


void draw() { background(150);
  // Go to the recipe to run the demonstration before starting this program
  for(int i=0; i<10; i++){ ellipse(x,y, i*10, i*10);}
  x += speed;
   for(int i=0; i<10; i++){ ellipse(x2,y2, i*10, i*10);}
  x2 += speed2;
    
  if(x > width || x < 0){
   speed = -speed; 
  }
    if(x2 > width || x < 0){
   speed2 = -speed2; 
  }
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
  
}
