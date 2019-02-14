package com.umut.soysal.swipelayoutview.ui;

import android.support.v7.widget.RecyclerView;

public interface OnSwipeListener<T> {

    /**
     * callback when the stack item is still slipping
     *
     */
    void onSwiping(RecyclerView.ViewHolder viewHolder, float ratio, int direction);

    /**
     * callback when the stack item is completely out
     *
     */
    void onSwiped(RecyclerView.ViewHolder viewHolder, T t, int direction);

    /**
     * Call back when all stacks are finished
     */
    void onSwipedClear();

}