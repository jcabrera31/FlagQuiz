package edu.orangecoastcollege.cs273.jcabrera31.flagquiz;

import android.preference.PreferenceFragment;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * SettingsActivityFragment is a subclass of PreferenceFragment for managing
 * the app settings, such as number of guesses and regions to select flags from.
 */
public class SettingsActivityFragment extends PreferenceFragment {

   //creates preferences GUI from preferences.xml file in res/xml
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences); // load from XML
    }
}
