package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        m985();
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m985();
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public final void m985() {
        m1045(1);
        m1048(new Fade(2));
        m1048(new ChangeBounds());
        m1048(new Fade(1));
    }
}
