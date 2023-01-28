# Convert date and time to persian


[![forthebadge](https://forthebadge.com/images/badges/built-for-android.svg)](https://forthebadge.com)
<br/>
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
![ConvertDateAndTimeToPersian (1)](https://user-images.githubusercontent.com/78638521/215270709-52455d8a-c48e-4f06-b069-bae462215388.svg)



# Install

## Gradle

step 1.Add it in your root build.gradle at the end of repositories:
```kotlin 
allprojects {
	repositories {
	...
	maven { url 'https://jitpack.io' }
	
    }
}
```
Step 2.Add the dependency

```kotlin
dependencies {
	   
	   implementation 'com.github.MohammadSadeghMehrafzoon:ConvertDateAndTimeToPersian:0.0.1'
}
```

# Let's convert :)
#### Step 1. Define class and send time or date to it
```kotlin
=> kotlin
 
 val  persianTimeAndDate = PersianTimeAndDate(dateAndTime)
 val  date = PersianDate(date)
 val  time = PersianDate(time)
 
```
```java
=> java

PersianDate date = new PersianDate(date);
PersianDate time = new PersianTime(time);
PersianDate persianTimeAndDate = new PersianTimeAndDate(dateAndTime);

```
#### Step 2. Get the time or date converted

```kotlin

date.getPersianDate()
time.getPersianTime()
persianTimeAndDate.getPersianDate()
persianTimeAndDate.getPersianTime()
```

# Example 1

```kotlin

 val  persianTimeAndDate = PersianTimeAndDate(2023-01-28T13:15:00)
 persianTimeAndDate.getPersianDate() // 1401/11/8 
 persianTimeAndDate.getPersianTime() // 18:45
 
 ```
 Or
 ```kotlin
 val  persianTimeAndDate = PersianTimeAndDate(2023/01/28T13:15:00)
 persianTimeAndDate.getPersianDate() // 1401/11/8 
 persianTimeAndDate.getPersianTime() // 18:45
 
```

# Example 2

```kotlin
 val  date = PersianDate(2023-01-28)
 date.getPersianDate() // 1401/11/8 

```
 Or
``` kotlin
 val  date = PersianDate(2023/01/28)
 date.getPersianDate() // 1401/11/8 
 
```
