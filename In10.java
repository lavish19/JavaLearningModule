class Ball{
	interface Color{
		String color(String color) ;
			
		}
	}
class FootBall implements Ball.Color{
	public String color(String color) {
		String ballColor=color;
		System.out.println(ballColor);
		return ballColor;
	}
} 
class VolleyBall implements Ball.Color{
	public String color(String color) {
		String ballColor=color;
		System.out.println(ballColor);
		return ballColor;
	}
}
class Game{
	public static void main(String[] args) {
		FootBall f=new FootBall();
		VolleyBall v=new VolleyBall();
		String a=f.color("red");
		String b=v.color("blue");
		
		
		
	
	}
}

