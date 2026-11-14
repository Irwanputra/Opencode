package dev.epro.r0;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G17185360867502361524 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public G17185360867502361524(I1632105416032993715 i1632105416032993715) {
        this.a = (byte) 3;
        Objects.requireNonNull(i1632105416032993715);
        this.b = i1632105416032993715;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((F3205875925450835131) obj).a();
                break;
            case 1:
                O8953140192291099683 o8953140192291099683 = (O8953140192291099683) obj;
                o8953140192291099683.v.obtainMessage(1, o8953140192291099683.b).sendToTarget();
                break;
            case 2:
                J17018592638074147698 j17018592638074147698 = ((Toolbar) obj).L;
                I4217019646703278835 i4217019646703278835 = j17018592638074147698 == null ? null : j17018592638074147698.b;
                if (i4217019646703278835 != null) {
                    i4217019646703278835.collapseActionView();
                    break;
                }
                break;
            default:
                I1632105416032993715 i1632105416032993715 = (I1632105416032993715) obj;
                View view2 = (View) i1632105416032993715.d;
                if (view2 != null) {
                    ((Activity) i1632105416032993715.b).runOnUiThread(new I3863025946240164840(i1632105416032993715, view2, (byte) 20));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ G17185360867502361524(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
