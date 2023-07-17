# ListView Example

Change the generated default Activity to inherit from ListView

```java
public class MainActivity extends ListActivity {
    // The rest of the code
}
```

Right-click on the layout folder and select New -> Layout Resource File

![img_1.png](img_1.png)

![img.png](img.png)

The list_item configuration file defines the view applied to each item in the list

`list_item.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>
<TextView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="10dp"
    android:textSize="16sp"
    android:textColor="#FF0000"
    >

</TextView>
```

Create an array of Strings containing the Days of the Week

```java
public class MainActivity extends ListActivity {
    private static final String[] WEEKDAYS = new String[]{
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
    };

```
## Using an ArrayAdapter with ListView

In Android development, any time we want to show a vertical list of scrollable items we will use a ListView which has data populated using an Adapter. 
The simplest adapter to use is called an ArrayAdapter because the adapter converts an ArrayList of objects into View items loaded into the ListView container.

![img_4.png](img_4.png)

## Java code

Amend the `onCreate()` method

```java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, WEEKDAYS));
        ListView lv = getListView();
        lv.setTextFilterEnabled(true);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long ig) {
                Toast.makeText(getApplicationContext(),
                        ((TextView)view).getText(), Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
```

Voila, we can create listView

![img_2.png](img_2.png)

If you just type a letter, the list is automatically filtered

![img_3.png](img_3.png)



