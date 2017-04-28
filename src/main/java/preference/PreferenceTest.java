package preference;

import java.util.prefs.Preferences;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 */
public class PreferenceTest {

    private Preferences prefs;

    public static void main(String[] args) {
        PreferenceTest test = new PreferenceTest();
        test.setPrefs();
    }


    public void setPrefs() {
        prefs = Preferences.systemRoot().node(this.getClass().getName());
        String ID1 = "Test1";
        String ID2 = "Test2";
        String ID3 = "Test3";


        System.out.println(prefs.getBoolean(ID1, true));
        System.out.println(prefs.get(ID2, "Hello World"));
        System.out.println(prefs.getInt(ID3, 45));

        prefs.remove(ID1);
    }
}
