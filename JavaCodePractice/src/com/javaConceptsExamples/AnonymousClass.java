package com.javaConceptsExamples;

import java.lang.*;

class Camera {
	 public void snap() {
		 System.out.println("Snapping...");
	 }
}

public class AnonymousClass {

	public static void main(String[] args) {

		Camera camera = new Camera(){
			@Override  public void snap() {
			   System.out.println("Camera focusing...");
			}
		};
		
		camera.snap();
	}

}
