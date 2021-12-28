package cg;

import java.util.stream.DoubleStream;

public class Calc {
	static double add(double... operands) {
        return DoubleStream.of(operands).sum();
    }

}
