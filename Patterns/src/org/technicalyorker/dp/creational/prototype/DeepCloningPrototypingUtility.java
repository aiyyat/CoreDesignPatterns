package org.technicalyorker.dp.creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * This utility does deep cloning by default by virtue of object serialization.
 * 
 * @author achuth
 *
 */
public class DeepCloningPrototypingUtility {
	@SuppressWarnings("unchecked")
	public <T extends Serializable> T clone(T t) throws IOException,
			ClassNotFoundException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(t);

		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bais);
		return (T) ois.readObject();
	}

	public static void main(String[] args) throws ClassNotFoundException,
			IOException {
		A a = new A(new B(new C()));
		System.out.println(a + "," + a.getB() + "," + a.getB().getC());
		a = new DeepCloningPrototypingUtility().clone(a);
		System.out.println(a + "," + a.getB() + "," + a.getB().getC());
	}
}

class A implements Serializable {
	private B b;

	public A(B b) {
		this.b = b;
	}

	public B getB() {
		return b;
	}
}

class B implements Serializable {
	C c;

	public B(C c) {
		this.c = c;
	}

	public C getC() {
		return c;
	}
}

class C implements Serializable {

}

class D {

}