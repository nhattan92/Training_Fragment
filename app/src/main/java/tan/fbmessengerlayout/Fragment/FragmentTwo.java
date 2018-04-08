package tan.fbmessengerlayout.Fragment;

import android.support.v4.app.Fragment;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import tan.fbmessengerlayout.R;

@EFragment(R.layout.fragment_two)
public class FragmentTwo extends Fragment {

    @ViewById(R.id.tv_fr_two)
    TextView textView;
    @AfterViews
    void updateTextView(){
        textView.setText("Fragment Two");
    }

}
