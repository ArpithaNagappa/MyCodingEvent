 # Purpose of the app?
 The application tracks event around different locations and details about the events.

 # current state of the app?
 The User is able to add events to the application.

 # future improvements of the app?
 We need to have person class inorder to have our users to select and save their favorite events.

Fields:
id (int) - the unique user ID
Name -(String)-user name
email (String) - the user’s email, which will also function as their username
password (String) - the user’s password
List of events- List<event>:Many-to-Many
Favorite events - EventCategory : Many-to-one

Methods:
getters and setters --for all the fields,It could have setters for all fields except id.
getFavoriteEvents--to return all favorite events.
