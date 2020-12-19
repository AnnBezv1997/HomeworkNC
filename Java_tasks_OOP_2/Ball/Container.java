package Ball;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        x1 = x;
        y1 = y;
        x2 = x1 + width;
        y2 = y1 + height;
    }

    public int getX() {
        return x1;
    }
    public int getY() {
        return y1;
    }
    public int getWidth(){
        return (x2 - x1);
    }
    public int getHeight(){
        return (y2 - y1);
    }
    
   private boolean collidesX(Ball ball){
        if(ball.getX()-ball.getRadius() >= this.x1){
            if(ball.getX() + ball.getRadius() <= this.x2){
                return true;
            }
        }
        return false;
    }

    private boolean collidesY(Ball ball){
        if(ball.getY()-ball.getRadius() >= this.y1){
            if(ball.getY() + ball.getRadius() <= this.y2){
                return true;
            }
        }
        return false;
    }

    public boolean collides(Ball ball){
        if ( collidesX(ball) && collidesY(ball) ){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Container[" + "(" + x1 + ", " + y1 + "),(" + x2 + ", " + y2 + ")]";
    }
}
