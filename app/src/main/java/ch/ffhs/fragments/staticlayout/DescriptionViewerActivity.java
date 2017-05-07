package ch.ffhs.fragments.staticlayout;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import ch.ffhs.fragments.staticlayout.TeamsFragment.ListSelectionListener;

//Several Activity lifecycle methods are instrumented to emit LogCat output
//so you can follow this class' lifecycle
public class DescriptionViewerActivity extends Activity implements
		ListSelectionListener {

	public static String[] mTeamArray;
	public static String[] mDescriptionArray;
	private DescriptionsFragment mDetailsFragment;

	private static final String TAG = "DescriptionViewerActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Get the string arrays with the teams and descriptions
		mTeamArray = getResources().getStringArray(R.array.Teams);
		mDescriptionArray = getResources().getStringArray(R.array.Descriptions);
		
		setContentView(R.layout.main);
		
		// Get a reference to the DescriptionsFragment
		mDetailsFragment = (DescriptionsFragment) getFragmentManager()
				.findFragmentById(R.id.details);
	}

	// Called when the user selects an item in the TeamsFragment
	@Override
	public void onListSelection(int index) {
		if (mDetailsFragment.getShownIndex() != index) {

			// Tell the QuoteFragment to show the quote string at position index
			mDetailsFragment.showDescriptionAtIndex(index);
		}
	}
	
	@Override
	protected void onDestroy() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onDestroy()");
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onPause()");
		super.onPause();
	}

	@Override
	protected void onRestart() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onRestart()");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onResume()");
		super.onResume();
	}

	@Override
	protected void onStart() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onStart()");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onStop()");
		super.onStop();
	}

}