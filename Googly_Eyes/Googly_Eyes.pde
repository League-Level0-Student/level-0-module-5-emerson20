void setup() {
  size(800, 500);
  PImage face = loadImage("Hermione.jpg");
  face.resize(800, 500);
  background(face);
}
void draw() {
 
   fill(255, 255, 255);
   ellipse(268, 175, 150, 75);
   fill(0, 0, 0);
   println("mouseY"+mouseY);
   ellipse(constrain(mouseX, 218, 312),constrain(mouseY, 165, 185), 40, 40);
   fill(255, 255, 255);
   ellipse(536, 170, 155, 75);
   fill(0, 0, 0);
   ellipse(constrain(mouseX, 500, 589),constrain(mouseY, 160, 178), 40, 40);
}