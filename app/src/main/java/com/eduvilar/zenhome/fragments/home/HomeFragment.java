package com.eduvilar.zenhome.fragments.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.eduvilar.zenhome.R;
import com.eduvilar.zenhome.base.BaseFragment;
import com.eduvilar.zenhome.callback.ImageUploadCallback;
import com.eduvilar.zenhome.fragments.flat.FlatFragment;
import com.eduvilar.zenhome.model.UploadImageView;
import com.eduvilar.zenhome.utils.UploadImageUtils;
import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

/**
 * Created by eduardovilar10 on 25/11/2017.
 */

public class HomeFragment extends BaseFragment implements HomeContract.View {

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    private HomeContract.Presenter presenter;

    private LinearLayout loadingView;
    private LinearLayout contentView;
    private UploadImageView profile;

    @Override
    public int layout() {
        return R.layout.fragment_home;
    }

    @Override
    public void view(View view) {
        loadingView = (LinearLayout) view.findViewById(R.id.loading_view);
        contentView = (LinearLayout) view.findViewById(R.id.content_view);
        profile = (UploadImageView) view.findViewById(R.id.profile);

    }

    @Override
    public void onBackPressed() {
        activity().finish();
    }

    @Override
    public void init() {
        if (presenter == null) {
            presenter = new HomePresenter(this);
        }
        presenter.init();
    }

    @Override
    public void onViewLoading() {
        loadingView.setVisibility(View.VISIBLE);
        contentView.setVisibility(View.GONE);
    }

    @Override
    public void onViewReady() {
        loadingView.setVisibility(View.GONE);
        contentView.setVisibility(View.VISIBLE);
    }

    @Override
    protected IDrawerItem[] getActionItems() {
        return new IDrawerItem[] {
                new PrimaryDrawerItem().withIdentifier(1).withName("Añadir vivienda").withIcon(CommunityMaterial.Icon.cmd_home_assistant).withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

                        return false;
                    }
                })
        };
    }
}
