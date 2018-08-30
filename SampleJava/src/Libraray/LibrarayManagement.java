package Libraray;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// this is to take care of Unique id issue
class Counter
{
	static int counter = 0;
	synchronized static String getUniqueId()
	{
		
//			get current time stamp and add counter at the end 
//			increase counter by one
//			return the generateId 	
		return "";
	}
}




class Library {
	private Map<String, Book> availableBooks;
	//store all rented books in the order  of last date of submision;
	// stores all books sorted in ther order of auther 
	private  List<Book> booksAutherCatalog;
	
	// stores all books sorted in ther order of catagory 
		private  List<Book> booksCatagoryCatalog;
		
	
	
	
	
	private Queue<Books> rentedBooks;
	private Map<String, Book> rentedBooks;
	// map to find out books in rentedBook priority queue
	
	
	
	
	// all overdue books can be moved here
	private Queue<Book> overdueBooks;

	
	
	// we can store all the active users 
	private Queue<User> activeUsers;
	
	// we can put all the requestes of user creation in this queue which can be reviewed by any Admin user 
	private Queue<User> requestedUser;
	
	//this can be a batch rocess that can be scheduled at 12AM everyday to find out overdue books and notify teh user, and move all those books in different queue;
	public void checkOverdueBookAndNotifyThem()
	{
		
	}
	
	public void borrowBook( String bookId) throws UserNotApprovedException 
	{
		mark that bo
	}
	
	public void returnBook(String bookId)
	{
//		fetch book using map and remove it from queue,
//		calculate late fee if there and mark that book as available
	}
	
	
	// this method  crates user and put them in to requestQueue
	public UserRegistrationStatus requestUserCreation()
	{
		
	}
	
	public String approveUserCreation() throws UserDoesnotHaveAccessException
	{
		
	}
	
	public searchBookByAuther()
	
	public searchBookByAuther()
	
}
abstract class Book
{
	private String bookId;
	private String bookName;
	private String publication;
	boolean isAvailable;
	bookType bookType;
	void bookTheBook() throws BookNotAvailableException
	{
		synchronized(this)
		{
			if(isAvailable)
			{
				isAvailable = false;
			}
			else
			{
				throw BookNotAvailableException;
			}
			
		}
	}
	void unbookBook () throws BookAlreadyAvailableException
	{
		if (!isAvailable) {
			isAvailable = true;
		}
		else
		{
			throw BookAlreadyAvailableException;
		}
	}
}
enum bookType
{
	FITIONAL_ROMANTIC,
	FICTIONAL_HORROR,
	FICIONAL_SIFI,
	NON_FINCTIONAL_SCIENCE,
	NON_FINCTIONAL_ARTS,
	NON_FINCTIONAL_ASTRONOMY,
	NON_FINCTIONAL_BIOGRAPHY;
}
class Megazine extends Book
{
	private Date publishDate;
	
}
class PaperBackBook extends Book
{
	private String auther;
}
enum UserRegistrationStatus
{
	NOT_REVIEW, APPROVED, REJECTED; 
}

enum IdType
{
	DrivingLicense, 
	PassportLicense,
	ADHAR,
	PAN;
}
abstract class PaymentMethod
{
	private String name;
	
}
class CreditCard extends PaymentMethod
{
	
}
class NetBanking extends PaymentMethod
{
	
}
class Wallet extends PaymentMethod
{
	
}
class DebitCard extends PaymentMethod
{
	
}
class User
{
	private String userId;
	private String email;
	private Address address;
	private IdType idType;
	private String idNumber;
	private List<PaymentMethod> paymentMethod;
	private List<Book> borrowedBooks;
}
class Student extends User
{
	private String studentIdNum;
	private String instituteName;
	private Date validTill;
	private Address InstitutionAddress;
}
class AdminUser extends User
{
	private String staffId;
	public void approveUser(List<User> users)
	{
		
	}
}

enum Status
{
	SUCCESS, NOT_STARTED, INPROCESS, TIMED_OUT,FAILED; 
}
class Order
{
	private String OrderId;
	private String TransactionId;
	private Status status;
	private List<OrderAction> orderActions;
	private double ammount;
	private double discount;
}
class OrderAction
{
	private String OrderActionId;
	private Book book;
	private double discount;
}

class Address
{
	private String houseNum;
	private String Street;
	private String locality;
	private String city;
	private String district;
	private String State;
	private String Country;
	private String zipCode;
}
public class LibrarayManagement {
	public static void main(String[] args) {
		
	}
}

