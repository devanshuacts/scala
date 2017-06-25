
package com.cdac.scala

class classExa1(val xc: Int, val yc: Int) {
	var x: Int = xc
	var y: Int = yc
	
	def move(dx: Int, dy: Int){
		x = x + dx;
		y = y + dy;
		println("Point x location: " + x);
		println("Point y location: " + y);
	}
}

object Test1{
	def main(args: Array[String]) {
		val pt = new classExa1(10, 20);
		pt.move(10, 10);
	}
}