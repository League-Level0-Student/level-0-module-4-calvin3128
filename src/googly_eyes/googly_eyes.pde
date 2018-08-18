  int x = 0;
  int y = 0;


void setup(){
  size(800,800);
  PImage eye = loadImage("eye.jpg");
  eye.resize(800,800);
  image(eye,0,0);
}

void draw(){
   setup();
if(mouseX > 500){
  x = 500;
} else if(mouseX < 325){
  x = 325;
} else{
  x = mouseX;
}

if(mouseY > 400){
  y = 400;
} else if(mouseY < 300){
  y = 300;
} else{
  y = mouseY;
}

  noStroke();
  fill(0,0,0);
  ellipse(x,y,75,75);
  println("x: " + mouseX); //500 right, 325 left
  println("y: " + mouseY); //400 low, 300 high
}