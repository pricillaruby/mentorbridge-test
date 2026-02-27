
# Find Rank Holder using Stream API

# Description
In this project, I have added five students for each department. The Student Details contains name ,department,year and percentage. The Departments are CSE , ECE , EEE , MECH and CIVIL. Finding toppers for each department and display the details.The output is department - topper name.

# Flow of the Project

<img width="615" height="331" alt="image" src="https://github.com/user-attachments/assets/3102debc-b5fb-4409-ac7a-c645a09c5353" />

# Technology used
- Java 21
- Collections
- Stream API

# Functionality

I have Created *Student* class. Student contains fields like name , year , department and percentage. Next , I have created *List* and add five students for each department .
And then I have created *Map* to group department wise students using *groupingBy()*. Next, To store the department and rank holder name , create *HashMap*. To find the highest percentage , using *max()* and add the department , topper name in hashmap using *put()* . Display the Department and Rank holder name.

