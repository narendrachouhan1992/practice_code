package test;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	  
}
abstract class Book
{
	private String bookId;
	private String bookName;
	private String publication;
	boolean isAvailable;
}
class Megazine extends Book
{
	private Date publishDate;
	
}
class PaperBackBook extends Book
{
	private String auther;
}
enum IdType
{
	DrivingLicense, 
	PassportLicense,
	ADHAR,
	PAN;
}
abstract class User
{
	private String userId;
	private String email;
	private Address address;
	private IdType idType;
	private String idNumber;
}
class Student extends User
{
	private String studentIdNum;
	private String instituteName;
	private Date validTill;
	
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
	
}

