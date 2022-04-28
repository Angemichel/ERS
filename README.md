# ERS
Project 1
Expense Reimbursement System:
Goal: Create an expense reimbursement system for a small company/group. 
This program will allow employees to create reimbursement requests.All Managers can view these requests and approve or deny them. 

key features:

Employee:
An employee can login to see their own reimbursements, past and pending
An employee can submit a reimbursement with an amount and a reason.


Manager:
A Manager can view all reimbursements past and pending
A Manager can appove or deny any reimbursement


Key Notes:
you do not have to allow for the creation of employees or managers.
You can have these already in the database.
No need to have implement security for application.(Assume that a later security team is responsible for making the applicaiton secure)
API routes do not need to be protected
Passwords do not have to be encrpted

Technical and testing requirements:
Backend developed in Javalin
Backend should be a RESTful web service
You may have to a make a non-REST compliant endpoint for login. This is normal.

AWS postgres RDS used to persist information
All DAO methods have a test
All Service methods with logic have a test (use mocking when applicable)
E2E tests using gherkin and selnium for all user stories.
