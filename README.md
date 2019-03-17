## shareNUS

# 1. Level of Achievement
Gemini

# 2. Problem Motivation
When taking a module, there are usually compulsory textbooks you are required to purchase, and these textbooks cost quite a fair bit most of the time. Since you only use the textbooks for the corresponding modules and subsequently have no need for them, you are likely to find it wasteful to purchase brand new ones and simply dispose of them afterwards. Some of you might also be interested in notes gathered by other students who had taken the same modules as they could have noted down key points you missed out on during lectures and tutorials. Most of you will thus turn to online platforms like Carousell to source for second-hand notes and textbooks due to their more affordable nature as compared to new ones sold at physical stores. This is especially so for second-hand notes as channels to get hold of them are limited, unless you are acquainted with friends who took the modules before. However, searching on such sites may be tedious as you have to look through numerous irrelevant listings, all of which are classified under broad categories such as “textbooks”.

When you are done with a module and no longer need the notes and textbooks you accumulated and bought, you are likely to want to get rid of them as they take up too much space. Yet, many of you will find it a pity to simply dispose them. As such, you turn to online marketplaces to let them go at a small price. However, the selling process on existing sites may be cumbersome. Existing sites are free for all, so the notes and textbooks might not be sold to fellow schoolmates. Arrangements for the handing over of notes and textbooks need to be made since they are bulky and cannot be mailed. These meetups are typically difficult to accommodate both you and your buyer due to different area of residences and schools.

Hence, we want and are motivated to create a platform that will solve the above mentioned problems.

# 3. User Stories
As a NUS student who is looking for compulsory textbooks and/or additional materials to aid in my studies, I want to be able to search for them easily and purchase them at a low price.
As a NUS (ex-)student who thinks it is a waste to simply throw away used, unwanted notes and/or textbooks, I want to be able to sell them to other students conveniently.

# 4. Project Scope
4.1 Aim
We hope to create a mobile application that makes the buying and selling process of used, unwanted notes and textbooks easy and convenient.

4.2 Target Group
Existing NUS students
NUS graduates

4.3 Core Features
“Selling”
Users can put up posts to sell their used, unwanted notes or textbooks. Their posts will be placed under 2 categories - faculty and course. There can be multiple entries for module code as certain textbooks are utilised by more than 1 module.

With this feature, the listed notes and textbooks can be searched for and possibly bought by other users.

“Looking For”
If users are unable to find the notes or textbook they desire in the application, they can put up a post to let other users of the application know that they are looking for this particular material. This post will be placed under 2 categories - faculty and course. There can be multiple entries for module code as certain textbooks are utilised by more than 1 module.

The purpose of this feature is to let other users of the application know the notes or textbooks a particular user is keen in obtaining. In the case that there exist users who own the desired materials but have not put up a post yet, they will be prompted to contact the interested party to let go of the materials. Friends of users who own the relevant materials can also be notified through word of mouth.

Chat
For “looking for” posts, the chat function can be utilised by potential sellers to contact the interested buyers. For “selling” posts, the chat function will be utilised by interested buyers to contact the sellers instead.

This feature connects buyers and sellers together. Meetups for the collection of materials can be arranged.

4.4 Difference from Similar Platforms
shareNUS (Our Application)
Other Online Marketplaces (e.g. Carousell)
Only accessible by existing NUS students or NUS graduates
Accessible by all
Listings are definitely suitable for NUS modules
Listings may or may not be suitable for NUS modules
Listing categories are NUS-specific - faculty, course, module code
Listing categories are not NUS-specific - learning & enrichment, books & stationery (textbooks)
Convenient meetup arrangements (NUS)
Inconvenient meetup arrangements (buyers and sellers may be from different schools or live far from each other)

# 5. Progress
5.1 Milestone 1
Basic user interface for all core features
Link to Firebase for user authentication

5.2 Milestone 2
Interface and backend for “Selling”/“Looking For” selection
Interface for uploading listings
Interface and backend for chat
Link to Firebase for user details data storage
Link to Firebase for messages data storage

5.3 Milestone 3
Backend for uploading listings
Input details (title, description, faculty, course, module)
Insert photo of “Selling”/“Looking For” material
Upload under a single listing
Link to Firebase for “Selling” data storage
Able to view all the listings under the browsing section
Filter the listings that fall under various categories
Link to Firebase for “Looking For” data storage
Able to view all the listings under the browsing section
Filter the listings that fall under various categories
Set up security for data storage on Firebase
Transition from the listings view to the chat interface
Maintenance of application (e.g. ensuring successful transition from one page to another)

# 6. Problems Encountered
Uploading both details and photo under a single listing
Wrapping size of chat bubble according to length of message
Storing messages for two users engaged in a chat under their respective databases on Firebase
Retrieving data of the listings from the database and presenting them in a comprehensive manner

# 7. Bugs Squashed
Same chat bubble size regardless of length of message
Initially, .png images were used for the chat bubbles. However, when testing the feature out, we realised that the size of the chat bubbles remain the same for all messages sent, regardless of their lengths. We thus researched online for ways to resolve this and found out that for the size of the chat bubbles to automatically enlarge or reduce according to length of message, the images should be converted to .9.png 9-patch images. This is because 9-patch files support scaling to accommodate contents of the view. We then looked up how to go about doing such a conversion and successfully accomplished corresponding the size of chat bubbles to the dimension of messages.

Messages sent in chat all appear to be sent by “you” (blue chat bubble) instead of “you” and other user (orange chat bubble)
Messages were initially stored wrongly on Firebase such that the username always matches that of “you”, even if messages were sent by the other user. This resulted in the chat constantly displaying “you” sending messages instead of messages sent between “you” and the other user.

Uploading both details and photo under a single listing
We were not able to upload multiple attributes (the details of each listing - title, description, faculty, course, module) and the image of the listing under one unique object in the firebase database at first. Hence, we decided to create another class called UploadImageInfo which is able to store all the attributes and the image url in the database.

Retrieving data of the listings from the database and presenting them in a comprehensive manner
We wanted to just simply present the data from each listing in ListView but realised that it is rather difficult to present it in a comprehensive manner and it keeps giving an error that is directed to the adaptor tool that we were using. Hence, we figured that we could create our own custom adaptor ImageUploadAdaptor and our own preferred layout of how the listing can be view in ListView.

# 8. User Testing
We gathered a small group of 10 NUS students and graduates, explained our application to them and got them to test it out. Afterwards, a short, simple survey was conducted. We gathered that 87%, 94% and 91 % of these students answered 'Yes' to these questions respectively: 'Generally, the application runs smoothly and its performance speed is tolerable', 'The application seems useful' and 'I can see myself using the application if it gets released in the future'.
