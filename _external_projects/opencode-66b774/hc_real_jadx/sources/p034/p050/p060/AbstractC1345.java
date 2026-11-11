package p034.p050.p060;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p034.p050.p060.C1290;
import p034.p080.C1501;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1345 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final C1501<WeakReference<AbstractC1345>> f6453 = new C1501<>(0);

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final Object f6454 = new Object();

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public static void m3033(AbstractC1345 abstractC1345) {
        synchronized (f6454) {
            Iterator<WeakReference<AbstractC1345>> it = f6453.iterator();
            while (it.hasNext()) {
                AbstractC1345 abstractC13452 = it.next().get();
                if (abstractC13452 == abstractC1345 || abstractC13452 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: 〳ぜぞぜべっ */
    public abstract MenuInflater mo2969();

    /* renamed from: 〻ぞまぎな〻 */
    public abstract void mo2971(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: ぁごぐすすぃ */
    public int mo2972() {
        return -100;
    }

    /* renamed from: いいにぽつ */
    public abstract void mo2974();

    /* renamed from: ぇ〳〲〺すっ */
    public void mo2976(int i) {
    }

    /* renamed from: ぇぬぎばつ */
    public abstract void mo2978();

    /* renamed from: ぉ〲なぱぽた */
    public abstract void mo2980(Toolbar toolbar);

    /* renamed from: ぉざぅち〻 */
    public abstract void mo2981(Bundle bundle);

    /* renamed from: おぐぴう〸ず */
    public abstract void mo2984(Bundle bundle);

    /* renamed from: くし〴〺ぅ */
    public abstract void mo2986(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: ざっざへづ */
    public abstract boolean mo2992(int i);

    /* renamed from: ざとぅぼこ〺 */
    public abstract void mo2993();

    /* renamed from: づざかべべ */
    public abstract <T extends View> T mo2997(int i);

    /* renamed from: てぜきぽく */
    public abstract void mo2999(Configuration configuration);

    /* renamed from: でどあくず */
    public abstract void mo3000(int i);

    /* renamed from: なぎぱいぢぎ */
    public abstract C1290.InterfaceC1293 mo3003();

    /* renamed from: のぷのちつ */
    public abstract void mo3006(Bundle bundle);

    /* renamed from: は〲ぱなで */
    public abstract void mo3007();

    /* renamed from: びえぁぜい */
    public abstract void mo3009(CharSequence charSequence);

    /* renamed from: びぐびあび */
    public Context mo3010(Context context) {
        return context;
    }

    /* renamed from: ぶでにく〼〳 */
    public abstract void mo3011(View view);

    /* renamed from: へぬ〴づぞ */
    public abstract void mo3013();

    /* renamed from: ぺぁあねじ */
    public abstract ActionBar mo3014();

    /* renamed from: ぺふねづ〺 */
    public abstract void mo3017();
}
