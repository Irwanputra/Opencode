package p034.p103.p104;

import android.database.Cursor;
import android.widget.Filter;
import p034.p050.p053.ViewOnClickListenerC1207;

/* renamed from: づざかべべ.ぺぁあねじ.げつ〴ぬぐ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1774 extends Filter {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public InterfaceC1775 f7994;

    /* renamed from: づざかべべ.ぺぁあねじ.げつ〴ぬぐ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC1775 {
    }

    public C1774(InterfaceC1775 interfaceC1775) {
        this.f7994 = interfaceC1775;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return ((ViewOnClickListenerC1207) this.f7994).mo2687((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            づざかべべ.ぺぁあねじ.げつ〴ぬぐ.〺つふすそ$げつ〴ぬぐ r0 = r4.f7994
            づざかべべ.〺つふすそ.ぉざぅち〻.ぇ〳〲〺すっ r0 = (p034.p050.p053.ViewOnClickListenerC1207) r0
            r0.getClass()
            if (r5 != 0) goto Lc
            java.lang.String r5 = ""
            goto L10
        Lc:
            java.lang.String r5 = r5.toString()
        L10:
            androidx.appcompat.widget.SearchView r1 = r0.f5974
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L30
            androidx.appcompat.widget.SearchView r1 = r0.f5974
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L22
            goto L30
        L22:
            android.app.SearchableInfo r1 = r0.f5977     // Catch: java.lang.RuntimeException -> L30
            r3 = 50
            android.database.Cursor r5 = r0.m2686(r1, r5, r3)     // Catch: java.lang.RuntimeException -> L30
            if (r5 == 0) goto L30
            r5.getCount()     // Catch: java.lang.RuntimeException -> L30
            goto L31
        L30:
            r5 = r2
        L31:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L41
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L46
        L41:
            r5 = 0
            r0.count = r5
            r0.values = r2
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p103.p104.C1774.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        InterfaceC1775 interfaceC1775 = this.f7994;
        Cursor cursor = ((AbstractC1777) interfaceC1775).f8004;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((ViewOnClickListenerC1207) interfaceC1775).mo2685((Cursor) obj);
    }
}
