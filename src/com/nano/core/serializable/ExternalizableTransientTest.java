package com.nano.core.serializable;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizableTransientTest implements Externalizable
{
    int	   x = 1;
    transient int y = 2;

    public static void main(String[] args) throws Exception
    {
	ExternalizableTransientTest a = new ExternalizableTransientTest();
	FileOutputStream fos = new FileOutputStream("Exter.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(a);

	System.out.println(a.x + "..." + a.y);

	FileInputStream fis = new FileInputStream("Exter.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	ExternalizableTransientTest b = (ExternalizableTransientTest) ois
		.readObject();

	System.out.println(b.x + "..." + b.y);
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException
    {
	out.writeInt(x);
	out.writeInt(y);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException,
	    ClassNotFoundException
    {
	x = in.readInt();
	y = in.readInt();

    }

}
