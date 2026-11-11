package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p034.p035.p041.C1049;
import p034.p035.p042.C1052;
import p034.p068.C1422;
import p034.p068.C1426;
import p034.p068.C1431;
import p034.p068.C1432;
import p034.p068.C1438;
import p034.p068.C1440;
import p034.p068.InterfaceC1430;
import p034.p068.InterfaceC1435;
import p034.p068.RunnableC1420;
import p034.p068.RunnableC1424;
import p034.p068.RunnableC1425;
import p034.p068.RunnableC1427;
import p034.p068.RunnableC1434;
import p034.p068.RunnableC1437;
import p034.p068.RunnableC1444;
import p034.p068.RunnableC1445;
import p034.p068.RunnableC1446;
import p034.p080.C1502;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final boolean f1292 = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public InterfaceC0178 f1293;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C1502<IBinder, C0183> f1294 = new C1502<>();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final HandlerC0187 f1295 = new HandlerC0187();

    /* renamed from: androidx.media.MediaBrowserServiceCompat$〳ぜぞぜべっ, reason: contains not printable characters */
    public static class C0177<T> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f1296;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f1297;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Object f1298;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f1299;

        public C0177(Object obj) {
            this.f1298 = obj;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo575(Bundle bundle) {
            StringBuilder m4207 = C2098.m4207("It is not supported to send an error for ");
            m4207.append(this.f1298);
            throw new UnsupportedOperationException(m4207.toString());
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void mo576(T t) {
            throw null;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean m577() {
            return this.f1296 || this.f1297;
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void m578(T t) {
            if (this.f1296 || this.f1297) {
                StringBuilder m4207 = C2098.m4207("sendResult() called when either sendResult() or sendError() had already been called for: ");
                m4207.append(this.f1298);
                throw new IllegalStateException(m4207.toString());
            }
            this.f1296 = true;
            mo576(null);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC0178 {
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        IBinder mo579(Intent intent);

        /* renamed from: づざかべべ, reason: contains not printable characters */
        void mo580();
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$ぁごぐすすぃ, reason: contains not printable characters */
    public class C0179 implements InterfaceC0178 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Messenger f1301;

        public C0179() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0178
        /* renamed from: くし〴〺ぅ */
        public IBinder mo579(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.f1301.getBinder();
            }
            return null;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0178
        /* renamed from: づざかべべ */
        public void mo580() {
            this.f1301 = new Messenger(MediaBrowserServiceCompat.this.f1295);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$いいにぽつ, reason: contains not printable characters */
    public interface InterfaceC0180 {
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$くし〴〺ぅ, reason: contains not printable characters */
    public class C0181 implements InterfaceC0178, InterfaceC1430 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Object f1302;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public Messenger f1303;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final List<Bundle> f1304 = new ArrayList();

        /* renamed from: androidx.media.MediaBrowserServiceCompat$くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
        public class C0182 extends C0177<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: づざかべべ, reason: contains not printable characters */
            public final /* synthetic */ C1438 f1306;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0182(C0181 c0181, Object obj, C1438 c1438) {
                super(obj);
                this.f1306 = c1438;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.C0177
            /* renamed from: くし〴〺ぅ */
            public void mo576(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                List<MediaBrowserCompat.MediaItem> list2 = list;
                if (list2 != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list2) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f1306.m3187(arrayList);
            }
        }

        public C0181() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0178
        /* renamed from: くし〴〺ぅ */
        public IBinder mo579(Intent intent) {
            return ((MediaBrowserService) this.f1302).onBind(intent);
        }

        @Override // p034.p068.InterfaceC1430
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo581(String str, C1438<List<Parcel>> c1438) {
            MediaBrowserServiceCompat.this.m570(str, new C0182(this, str, c1438));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0178
        /* renamed from: づざかべべ */
        public void mo580() {
            C1432 c1432 = new C1432(MediaBrowserServiceCompat.this, this);
            this.f1302 = c1432;
            c1432.onCreate();
        }

        @Override // p034.p068.InterfaceC1430
        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public C1426 mo582(String str, int i, Bundle bundle) {
            if (bundle != null && bundle.getInt("extra_client_version", 0) != 0) {
                bundle.remove("extra_client_version");
                this.f1303 = new Messenger(MediaBrowserServiceCompat.this.f1295);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                C1049.m2383(bundle2, "extra_messenger", this.f1303.getBinder());
                MediaBrowserServiceCompat.this.getClass();
                this.f1304.add(bundle2);
            }
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            new HashMap();
            if (Build.VERSION.SDK_INT >= 28) {
                new C1422(str, -1, i);
            }
            mediaBrowserServiceCompat.getClass();
            MediaBrowserServiceCompat.this.m568(str, i, bundle);
            MediaBrowserServiceCompat.this.getClass();
            return null;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0183 implements IBinder.DeathRecipient {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final InterfaceC0180 f1307;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final HashMap<String, List<C1052<IBinder, Bundle>>> f1308 = new HashMap<>();

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final String f1309;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
        public class RunnableC0184 implements Runnable {
            public RunnableC0184() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0183 c0183 = C0183.this;
                MediaBrowserServiceCompat.this.f1294.remove(((C0192) c0183.f1307).m588());
            }
        }

        public C0183(String str, int i, int i2, Bundle bundle, InterfaceC0180 interfaceC0180) {
            this.f1309 = str;
            if (Build.VERSION.SDK_INT >= 28) {
                new C1422(str, i, i2);
            }
            this.f1307 = interfaceC0180;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.f1295.post(new RunnableC0184());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$づざかべべ, reason: contains not printable characters */
    public class C0185 extends C0189 implements C1440.InterfaceC1442 {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
        public class C0186 extends C0177<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: づざかべべ, reason: contains not printable characters */
            public final /* synthetic */ C1440.C1441 f1313;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0186(C0185 c0185, Object obj, C1440.C1441 c1441) {
                super(obj);
                this.f1313 = c1441;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.C0177
            /* renamed from: くし〴〺ぅ */
            public void mo576(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList<Parcel> arrayList;
                List<MediaBrowserCompat.MediaItem> list2 = list;
                ArrayList arrayList2 = null;
                if (list2 != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list2) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                C1440.C1441 c1441 = this.f1313;
                int i = this.f1299;
                c1441.getClass();
                try {
                    C1440.f6724.setInt(c1441.f6725, i);
                } catch (IllegalAccessException unused) {
                }
                MediaBrowserService.Result result = c1441.f6725;
                if (arrayList != null) {
                    arrayList2 = new ArrayList();
                    for (Parcel parcel : arrayList) {
                        parcel.setDataPosition(0);
                        arrayList2.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                        parcel.recycle();
                    }
                }
                result.sendResult(arrayList2);
            }
        }

        public C0185() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C0189, androidx.media.MediaBrowserServiceCompat.C0181, androidx.media.MediaBrowserServiceCompat.InterfaceC0178
        /* renamed from: づざかべべ */
        public void mo580() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            Field field = C1440.f6724;
            C1440.C1443 c1443 = new C1440.C1443(mediaBrowserServiceCompat, this);
            this.f1302 = c1443;
            c1443.onCreate();
        }

        @Override // p034.p068.C1440.InterfaceC1442
        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void mo583(String str, C1440.C1441 c1441, Bundle bundle) {
            MediaBrowserServiceCompat.this.m574(str, new C0186(this, str, c1441));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$てぜきぽく, reason: contains not printable characters */
    public final class HandlerC0187 extends Handler {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final C0191 f1315;

        public HandlerC0187() {
            this.f1315 = MediaBrowserServiceCompat.this.new C0191();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m31(bundle);
                    C0191 c0191 = this.f1315;
                    String string = data.getString("data_package_name");
                    int i = data.getInt("data_calling_pid");
                    int i2 = data.getInt("data_calling_uid");
                    C0192 c0192 = new C0192(message.replyTo);
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                    mediaBrowserServiceCompat.getClass();
                    boolean z = false;
                    if (string != null) {
                        String[] packagesForUid = mediaBrowserServiceCompat.getPackageManager().getPackagesForUid(i2);
                        int length = packagesForUid.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (packagesForUid[i3].equals(string)) {
                                    z = true;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    if (z) {
                        MediaBrowserServiceCompat.this.f1295.m584(new RunnableC1420(c0191, c0192, string, i, i2, bundle));
                        return;
                    }
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + string);
                case 2:
                    C0191 c01912 = this.f1315;
                    MediaBrowserServiceCompat.this.f1295.m584(new RunnableC1445(c01912, new C0192(message.replyTo)));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m31(bundle2);
                    C0191 c01913 = this.f1315;
                    MediaBrowserServiceCompat.this.f1295.m584(new RunnableC1424(c01913, new C0192(message.replyTo), data.getString("data_media_item_id"), C1049.m2384(data, "data_callback_token"), bundle2));
                    return;
                case 4:
                    C0191 c01914 = this.f1315;
                    MediaBrowserServiceCompat.this.f1295.m584(new RunnableC1446(c01914, new C0192(message.replyTo), data.getString("data_media_item_id"), C1049.m2384(data, "data_callback_token")));
                    return;
                case 5:
                    C0191 c01915 = this.f1315;
                    String string2 = data.getString("data_media_item_id");
                    ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C0192 c01922 = new C0192(message.replyTo);
                    c01915.getClass();
                    if (TextUtils.isEmpty(string2) || resultReceiver == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f1295.m584(new RunnableC1434(c01915, c01922, string2, resultReceiver));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.m31(bundle3);
                    C0191 c01916 = this.f1315;
                    MediaBrowserServiceCompat.this.f1295.m584(new RunnableC1437(c01916, new C0192(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3));
                    return;
                case 7:
                    C0191 c01917 = this.f1315;
                    MediaBrowserServiceCompat.this.f1295.m584(new RunnableC1444(c01917, new C0192(message.replyTo)));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m31(bundle4);
                    C0191 c01918 = this.f1315;
                    String string3 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C0192 c01923 = new C0192(message.replyTo);
                    c01918.getClass();
                    if (TextUtils.isEmpty(string3) || resultReceiver2 == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f1295.m584(new RunnableC1427(c01918, c01923, string3, bundle4, resultReceiver2));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m31(bundle5);
                    C0191 c01919 = this.f1315;
                    String string4 = data.getString("data_custom_action");
                    ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C0192 c01924 = new C0192(message.replyTo);
                    c01919.getClass();
                    if (TextUtils.isEmpty(string4) || resultReceiver3 == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f1295.m584(new RunnableC1425(c01919, c01924, string4, bundle5, resultReceiver3));
                    return;
                default:
                    String str = "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1;
                    return;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m584(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$なぎぱいぢぎ, reason: contains not printable characters */
    public class C0188 extends C0185 {
        public C0188(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            super();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$びぐびあび, reason: contains not printable characters */
    public class C0189 extends C0181 implements InterfaceC1435 {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$びぐびあび$げつ〴ぬぐ, reason: contains not printable characters */
        public class C0190 extends C0177<MediaBrowserCompat.MediaItem> {

            /* renamed from: づざかべべ, reason: contains not printable characters */
            public final /* synthetic */ C1438 f1317;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0190(C0189 c0189, Object obj, C1438 c1438) {
                super(obj);
                this.f1317 = c1438;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.C0177
            /* renamed from: くし〴〺ぅ */
            public void mo576(MediaBrowserCompat.MediaItem mediaItem) {
                Parcel obtain;
                C1438 c1438;
                MediaBrowserCompat.MediaItem mediaItem2 = mediaItem;
                if (mediaItem2 == null) {
                    c1438 = this.f1317;
                    obtain = null;
                } else {
                    obtain = Parcel.obtain();
                    mediaItem2.writeToParcel(obtain, 0);
                    c1438 = this.f1317;
                }
                c1438.m3187(obtain);
            }
        }

        public C0189() {
            super();
        }

        @Override // p034.p068.InterfaceC1435
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo585(String str, C1438<Parcel> c1438) {
            MediaBrowserServiceCompat.this.m572(new C0190(this, str, c1438));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C0181, androidx.media.MediaBrowserServiceCompat.InterfaceC0178
        /* renamed from: づざかべべ */
        public void mo580() {
            C1431 c1431 = new C1431(MediaBrowserServiceCompat.this, this);
            this.f1302 = c1431;
            c1431.onCreate();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$ぺぁあねじ, reason: contains not printable characters */
    public class C0191 {
        public C0191() {
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$ぺふねづ〺, reason: contains not printable characters */
    public static class C0192 implements InterfaceC0180 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Messenger f1319;

        public C0192(Messenger messenger) {
            this.f1319 = messenger;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m586(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            m587(3, bundle3);
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final void m587(int i, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f1319.send(obtain);
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public IBinder m588() {
            return this.f1319.getBinder();
        }
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f1293.mo579(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        InterfaceC0178 c0188 = i >= 28 ? new C0188(this) : i >= 26 ? new C0185() : i >= 23 ? new C0189() : i >= 21 ? new C0181() : new C0179();
        this.f1293 = c0188;
        c0188.mo580();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m567() {
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public abstract void m568(String str, int i, Bundle bundle);

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m569() {
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public abstract void m570(String str, C0177<List<MediaBrowserCompat.MediaItem>> c0177);

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m571(C0177 c0177) {
        if (c0177.f1296 || c0177.f1297) {
            StringBuilder m4207 = C2098.m4207("sendError() called when either sendResult() or sendError() had already been called for: ");
            m4207.append(c0177.f1298);
            throw new IllegalStateException(m4207.toString());
        }
        c0177.f1297 = true;
        c0177.mo575(null);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m572(C0177 c0177) {
        c0177.f1299 = 2;
        c0177.m578(null);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m573(C0177 c0177) {
        c0177.f1299 = 4;
        c0177.m578(null);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m574(String str, C0177 c0177) {
        c0177.f1299 = 1;
        m570(str, c0177);
    }
}
