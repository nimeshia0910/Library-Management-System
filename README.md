# Library-Management-System

This system provides a login to the admin and librarians to perform functions such as add, view, delete librarians and books. Mainly this system provides the access to the students to search required books and check availability of any required book.
  
First the ‘home’ window is loaded when you run the project. There you can click the ‘Student’ button if you are a student, or the ‘guest login’ button if you are either an admin or a librarian. 
Let’s see the functions of different users in the system.
Students:
When you click the ‘student’ button on the HomePage window you get directed to a form with two buttons:
* View book details: 
  * When you click this you get directed to the ‘StudentPage’ form.
  * When you enter the title or the author of the book and click search all the matching details get loaded into the table.
  * By clicking the ok button the window gets refreshed.
  * The check availability button you can directly go to the window that checks availability.
*	Check availability:
    *	 When you click this you get directed to the ‘BookPanel’ form.
    *  By entering the book id and clicking the search button you can get the information such as name, author, publisher, edition and availability of the relevant book. 
    *	 If the book is not under the issued books table the availability is shown as “available” saying that you can borrow it and the return date text field is shown as null.
    *	 If the searched book id is in the issued book table the availability is returned as “not available” denoting the book has been borrowed by a student and the return date of the respective book is shown in the relevant field.
    *  When you click the ok button the form gets refreshed. 
## Admin:

When you click the “guest login” button in the home window a login form is loaded. There you have to enter,
  * Username-admin
  * Password-admin 

To login as an admin to the system.


An admin can perform add, view, delete librarian functions and those buttons can be seen in the ‘adminPage’ window.
*	Add:
    * When you enter all the librarian details in the form and click on the ‘Add Librarian’ the librarian gets added if all the details are valid.
*	View:
    * By entering the librarian id and clicking on ‘view librarian’ the relevant librarian details get loaded into the form.
    * You can edit any field in the form and click on ‘edit librarian’ to update the librarian details in the database table.
*	Delete:
    * All the librarian details are loaded into the table when the window is loaded. You can select a row with the details of the librarian to be deleted and click on ‘Delete Librarian’ button and the all records of the librarian gets deleted.
*	Logout:
    * You get directed back to the ‘Login’ form by clicking on the ‘Logout’ button.
## Librarians:

When you click the “guest login” button in the home window a login form is loaded. There you can enter your username and password if you have already signed up and have created a username and password. Else you can click on,

* Signup:
    * There you can enter your username, your full name from which you have registered and other required information. 
    * When you click on the ‘create’ button it gets validated to see whether you are actually a registered librarian.
    * If your information matches with the ones entered by the admin you can login to the ‘LibrarianPage’ window, or else you get a notification saying it’s an unauthorized login.  
* Forgot Password:
    * If you have forgotten your password, you can simply enter your username and click search where it loads the relevant information about you then you have to answer the security question and click on ‘retrieve’ button which retrieves the password if it matches with your actual answer.
In the ‘LibrarianPage’ there are five buttons that symbolizes the functions of the librarians,
* Add:
    * When you fill all the details of a new book and click on ‘add’ button the new book gets added to the library books.

* View:
    * View Book:
        * Enter the book id and click on ‘search’ button and all the book details of the relevant book will be loaded in the form.
        * You can edit any field in the details form and click on ‘edit book’ button and the book details will be updated in the database of the library management system.
    * View Issue:
        * The details of the issued books will be displayed on a table when the form is loaded.
*	Issue:
    * You only have to enter the student id and the book id, the book details get loaded as soon as you enter the book id. The current date is already loaded as the issue date and a date after 14 days from the issued date is automatically calculated and displayed as the due date.
    * When you click on the ‘issue book’ button the book is issued to the student and is updated in the issued book table. 
* Return:
    * When you enter the book id all the details about the borrower and the book is displayed.
    * You have to enter the over dated days from the due date and enter, then the fine is automatically calculated as Rs.5.00 per over dated day.
    * If you have entered a correct book id and over dated days the book gets returned when you click the ’Return Book’ button.
* Logout:
    * You are re directed to the ‘Login’ form when you click the ‘Logout’ button.


![Screenshot (780)](https://user-images.githubusercontent.com/72261980/153770831-f2939ab1-deb2-4b27-a11a-1b1e484ad6e0.png)

