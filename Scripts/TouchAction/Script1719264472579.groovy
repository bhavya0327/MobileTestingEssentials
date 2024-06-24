import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import groovy.time.Duration
import io.appium.java_client.AppiumDriver
import io.appium.java_client.TouchAction
import io.appium.java_client.touch.WaitOptions
import io.appium.java_client.touch.offset.PointOption



Mobile.startApplication('/Users/bhavyansh-katalon/Downloads/IT Glossary_1.5_Apkpure.apk', true)

Mobile.delay(5)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

PointOption pointStart = PointOption.point(524,1925);
PointOption pointEnd = PointOption.point(524,723);

PointOption tapPoint = PointOption.point(856,1439)

//TouchAction Object -> executeGesture
TouchAction executeGesture = new TouchAction(driver)

//Tap at postion specifed as "tapPoint"
executeGesture.tap(tapPoint)
//new TouchAction(driver).tap(tapPoint).perform() 

Mobile.delay(5)

//Swipe from "pointStart" to "pointEnd"
executeGesture.press(pointStart).moveTo(pointEnd).release().perform()
//new TouchAction(driver).press(pointStart).moveTo(pointEnd).release().perform()  

executeGesture.longPress(pointEnd).perform().release()



Mobile.delay(5)

Mobile.closeApplication()