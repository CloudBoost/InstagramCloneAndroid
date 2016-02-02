package io.cloudboost.instagramcloneandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class PeopleFragment extends Fragment {
	ListView listView;
	MyArrayAdapter myArrayAdapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		listView = (ListView) inflater.inflate(R.layout.people_fragment,
				container, false);
		listView.setAdapter(myArrayAdapter = new MyArrayAdapter(getContext(),
				R.layout.row));
		addRows();
		return listView;
	}

	public void addRows() {
		for (int i = 0; i < StaticData.names.length; i++) {
			myArrayAdapter.add(new RowData(null, StaticData.names[i],
					StaticData.names[i]));
		}
	}

}
