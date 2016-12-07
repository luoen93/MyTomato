package com.siokagami.application.mytomato.view;

import android.content.Intent;
import android.os.Bundle;

import com.siokagami.application.mytomato.R;

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;
import it.neokree.materialnavigationdrawer.elements.MaterialAccount;

/**
 * Created by siokagami on 16/10/28.
 */

public class TomatoNavigationMenu extends MaterialNavigationDrawer {


    @Override
    public void init(Bundle savedInstanceState) {
        this.disableLearningPattern();
        MaterialAccount account = new MaterialAccount(this.getResources(),"辛宜伦","",R.drawable.bg_user_menu_user_icon, R.drawable.bg_user_menu);
        this.addAccount(account);
        this.addSection(newSection("首页",new MainPageFragment()));
        this.addSection(newSection("番茄工作",new TomatoWorkFragment()));
        this.addSection(newSection("统计",new TomatoStatsFragment()));
        this.addBottomSection(newSection("设置",R.drawable.icon_user_menu_setting,new Intent(this,SettingActivity.class)));
    }


}
