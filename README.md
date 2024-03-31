# Task-Trek-backend

Tech Stack: Java, Spring Boot, MySQL/MongoDB, React

Functionality:

1. Every person is a chef whose details are stored in chef_details table
2. A person can add chefs with a form which contains
    1. First Name
    2. Last Name
    3. Email Address
    4. Phone Number
    5. Status - dropdown(Active, Inactive)
3. A chef will be able to fill a horizontal form in UI where form contains
    1. Name - dropdown contains all “active” chef’s
    2. Date - calendar
    3. Day - Auto fill after selecting “Date”
    4. Dish - Text Field
4. All the active chefs in the db should be notified via email/message when clicked on “Notify” button on the UI


API Design:

/chefs
- POST - addChef(Chef_details)
- GET - retrieveAllChefs()

/chefs/{chef_id}
- GET - retrieveChefById(chef_id)

/assignment
- POST - createAssignment(Assignment)
- GET - retrieveAllAssignments()

/assignments/{assignment_id}
- GET - retrieveAssignmentById(assignment_id)
- PUT - updateAssignment(assignment_id)
- DELETE - deleteAssignment(assignment_id)

/notifications
- POST - notifyAllChefs(chefs, notification_type, notification_message)



Database Design:

Chef_details
- chef_id(PK)
- first_name
- last_name
- email_address
- phone_number
- status - Active, inactive 

Assignment 
- assignment_id(PK)
- chef_id(FK referencing chef table)
- day_of_week
- assigned_date
- dish
- timestamp
- owner - chef who does the assignment

Notification_status
- notification_id(PK)
- chef_id(FK referencing chef table)
- notification_type - email, phone message
- notification_message
- Timestamp
- Status - Pending, Sent

Chef_availability
- availability_id(PK)
- chef_id(FK referencing chef table)
- days_in_week - Monday, Tuesday,…
- Availability - Y, N



Email Details:

Subject: Weekly Cooking Assignments(Monday Date - Sunday Date)

Hey [Chef’s_first_name],

Here’s the cooking schedule for the upcoming week.
1. Monday - Date - Full Name - Dish
2. Tuesday - Date - Full Name - Dish
3. Wednesday - Date - Full Name - Dish
4. Thursday - Date - Full Name - Dish
5. Friday - Date - Full Name - Dish
6. Saturday - Date - Full Name - Dish
7. Sunday - Date - Full Name - Dish

Please review your assignment and ensure you are prepared for your cooking duties accordingly.
If you have any questions or concerns, reach out to chef_rotation_tracker@gmail.com

Best regards,
TaskTrek
