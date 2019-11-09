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

![](https://lh3.googleusercontent.com/22hZ-qj_qiRHJBjCqJmSX_oE4jgfN-OusMETi76HzvrfWD48impGqrXsQAOjsAivSVoc3VS83pTDHmCcz-y5ZqKbHkTCnRkWMoWgpFL6FGr1fHjjBGeD4pc1RfhY4G3cMmh9uW9WNkLRSq4J7VgP_oGyAqASDFnlxaUhw6QDXQ6jJRPZ0ARzaCYs7LEHvkYnXxWwekZiejsIvxlApk6nmch3hBlgsLn0FC7-nuzK-lxZocV_JNBD7STBWxjz0sPQFGQrlFUyXKBCSrXZbtgsKT7UXTVEeIsiIMVwzBjpvMBYjmAk2WoAIZLLgUL9cO9kZ828S_Aap0rU22u3AKO_Gq05e27PqY16hqASJvWXnmeyHEpA1ZMijki3G5xYTgj1rt4TN6feSUREtFsQ6RQ1cae7Wi6SLzt1jUG2YXyLkdw68vcyUqv8nRec76GOOpOoxXcnhkzbiW6Myl5V7vPnFp6Lqf-cpQxS3zAZZdAZy9ceGNRtp-kA1WXmOCWCUfqt2S4T_1jm74JTf1PmARq2WCrCACaZ_RhSSNIEeCFwspPi9K3IPxlWlkh5UDT9iAzrgvtMmBWB63vWaUUP2iKBFVNZrtG1HDYsD5Xu7H_btF84LtYkJZyvxd2S2lgtiNuXlchw4vGpw9165fanYdvYemfCMCbFotob3Bv1yTcQr_XE34suoU41grJyYP5f14hcP4cdstPbUI2_UCYzNSf6_It6vtQCgdl7qk5BEue9VayhIAi_Ew=w2000-h1358-no)


## Tutorial Walkthrough
### Step 0. Download and install Android Studio.
[https://developer.android.com/studio](https://developer.android.com/studio)

If you have a physical Android phone to test with, follow the setup instructions [here](https://codelabs.developers.google.com/codelabs/android-training-hello-world/index.html?index=../../android-training#5). Otherwise, briefly read on how to use a Android Virtual Device (AVD) [here](https://codelabs.developers.google.com/codelabs/android-training-hello-world/index.html?index=../../android-training#4).

### Step 1. Get Hello World Set Up and Background on Android 

#### A. Getting Started

Open Android Studio, start a new project with **min SDK version 26**. Choose "Empty Activity".

Name the project a cool name like "TigerConfessions". Click finish, and wait for the Gradle Sync and build to complete. When building and running the app, this is what you should get:
![](https://lh3.googleusercontent.com/Zf02C4Oo39yHTGNtSjhiO0hmdqeGxJpRbcQNtISy43tu6qd3yEVF3La1dWcK__sfSzDa4H-SQORPreLzPy2U7nFWlXC2BBjSUXYEbkzWSofinPGLJ8oGip4srhVTIVsSfb0YVdmo-3wo6HQL_3vpigUHkfA_uTYZYdPbc7skuj8LINQlj5XCH0UYJGMb8N1iIZwF_5yiCTk5svlpqKbgr8MNQchB8rf9q57FsFGCxzQ5fIj8JtY78ossyPyXRhl0S_MXVE7Vt_eToCgUDMkaoHxc8ZnThV-QVpJwxAVhvR8Hs1X9VpXscgsSN_72Yl3LZVQnn0fljeQOFSb6xzvkqdPZYKr7ycy4YJU37FxrRFdjZRAgPMOuKg3LYvh5tIRUrCsrTIhH2ippxjveDkhXJ1RUrM6kwMHslTNrnj3Py_weXnpgqahrDKDPSG_sKNdo1Kkl65G5B41fEGKsW6oZDTMQG_Ju0LJepT6QmiRZVhfmxDIzMtB8fQLGpN3odQvhkg4TqXAiUNnN471nLdz7MB1bANMyUIfKBBMRKT1he3s5k-tIJL5PjSIVKe9J4f4vIpK_-D6GZpr82n3zD2yf5RGWsg3PQ8oRFrwXXon5G2tx14Yz8ju-ONWl09v3tzANakmeO_-r7-NSBA7YBchQ7TQRFi-_dkosVDPwOASkvu3G7fEveNXnZXci8NoBqscOAmwSi1q29E_WGfm-SAmPOUvunkMYDrGtCzHvJqqA1SqGc8fSvA=w3006-h1686-no)

#### B. Some background on the structure of Android Applications:

An [**Activity**](https://developer.android.com/reference/android/app/Activity) is a single, focused thing that the user can do. Almost all activities interact with the user, so the Activity class takes care of creating a window for you in which you can place your UI. In most cases, activities are often presented to the user as full-screen windows, so for now you can think of activities as "pages" in an application.

A [**View**](https://developer.android.com/reference/android/view/View) is the basic building block for user interface components. A View occupies a rectangular area on the screen and is responsible for drawing and event handling. View is the base class for _widgets_, which are used to create interactive UI components ([Button](https://developer.android.com/reference/android/widget/Button), [TextView](https://developer.android.com/reference/android/widget/TextView.html), [ScrollView](https://developer.android.com/reference/android/widget/ScrollView), [EditText](https://developer.android.com/reference/android/widget/EditText), [RecyclerView](https://developer.android.com/reference/android/support/v7/widget/RecyclerView) etc). You can even create custom views. Views can encapsualte one another.

A [**Layout**](https://developer.android.com/guide/topics/ui/declaring-layout) is how you organize your views within an Activity.  A layout defines the structure for a user interface in your app, such as in an [activity](https://developer.android.com/guide/components/activities.html). All elements in the layout are built using a hierarchy of [View](https://developer.android.com/reference/android/view/View.html) and [ViewGroup](https://developer.android.com/reference/android/view/ViewGroup.html) objects.

![](https://developer.android.com/images/viewgroup_2x.png)


### Step 2. Linear Layout and Image View


#### A. Change the constraint layout to a linear layout in activity_main.xml

A [`ConstraintLayout`](https://developer.android.com/reference/androidx/constraintlayout/widget/ConstraintLayout.html) allows you to create large and complex layouts with a flat view hierarchy (no nested view groups), but it is more complex than what we need. We will use a [LinearLayout](https://developer.android.com/reference/android/widget/LinearLayout.html) instead. A LinearLayout is a view group that aligns all children in a single direction, vertically or horizontally.

1. Change the ConstraintLayout to LinearLayout
2. Add android:orientation="vertical" attribute in the LinearLayout. For a [LinearLayout](https://developer.android.com/reference/android/widget/LinearLayout.html) it is good practice to explicitly specify the layout direction with the  [`android:orientation`](https://developer.android.com/reference/android/widget/LinearLayout.html#attr_android:orientation)  attribute. 

Resulting activity_xml:
~~~
<?xml version="1.0" encoding="utf-8"?>  
<LinearLayout  
  xmlns:android="http://schemas.android.com/apk/res/android"  
  xmlns:app="http://schemas.android.com/apk/res-auto"  
  xmlns:tools="http://schemas.android.com/tools"  
  android:layout_width="match_parent"  
  android:layout_height="match_parent"
  android:orientation="vertical"  
  tools:context=".MainActivity">  
    <TextView  
		  android:layout_width="wrap_content"  
		  android:layout_height="wrap_content"  
		  android:text="Hello World!"  
		  app:layout_constraintBottom_toBottomOf="parent"  
		  app:layout_constraintLeft_toLeftOf="parent"  
		  app:layout_constraintRight_toRightOf="parent"  
		  app:layout_constraintTop_toTopOf="parent" />  
</LinearLayout>
~~~

#### B. Delete the TextView in activity_xml
Resulting activity_xml:
~~~
<?xml version="1.0" encoding="utf-8"?>  
<LinearLayout  
  xmlns:android="http://schemas.android.com/apk/res/android"  
  xmlns:app="http://schemas.android.com/apk/res-auto"  
  xmlns:tools="http://schemas.android.com/tools"  
  android:layout_width="match_parent"  
  android:layout_height="match_parent"
  android:orientation="vertical"  
  tools:context=".MainActivity">  
</LinearLayout>
~~~
#### C. Add an image to the res/drawable folder to serve as the banner.
It is the convention in Android to place drawable resources into res/drawable folder. Here is the image I used. Save it as "tigercat.png".
![](https://lh3.googleusercontent.com/DNCbbh_lWJukf50-Hclu3NOvNEV_X6vEQXPZ-AB0j7DHYkds5LrITw_tO373Cjf_ESWXDOHD4TDmKpM3zVWwSErazv3MO0kQs84MU44xnrgCLof2On6XbZ_JkpJ7RXdFnCUMremjxFKJGeg1zjT2LnPyJBednySuovDQKA0gpeyqZ4OwAWbdR1wIftoDeg4ecZNyAoXrX4G7RQfYEGjegcIShQC-GoAeaTElG17ojDVC-aCHWcMncHEFQRfItIic0t98E3NO6oOnosKiov_ffgUz_1RjOLy4i1cUsO2JAt3DSmsoqS8izvXUc26IBvjYO4-VUglsogZN_NprDfdPTQn6pTZ6scN2DWuHrIwl7hC-J6UA1nQ1ACEgt_n1Ei3oxhLqOLSwLECwy1t_CQbHH5QYHxUgjEBLEt0isGosSg1UE6Qaq4-_eNkqeWTYYyjP3N08iluZNLdu7r1gbzJB2BEYDJeVnABj184XUHHfXCbch87HbIaGCaE40oVX8yvULW-Xpk10uh636FnfTey4HgOKkuJjQRCcKAOVPhTcaUZIytjcp7E6W3D6XRZ-brsVDgSI5Pi4Y6L9QjEB1ZQ9bix0PXH5kc8HmzUVnyIFYIUp7X8lgf4m18wgzXIeWypdflCp2iD9obYQ4Jbue8chEOwHNvgn34qOkOiN9_CWn3GBQ-ke7X_x3C3UkokfmbeBYF5h4qRZH9b_ib0l4nqN_JAQJxazEbmLrkBkPdXFoEgDPQLY5Q=w2563-h1125-no)

#### D. Add the ImageView that will show the image in activity_xml

Note that we set the src attribute to **@drawable/tigercat** so the ImageView can reference tigercat.png

Resulting activity_xml:
~~~
<?xml version="1.0" encoding="utf-8"?>  
<LinearLayout  
  xmlns:android="http://schemas.android.com/apk/res/android"  
  xmlns:app="http://schemas.android.com/apk/res-auto"  
  xmlns:tools="http://schemas.android.com/tools"  
  android:layout_width="match_parent"  
  android:layout_height="match_parent"  
  android:orientation="vertical"  
  tools:context=".MainActivity">  
    <ImageView  
	  android:layout_width="wrap_content"  
	  android:layout_height="180dp"  
	  android:src="@drawable/tigercat"  
	  android:layout_gravity="center_horizontal"/>  
</LinearLayout>
~~~

Your application should now look like this:
![](https://lh3.googleusercontent.com/yDOVHJiZMVztFUG7oQyeF6-BaFVgl2BH8oNA0F8DyXAxR9Py-rih_aPx-dQOMPxMqEKo7FywlchG7CUuPd6KEFBcUYu8gjmvOUgoHGkaQvHJd7MnewYF2arbQolRGq34RDCMpOWkbLU6ET72izAfqNho6BPvKTgvgwUSfytZ2W058DGt3UxsadZrE9N9Xuxsu_IvUH_1Akl-_f1u7-TC6BH-nAfTBqcJSQlN7OR1W7k6st2cBEV6NF6wuqTZ2OUeN3FhWYJneRFin6m2kDJSBku53qejUgKcFOx5hGmyVs5_o-IrwWHDk_0EXKwHOOOV5Crz5zjIOglJLhLlZ62sx4ZLs4fOuB7ZDfAAhVAZuHzytSLXEjKS_nZoEmkJENgchcDINjmYIiN8dtkEWKJM3XMpk2rD5W2Pv8hCwc3oqyA_HTvBIo_AyB7xE5jd_4iGmErs4I9nXZ0CIn6ehq5AbY28xgM1hEsVxOaZZ1e3PfaHCvVe7R49_oZe6C4UFV0wuHNa_7C4eKmiDzSthnOH4cRey9AZ7lXUCZzz4Zp_xvc3KG6xOEAWnRlHfwadRWpsvRqyVuWTxHee3mamvILVmzgo8N7I6J8M5hLt5uvgHwJpzFTh9kbeVhXTszPysSHhmeL1z3kXMhXB0aOw-Fnd7VDKabwbtD4RB99ptRkBt0bY4dg5UealExp-z43Y5spbX3mEsnhNmCIsDFVJMPB6lNyFv59ac5T_Ucfst3sqWdNsCPTI3g=w2964-h1770-no)

### Step 3. Create Layouts for User Input and Confession Posts [[link]](https://github.com/glossiercoder/Intro-to-Android-HackPrinceton-2019/commit/21f288b99e5e4cff61b4f1d63fbc53306041e381)

#### A. Add LinearLayouts and ScrollView for our page elements.

An Android  [ScrollView](https://developer.android.com/reference/android/widget/ScrollView)  is a  [ViewGroup](https://developer.android.com/reference/android/view/ViewGroup.html)  that allows the view hierarchy placed within it to be scrolled. Scroll view may have only one direct child placed within it.

However, we want multiple views within the  [ScrollView](https://developer.android.com/reference/android/widget/ScrollView), so we can solve this issue by making the single child a  [LinearLayout](https://developer.android.com/reference/android/widget/LinearLayout).

1. Create a Linear Layout to hold the user input UI elements (EditText and Button). Note that we set the orientation attribute to be "horizontal" as the elements will be laid out horizontally.
2. Add ScrollView containing a LinearLayout to hold the confession posts. Note that (1) the LinearLayout orientation attribute is set to "vertical." (2) we give this linear layout an id attribute: **android:id="@+id/confession_list"**  -- this will allow us to reference this layout from our Java code later on.

Resulting activity_main.xml:
~~~
<?xml version="1.0" encoding="utf-8"?>  
<LinearLayout  
	  xmlns:android="http://schemas.android.com/apk/res/android"  
	  xmlns:app="http://schemas.android.com/apk/res-auto"  
	  xmlns:tools="http://schemas.android.com/tools"  
	  android:layout_width="match_parent"  
	  android:layout_height="match_parent"  
	  android:orientation="vertical"  
	  tools:context=".MainActivity">  
	  <ImageView 
		  android:layout_width="wrap_content"  
		  android:layout_height="180dp"  
		  android:src="@drawable/tigercat"  
		  android:layout_gravity="center_horizontal"/>  
	  
	  <!-- This linear layout will hold the EditText and Button.-->
	  <LinearLayout  
		  android:layout_width="match_parent"  
		  android:layout_height="wrap_content"
		  android:orientation="horizontal">  
		  <!-- Edit Text and Button will go here -->
	  </LinearLayout>  
	  
	  <!-- This ScrollView will hold a LinearLayout containing the confession posts. -->  
	  <ScrollView  
		  android:layout_height="match_parent"
		  android:layout_width="match_parent">  
		  <!-- This LinearLayout will hold the confession posts. ->
		  <LinearLayout  
			  android:id="@+id/confession_list"  
			  android:layout_width="match_parent"  
			  android:layout_height="match_parent"  
			  android:orientation="vertical"  
			  tools:context=".MainActivity">  
        </LinearLayout>  
    </ScrollView>  
</LinearLayout>
~~~

This should not result in any visual changes to the application.

### Step 4. Add User Input UI Elements. [[link]](https://github.com/glossiercoder/Intro-to-Android-HackPrinceton-2019/commit/83eee5a202a505a4762d63920ada2785b997f7d0)

#### A. Add an EditText component to accept user input for the confessions.

An  [EditText](https://developer.android.com/reference/android/widget/EditText)  is a user interface element for entering and modifying text.

The **android:hint** attribute is the greyed-out text displayed by default to the user that prompts them to input in the requested information. Here, we set it to "Enter your confession here..."

Note that we specify the **inputType** attribute to be "textMultiLine" -- this will allow us to enter in confessions spanning multiple lines.

Note we give this EditText an id attribute: **android:id="@+id/confession_edit_text"**  -- this will allow us to reference this input field from our Java code later on.
~~~
<!-- This linear layout will hold the EditText and Button. -->  
<LinearLayout  
  android:layout_width="match_parent"  
  android:layout_height="wrap_content"  
  android:orientation="horizontal">  
    <EditText  
	  android:id="@+id/confession_edit_text"  
	  android:layout_width="wrap_content"  
	  android:layout_height="wrap_content"  
	  android:inputType="textMultiLine"  
	  android:hint="Enter your confession here..."/>  
</LinearLayout>
~~~
#### B. Download the "add" icon [here](https://lh3.googleusercontent.com/hsZXZCf2HrYARxKmb-QJtLaQ1dydyU_UZHlaE3CqhYkAm84aqX0koCoz-95HtLaUPZhUKKn_YEd36JIM1DARsxkgNQOljTcRKxyp0Y3jWvFuFRArRVofYgo4jfA0GxfcIfabhj5UstFOmyUoTxXHAFHbuPgRhV7piqki4wVneOHik0nbi1200GoEaLz3Di8EjrMthkBOrFEXIoSmouQogXb_QAqapRUXe8rrDK-YhH6RfpKlBuJ8Gghb_15hhY9bUg7dGtLQW9SeyFZazOXBcVIXbu_ReNLiUmyLKtBXJYL-_2LnCT7qU2vjVhL3orB8uaHD6QbJDmNi3aaVU6D-uBJhOtK8_kupvrxGzIBBoP58LNg377VXI1QZB2gnMvd8eXA14bY90lMEM_Kzf20gsnZOKWbhNRn_cD67jzk0NvqhiGr-GZWuxlPGYAnQKTPwDwwMujHTvWBop39TW5zv7ilwJt4-Q7kRBeCvP6L1YRP7Ik7DeaTSXq4VXM2Pajlakzd8WXYgLO_91Spn1MMm_7LfhfDsgTmyukgcmI7j0aQLIQrK3U8LV9SRzE1YCVCEFeCUUf3fvwx4DlBW75IMsp1Tv1GJk4aZcW09TGh4ycOdV9YGd0gNJA09WPBMjCKDtlsh6YaqhcDPsEhjJopFJbnzYpf3VHXMrYLL02JUuOZ5euiBrDwAQeiuTjMaJRF_26Es6Th9MkrP3KywFLUkhreHNdYh8TS5HkbnqILsYngmyqEyRg=s36-no) and add it to the res/drawable resource folder.

The image should be named **add.png**
![](https://lh3.googleusercontent.com/hsZXZCf2HrYARxKmb-QJtLaQ1dydyU_UZHlaE3CqhYkAm84aqX0koCoz-95HtLaUPZhUKKn_YEd36JIM1DARsxkgNQOljTcRKxyp0Y3jWvFuFRArRVofYgo4jfA0GxfcIfabhj5UstFOmyUoTxXHAFHbuPgRhV7piqki4wVneOHik0nbi1200GoEaLz3Di8EjrMthkBOrFEXIoSmouQogXb_QAqapRUXe8rrDK-YhH6RfpKlBuJ8Gghb_15hhY9bUg7dGtLQW9SeyFZazOXBcVIXbu_ReNLiUmyLKtBXJYL-_2LnCT7qU2vjVhL3orB8uaHD6QbJDmNi3aaVU6D-uBJhOtK8_kupvrxGzIBBoP58LNg377VXI1QZB2gnMvd8eXA14bY90lMEM_Kzf20gsnZOKWbhNRn_cD67jzk0NvqhiGr-GZWuxlPGYAnQKTPwDwwMujHTvWBop39TW5zv7ilwJt4-Q7kRBeCvP6L1YRP7Ik7DeaTSXq4VXM2Pajlakzd8WXYgLO_91Spn1MMm_7LfhfDsgTmyukgcmI7j0aQLIQrK3U8LV9SRzE1YCVCEFeCUUf3fvwx4DlBW75IMsp1Tv1GJk4aZcW09TGh4ycOdV9YGd0gNJA09WPBMjCKDtlsh6YaqhcDPsEhjJopFJbnzYpf3VHXMrYLL02JUuOZ5euiBrDwAQeiuTjMaJRF_26Es6Th9MkrP3KywFLUkhreHNdYh8TS5HkbnqILsYngmyqEyRg=s36-no)


#### C. Add an ImageButton component to allow the user to submit confessions.

An [ImageButton](https://developer.android.com/reference/android/widget/ImageButton) is a button with an image (instead of text) that can be pressed or clicked by the user. 

Note we give this ImageButton an id attribute: **android:id="@+id/confession_post_button"**  -- this will allow us to reference this input field from our Java code later on.

Note that we set the src attribute to **@drawable/add** so the ImageButton can reference add.png
~~~
<LinearLayout  
  android:layout_width="match_parent"  
  android:layout_height="wrap_content"  
  android:layout_marginHorizontal="10dp"  
  android:orientation="horizontal">  
    <EditText  
	  android:id="@+id/confession_edit_text"  
	  android:layout_width="wrap_content"  
	  android:layout_height="wrap_content"  
	  android:inputType="textMultiLine"  
	  android:hint="Enter your confession here..."/>  
    <ImageButton  
	  android:id="@+id/confession_post_button"  
	  android:layout_width="wrap_content"  
	  android:layout_height="wrap_content"  
	  android:src="@drawable/add"/>  
</LinearLayout>
~~~

Now the app should look like this:
![](https://lh3.googleusercontent.com/nD9f2pOhCTJsajEMBQVnZRY7XPVdJ4HvzY_5m6OA363zoY9Pn3_UnCg6p1LosaINpQ9-7RCVtCKWpKNKWVolQ5HGguWhHfFcplaOYTOtuT34rNO8UC9vQvJd6xH1bcom0kyZ4yA0xcfvoViWsMX1nRc2Qj9zc5-c7Cfp_9_PE8oxpJWgtnPPHx61PvSkz9JFz41Iflr-14_ICfsV3euixkURqayIzY-G3zmoXmniNETKKNzJC20JQ5gDrha0BJk-HJlRVx8TcRhiSB6TLtAvIzhhrCCphR9AZe4y1sSonXGqBh-rO2Nv6TPh2w-jYqtpMdIXNnZl0ET0v9VT6yFNwi6H2Kq8GjIyYRcVK7sPllNQ2ET_PmwQYBoUZ67w4ZfSu98fGv5YROc848cko4E9z9_8o2O2RcugfUCpHFemnN4Ech74vHuCMs4tMsdT6tmZ7TakgO7FRc_AiXhbP-COO0xf2snxsN06xxlREJlvT8Ys-ZuHxixFx6tiXgHf0gfwJkTsEoAwB36yvR9tVeWQfgV1lwz5mbELQFH_lEfJpUise8mmqmr90Mv8EL2n_5UZvTcE1sjpDN_eizRS7HilMARpvc6gpkBD0F0XvdFJPatf_u7eXRcP_lLW6-5fX_K-4BQau_emG0WR-RXpl40NqjoquIx07seJQsG04i0MgXPRZaBxLZooo8YOQpMeGjB1IUnBN-zJj7lE68iJ_R2-ipP8195QSwHo84IvBCIcdREsxfMK0A=w3082-h1762-no)

#### D. Introduce layout_weight attribute.

In the screenshot above, we see that the EditText and ImageButton do not take up the entire width of the screen. And if they were to take up the entire screen, how much space should one element take up relative to the other?

We can solve both issues by using the [layout_weight](https://developer.android.com/reference/android/widget/LinearLayout.LayoutParams.html#attr_android:layout_weight) attribute that is available to the children inside of a LinearLayout -- this tells us how much space each element should take up relative to the others in the same LinearLayout.

Here, we give confession_edit_text a weight of 5, and confession_post_button a weight of 1. This means that on the screen, the confession_edit_text will take up 5 times as much horizontal width as confession_post_button.
~~~
<!-- This linear layout will hold the EditText and Button. -->  
<LinearLayout  
  android:layout_width="match_parent"  
  android:layout_height="wrap_content"  
  android:orientation="horizontal">  
    <EditText  
	  android:id="@+id/confession_edit_text"  
	  android:layout_width="wrap_content"  
	  android:layout_height="wrap_content"  
	  android:inputType="textMultiLine"  
	  android:hint="Enter your confession here..."  
	  android:layout_weight="5"/>  
    <ImageButton  
	  android:id="@+id/confession_post_button"  
	  android:layout_width="wrap_content"  
	  android:layout_height="wrap_content"  
	  android:src="@drawable/add"  
	  android:layout_weight="1"/>  
</LinearLayout>
~~~
![](https://lh3.googleusercontent.com/dVBqg84n89iq-INq0GB6fGcTEcL35mdU5HDSQL9yYkARaIfbPb0--Uyw_SYBpB8zk87lsRTv4yfQYlzh3tH8PJQyfqGJuUvCc4HhTHt3MAatgF7IqnKPkxrcNzbi1DN7munt7VB9ubrKbiD22rrQaNXoKW3M_8xAKAwS0jqxoxlv1qeWcImfT3amZcUMKHOfLBVcJYeDD7XtMxoLdlRIrQ61VWEvFtOtsNVH-2euSeqieCmMiVryhOli0xNSZfB84-G-bG0wWZ-bfUnoDtp7HZLCYBEhNfP7FJJqicbYNDRWVD6TcgmblxVUc_tL5xf6P-fnkN9Kyw_b9nrZZfg4EXvCIcAJq2axUtLDEHX7G1QHn9jFtSV_QuvKArbKjWOF00eso0wRnHGsAdvXogJ5H5XysBx5m_MxxFAuWUpp1_dO9Pupic-rEjUDs5WnHABUs9cerdFukCyWn5FJdKEkt9v1MotmYDMuOxXlBhGTDd-mZ04x3Yi1LZzD_6aSbaJ_zFHMRUoxGWyCYHg_EldoDt9_oLwXttz5HAP7XLpF3IfPTK26SyglJCqMCNw5XM7uhH-_oVo50Uby880W_2QZWhLP4puMRNBAEbv-7M2qFyy7pMPbCb6aZ7e7C2Z_IH0NyQdY9c0aewcc3G997uPKr5Y6rlHVHATdxO4lr-vnISPpMHdp2YWZdVSq=w3094-h1750-no)

### Step 5. Finishing touches on the UI. [[link]](https://github.com/glossiercoder/Intro-to-Android-HackPrinceton-2019/commit/9793e73b543d97799b2214cd2ed2fc0922c2aaa7)

#### A. Update colorPrimary and colorAccent in res/values/colors.xml

The file colors.xml defines the values of color variables used in the application. You'll notice that **colorPrimary** controls the background color of the App header (which currently is a Turquoise blue).

Believe it or not, there is officially a color called ["Princeton Orange"](https://www.colorhexa.com/ff8f00) with a hex value of #ff8f00.

Let's also add in a golden yellow called ["Selective Yellow"](https://www.colorhexa.com/ffba00) to serve as the accent color.
~~~
<?xml version="1.0" encoding="utf-8"?>  
<resources>  
	<color name="colorPrimary">#ff8f00</color> <!-- princeton orange -->  
	<color name="colorPrimaryDark">#00574B</color>  
    <color name="colorAccent">#ffba00</color> <!-- golden yellow -->  
</resources>
~~~

#### B. Set the background color of confession_post_button to colorAccent.

~~~
<ImageButton  
	  android:id="@+id/confession_post_button"  
	  android:layout_width="wrap_content"  
	  android:layout_height="wrap_content"  
	  android:src="@drawable/add"  
	  android:background="@color/colorAccent"  
	  android:layout_weight="1"/>
~~~

#### C. Add margin_horizontal and marginTop to the LinearLayout containing the EditText and ImageButton.

We set  **android:layout_marginHorizontal="10dp"**  and **android:layout_marginTop="5dp"**. This will add a 10dp border to the left and right side of the layout, and 5dp at the top of the layout, which looks better visually.

~~~
<!-- This linear layout will hold the EditText and Button. -->  
<LinearLayout  
  android:layout_width="match_parent"  
  android:layout_height="wrap_content"  
  android:layout_marginHorizontal="10dp" 
  android:layout_marginTop="5dp" 
  android:orientation="horizontal">  
	    <EditText  
			  android:id="@+id/confession_edit_text"  
			  android:layout_width="wrap_content"  
			  android:layout_height="wrap_content"  
			  android:inputType="textMultiLine"  
			  android:hint="Enter your confession here..."  
			  android:layout_weight="5"/>  
	    <ImageButton  
			  android:id="@+id/confession_post_button"  
			  android:layout_width="wrap_content"  
			  android:layout_height="wrap_content"  
			  android:src="@drawable/add"  
			  android:background="@color/colorAccent"  
			  android:layout_weight="1"/>  
</LinearLayout>
~~~

#### D. Set the LinearLayout confession_list to have a padding_horizontal of 10dp

This will add a 10dp border to the left and right side of the elements inside of the layout, which looks better visually.
~~~
<!-- This ScrollView will hold a LinearLayout containing the confession posts. -->  
<ScrollView  
  android:layout_height="match_parent"  
  android:layout_width="match_parent">  
    <LinearLayout  
	  android:id="@+id/confession_list"  
	  android:layout_width="match_parent"  
	  android:layout_height="match_parent"  
	  android:paddingHorizontal="10dp"  
	  android:orientation="vertical"  
	  tools:context=".MainActivity">  
	</LinearLayout>  
</ScrollView>
~~~

After these all changes, your application should look like this:
![](https://lh3.googleusercontent.com/DVzpiFbR7K1CaXS6tBALUfSIPZbfvSbhXIAd4C0ORoRfgU3B2k3Nw80qt_SEm_zrdbysU4nJAu4SUcoI5UxXzF_WBUWHXHw41oapIRZ2coaL6GWexf6aBBabvR8K2LIEhiKT69ubjhJQ0fc8hExw-jLONz3ZgZg0_20W7ThjI0snYbo9wfGHUjehLRns1aaaZPmFy-dxnZ2SlDH7dCDn35XZQWNZTFhNMGFdl5i5kkFlgJz-1xY6O5c9xeXVOwKMog8UKX1so-0G67CClCb9l9ujhbt09G2s3BEjB1XxNomorHjPEqYdWw95Ss0OV6UJjCbbE0mLen9wm1H8Z9Ej_Camrtf9qyJmmsWVvU2o5clcUd4qLB4DJO5OcWa7RGSG9iuQMh_Y_9yC7bmCViiTFHZKG-lAdABbGBZ4PRQuZv_F61rrzsDScD7oigbh2agf-g8qvUeMYPd0nlonsttlq-ic16UsO0Hc7NXzeJV9sYbGO5yS570ssLdxtT9mGdQRPu5KDUFvCSbqiIaATyyARs-AfVoNFLeT4-Jzz3EWbmmH3e9rspmUx6Nv_IPacti09FwlqbRKzoFpa7Ut0Ay862pJI78XjNQBHXq7PysvatI_zBLVlpmpXcpXDKZs5VfK-em7VPPBr72R-cS9cJFRRqQXcu4-3NLpiyG7nA1-z4oNjveQocelgDvXK3lgaClFNOWvueH6TSji46DLfWHOLrNeVBB-RG3lAdW_Z4bPIwAuoR1jtw=w2644-h1746-no)

### Step 6. Link UI Elements to Java Code and Allow for Confessions to be Posted [[link]](https://github.com/glossiercoder/Intro-to-Android-HackPrinceton-2019/commit/2bb845de4fd74b6e98b79834b58eaf3517afee13)
#### A. Import the classes we are going to use ahead of time -- it'll make our lives easier
~~~
import android.os.Bundle;  
import android.view.View;  
import android.widget.ImageButton;  
import android.widget.EditText;  
import android.widget.TextView;  
import android.widget.LinearLayout;  
import android.widget.LinearLayout.LayoutParams;  
import android.util.TypedValue;  
import android.view.View.OnClickListener;  
import android.app.AlertDialog;  
import android.content.DialogInterface;  
import android.content.Intent;
~~~

#### B. Reference and link these UI elements to the Java Code in MainActivity.java

Create some instance variables for the EditText, ImageButton, and LinearLayout to hold the confessions.

In **onCreate()** within MainActivity -- this is called at the beginning when the Activity is initialized (read more about the Android Lifecycle here) -- initialize these variables. We use **findViewById()** and the **android:id** attribute we set above to link these UI elements in the XML to our Java instance variables in onCreate().

In MainActivity.java:
~~~
private EditText confessionEditText;  
private ImageButton confessionPostButton;  
private LinearLayout confessionList;  
  
@Override  
protected void onCreate(Bundle savedInstanceState) {  
    super.onCreate(savedInstanceState);  
    setContentView(R.layout.activity_main);  
  
    this.confessionEditText = findViewById(R.id.confession_edit_text);  
    this.confessionPostButton = findViewById(R.id.confession_post_button);  
    this.confessionList = findViewById(R.id.confession_list);  
}
~~~

#### C. Set confession_post_button to call a new method postConfession() onClick.

In activity_main.xml, we set the attribute **android:onClick** to "postConfession":
~~~
<ImageButton  
  android:id="@+id/confession_post_button"  
  android:layout_width="wrap_content"  
  android:layout_height="wrap_content"  
  android:src="@drawable/add"  
  android:layout_weight="1"  
  android:background="@color/colorAccent"  
  android:onClick="postConfession"/>
~~~

#### D. Create method postConfession()

Create a method **postConfession()** that accepts a view parameter by convention, and is of type void.  We do several things in postConfession(): 

 1. Retrieve the text string inside of confessionEditText via calling getText() and toString()
 2. Clearing the EditText by calling setText("")
 3. Creating a new TextView to hold our confession, via a method createNewConfession(String confessionText) that we will implement in the next step. A [TextView](https://developer.android.com/reference/android/widget/TextView) is a user interface element that displays text to the user.
 4. Add this newly created TextView to the confessionsList so it will appear in our list of confessions.
~~~
public void postConfession(View view) {    
    String confessionText = confessionEditText.getText().toString();  
    confessionEditText.setText("");  
  
    TextView newConfession = createNewConfession(confessionText);  
  
    confessionList.addView(newConfession);  
}
~~~

#### E. Add a rectangle resource drawable to res/drawable for the confession text border

Add a new resource xml file under res/drawable called **rectangle.xml**, and place the following inside. This will create an orange border around every confession.

~~~
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle" >  
    <solid android:color="@android:color/white" />  
    <stroke android:width="1dip" android:color="@color/colorPrimary"/>  
</shape>
~~~

#### F. Create method createNewConfession()

Create method createNewConfession() that accepts a String confessionText as an input parameter, and returns a TextView. We do several things in createNewConfession(): 

 1. Input validation -- confessionText should not be null. This is a good programming practice.
 2. Create a new TextView called confessionTextView.
 3. Set the text inside the confessionTextView to confessionText.
 4. Use a LinearLayout.LayoutParam object to set the width, height, and margins of the TextView.
 5. Give the TextView a 10dp padding on all sides/
 6. Set the TextView text size to 18dp.
 7. Set confessionTextView background to **R.drawable.rectangle** -- we added this resource in step D. 
 8. Return the newly created confessionTextView

~~~
private TextView createNewConfession(String confessionText) {  
    if (confessionText == null) {  
        throw new NullPointerException("Confession should not be null!");  
    }  
  
    TextView confessionTextView = new TextView(this);  
    confessionTextView.setText(confessionText);  
  
    LinearLayout.LayoutParams params =
    	new LinearLayout.LayoutParams(
		/* width= */ LayoutParams.MATCH_PARENT,
		/* height= */ LayoutParams.WRAP_CONTENT);  
    params.setMargins(10,10,10,10);  
    confessionTextView.setLayoutParams(params);  
  
    confessionTextView.setPadding(10, 10, 10, 10);  
    confessionTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 18);  
    confessionTextView.setBackground(getResources().getDrawable(R.drawable.rectangle));  
  
    return confessionTextView;  
}
~~~

Now if you run the application, you should be able to post confessions! :)
![](https://lh3.googleusercontent.com/W-e6atXdoKIzFwxz1FRjxPC-Qxf5qTBJyUsnlaAC_vaUeKNz-xnC4o0wF1CwEmmRu-UmySx5CeK1wD105B8GmhFb46KGDilEZReO3UYzvFjQ7kCMQmUy_u04uq-BE2dBotd6xfeYUeiFNs1grV8IVC0TeW10Xx9ghSRRhmRf-AMecnuJNTedu2K7FNVyD94q5172VLYGkuwfjKS5uf8DwOeeLz8akvVkO48fh4thhYWIBsS7GTtfjy3WW5B0hKEHI5UfO8R_J5pzYnfMMuJ77DSgd7z279sQOuZqWLZSn7c4Wz-4LiTLAbbquTBH_abiIksYyZ19QPheQv0pmatENRCc68InFcyQwAENdrLXHMpULQPkTXMGtNzOh21r_Enl8BG5Fm67KHskNE6vzdp8feAt7ZsX4qyK3BCkgNSyZNASFtVkS84n66Mkci08CFCPcaQ6cHZx35KvNQqDXmk7DP1eiGu0JsC8j9Cm-ZjCnkSRgKTLGbDDsK7SEqRLaUudufJB0QEc2npCKD3TRU3BY7N9UWX5_ILF2QkIWfyy1CSpMkuEJ5VMw5qRN02D5RwejSq2tErKXcz8p_P6931NzLQ3QeDEB6QverLR3_JZWVJmas_3bKQOEBjOOwEXhl181y1t_iciyEy1S-MC9L_Gr5lKda830Ljdcowt1gSEKL0Yzw-yAV--x0BYtUCC7FsBbVqZ1HsmkdWt44ZkCsIMbO73esqSCfp8m7tmFxQ2_mya480CPA=w2720-h1623-no)

### Step 7. Dialog and Share Intents [[link]](https://github.com/glossiercoder/Intro-to-Android-HackPrinceton-2019/commit/e099bf8ab8a7bba23accd1a07b56557e7d15df6d)

As shown in the demo video, we want each confession to be clickable. When the user taps the confession, a [Dialog](https://developer.android.com/guide/topics/ui/dialogs) will pop up with the confession text and give the user the option to (1) share the confession text, or (2) exit the dialog.

#### A. Create a ConfessionsOnClickListener

We create a click listener class for the confession text views that implements  [View.OnClickListener]. (https://developer.android.com/reference/android/view/View.OnClickListener). We store the confessionText string as a private instance variable due to access permissions (if you keep it as a local variable, you will probably see that you run into access issues).

In the onClick() method we do the following:

 1. Check to make sure that the view is of type TextView, since we typecast it to a TextView. In the event that the view for some reason is NOT a TextView, onClick simply does nothing. This is an optional, but good form of input validation to have.
 2. Obtain and set the confessionText from the confessionTextView via getText() and toString()
 3. Create a new AlertDialog.Builder and set its message to confessionText.
 4. Obtain the dialog by calling builder.create();
 5. Show the dialog.
~~~
private class ConfessionsOnClickListener implements OnClickListener {  
  
    private AlertDialog.Builder builder;  
    private String confessionText;  
  
    @Override 
    public void onClick(View view) { 
	    if (!(view instanceof TextView)) {  
		    return;  
		}
        TextView confessionTextView = (TextView) view;  
        confessionText = confessionTextView.getText().toString();  
  
        builder = new AlertDialog.Builder(view.getContext());
        builder.setMessage(confessionText) .setTitle("Confession");  
 
        AlertDialog dialog = builder.create();  
        dialog.show();  
    }  
}
~~~

#### B. Introduce Share Intent

Right now, the dialog will appear and show the confession, but there will not yet be buttons that give us a set of actions to choose from. Let's add those in. First, let's add in the capability to share messages. To do so, we'll need to use something called an Intent.

An [Intent](https://developer.android.com/reference/android/content/Intent) is an abstract description of an operation to be performed. An Intent provides a facility for performing late runtime binding between the code in different applications. Its most significant use is in the launching of activities, where it can be thought of as the glue between activities. It is basically a passive data structure holding an abstract description of an action to be performed.

In our **onClick()** before we create the dialog using the builder we do the following:

1. We call builder.setPositiveButton(), where the first parameter is the label of the button "Share Confession", and the second parameter is a new DialogInterface.OnClickListener.
2. We start to fill in the onClick() method of the new DialogInterface.OnClickListener by creating a new Intent object named something such as sharingIntent. This intent is of type ACTION_SEND. There are various Intent types such as Email, Uri Request, Location Request etc.
3. Set the Intent type to "text/plain"
4. By convention, we need to include a subject EXTRA_SUBJECT via putExtra(). Let's include "Subject Here"
5. Next, we include confessionText via putExtra() under the EXTRA_TEXT category.
6. Finally, we use startActivity() that will launch the Intent. The text prompt we include is the string "Share Using."
~~~
builder.setPositiveButton("Share Confession", new DialogInterface.OnClickListener() {  
    @Override  
  public void onClick(DialogInterface dialog, int id) {  
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);  
        sharingIntent.setType("text/plain");  
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");  
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, confessionText);  
        startActivity(Intent.createChooser(sharingIntent, "Share Using"));
    }  
});
~~~

#### D. Add in cancel option in Dialog.

We use builder.setNegativeButton() to create an onClick() listener that dismisses the dialog.
~~~
builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {  
    @Override  
  public void onClick(DialogInterface dialog, int id) {  
        dialog.dismiss();  
    }  
});
~~~

#### E. Link ConfessionsOnClickListener to confessionTextView.

In createNewConfession() before returning confessionTextView, make the textView clickable and set the onClickListener to ConfessionsOnClickListener.
~~~
confessionTextView.setClickable(true);  
confessionTextView.setOnClickListener(new ConfessionsOnClickListener());
~~~

The application should now look like this:
![](https://lh3.googleusercontent.com/KP5hhAzUt5PpIcnnsRmrunjrkHhXJPgrRW-L8i_d8vXB3sxl2xQdDgiXr25fWmivAhrhSg6-wGtwnoQx9ShsgA1ycOaAZ8AmJosWGh684Mg5tJBIjjnb-3_JZBOFsDDbjcpklhG225wQuQvIAVHODwlg8NjwonzrBwpmq4O0STZu8HmrA_sexZUGbwb4N9dxyNpXaenJq2j_oDjh-OL_HhACJ2tKR3kHT8_ir_aMfUKdyUkaSSmTeCgnVVBMOBdJPG_KUROgFTCLyY9DGh9flnswF91RZey_iYi9RoJ2gxH--vDpgdo_4fedBc6ufimEQCCZA49FjOZJTTeKeQdIB65uYdXeDWkmkTZ536VIErZtuKTENEbuy9rOtSVq_6_s3_geetcxq_5QBO57xBzmBmiwyPFxLZPByAXMdpCW4NROsVyyOMkxJD6qjlUh3x8jtsclleXg2RHnn5Gh0Eu7U5BBR3bxqQNeB6JZD9cTpvfuOXMQXXheDGEjc3TKJWYq7n-Fq1JHF3pnZ1rFUjTN2XZHnnPoUBP0PwgYZKt1PqbFIqjrcu2cbVspzc5aLscXGMiUzUiECd7JJUsyn6OtW6sbG29R7Vx08lIIvIsgMITY8S2KPYE0gDNWYF1-XAvm7D8FA4cB52ThooupO3_w_Tz-ILiEkVFjb8Wkez7wvJqdNkCxNA7igp9yBuPeCmaW1ljrK3WoeXGIk-ypUeFjAP_BwmPWruNErBcnbUCfm4TnLGRVBw=w2582-h1766-no)

### Step 8. Finishing Touches -- Cleanup of Strings.xml  

Finally, we are going to do some cleanup of the app.

#### A. Place all string resources in activity_main.xml into strings.xml

In Android, it is convention to store all strings in the application as variables in a strings.xml file. This is good practice -- if you need to change a string, you can do so in this one place rather than everywhere that this string is used. Also, having the strings in strings.xml allows for additional features such as location translation and  [Talkback screenreader for accessibility](https://support.google.com/accessibility/android/answer/6006564?hl=en)  features.

We create variables in **strings.xml** for each static string we used in the project. Afterwards, strings.xml should look like this:
~~~
<resources>  
    <string name="app_name">TigerConfessions</string>  
    <string name="enter_confession_text">Enter your confession here...</string>  
    <string name="confession_header">Confession</string>  
    <string name="share_confession">Share Confession</string>  
    <string name="subject_here">Subject Here</string>  
    <string name="share_using">Share Using</string>  
    <string name="cancel">Cancel</string>  
</resources>
~~~

In the XML, remove direct mentions to the string itself and reference the variable instead. For instance, confession_edit_text should look like this:
~~~
<EditText  
  android:id="@+id/confession_edit_text"  
  android:layout_width="wrap_content"  
  android:layout_height="wrap_content"  
  android:inputType="textMultiLine"  
  android:hint="@string/enter_confession_text"  
  android:layout_weight="5"/>
~~~
Similarly, in MainActivity.java remove direct mentions to the string itself and reference the variable instead. You will need to use **getResources().getString(int resId),** where resId is in the form of R.string.[id]. For example, instead of 
~~~
builder.setMessage(confessionText).setTitle("Confession");
~~~
we write:
~~~
builder.setMessage(confessionText).setTitle(getResources().getString(R.string.confession_header));
~~~
For the complete set of changes, see the git commit.

While this doesn't result in visible changed to the end product, it helps to foster good Android programming habits :)

## Adding Firebase to the Application (Optional)

### Step 1. Firebase in Android Part 1 [[link]](https://github.com/glossiercoder/Intro-to-Android-HackPrinceton-2019/commit/1096eaf897907269bb7c059ff6a76f88f1440674)
#### A. Sign into your Google account using the top right icon in Android Studio.

![](https://lh3.googleusercontent.com/2ZD97eGAvA5Hy1UN6yHqLNFPLkd5lrJ89ZgEqjSl2XYzJX1XFk6Or1s9JeV2CAecrEXekqK5owivSSvnK5CYBWRO4NAQkN_4QrJZg4MLh22p46XLn3EReOcOW_Fh6oMvniRseA8azZhNvte0g7HPdTNPRzLZvrJQN1ho7PzSWwjDD69n9vKCxaOilRD8j4AOg42OhenoyxGrn3ExqGFz6tj_1oA8vHH3Pf8vY5lVehScSIew1Kgk03kjIiasPm6vaTQrJcdVw8OMvoRihFmNffJ8ghGPzN5OmHBG16bJi6C7XyN-DG6TP35S2ZHZVS7E2vwM36LB4EUbX7aCojqjsUXOlHWsPAO6RG8s4FyAz5wflqqaLM07GPOwReNCZJa5U_8HYQ5n9768_mLKGxBd6aFr0fxgD3duyXXQd5v6c5wDaL4o66ycpwv0NdDlNYP1dJexLhnFd7G3hEEh0BJIcOb6OeGb6xonAJfiIKbgfh-ZNIa5uhFfcGa863w9vR_P1g-KsWnUJ_UK4H7brP44vl4YgsKjTFbY45LA7VAkT_0E0s023o5Ob2xPYjtH9CL_HRLXO6gBnOjGaUkShDrKu4N0otpHU5a9tNravzqyxgxPdkna-5gIkDyjbPVEbuodT4lKwBQVuRJXU-Tv3ORJcGD7_hQiP0oznu_8bgUWfAKReLKWiTxCI-MS8_N3-bUgGcYokXyOjCGvzXibK388aTXCgfTeqilGEZ7fUK6T5U3RaWD-tw=w2401-h1071-no)

#### B. Follow the Firebase database instructions.

Go to Tools >> Firebase >> Realtime Database >> Save and Retrieve Data >> Follow Steps.

#### [](https://github.com/glossiercoder/Intro-to-Android-CalHacks-2019/blob/master/README.md#b1-connect-your-app-to-firebase)(B1) Connect your app to Firebase

Create a new Firebase Project, and give it a name such as "TigerConfessions". Click on "Connect to Firebase" -- This will create a project on  [firebase.google.com](https://github.com/glossiercoder/Intro-to-Android-CalHacks-2019/blob/master/firebase.google.com)).
![](https://lh3.googleusercontent.com/okzXO0n0alHF6lOo7foNx1xG6cNv0l4dkwZteaMBzw0A-yS_BW76gbTTiypAONgUhMRkaSbDWWZg4CZ30d0ob61HwzpjBwWU_hLY2d5cDz1hVMB-8I8yg2XiLc27uk7wLtstbqEB7YXVjzduntAzNnB3439FWm2-qTtMw0CfaXnZNHOtRZ9vsE2qaCqiH20VFjlUiJzF6joag1iFbReKqUag0O2Wjr525R1j-IuXFIocC_0ucG5_pte4g87A0mxbXE_3X8c0ulsqJoQM0Wg1eoVp7EAGe-OthhIqdS605BswSB7XT64HHFJ6ABhyaL-MqnuapXyhQIVJj-0N-Uf2CkUAFCMElEkAPgB8rZEkJ4c34eZdAY8x6QLT6BfUWssZ3aO5xoD1qlA6h1XpeQSsH6gDxCRFcvwbirQ6_6PzJRy1ESElfiJlGcU-trRiIhcs6ahUV2968c15O7YVfysGL2l5ZKjGzJd2A3OIqpzqMA3nhSg_6zy8F0hir3TqPLXqW2in9KPBuQRMK9DVuJxysYbIwKOyvB2F_xT6W9t4iPB5EM-38SJK2IXAwblJKKFQFFZRzalYoPwm1ZVDmJnKEgAsRii31uaecWa3LiuOWceaVsTPW2lF5gX1s4AocD2kpsTvNnyia6Wg1Qe-CRdG_yY07HfNxHklfUiH2s6QabOhZ_tL-vi0rl2xl05ycr7XbEUOVKxppvprWRi1GQsq9fwkh0D82wqp6g7pt17rir1IA4HfTQ=w3111-h1861-no)

![](https://lh3.googleusercontent.com/d5ggTDsd3My6SERqBpbY6s7Dlnj6M4npNCtlMj_PhTDOaAFIOqqB8vvQkmUeIRcNkggmVqLbBFiz8I3I5mzU5PAOECXrH3uerP4tjbgnOyCo86FE7gICcBcwgAywKcuMmELe-GQGQmJ-c18eDEDE1G9aYVdZ14vNrX5h8k9GT15SrkQg0O1co5DBEMDX83jtJEg624jr7--NgpIMREEqQrSqkN8yuqavbY8Zw8xVRIsyiARzkobuwZJs6ZlawGdsdvTIqJHUUhfpsWwr6tMaTR5Gxub5xId2TIt-ch0dIxFOePmY1Ss7rJF8BJX8m77fh_KhzLzEL3BZwoUGz9e9RS4QN1s1x2BkcenMFbs8cEVKItz5wdRqp-Ygi83DH4sLZZfcpDPuruqDtnN5ZCiMrNx-euOAfGYheYS8vUFpw71cmjwk86WC-_BXMXxikU1WE4p58JX1w5eD9E_J-1-KbQX1lysH3Fld1MN01q8aILZLQKv_OHYIVQjKAO2Gl6gTZedO1xA5cHrjaYThhDZpZKAunY-JErAs7irfmqbbhntMoNgY73J6T3CepJUDY4gGh94ai1wAQ5DqbEqx0ddllybk60hbDgRO_DQ0x3Wbf2G1bXcRHpPXsUj-_KNdq9JXpWfX1wpqxbzmC4yZf3qfOGEdAFQlI7IubsqbPo8C13MmTm23x2NkqPyGSq3OodvaaXJjzFYA3aD5FBqeQA4SbryLswpi45Zlw81Q790mM6ZngvMpvg=w3090-h1858-no)

Now go to firebase.google.com. In  [firebase.google.com](https://github.com/glossiercoder/Intro-to-Android-CalHacks-2019/blob/master/firebase.google.com)  click the blue "Go to Console" button at the top right corner. You'll see your application (whatever you named it as, such as ) under "All Firebase projects" from which you can access the developer console.

![](https://lh3.googleusercontent.com/H5lNM8BUJUx4928-CBXHYBhfVMtmYQoOBbDuvYpMihyJak2qu2FUZLJro8Hb4NmYlpJUJ53mqQ3JMRs4eBJjn31ZbCnm2s037WZ5OMeOoY9Vc4MKHNU4var5sMIIaStJTw-5wFvZKKy8NsKtntoPuFJlE2tjnWs_a23r_Q0hRgWm25KEftmBOKGKhQ2v_bJ-JLD-A7CDbnm6fdnfPIvhkzboaQsbKWBEWjHk-fdPque5ogsbHmOYxBETzgfSUWJ46vvIp7UBAmsT2Hs4xEMfoY_adxioXUdOqtHCwj04y6i5CFjDxZpiHNjpYDWrxd1H4yTWcQJuqu2cdee0UXySmY18vzVBmxywGFkQOqFLJkwhVIcr2c6Nu_1byS3xjrTzcjvcl2NPtN35oejbsPRWnTNRmdazFqwIOR9B8zjvO9A8cowHCJ-Tg8Um7CZMiY439RUHZyEcSCU-R2nxWFpoFiXQUutiL_qOnf0iPso5fWi2H-5GarKDqh70zhZPeylvErvx_2qywGDSFgAb6C0_v9MqI2MpdTXoX7OZ1oSMuE5Z2dwduGHpiaMAvCUOIaIWaZyLJT73kYC8fIB3xX7154m_t_Ns2pit2wc5N2cfEDoHRroFLgrcl3kZmZr-TDCEUsUGq6O9XH1o7UCddL-fJXzxdUA9hIL9puU-nIYXo9UGrYGoa18Qo0DlYG0vPCRsaSVidoQ4EBZYweLI80ThMjN-gkPj0YZbI39bnCtq37BgeK76zA=w2856-h1701-no)

In the console under the Developer>>Database section on the left navigation sidebar, scroll and find "Or choose Realtime Database." The advantage of a  [realtime database](https://firebase.google.com/docs/database)  is that it does not require you to use commits to explicitly save data.

![](https://lh3.googleusercontent.com/ddn7zG3QxwbK4E6Kq0gK3gqre-pyjvnuoFNRPSZCbuhAy7NaTEKc2RB4q_1D20zIo_UBM7LW3zZrdyDT46TzCt1-NLOjIfWX3sz8qpaiP_r4NG4CYsMSxtGP3LA-wJnB1sX_sQc0pczl9Ln5tjyQwLErF11hvD67ZYwN59j5ExaGL7D97ztOUXy2DPytHGt-m4jC9Kqu4A3nAJDa_xYvNyM22Kl9VDzfZTudbnXI4FQD4rQOjBxWPS4dQ9b01711Dqx3L9MctYCihERSj7aqvvxDZlWuItXLirNVcLAkHykveOyPhCxUdUBIxzd4do2A_f-7U-uIU8s9Jw8s2QoTttZyCSoARvtJz29ivqTOnvsfJV0gQt4pL1hgi29pLcUXs1cjqem2gCGdU2aGCZqTuKcjCEAOG7paK0QQOoqSlTXmB2bS0FFhM7ILx5UogQ6IkyLM_UrANMccaC-kxtq-3zzXF0bauPTsXl86Dxm_22u6LxzaYdMT55O-6q5WLnqTn3jot-QCAmQq1JKwVnAGZiFVwFX7gA5PZS3dlLIZ6XLAQQA9fD4rCOS5Sl4WSSdRDta6YVPJQJJsTA66sMfBQ2girFj_Vdug6-cEdMejFsOBP7WQl9-wuvcj5W4aYCxAiic4QryQ5LPX1xeJT00bj1d588TZOWrgtfRA3FVaBx5OeMjD5ziRhOPbBvLVYJ9SLCEaUDXyjYxaQ59KU6pN6qWgXFlv8RN8vvNoC_yr88w4kggVRQ=w3326-h1441-no)

Click on the blue "**Create database**" button. A menu will pop up. Choose "Start in test mode." In practice, this is a terrible idea since it would allow everyone who has access to your database reference will have read and write capabilities YIKES. For the ease of this tutorial, we will choose this option since a locked database requires authentication which involves some extra setup. Hit enable.

[![](https://camo.githubusercontent.com/71b490239dcbb4e8de8282469da4e2fa78e91606/68747470733a2f2f6c68332e676f6f676c6575736572636f6e74656e742e636f6d2f44674d5473534c716464526570506a484e72593750325f31377032666a4550537269326f357759505361512d38634b5f394b4945306b4c4634364276522d56344352574a4f414e4d3966572d724d72323230584964794f446b513763433950687a644d4a74656d564e39664e4261585079577439783939784f616770523242623935494e6b665f2d536630324830334c554d535a30444234627336636830386461684252696c385446553150616f4c436f73364a752d6c65306f347034386952787766364d4232373244463235473944597a784835756d386e5678427a7832413943755f6247495a6b635245597a727a62476a2d474734357a3531614e366e4a4136656e435877506162356445417048526a6a6b727a6e54554b374a44455339635f6345436f335573376b356a785079564b4e324f41387a346c3951326e46325a3442487a463831365161783839414e5538512d7431326f4e54597542544b716e7770744769416f694c6b473442395639624c74414172556c6c425539724669642d646a74526277685337396253357235794f644f343433456371715232474c62646b6f43457064424e5655536d3665695a6570773253776d415232707a7a705a665336646f66355751714c4a443847496c49455537613371393032447251464c67656d5a4e7166544c6379324e5753625f4b665353344c6236636c2d364d4644304b746974583346674c454966684e48635667374b64526b657130616772394b4c6e6e6d42786a7a4532563634336e6672555844434a7359454a546233794f316b4a5678466878304a794a53704750777554414d786a305a6631656638567043673055664a316471336a64516d735a626e345332426b536f4c597053705459722d39436231524b34636c51596c4136427a4f5a356c664659364f464536335f4e5548535a73624d6b6e68676d7a6b316d6563336d704648683876734d695859643846375f6259516d3036766e4a495966473833616b535f6b43516e7478565f69536e4575637151576d44344b64765865513d77333335342d68313733362d6e6f)](https://camo.githubusercontent.com/71b490239dcbb4e8de8282469da4e2fa78e91606/68747470733a2f2f6c68332e676f6f676c6575736572636f6e74656e742e636f6d2f44674d5473534c716464526570506a484e72593750325f31377032666a4550537269326f357759505361512d38634b5f394b4945306b4c4634364276522d56344352574a4f414e4d3966572d724d72323230584964794f446b513763433950687a644d4a74656d564e39664e4261585079577439783939784f616770523242623935494e6b665f2d536630324830334c554d535a30444234627336636830386461684252696c385446553150616f4c436f73364a752d6c65306f347034386952787766364d4232373244463235473944597a784835756d386e5678427a7832413943755f6247495a6b635245597a727a62476a2d474734357a3531614e366e4a4136656e435877506162356445417048526a6a6b727a6e54554b374a44455339635f6345436f335573376b356a785079564b4e324f41387a346c3951326e46325a3442487a463831365161783839414e5538512d7431326f4e54597542544b716e7770744769416f694c6b473442395639624c74414172556c6c425539724669642d646a74526277685337396253357235794f644f343433456371715232474c62646b6f43457064424e5655536d3665695a6570773253776d415232707a7a705a665336646f66355751714c4a443847496c49455537613371393032447251464c67656d5a4e7166544c6379324e5753625f4b665353344c6236636c2d364d4644304b746974583346674c454966684e48635667374b64526b657130616772394b4c6e6e6d42786a7a4532563634336e6672555844434a7359454a546233794f316b4a5678466878304a794a53704750777554414d786a305a6631656638567043673055664a316471336a64516d735a626e345332426b536f4c597053705459722d39436231524b34636c51596c4136427a4f5a356c664659364f464536335f4e5548535a73624d6b6e68676d7a6b316d6563336d704648683876734d695859643846375f6259516d3036766e4a495966473833616b535f6b43516e7478565f69536e4575637151576d44344b64765865513d77333335342d68313733362d6e6f)

#### [](https://github.com/glossiercoder/Intro-to-Android-CalHacks-2019/blob/master/README.md#b2-add-the-realtime-database-to-your-app)(B2) Add the Realtime Database to your app.

Now navigate back to Android Studio and click the button "Add the Realtime Database to your app", and click "Accept." This will add the necessary items to your build.gradle and app.gradle automatically. These are the libraries needed for Firebase.

#### [](https://github.com/glossiercoder/Intro-to-Android-CalHacks-2019/blob/master/README.md#b3-configure-firebase-database-rules)(B3) Configure Firebase Database Rules

This step should be already handled for you. Please signal me if you run into an error.

### Step 2 Firebase in Android Part 2
TODO

## Additional Coding Challenges for this Project

Here are a few ways you could test your development skills and take this app further...

-   (Easy) Add a timestamp to when each confession was posted.
-   (Easy) Right now the application looks fine in portrait mode, but not so great in landscape :( -- figure out how to do so! Hint: you will need to create some new layout resource files in a layout-land/ directory within res/ .
-   (Medium) Allow persistant data via Shared Preferences!
-   (Medium) Allow for the deletion of confessions.
-   (Medium) Create a up/down voting system (like reddit?) and sort the list by popularity of votes.
-   (Harder) Allow for replies and comments to confessions.


## Additional Resources for Android
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
