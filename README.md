#InstagramCloneMaster
#####In this section
In this tutorial, we are going to build  a clone for Instagram photosharing app, a widely used social networking app for telling a story in pictures.
<p>&nbsp;</p>
<img class="center-img" alt="instagram android Clone" src="https://github.com/egimaben/InstagramCloneAndroid/blob/master/images.PNG">
<p>&nbsp;</p>
><span class="tut-info">Info</span> By the end of this tutorial, you will have learnt abit how to deal with files on CloudBoost using <code>CloudFile</code>s and also <code>ACL</code> permission management.
#Assumptions
I will assume that :
<ul>
<li>You have checked out our first java tutorial in this series and know you to set up your environment to develop CloudBoost apps, including the libraries to add to the classpath i.e.</li>
<ul>
<li>Javasdk for cloudboost Javasdk-1.0.1.jar </li>
<li>Socket-client.jar</li>
<li>Okhttp-2.4.0.jar</li>
<li>Okhttp-ws-2.4.0.jar</li>
<li>Okio-1.4.0.jar</li>
</ul>
<li>You know android (We shall not focus so much on learning the the android specific concepts bit of the code).</li>
<li>You already have an app on cloudboost, and have created a table called <code>users</code>, with the following columns
<ul>
<li>user_name, type text</li>
<li>follows, type StringArray</li>
<li>followed_by, type StringArray</li>
<li>photos, type fileArray</li>
</ul>
</ul>
#The Android project
Create a new android project in your IDE(I use Eclipse 3.7 with ADT) and name it <code>WhatsappAndroidClone</code>, place all the required <code>jar</code>'s in the libs folder.

We are going to use facebook to login and get user's friend details and images so that we have enough data and images to play around with. 

#How it works
##Facebook Login##
We use facebook SDK to login to facebook and fetch user profile in form of a json, we then sign the user up on our app as a <code>CloudUser</code>
<p>&nbsp;</p>
<img class="center-img" alt="Facebook login" src="https://github.com/egimaben/InstagramCloneAndroid/blob/master/login.PNG"> 
<p>&nbsp;</p>
##Images##
We get image URLs from the Facebook Graph profile and download them into blobs. We then create <code>CloudFile</code> objects out of these blobs and save them to our app. ##Very simple##, no need to again write the bytes to some location on the server, we don't need to know where our files go.
##Displaying Images##
<p>&nbsp;</p>
<img class="center-img" alt="instagram android Clone" src="https://github.com/egimaben/InstagramCloneAndroid/blob/master/images.PNG">
<p>&nbsp;</p>
We shall use android <code>GridView</code>  to display images anonymously in the search dock of instagram lower navigation, in the photos tab. These images can be downloaded from the URLs of our stored images on cloudboost. These url's come with the <code>CloudObject</code> you fetch for each user, in form of an array in the photos column.
##Friends##
In instagram as we all know, you can follow people, in which case you will be alerted about their activities. People can also follow you and be notified of these
When people follow us, we update their <code>following</code> column and our <code>followed_by</code> column. We then grant them <code>read</code> ACL permission to our images. The user retains <code>read,write</code> ACL permission.
<p>&nbsp;</p>
<img class="center-img" alt="Whatsapp android chats" src="https://github.com/egimaben/InstagramCloneAndroid/blob/master/friends.PNG">
<p>&nbsp;</p>
><span class="tut-info">Info</span> This is by no means a complete, usable application, it's just used to show basic functions on cloudboost. We shall be adding more functionality to it with time.



