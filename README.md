# Populate Spinner through XML

To populate values to spinner, first we add values to `strings.xml`

```xml
<resources>
    <string name="app_name">comp1786-L3-4-android-gui</string>
    <string-array name="workStatus">
        <item>Employed</item>
        <item>Unemployed</item>
    </string-array>
</resources>
```

Then, refer the array to the layout `activity_main.xml`

```xml
    <Spinner
        android:id="@+id/spinner"
        android:layout_width="351dp"
        android:layout_height="22dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="16dp"
        android:layout_marginEnd="16dp"
        android:entries="@array/workStatus" 
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/work_status_text" />
```

The final app can be seen as below

![img_1.png](img_1.png)