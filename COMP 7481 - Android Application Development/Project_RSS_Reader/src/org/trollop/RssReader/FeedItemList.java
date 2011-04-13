/**
 * Project: Project_RSS_Reader
 * File: ListFeedItem.java
 * Date: 2011-04-12
 * Time: 6:13:32 PM
 */
package org.trollop.RssReader;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author Steffen L. Norgren, A00683006
 *
 */
public class FeedItemList extends ArrayAdapter<FeedItem> {
	private int resource;
	private Context context;
	
	public FeedItemList(Context context, int resource, ArrayList<FeedItem> feedItems) {
		super(context, resource, feedItems);
		this.context = context;
		this.resource = resource;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LinearLayout feedView;
		FeedItem feedItem = getItem(position);
		
		if (convertView == null) {
			feedView = new LinearLayout(context);
			String inflater = Context.LAYOUT_INFLATER_SERVICE;
			LayoutInflater vi;
			vi = (LayoutInflater) context.getSystemService(inflater);
			vi.inflate(resource, feedView, true);
		}
		else {
			feedView = (LinearLayout) convertView;
		}
		
		if (feedItem != null) {
			TextView title = (TextView) feedView.findViewById(R.id.toptext);
			
			if (title != null) {
				title.setText(feedItem.getTitle());
			}
		}
		return feedView;
	}
}
