# Introduction to Android @ HackPrinceton 2019

Fall 2019 HackPrinceton, Saturday November 9th 11am.
Duration ~1.5 hours + Q&A.

Workshop lead by Jessica Zheng Princeton '19.


**Foreword**

This workshop will walk participants through building a simple Android app that showcases Android fundamentals and programming practices. This will provide you with a solid foundation to build off of when you develop more complex applications that go beyond the scope of this workshop. Open to all levels of programmers, experience with Java recommended.

Q&A following the workshop is open for deeper questions about Android, questions about our experience navigating the hiring process, and my day to day life as a SWE at Google :) or come find me when I'm mentoring.

**Tech Stack**:  Android, Android Studio, Firebase

**Setup**: Please install Android Studio. Download [here](https://developer.android.com/studio). Please do this ASAP, *preferably before the workshop*. If you are using a physical Android phone, make sure that USB debugging is enabled under settings and developer options and you [follow the setup instructions here](https://codelabs.developers.google.com/codelabs/android-training-hello-world/index.html?index=../../android-training#5).

**Demo App**

We will be creating a bare-bones rendition of Tiger Confessions 3.0! (Although it is really just a glorified to-do list that highlights some Android fundamentals). Video demo can be found [here](https://youtu.be/CcK5yyACK6g).

![](https://lh3.googleusercontent.com/7GEmBYbHODIpiHcCLoC1uXhm4uqTxJRh3-kk558s6MiqitPUF3JpiB9lPZmDjjdEImgiwUi-uHldJoLJUML2OL6x3nCk9I1NU652utQaN6A2lSa7QZXyizXr99WmJBuFnE0a_LUDXG2hYFM-ihdFsKT8NpMWOPv0BFci3S3iXCjUISw1lkt2COKrUS4YYLXrcyYMOwVWChT2cacT4ObuCBXXJz719HZ8s55-k1hyYpxMBZ6u6cQq_8Y7a1A9TpvwB9OJhOYZpoUD0yFEjdKa36pJII1tYNgO14113mhABPTYMtdsFP-sxCc8f09vHKhkuQ30RPJyDIU6TXtVSiLUrzWApCdiDc5OIHaOrJvl7G8NirerXHotwLb5gpjf8V11lecFHb1-RnI2wHgYGhp0hdLZ9FAJl6Or2KxQBJiRrENdpmFw5cHM2atpjEMOeg8v-XmruKEYSqTujXoOPx0GX3WWmIKYkqxGx_PglilMrQ034V8Xxec-9Y0u6sZkWyji5adGeODsVc81LtpqkluecnwCbGQIWwj4y7EflEGK45rNo8pv9cmawfvoMid_V3gT_f6KojcTXzMtJzGqdIHGw4dsxZZwIiV3vRTOhnaEiJpOyaJnZu8v4ckGN1via9nHMOcSQdibD-pkWJ2q00DF6EOuKVX52eLjqMhGjbOmSwvRu61MnpdLf8ef=w1754-h1152-no)


## Tutorial Walkthrough
### Step 0. Download and install Android Studio.
[https://developer.android.com/studio](https://developer.android.com/studio)

If you have a physical Android phone to test with, follow the setup instructions [here](https://codelabs.developers.google.com/codelabs/android-training-hello-world/index.html?index=../../android-training#5). Otherwise, briefly read on how to use a Android Virtual Device (AVD) [here](https://codelabs.developers.google.com/codelabs/android-training-hello-world/index.html?index=../../android-training#4).

### Step 1. Get Hello World Set Up and Background on Android 

#### A. Getting Started

Open Android Studio, start a new project, and choose "Empty Activity". Name the project a cool name like "TigerConfessions3.0". Click finish, and wait for the Gradle Sync and build to complete.

[TODO]


#### B. Some background on the structure of Android Applications:

An [**Activity**](https://developer.android.com/reference/android/app/Activity) is a single, focused thing that the user can do. Almost all activities interact with the user, so the Activity class takes care of creating a window for you in which you can place your UI. In most cases, activities are often presented to the user as full-screen windows, so for now you can think of activities as "pages" in an application.

A [**View**](https://developer.android.com/reference/android/view/View) is the basic building block for user interface components. A View occupies a rectangular area on the screen and is responsible for drawing and event handling. View is the base class for _widgets_, which are used to create interactive UI components ([Button](https://developer.android.com/reference/android/widget/Button), [TextView](https://developer.android.com/reference/android/widget/TextView.html), [ScrollView](https://developer.android.com/reference/android/widget/ScrollView), [EditText](https://developer.android.com/reference/android/widget/EditText), [RecyclerView](https://developer.android.com/reference/android/support/v7/widget/RecyclerView) etc). You can even create custom views. Views can encapsualte one another.

A [**Layout**](https://developer.android.com/guide/topics/ui/declaring-layout) is how you organize your views within an Activity.  A layout defines the structure for a user interface in your app, such as in an [activity](https://developer.android.com/guide/components/activities.html). All elements in the layout are built using a hierarchy of [View](https://developer.android.com/reference/android/view/View.html) and [ViewGroup](https://developer.android.com/reference/android/view/ViewGroup.html) objects.

![](https://developer.android.com/images/viewgroup_2x.png)

### Coding Challenges for this Project

Here are a few ways you could test your development skills and take this app further...

 - (Easy) Add a timestamp to when each confession was posted. 
 - (Easy) Right now the application looks fine in portrait mode, but not so great in landscape :( -- figure out how to do so! Hint: you will need to create some new layout resource files in a layout-land/ directory within res/ . 
 - (Medium) Allow for the deletion of confessions.
 - (Medium) Create a up/down voting system (like reddit?) and sort the list by popularity of votes.
 - (Harder) Allow for replies and comments to confessions.

## Additional Resources

The codelab I recommend the most for learning about Android in-depth is the one provided by Google themselves: [Android Developer Fundamentals](https://codelabs.developers.google.com/android-training/). It is well-documented, maintained and kept-up-to-date, and even has a series of accompanying [video lectures](https://www.youtube.com/playlist?list=PLlyCyjh2pUe9wv-hU4my-Nen_SvXIzxGB). 

A select list of interesting tutorials:

 - [Using the Debugger](https://codelabs.developers.google.com/codelabs/android-training-using-debugger/index.html?index=../../android-training#0)
- [Input Controls](https://codelabs.developers.google.com/codelabs/android-training-input-controls/index.html?index=../../android-training#0)
- [Menus and Pickers](https://codelabs.developers.google.com/codelabs/android-training-menus-and-pickers/index.html?index=../../android-training#0)
- [Clickable Images](https://codelabs.developers.google.com/codelabs/android-training-clickable-images/index.html?index=../../android-training#0)
- [User Navigation](https://codelabs.developers.google.com/codelabs/android-training-provide-user-navigation/index.html?index=../../android-training#0)
- [Shared Preferences](https://codelabs.developers.google.com/codelabs/android-training-shared-preferences/index.html?index=../../android-training#0) (Storing data for an app locally on a device)
- [App Settings](https://codelabs.developers.google.com/codelabs/android-training-adding-settings-to-app/index.html?index=../../android-training#0)
- [Notifications](https://codelabs.developers.google.com/codelabs/android-training-notifications/index.html?index=../../android-training#0)
- [Cards and Colors](https://codelabs.developers.google.com/codelabs/android-training-cards-and-colors/index.html?index=../../android-training#0)
- [Drawables, Styles, and Themes](https://codelabs.developers.google.com/codelabs/android-training-drawables-styles-and-themes/index.html?index=../../android-training#0)
- [Implicit Intents](https://codelabs.developers.google.com/codelabs/android-training-activity-with-implicit-intent/index.html?index=../../android-training#1) (e.g. opening a link to a Webpage, Email, or Google Maps Location)
-  [Intents](https://codelabs.developers.google.com/codelabs/android-training-create-an-activity/index.html?index=../../android-training#1) (passing data between screens within your application)
