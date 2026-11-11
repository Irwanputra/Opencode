package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p034.p050.p053.C1232;
import p034.p050.p053.C1241;
import p034.p050.p053.C1252;
import p034.p050.p053.C1260;
import p034.p050.p055.p056.C1266;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final int[] f349 = {R.attr.checkMark};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1232 f350;

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(C1241.m2865(context), attributeSet, i);
        C1252.m2892(this, getContext());
        C1232 c1232 = new C1232(this);
        this.f350 = c1232;
        c1232.m2846(attributeSet, i);
        c1232.m2842();
        C1260 m2910 = C1260.m2910(getContext(), attributeSet, f349, i, 0);
        setCheckMarkDrawable(m2910.m2913(0));
        m2910.f6162.recycle();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1232 c1232 = this.f350;
        if (c1232 != null) {
            c1232.m2842();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C2786.m4791(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C1266.m2928(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C2786.m4773(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1232 c1232 = this.f350;
        if (c1232 != null) {
            c1232.m2848(context, i);
        }
    }
}
