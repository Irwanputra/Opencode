package p237.p238.p239.p241.p242;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import java.lang.ref.WeakReference;
import java.util.List;
import p237.p238.p239.p241.p242.InterfaceC2790;

/* renamed from: びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC2787 implements IBinder.DeathRecipient {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public InterfaceC2790 f10458;

    /* renamed from: びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.くし〴〺ぅ$〺つふすそ, reason: contains not printable characters */
    public static class BinderC2788 extends InterfaceC2790.AbstractBinderC2791 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final WeakReference<AbstractC2787> f10459;

        public BinderC2788(AbstractC2787 abstractC2787) {
            this.f10459 = new WeakReference<>(abstractC2787);
        }

        /* renamed from: ぁごぐすすぃ */
        public void mo25(MediaMetadataCompat mediaMetadataCompat) {
            this.f10459.get();
        }

        /* renamed from: おぐぴう〸ず */
        public void mo26(Bundle bundle) {
            this.f10459.get();
        }

        /* renamed from: ざとぅぼこ〺 */
        public void mo27(List<MediaSessionCompat.QueueItem> list) {
            this.f10459.get();
        }

        /* renamed from: なぎぱいぢぎ */
        public void mo28() {
            this.f10459.get();
        }

        /* renamed from: なぶひせが */
        public void mo29(ParcelableVolumeInfo parcelableVolumeInfo) {
            this.f10459.get();
        }

        /* renamed from: びぐびあび */
        public void mo30(CharSequence charSequence) {
            this.f10459.get();
        }
    }

    /* renamed from: びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C2789 implements InterfaceC2781 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final WeakReference<AbstractC2787> f10460;

        public C2789(AbstractC2787 abstractC2787) {
            this.f10460 = new WeakReference<>(abstractC2787);
        }
    }

    public AbstractC2787() {
        if (Build.VERSION.SDK_INT >= 21) {
            new C2795(new C2789(this));
        } else {
            this.f10458 = new BinderC2788(this);
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
    }
}
