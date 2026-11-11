package p034.p050.p053;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.ListPopupWindow;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.ごづごきえ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1224 implements AdapterView.OnItemSelectedListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ ListPopupWindow f6038;

    public C1224(ListPopupWindow listPopupWindow) {
        this.f6038 = listPopupWindow;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C1212 c1212;
        if (i == -1 || (c1212 = this.f6038.f449) == null) {
            return;
        }
        c1212.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
