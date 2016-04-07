// University of São Paulo - IME USP
//
// Object Oriented Programming Laboratory
// Assigment 5 - 03/17/2016
//
// Prof. Marcelo Finger
// Fellipe Souto Sampaio - 7990422

package class5.interfaceexercise;

public class Humano implements Animal, Mamifero {

	@Override
	public String mama() {
		return "Os humanos mamam na infância";
	}

	@Override
	public String daALuz() {
		return "Os humanos do sexo feminino dão a luz";
	}

	@Override
	public String caminha() {
		return "Os humanos caminham em duas pernas";
	}

	@Override
	public String respira() {
		return "Os humanos precisam respirar O2 para sobreviver";
	}

}
