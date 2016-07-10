package br.usp.ime.p2.ex1;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

public class PilhaLimitada extends Stack<Number> {
	
	private Number lowerBound;
	private Number upperBound;
	
	public PilhaLimitada(Number lowerBound, Number upperBound) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}
	
	@Override
	public Number push(Number n) {
		double sum = total() + n.doubleValue();
		if(sum <= upperBound.doubleValue() && sum >= lowerBound.doubleValue()) {
			super.push(n);
			return n;
		} else { return null;}
	}
	
	@Override
	public Number pop() {
		try {
			return super.pop();
		} catch(EmptyStackException e) {
			return null;
		}
	}
	
	public double total() {
		Iterator<Number> iterator = this.iterator();
		double total = 0.0;
		while(iterator.hasNext()) {
			total += iterator.next().doubleValue();
		}
		return total;
	}

}
