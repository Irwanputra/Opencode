package dev.epro.r0;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P10847846558498882845 extends V7723538628475019968 {
    public final /* synthetic */ byte j = 0;
    public final /* synthetic */ View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P10847846558498882845(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.k = actionMenuItemView;
    }

    @Override // dev.epro.r0.V7723538628475019968
    public final Y1226494281320458288 b() {
        H10500197361170225543 h10500197361170225543;
        byte b = this.j;
        View view = this.k;
        switch (b) {
            case 0:
                H8799190816846314569 h8799190816846314569 = ((ActionMenuItemView) view).n;
                if (h8799190816846314569 == null || (h10500197361170225543 = ((T432659191337924804) h8799190816846314569).a.t) == null) {
                    return null;
                }
                return h10500197361170225543.a();
            default:
                H10500197361170225543 h105001973611702255432 = ((D18165525574842162311) view).d.s;
                if (h105001973611702255432 == null) {
                    return null;
                }
                return h105001973611702255432.a();
        }
    }

    @Override // dev.epro.r0.V7723538628475019968
    public final boolean c() {
        Y1226494281320458288 y1226494281320458288B;
        byte b = this.j;
        View view = this.k;
        switch (b) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                O691910143173251949 o691910143173251949 = actionMenuItemView.l;
                if (o691910143173251949 == null || !o691910143173251949.b(actionMenuItemView.i) || (y1226494281320458288B = b()) == null || !y1226494281320458288B.b()) {
                }
                break;
            default:
                ((D18165525574842162311) view).d.l();
                break;
        }
        return true;
    }

    @Override // dev.epro.r0.V7723538628475019968
    public boolean d() {
        switch (this.j) {
            case 1:
                T1878852318042345820 t1878852318042345820 = ((D18165525574842162311) this.k).d;
                if (t1878852318042345820.u != null) {
                    return false;
                }
                t1878852318042345820.e();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P10847846558498882845(D18165525574842162311 d18165525574842162311, D18165525574842162311 d181655255748421623112) {
        super(d181655255748421623112);
        this.k = d18165525574842162311;
    }
}
