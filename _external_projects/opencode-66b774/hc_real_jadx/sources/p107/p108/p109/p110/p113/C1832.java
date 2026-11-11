package p107.p108.p109.p110.p113;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1832 implements AdapterView.OnItemSelectedListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Spinner f8198;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f8199 = -1;

    public C1832(Object obj) {
        this.f8198 = obj != null ? (Spinner) obj : null;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i != this.f8199) {
            this.f8199 = i;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        if (-1 != this.f8199) {
            this.f8199 = -1;
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3947(String str) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f8198.getCount()) {
                break;
            }
            if (this.f8198.getItemAtPosition(i2).toString().equalsIgnoreCase(str)) {
                i = i2;
                break;
            }
            i2++;
        }
        this.f8199 = Math.max(-1, i);
        this.f8198.setSelection(i);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public Object m3948() {
        return this.f8198.getSelectedItem();
    }
}
