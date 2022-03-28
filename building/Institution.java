package building;

import equipment.Book;

public abstract class Institution
{

}

class Library extends Institution implements Trading
{
	Book bkobj1=new Book();
}

class Restaurent extends Institution 
{
	
}
class Company extends Institution 
{

}

class KFC extends Restaurent
{
	
}
