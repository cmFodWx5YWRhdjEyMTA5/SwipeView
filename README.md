# SwipeView
A Tinder style Swipeable view for Android Library

## Demo
<img src="image/app.gif" width="300" height="490"/>

## Download

```gradle
maven { url 'https://jitpack.io' }
```

```gradle
dependencies {
  implementation 'com.github.umutsoysl:SwipeView:1.0'
}
```
## StackImageView

```xml
 <com.umut.soysal.swipelayoutview.ui.StackImageView
                android:id="@+id/iv_avatar"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:scaleType="centerCrop"
                app:radius="10dp"
                android:src="@drawable/img_avatar_01" />
        
        <!-- Your content here -->
        
</iammert.com.view.scalinglib.ScalingLayout>
```


### step 1

init RecyclerView firstly :

``` java
RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
recyclerView.setAdapter(...);
```

### step 2

then set `CardLayoutManager` for RecyclerView and `CardItemTouchHelperCallback` for ItemTouchHelper . In addition , don't forget set `OnSwipeListener` for `CardItemTouchHelperCallback` :

``` java
// dataList means dataSource for adapter
CardItemTouchHelperCallback cardCallback = new CardItemTouchHelperCallback(recyclerView.getAdapter(), dataList);
ItemTouchHelper touchHelper = new ItemTouchHelper(cardCallback); CardLayoutManager cardLayoutManager = new CardLayoutManager(recyclerView, touchHelper);
recyclerView.setLayoutManager(cardLayoutManager);
touchHelper.attachToRecyclerView(recyclerView);
cardCallback.setOnSwipedListener(new OnSwipeListener<T>() {

    @Override
    public void onSwiping(RecyclerView.ViewHolder viewHolder, float ratio, int direction) {
        /**
         * will callback when the card are swiping by user
         * viewHolder : thee viewHolder of swiping card
         * ratio : the ratio of swiping , you can add some animation by the ratio
         * direction : CardConfig.SWIPING_LEFT means swiping from left；CardConfig.SWIPING_RIGHT means swiping from right
         *             CardConfig.SWIPING_NONE means not left nor right
         */
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, T t, int direction) {
	    /**
	     *  will callback when the card swiped from screen by user
	     *  you can also clean animation from the itemview of viewHolder in this method
	     *  viewHolder : the viewHolder of swiped cards
	     *  t : the data of swiped cards from dataList
	     *  direction : CardConfig.SWIPED_LEFT means swiped from left；CardConfig.SWIPED_RIGHT means swiped from right
	     */
    }

    @Override
    public void onSwipedClear() {
        /**
         *  will callback when all cards swiped clear
         *  you can load more data 
         */
    }

});
```

### step 3
``` java
/*
*Create stack photoview list
*/
 private void initData() {
        list.add(R.drawable.img_avatar_01);
        list.add(R.drawable.img_avatar_02);
        list.add(R.drawable.img_avatar_03);
        list.add(R.drawable.img_avatar_04);
        list.add(R.drawable.img_avatar_05);
        list.add(R.drawable.img_avatar_06);
        list.add(R.drawable.img_avatar_07);

    }
```

License
--------


    Copyright 2019 Umut Soysal.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


