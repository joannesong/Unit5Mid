package nyc.c4q.unit5midassesssment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.unit5midassesssment.model.Name;
import nyc.c4q.unit5midassesssment.model.Picture;
import nyc.c4q.unit5midassesssment.model.User;

/**
 * Created by joannesong on 1/24/18.
 */

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    List<Name> nameList = new ArrayList<>();
    List<Picture> pictureList = new ArrayList<>();

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_main_itemview, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.onBind(nameList.get(position),pictureList.get(position) );
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }
}
