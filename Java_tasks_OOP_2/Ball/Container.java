package Ball;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    // Добавила конструктор по умолчанию он задает левую верхнюю точку контейнера(0.0)
    public Container(){
        this.x1 = 0;
        this.y1 = 0;
    }

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
    // сеттеров не было добавила сеттеры для правой нижней точки x2 y2 и левой верхней x1 x2
    public void setX2(int x2){
        this.x2 = x2;
    }
    public void setY2(int y2){
        this.y2 = y2;
    }
    public void setX1(int x1){
        this.x1 = x1;
    }
    public void setY1(int y1){
        this.y1 = y1;
    }
    public boolean collides(Ball ball){
        boolean chek = false;
        if ( ball.getX()-ball.getRadius() >= this.x1 &&  ball.getX() + ball.getRadius() <= this.x2){
            if (ball.getY() - ball.getRadius() >= this.y1 &&  ball.getY() + ball.getRadius()<= this.y2){
            chek = true;
            }
        }
        return chek;

    }

    @Override
    public String toString() {
        return "Container[" + "(" + x1 + ", " + y1 + "),(" + x2 + ", " + y2 + ")]";
    }
}
