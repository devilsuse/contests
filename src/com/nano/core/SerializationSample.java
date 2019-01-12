package com.nano.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationSample
{

	/**
	 * @param args
	 */

	public static void main(String args[]) throws IOException, FileNotFoundException, ClassNotFoundException
	{

		SerializationBox serialB = new SerializationBox();
		// serialB.setSerializableProp((byte) 1);
		serialB.setS((short) 22);
		serialize("serial.out", serialB);
		SerializationBox sb = (SerializationBox) deSerialize("serial.out");
		System.out.println(sb.getSerializableProp());
	}

	public static void serialize(String outFile, Object serializableObject) throws IOException
	{
		FileOutputStream fos = new FileOutputStream(outFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(serializableObject);
	}

	public static Object deSerialize(String serilizedObject) throws FileNotFoundException, IOException,
			ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream(serilizedObject);
		ObjectInputStream ois = new ObjectInputStream(fis);
		return ois.readObject();
	}

}

class SerializationBox implements Serializable
{

	private byte	serializableProp	= (byte) 1025;
	private short	s;

	public byte getSerializableProp()
	{
		return serializableProp;
	}

	public void setSerializableProp(byte serializableProp)
	{
		this.serializableProp = serializableProp;
	}

	public short getS()
	{
		return s;
	}

	public void setS(short s)
	{
		this.s = s;
	}
}
