package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import dev.epro.r0.E6758797890281795541;
import dev.epro.r0.Q3791352212346016950;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class vw2 extends FrameLayout {
    public E6758797890281795541 a;

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int c;
        int c2;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            Context context = getContext();
            E6758797890281795541 e6758797890281795541 = this.a;
            context.getClass();
            int i3 = e6758797890281795541.a;
            c = (i3 == -4 || i3 == -3) ? -1 : (int) Q3791352212346016950.c(context, i3);
            int i4 = this.a.b;
            c2 = (i4 == -4 || i4 == -3) ? -1 : (int) Q3791352212346016950.c(context, i4);
        } else {
            measureChild(childAt, i, i2);
            c = childAt.getMeasuredWidth();
            c2 = childAt.getMeasuredHeight();
        }
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (c < suggestedMinimumWidth) {
            c = suggestedMinimumWidth;
        }
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (c2 < suggestedMinimumHeight) {
            c2 = suggestedMinimumHeight;
        }
        setMeasuredDimension(View.resolveSize(c, i), View.resolveSize(c2, i2));
    }
}
