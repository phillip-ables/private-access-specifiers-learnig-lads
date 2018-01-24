# private-access-specifiers-learnig-lads
learning lads tutorial on private access specifiers

learn about the private access specifier

There are four types of access specifiers in java
  public
  private access
  default access
  private access specifiers

public class members are available everywhere
you can access them anywhere in the java enviroment

class members with private access specifier are only available in the class which they are defined
to have a private member
you need to use the private keyword
  write the access specifier

decide whether your member is going to be a instance member or static member
if instance member than you don't to use the static keyword
then just specify type of data you want to be stored

now this data type you want to store is a private member of this class
this property is only availible inside this class
cannot access outside of this class

we try to access the private name property with new student object in tutorials class
try to access private memory we get error
the field student.name is not visable

field private member is only avaliable in the class you have defined it in
this initialization is not possible

i can access the age member because age is a public property

create a method in the constructor using the private variable
call this method on the new object
you will see null

this name is a reference variable and by default its value is null

a private memmber is only accessable where we define it

we can access this name in any method in the constructor
