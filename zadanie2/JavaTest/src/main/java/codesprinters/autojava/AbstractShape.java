package codesprinters.autojava;

// Klasa abstrakcyjna

public abstract class AbstractShape implements Shape {
	

	public String getName() {
		return this.getClass().getSimpleName();
	}

}
