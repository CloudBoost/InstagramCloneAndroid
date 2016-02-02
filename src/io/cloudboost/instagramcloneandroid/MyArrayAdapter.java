package io.cloudboost.instagramcloneandroid;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyArrayAdapter extends ArrayAdapter<RowData> {
	private TextView screenName;
	private TextView fullName;
	private ImageView avatar;

	private List<RowData> clientList = new ArrayList<>();

	@Override
	public void add(RowData object) {
		clientList.add((RowData) object);
		super.add(object);
	}

	public MyArrayAdapter(Context context, int textViewResourceId) {
		super(context, textViewResourceId);

	}

	public int getCount() {
		return this.clientList.size();
	}

	public RowData getItem(int index) {
		return this.clientList.get(index);
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		if (row == null) {
			LayoutInflater inflater = (LayoutInflater) this.getContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.row, parent, false);
		}
		RowData client = getItem(position);
		screenName = (TextView) row.findViewById(R.id.screen_name);
		fullName = (TextView) row.findViewById(R.id.full_name);
		avatar = (ImageView) row.findViewById(R.id.my_avatar);
		final int draw = StaticData.getRandomCheeseDrawable();
		avatar.setImageDrawable(getContext().getResources().getDrawable(draw));
		screenName.setText(client.getScreenName().split(" ")[0]);
		fullName.setText(client.getFullName());
		// lastMsg.setText(client.getLastMsg());

		row.setTag(client);
		return row;
	}
}
