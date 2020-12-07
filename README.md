# SmsApp : It fetches all the inbox messages, shows if message if read or unread .It also shows notification as soon as Sms received in the device.

<b>Specs :</b>
1.Language Used - Kotlin , Java
2.Build with Gradle
3.IDE Used -  Android Studio.

#Permissions required : READ_SMS , RECEIVE_SMS

#Architecture used(Design Pattern)  :
 MVP - Model View Presenter

#Working :
Install the APK,it shows loader as long as it will take to fetch the messages from the device.
It shows notification as soon as device receive any new message.Clicking on notification will end up on fetching
all the latest messages.It using Pagination approach to fetch message in group of 15 messages at a time.

#API Reference :
App uses Telephony.SMS apis provided by google.

#Libraries Used :
Retrofit,RxJava,Dagger,Shimmer RecyclerView ,Butterknife, Easy permissions and other design libraries.

#ScreenShots
![alt text](https://github.com/meajay/SmsApp/blob/master/app/WhatsApp%20Image%202020-12-07%20at%201.17.04%20PM.jpeg)
![alt text](https://github.com/meajay/SmsApp/blob/master/app/WhatsApp%20Image%202020-12-07%20at%201.16.05%20PM.jpeg)

