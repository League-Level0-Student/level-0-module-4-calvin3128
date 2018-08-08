

PImage eye;
void setup(){
  size(800,800);
  eye = loadImage("eye.png");
}

void draw(){
  background(0,0,0);

eye.resize(width,height);
image(eye,0,0);

ellipse(400,400,100,100);


}