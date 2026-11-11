package p034.p084.p085;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: づざかべべ.でどあくず.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1512 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public DataSetObserver f6964;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final DataSetObservable f6965 = new DataSetObservable();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m3303() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f6964;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f6965.notifyChanged();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void mo3304(ViewGroup viewGroup) {
    }

    /* renamed from: ぁごぐすすぃ */
    public abstract boolean mo1134(View view, Object obj);

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public Parcelable mo3305() {
        return null;
    }

    /* renamed from: くし〴〺ぅ */
    public abstract int mo1135();

    /* renamed from: げつ〴ぬぐ */
    public void mo1136(ViewGroup viewGroup, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: づざかべべ */
    public CharSequence mo1632(int i) {
        return null;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void mo3306(ViewGroup viewGroup) {
    }

    /* renamed from: なぎぱいぢぎ */
    public Object mo1137(ViewGroup viewGroup, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* renamed from: びぐびあび */
    public int mo1633(Object obj) {
        return -1;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void mo3307(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void mo3308(ViewGroup viewGroup, int i, Object obj) {
    }
}
