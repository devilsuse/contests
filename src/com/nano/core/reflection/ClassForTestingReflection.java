package com.nano.core.reflection;

public class ClassForTestingReflection
{

	String	driverClassName;
	String	url;
	String	username;
	String	password;
	String	schema;
	String	dbName;
	int		i;

	public ClassForTestingReflection(String driverClassName, String url, String username, String password,
			String schema, String dbName)
	{

		this.driverClassName = driverClassName;
		this.url = url;
		this.username = username;
		this.password = password;

		// this.dataSource = getDataSource(driverClassName, url, username,
		// password);
		this.schema = schema;
		this.dbName = dbName;
		// connectionHash = new
		// HashCodeBuilder().append(url).append(password).append(username).toHashCode();

		addShutdownHook();
		// readTables();
	}

	private void addShutdownHook()
	{
		final ClassForTestingReflection thisStorage = this;

		Runtime.getRuntime().addShutdownHook(new Thread()
		{
			public void run()
			{
				System.out.println("This is funny way of closing database... Isn't it?");// thisStorage.close();
			}
		});
	}

	public static void main(String[] args)
	{
		int[] a = { 1, 2, 333 };
		for (int i = 0; i < a.length; i++)
		{

		}

	}

}
