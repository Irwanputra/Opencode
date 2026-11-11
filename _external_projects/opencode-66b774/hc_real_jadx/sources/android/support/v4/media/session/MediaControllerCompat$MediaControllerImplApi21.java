package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p034.p035.p041.C1049;
import p237.p238.p239.p241.p242.AbstractC2787;
import p237.p238.p239.p241.p242.InterfaceC2782;
import p237.p238.p239.p241.p242.InterfaceC2794;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MediaControllerCompat$MediaControllerImplApi21 implements InterfaceC2794 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object f59;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final MediaSessionCompat.Token f60;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Object f57 = new Object();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final List<AbstractC2787> f58 = new ArrayList();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public HashMap<AbstractC2787, BinderC0024> f61 = new HashMap<>();

    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public WeakReference<MediaControllerCompat$MediaControllerImplApi21> f62;

        public ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21) {
            super(null);
            this.f62 = new WeakReference<>(mediaControllerCompat$MediaControllerImplApi21);
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f62.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f57) {
                mediaControllerCompat$MediaControllerImplApi21.f60.f68 = InterfaceC2782.AbstractBinderC2783.m4757(C1049.m2384(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                MediaSessionCompat.Token token = mediaControllerCompat$MediaControllerImplApi21.f60;
                bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
                token.getClass();
                mediaControllerCompat$MediaControllerImplApi21.m23();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$げつ〴ぬぐ, reason: contains not printable characters */
    public static class BinderC0024 extends AbstractC2787.BinderC2788 {
        public BinderC0024(AbstractC2787 abstractC2787) {
            super(abstractC2787);
        }

        @Override // p237.p238.p239.p241.p242.AbstractC2787.BinderC2788, p237.p238.p239.p241.p242.InterfaceC2790
        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public void mo25(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        @Override // p237.p238.p239.p241.p242.AbstractC2787.BinderC2788, p237.p238.p239.p241.p242.InterfaceC2790
        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public void mo26(Bundle bundle) {
            throw new AssertionError();
        }

        @Override // p237.p238.p239.p241.p242.AbstractC2787.BinderC2788, p237.p238.p239.p241.p242.InterfaceC2790
        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public void mo27(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        @Override // p237.p238.p239.p241.p242.AbstractC2787.BinderC2788, p237.p238.p239.p241.p242.InterfaceC2790
        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public void mo28() {
            throw new AssertionError();
        }

        @Override // p237.p238.p239.p241.p242.AbstractC2787.BinderC2788, p237.p238.p239.p241.p242.InterfaceC2790
        /* renamed from: なぶひせが, reason: contains not printable characters */
        public void mo29(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // p237.p238.p239.p241.p242.AbstractC2787.BinderC2788, p237.p238.p239.p241.p242.InterfaceC2790
        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void mo30(CharSequence charSequence) {
            throw new AssertionError();
        }
    }

    public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
        this.f60 = token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f67);
        this.f59 = mediaController;
        if (token.f68 == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m23() {
        if (this.f60.f68 == null) {
            return;
        }
        for (AbstractC2787 abstractC2787 : this.f58) {
            BinderC0024 binderC0024 = new BinderC0024(abstractC2787);
            this.f61.put(abstractC2787, binderC0024);
            abstractC2787.f10458 = binderC0024;
            try {
                this.f60.f68.mo4755(binderC0024);
            } catch (RemoteException unused) {
            }
        }
        this.f58.clear();
    }

    @Override // p237.p238.p239.p241.p242.InterfaceC2794
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean mo24(KeyEvent keyEvent) {
        return ((MediaController) this.f59).dispatchMediaButtonEvent(keyEvent);
    }
}
