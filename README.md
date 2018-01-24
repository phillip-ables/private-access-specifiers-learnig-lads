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
method will initialize a value for the private name variable
now we have a method and thorugh the method we are going to be initializing the private String

if you want to access that private member outside the class
have the public methods in that same class
through that method access that private member in the class

what if i wanted only the name property

public method thats going to return a string type
takes no parameters and return name

PUBLIC MEthods to access private members

accessors and mutators

to define a private method
first we need to specify the access specifier as private

SPECIFY THE ACCESS specifier

if your method is going to be static then youre going to use the static key word otherwise we dont need to use any keyword

after, write the return type of the method (VOID)

its not going to take any parameters
and here were going to have the body

private methods are available inside thre class

cannot access it through a new object in main
