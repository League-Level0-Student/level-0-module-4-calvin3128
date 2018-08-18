import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;


PImage donkey;
PImage tail;
int bgs = 0;
int gs = 0;
    int tx = mouseX;
    int ty = mouseY;
    int r;
    int g;
    int b;

void setup(){
  
  
  Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to
  
  
  size(550,406);
  donkey = loadImage("donkey.jpg");
  tail = loadImage("tail.png");
  tail.resize(100,0);
}

void draw(){
  if(bgs == 0){
  background(r,g,b);
  r++;
  b = b + 3;
  b--;
  r = r%255;
  b = b%255;
  g = g%255;
  }
  else{
    background(donkey);
  }
  if(gs == 0){
    tx = mouseX;
    ty = mouseY;
  }
  image(tail,tx,ty);
  
  if(bgs < 2 && gs == 0){
  if(mouseX > 0 && mouseX < 50 && mouseY > 0 && mouseY < 50){
   bgs = 1;   
  }
  else{
    bgs = 0;
  }
  }
  
  if(mousePressed){
    println("x: " + mouseX + " y: " + mouseY);
    checkloc();
    gs = 1;
    bgs = 2;
  }
  
}

void checkloc(){
 if(mouseX > 475 && mouseX < 515){
  if(mouseY > 100 && mouseY < 155){
    bgs = 2;
    win();
  }
 }
}

void win(){
  woohooSound.trigger();
     playSound = false;
}