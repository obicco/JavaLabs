package it.polito.oop.timefficiency;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Experiment<D> {

	public void addAlgorithm(String name, Consumer<D> algorithm) {
		// TODO: unimplemented method
	}
	
	public void setDataGenerator(Supplier<D> generator) {
		// TODO: unimplemented method
	}
	
	public Collection<String >algorithms(){
		return null;
	}

	public double perform(String name) {
		// TODO: unimplemented method
		return -1.0;
	}
	
	public int run() {
		// TODO: unimplemented method
		return -1;
	}
	
	public void setRepeat(int n) {
		// TODO: unimplemented method
	}

	public int getRepeat() {
		// TODO: unimplemented method
		return -1;
	}
	
	public Map<String,List<Double>> getMeasures(){
		return null;
	}
	
	public void setPlotFormat(int nameWidth, int plotWidth) {
		// TODO: unimplemented method
	}
	
	public String plotInterval() {
		// TODO: unimplemented method
		return null;
	}
}
