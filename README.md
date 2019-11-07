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

### Coding Challenges for this Project

Here are a few ways you could test your development skills and take this app further...

 - (Easy) Add a timestamp to when each confession was posted. 
 - (Easy) Right now the application looks fine in portrait mode, but not so great in landscape :( -- figure out how to do so! Hint: you will need to create some new layout resource files in a layout-land/ directory within res/ . 
 - (Medium) Allow persistant data via Shared Preferences!
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
