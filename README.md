# REST-API-SpringWebflux-Consume
Consume GET http://dummy.restapiexample.com/api/v1/employee/1 using WebClient and store the data in employee collection and expose the endpoint that returns data from the database. Follow the below points -
1) Use MongoDB
2) Use Gradle as a build tool
* Response sample of http://dummy.restapiexample.com/api/v1/employee/1 -
{"status":"success","data":{"id":1,"employee_name":"Tiger Nixon","employee_salary":320800,"employee_age":61,"profile_image":""},"message":"Successfully! Record has been fetched."}
