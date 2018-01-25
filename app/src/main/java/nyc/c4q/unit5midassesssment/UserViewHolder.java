package nyc.c4q.unit5midassesssment;


import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import nyc.c4q.unit5midassesssment.model.Name;
import nyc.c4q.unit5midassesssment.model.Picture;
import nyc.c4q.unit5midassesssment.model.User;

/**
 * Created by joannesong on 1/24/18.
 */

public class UserViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    ImageView image;
    TextView text;
    private Context context;

    public UserViewHolder(View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image_user);
        text = itemView.findViewById(R.id.text_user);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        DetailFragment detailFragment = new DetailFragment();
        FragmentManager fragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.addToBackStack(null).replace(R.id.fragment_container, detailFragment);
        View f = v.findViewById(R.id.fragment_container);
        f.setVisibility(View.VISIBLE);
        View r = v.findViewById(R.id.recycler);
        r.setVisibility(View.GONE);
        fragmentTransaction.commit();
    }

}
