package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.session.MediaButtonReceiver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p034.p035.p041.C1049;
import p034.p080.AbstractC1495;
import p034.p080.C1502;
import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.C2780;
import p237.p238.p239.p241.C2799;
import p237.p238.p239.p241.C2800;
import p237.p238.p239.p241.InterfaceC2796;
import p237.p238.p239.p241.InterfaceC2797;
import p237.p238.p239.p241.InterfaceC2798;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class MediaBrowserCompat {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final boolean f0 = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC0012 f1;

    public static class CustomActionResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public void mo0(int i, Bundle bundle) {
        }
    }

    public static class ItemReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        /* renamed from: なぎぱいぢぎ */
        public void mo0(int i, Bundle bundle) {
            MediaSessionCompat.m31(bundle);
            if (i != 0) {
                throw null;
            }
            if (bundle == null) {
                throw null;
            }
            if (!bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaItem)) {
                throw null;
            }
            throw null;
        }
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C0000();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int f2;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final MediaDescriptionCompat f3;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0000 implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(Parcel parcel) {
            this.f2 = parcel.readInt();
            this.f3 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.f45)) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.f2 = i;
            this.f3 = mediaDescriptionCompat;
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public static List<MediaItem> m1(List<?> list) {
            MediaItem mediaItem;
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj == null || Build.VERSION.SDK_INT < 21) {
                    mediaItem = null;
                } else {
                    MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) obj;
                    mediaItem = new MediaItem(MediaDescriptionCompat.m22(mediaItem2.getDescription()), mediaItem2.getFlags());
                }
                arrayList.add(mediaItem);
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f2 + ", mDescription=" + this.f3 + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2);
            this.f3.writeToParcel(parcel, i);
        }
    }

    public static class SearchResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        /* renamed from: なぎぱいぢぎ */
        public void mo0(int i, Bundle bundle) {
            MediaSessionCompat.m31(bundle);
            if (i != 0) {
                throw null;
            }
            if (bundle == null) {
                throw null;
            }
            if (!bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            if (parcelableArray == null) {
                throw null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$〳ぜぞぜべっ, reason: contains not printable characters */
    public interface InterfaceC0001 {
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        void mo2(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void mo3(Messenger messenger);

        /* renamed from: びぐびあび, reason: contains not printable characters */
        void mo4(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$〺つふすそ, reason: contains not printable characters */
    public static class C0002 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public InterfaceC0004 f4;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Object f5;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$〺つふすそ$〺つふすそ, reason: contains not printable characters */
        public class C0003 implements InterfaceC2797 {
            public C0003() {
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
        public interface InterfaceC0004 {
        }

        public C0002() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f5 = new C2780(new C0003());
            } else {
                this.f5 = null;
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo5() {
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ぁごぐすすぃ, reason: contains not printable characters */
    public static class C0005 implements InterfaceC0012, InterfaceC0001 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public ServiceConnectionC0007 f7;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final ComponentName f8;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public Messenger f10;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final C0002 f11;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Context f12;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public MediaSessionCompat.Token f14;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final Bundle f16;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public C0017 f17;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public String f18;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final HandlerC0013 f13 = new HandlerC0013(this);

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final C1502<String, C0011> f15 = new C1502<>();

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f9 = 1;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ぁごぐすすぃ$〺つふすそ, reason: contains not printable characters */
        public class RunnableC0006 implements Runnable {
            public RunnableC0006() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0005 c0005 = C0005.this;
                Messenger messenger = c0005.f10;
                if (messenger != null) {
                    try {
                        c0005.f17.m17(2, null, messenger);
                    } catch (RemoteException unused) {
                        StringBuilder m4207 = C2098.m4207("RemoteException during connect for ");
                        m4207.append(C0005.this.f8);
                        m4207.toString();
                    }
                }
                C0005 c00052 = C0005.this;
                int i = c00052.f9;
                c00052.m7();
                if (i != 0) {
                    C0005.this.f9 = i;
                }
                if (MediaBrowserCompat.f0) {
                    C0005.this.m9();
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ, reason: contains not printable characters */
        public class ServiceConnectionC0007 implements ServiceConnection {

            /* renamed from: android.support.v4.media.MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$〺つふすそ, reason: contains not printable characters */
            public class RunnableC0008 implements Runnable {

                /* renamed from: 〺つふすそ, reason: contains not printable characters */
                public final /* synthetic */ ComponentName f21;

                public RunnableC0008(ComponentName componentName) {
                    this.f21 = componentName;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (MediaBrowserCompat.f0) {
                        StringBuilder m4207 = C2098.m4207("MediaServiceConnection.onServiceDisconnected name=");
                        m4207.append(this.f21);
                        m4207.append(" this=");
                        m4207.append(this);
                        m4207.append(" mServiceConnection=");
                        m4207.append(C0005.this.f7);
                        m4207.toString();
                        C0005.this.m9();
                    }
                    if (ServiceConnectionC0007.this.m14("onServiceDisconnected")) {
                        C0005 c0005 = C0005.this;
                        c0005.f17 = null;
                        c0005.f10 = null;
                        c0005.f13.m16(null);
                        C0005 c00052 = C0005.this;
                        c00052.f9 = 4;
                        ((MediaButtonReceiver.C0193) c00052.f11).m590();
                    }
                }
            }

            /* renamed from: android.support.v4.media.MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
            public class RunnableC0009 implements Runnable {

                /* renamed from: 〺つふすそ, reason: contains not printable characters */
                public final /* synthetic */ ComponentName f23;

                /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
                public final /* synthetic */ IBinder f24;

                public RunnableC0009(ComponentName componentName, IBinder iBinder) {
                    this.f23 = componentName;
                    this.f24 = iBinder;
                }

                @Override // java.lang.Runnable
                public void run() {
                    boolean z = MediaBrowserCompat.f0;
                    if (z) {
                        StringBuilder m4207 = C2098.m4207("MediaServiceConnection.onServiceConnected name=");
                        m4207.append(this.f23);
                        m4207.append(" binder=");
                        m4207.append(this.f24);
                        m4207.toString();
                        C0005.this.m9();
                    }
                    if (ServiceConnectionC0007.this.m14("onServiceConnected")) {
                        C0005 c0005 = C0005.this;
                        c0005.f17 = new C0017(this.f24, c0005.f16);
                        C0005.this.f10 = new Messenger(C0005.this.f13);
                        C0005 c00052 = C0005.this;
                        c00052.f13.m16(c00052.f10);
                        C0005 c00053 = C0005.this;
                        c00053.f9 = 2;
                        if (z) {
                            try {
                                c00053.m9();
                            } catch (RemoteException unused) {
                                StringBuilder m42072 = C2098.m4207("RemoteException during connect for ");
                                m42072.append(C0005.this.f8);
                                m42072.toString();
                                if (MediaBrowserCompat.f0) {
                                    C0005.this.m9();
                                    return;
                                }
                                return;
                            }
                        }
                        C0005 c00054 = C0005.this;
                        C0017 c0017 = c00054.f17;
                        Context context = c00054.f12;
                        Messenger messenger = c00054.f10;
                        c0017.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putString("data_package_name", context.getPackageName());
                        bundle.putBundle("data_root_hints", c0017.f39);
                        c0017.m17(1, bundle, messenger);
                    }
                }
            }

            public ServiceConnectionC0007() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                m13(new RunnableC0009(componentName, iBinder));
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                m13(new RunnableC0008(componentName));
            }

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public final void m13(Runnable runnable) {
                if (Thread.currentThread() == C0005.this.f13.getLooper().getThread()) {
                    runnable.run();
                } else {
                    C0005.this.f13.post(runnable);
                }
            }

            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            public boolean m14(String str) {
                int i;
                C0005 c0005 = C0005.this;
                if (c0005.f7 == this && (i = c0005.f9) != 0 && i != 1) {
                    return true;
                }
                int i2 = c0005.f9;
                if (i2 == 0 || i2 == 1) {
                    return false;
                }
                StringBuilder m4179 = C2098.m4179(str, " for ");
                m4179.append(C0005.this.f8);
                m4179.append(" with mServiceConnection=");
                m4179.append(C0005.this.f7);
                m4179.append(" this=");
                m4179.append(this);
                m4179.toString();
                return false;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
        public class RunnableC0010 implements Runnable {
            public RunnableC0010() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0005 c0005 = C0005.this;
                if (c0005.f9 == 0) {
                    return;
                }
                c0005.f9 = 2;
                if (MediaBrowserCompat.f0 && c0005.f7 != null) {
                    StringBuilder m4207 = C2098.m4207("mServiceConnection should be null. Instead it is ");
                    m4207.append(C0005.this.f7);
                    throw new RuntimeException(m4207.toString());
                }
                if (c0005.f17 != null) {
                    StringBuilder m42072 = C2098.m4207("mServiceBinderWrapper should be null. Instead it is ");
                    m42072.append(C0005.this.f17);
                    throw new RuntimeException(m42072.toString());
                }
                if (c0005.f10 != null) {
                    StringBuilder m42073 = C2098.m4207("mCallbacksMessenger should be null. Instead it is ");
                    m42073.append(C0005.this.f10);
                    throw new RuntimeException(m42073.toString());
                }
                Intent intent = new Intent("android.media.browse.MediaBrowserService");
                intent.setComponent(C0005.this.f8);
                C0005 c00052 = C0005.this;
                ServiceConnectionC0007 serviceConnectionC0007 = c00052.new ServiceConnectionC0007();
                c00052.f7 = serviceConnectionC0007;
                boolean z = false;
                try {
                    z = c00052.f12.bindService(intent, serviceConnectionC0007, 1);
                } catch (Exception unused) {
                    StringBuilder m42074 = C2098.m4207("Failed binding to service ");
                    m42074.append(C0005.this.f8);
                    m42074.toString();
                }
                if (!z) {
                    C0005.this.m7();
                    ((MediaButtonReceiver.C0193) C0005.this.f11).m590();
                }
                if (MediaBrowserCompat.f0) {
                    C0005.this.m9();
                }
            }
        }

        public C0005(Context context, ComponentName componentName, C0002 c0002, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            }
            if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            }
            if (c0002 == null) {
                throw new IllegalArgumentException("connection callback must not be null");
            }
            this.f12 = context;
            this.f8 = componentName;
            this.f11 = c0002;
            this.f16 = bundle == null ? null : new Bundle(bundle);
        }

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public static String m6(int i) {
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? C2098.m4208("UNKNOWN/", i) : "CONNECT_STATE_SUSPENDED" : "CONNECT_STATE_CONNECTED" : "CONNECT_STATE_CONNECTING" : "CONNECT_STATE_DISCONNECTED" : "CONNECT_STATE_DISCONNECTING";
        }

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public void m7() {
            ServiceConnectionC0007 serviceConnectionC0007 = this.f7;
            if (serviceConnectionC0007 != null) {
                this.f12.unbindService(serviceConnectionC0007);
            }
            this.f9 = 1;
            this.f7 = null;
            this.f17 = null;
            this.f10 = null;
            this.f13.m16(null);
            this.f18 = null;
            this.f14 = null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0012
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public MediaSessionCompat.Token mo8() {
            if (this.f9 == 3) {
                return this.f14;
            }
            StringBuilder m4207 = C2098.m4207("getSessionToken() called while not connected(state=");
            m4207.append(this.f9);
            m4207.append(")");
            throw new IllegalStateException(m4207.toString());
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public void m9() {
            StringBuilder m4207 = C2098.m4207("  mServiceComponent=");
            m4207.append(this.f8);
            m4207.toString();
            String str = "  mCallback=" + this.f11;
            String str2 = "  mRootHints=" + this.f16;
            m6(this.f9);
            String str3 = "  mServiceConnection=" + this.f7;
            String str4 = "  mServiceBinderWrapper=" + this.f17;
            String str5 = "  mCallbacksMessenger=" + this.f10;
            String str6 = "  mMediaSessionToken=" + this.f14;
        }

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public final boolean m10(Messenger messenger, String str) {
            int i;
            if (this.f10 == messenger && (i = this.f9) != 0 && i != 1) {
                return true;
            }
            int i2 = this.f9;
            if (i2 == 0 || i2 == 1) {
                return false;
            }
            StringBuilder m4179 = C2098.m4179(str, " for ");
            m4179.append(this.f8);
            m4179.append(" with mCallbacksMessenger=");
            m4179.append(this.f10);
            m4179.append(" this=");
            m4179.append(this);
            m4179.toString();
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0001
        /* renamed from: くし〴〺ぅ */
        public void mo2(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (!m10(messenger, "onConnect")) {
                return;
            }
            int i = this.f9;
            if (i != 2) {
                m6(i);
                return;
            }
            this.f18 = str;
            this.f14 = token;
            this.f9 = 3;
            if (MediaBrowserCompat.f0) {
                m9();
            }
            this.f11.mo5();
            try {
                Iterator it = ((AbstractC1495.C1496) this.f15.entrySet()).iterator();
                while (true) {
                    AbstractC1495.C1500 c1500 = (AbstractC1495.C1500) it;
                    if (!c1500.hasNext()) {
                        return;
                    }
                    c1500.next();
                    String str2 = (String) c1500.getKey();
                    C0011 c0011 = (C0011) c1500.getValue();
                    List<AbstractC0018> list = c0011.f28;
                    List<Bundle> list2 = c0011.f27;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        C0017 c0017 = this.f17;
                        IBinder iBinder = list.get(i2).f41;
                        Bundle bundle2 = list2.get(i2);
                        Messenger messenger2 = this.f10;
                        c0017.getClass();
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("data_media_item_id", str2);
                        C1049.m2383(bundle3, "data_callback_token", iBinder);
                        bundle3.putBundle("data_options", bundle2);
                        c0017.m17(3, bundle3, messenger2);
                    }
                }
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0001
        /* renamed from: げつ〴ぬぐ */
        public void mo3(Messenger messenger) {
            StringBuilder m4207 = C2098.m4207("onConnectFailed for ");
            m4207.append(this.f8);
            m4207.toString();
            if (m10(messenger, "onConnectFailed")) {
                int i = this.f9;
                if (i != 2) {
                    m6(i);
                } else {
                    m7();
                    ((MediaButtonReceiver.C0193) this.f11).m590();
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0012
        /* renamed from: づざかべべ, reason: contains not printable characters */
        public void mo11() {
            this.f9 = 0;
            this.f13.post(new RunnableC0006());
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0012
        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public void mo12() {
            int i = this.f9;
            if (i == 0 || i == 1) {
                this.f9 = 2;
                this.f13.post(new RunnableC0010());
            } else {
                StringBuilder m4207 = C2098.m4207("connect() called while neigther disconnecting nor disconnected (state=");
                m4207.append(m6(this.f9));
                m4207.append(")");
                throw new IllegalStateException(m4207.toString());
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0001
        /* renamed from: びぐびあび */
        public void mo4(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (m10(messenger, "onLoadChildren")) {
                if (MediaBrowserCompat.f0) {
                    StringBuilder m4207 = C2098.m4207("onLoadChildren for ");
                    m4207.append(this.f8);
                    m4207.append(" id=");
                    m4207.append(str);
                    m4207.toString();
                }
                C0011 orDefault = this.f15.getOrDefault(str, null);
                if (orDefault == null) {
                    return;
                }
                orDefault.m15(bundle);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$いいにぽつ, reason: contains not printable characters */
    public static class C0011 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final List<AbstractC0018> f28 = new ArrayList();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final List<Bundle> f27 = new ArrayList();

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public AbstractC0018 m15(Bundle bundle) {
            for (int i = 0; i < this.f27.size(); i++) {
                if (C2786.m4792(this.f27.get(i), bundle)) {
                    return this.f28.get(i);
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$くし〴〺ぅ, reason: contains not printable characters */
    public interface InterfaceC0012 {
        /* renamed from: 〺つふすそ */
        MediaSessionCompat.Token mo8();

        /* renamed from: づざかべべ */
        void mo11();

        /* renamed from: なぎぱいぢぎ */
        void mo12();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$げつ〴ぬぐ, reason: contains not printable characters */
    public static class HandlerC0013 extends Handler {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public WeakReference<Messenger> f29;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final WeakReference<InterfaceC0001> f30;

        public HandlerC0013(InterfaceC0001 interfaceC0001) {
            this.f30 = new WeakReference<>(interfaceC0001);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f29;
            if (weakReference == null || weakReference.get() == null || this.f30.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.m31(data);
            InterfaceC0001 interfaceC0001 = this.f30.get();
            Messenger messenger = this.f29.get();
            try {
                int i = message.what;
                if (i == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m31(bundle);
                    interfaceC0001.mo2(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                } else if (i == 2) {
                    interfaceC0001.mo3(messenger);
                } else if (i != 3) {
                    String str = "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1;
                } else {
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m31(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.m31(bundle3);
                    interfaceC0001.mo4(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                }
            } catch (BadParcelableException unused) {
                if (message.what == 1) {
                    interfaceC0001.mo3(messenger);
                }
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m16(Messenger messenger) {
            this.f29 = new WeakReference<>(messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$づざかべべ, reason: contains not printable characters */
    public static class C0014 extends C0016 {
        public C0014(Context context, ComponentName componentName, C0002 c0002, Bundle bundle) {
            super(context, componentName, c0002, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$なぎぱいぢぎ, reason: contains not printable characters */
    public static class C0015 extends C0014 {
        public C0015(Context context, ComponentName componentName, C0002 c0002, Bundle bundle) {
            super(context, componentName, c0002, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$びぐびあび, reason: contains not printable characters */
    public static class C0016 implements InterfaceC0012, InterfaceC0001, C0002.InterfaceC0004 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public MediaSessionCompat.Token f31;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Object f32;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public Messenger f33;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final Bundle f34;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Context f35;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public C0017 f37;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final HandlerC0013 f38 = new HandlerC0013(this);

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final C1502<String, C0011> f36 = new C1502<>();

        public C0016(Context context, ComponentName componentName, C0002 c0002, Bundle bundle) {
            this.f35 = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.f34 = bundle2;
            bundle2.putInt("extra_client_version", 1);
            c0002.f4 = this;
            this.f32 = new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) c0002.f5, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0012
        /* renamed from: 〺つふすそ */
        public MediaSessionCompat.Token mo8() {
            if (this.f31 == null) {
                this.f31 = MediaSessionCompat.Token.m32(((MediaBrowser) this.f32).getSessionToken(), null);
            }
            return this.f31;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0001
        /* renamed from: くし〴〺ぅ */
        public void mo2(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0001
        /* renamed from: げつ〴ぬぐ */
        public void mo3(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0012
        /* renamed from: づざかべべ */
        public void mo11() {
            Messenger messenger;
            C0017 c0017 = this.f37;
            if (c0017 != null && (messenger = this.f33) != null) {
                try {
                    c0017.m17(7, null, messenger);
                } catch (RemoteException unused) {
                }
            }
            ((MediaBrowser) this.f32).disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0012
        /* renamed from: なぎぱいぢぎ */
        public void mo12() {
            ((MediaBrowser) this.f32).connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0001
        /* renamed from: びぐびあび */
        public void mo4(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f33 != messenger) {
                return;
            }
            C0011 orDefault = this.f36.getOrDefault(str, null);
            if (orDefault == null) {
                boolean z = MediaBrowserCompat.f0;
            } else {
                orDefault.m15(bundle);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ぺぁあねじ, reason: contains not printable characters */
    public static class C0017 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Bundle f39;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Messenger f40;

        public C0017(IBinder iBinder, Bundle bundle) {
            this.f40 = new Messenger(iBinder);
            this.f39 = bundle;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final void m17(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f40.send(obtain);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ぺふねづ〺, reason: contains not printable characters */
    public static abstract class AbstractC0018 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final IBinder f41 = new Binder();

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ぺふねづ〺$〺つふすそ, reason: contains not printable characters */
        public class C0019 extends C0020 implements InterfaceC2798 {
            public C0019() {
                super();
            }

            @Override // p237.p238.p239.p241.InterfaceC2798
            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public void mo18(String str, Bundle bundle) {
                AbstractC0018.this.getClass();
            }

            @Override // p237.p238.p239.p241.InterfaceC2798
            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            public void mo19(String str, List<?> list, Bundle bundle) {
                AbstractC0018 abstractC0018 = AbstractC0018.this;
                MediaItem.m1(list);
                abstractC0018.getClass();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ぺふねづ〺$げつ〴ぬぐ, reason: contains not printable characters */
        public class C0020 implements InterfaceC2796 {
            public C0020() {
            }

            @Override // p237.p238.p239.p241.InterfaceC2796
            /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
            public void mo20(String str, List<?> list) {
                AbstractC0018.this.getClass();
                AbstractC0018 abstractC0018 = AbstractC0018.this;
                MediaItem.m1(list);
                abstractC0018.getClass();
            }

            @Override // p237.p238.p239.p241.InterfaceC2796
            /* renamed from: びぐびあび, reason: contains not printable characters */
            public void mo21(String str) {
                AbstractC0018.this.getClass();
            }
        }

        public AbstractC0018() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                new C2799(new C0019());
            } else if (i >= 21) {
                new C2800(new C0020());
            }
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0002 c0002, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        this.f1 = i >= 26 ? new C0015(context, componentName, c0002, null) : i >= 23 ? new C0014(context, componentName, c0002, null) : i >= 21 ? new C0016(context, componentName, c0002, null) : new C0005(context, componentName, c0002, null);
    }
}
