package com.wan.t11_swipe_to_refresh;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * @author wzc
 * @date 2018/2/10
 */
public class ListFragmentActivity extends SingleFragmentActivity {
    public static void start(Context context) {
        Intent starter = new Intent(context, ListFragmentActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected Fragment createFragment() {
        return SwipeRefreshListFragment.newInstance();
    }
}
