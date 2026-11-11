package de.blinkt.openvpn.core;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Pair;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import p010.p011.p012.p013.C0753;
import p010.p011.p012.p013.InterfaceC0728;
import p010.p011.p012.p013.InterfaceC0734;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class OpenVPNStatusService extends Service implements C0753.InterfaceC0755, C0753.InterfaceC0756, C0753.InterfaceC0757 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final RemoteCallbackList<InterfaceC0728> f3726 = new RemoteCallbackList<>();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final InterfaceC0734.AbstractBinderC0735 f3727 = new BinderC0500();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final HandlerC0498 f3728 = new HandlerC0498(null);

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static C0499 f3729;

    /* renamed from: de.blinkt.openvpn.core.OpenVPNStatusService$〺つふすそ, reason: contains not printable characters */
    public static class HandlerC0498 extends Handler {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public WeakReference<OpenVPNStatusService> f3730 = null;

        public HandlerC0498(BinderC0500 binderC0500) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<OpenVPNStatusService> weakReference = this.f3730;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f3730.get();
            RemoteCallbackList<InterfaceC0728> remoteCallbackList = OpenVPNStatusService.f3726;
            int beginBroadcast = remoteCallbackList.beginBroadcast();
            for (int i = 0; i < beginBroadcast; i++) {
                try {
                    InterfaceC0728 broadcastItem = remoteCallbackList.getBroadcastItem(i);
                    switch (message.what) {
                        case 100:
                            broadcastItem.mo1989((LogItem) message.obj);
                            continue;
                        case 101:
                            C0499 c0499 = (C0499) message.obj;
                            broadcastItem.mo1990(c0499.f3733, c0499.f3731, c0499.f3734, c0499.f3732, c0499.f3735);
                            continue;
                        case 102:
                            Pair pair = (Pair) message.obj;
                            broadcastItem.mo1988(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
                            continue;
                        case 103:
                            broadcastItem.mo1987((String) message.obj);
                            continue;
                        default:
                            continue;
                    }
                } catch (RemoteException unused) {
                }
            }
            remoteCallbackList.finishBroadcast();
        }
    }

    /* renamed from: de.blinkt.openvpn.core.OpenVPNStatusService$くし〴〺ぅ, reason: contains not printable characters */
    public static class C0499 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public String f3731;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public ConnectionStatus f3732;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public String f3733;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f3734;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public Intent f3735;

        public C0499(String str, String str2, int i, ConnectionStatus connectionStatus, Intent intent) {
            this.f3733 = str;
            this.f3734 = i;
            this.f3731 = str2;
            this.f3732 = connectionStatus;
            this.f3735 = intent;
        }
    }

    /* renamed from: de.blinkt.openvpn.core.OpenVPNStatusService$げつ〴ぬぐ, reason: contains not printable characters */
    public static class BinderC0500 extends InterfaceC0734.AbstractBinderC0735 {

        /* renamed from: de.blinkt.openvpn.core.OpenVPNStatusService$げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
        public class C0501 extends Thread {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public final /* synthetic */ ParcelFileDescriptor[] f3736;

            /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
            public final /* synthetic */ LogItem[] f3737;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0501(BinderC0500 binderC0500, String str, ParcelFileDescriptor[] parcelFileDescriptorArr, LogItem[] logItemArr) {
                super(str);
                this.f3736 = parcelFileDescriptorArr;
                this.f3737 = logItemArr;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                DataOutputStream dataOutputStream = new DataOutputStream(new ParcelFileDescriptor.AutoCloseOutputStream(this.f3736[1]));
                try {
                    Object obj = C0753.f4871;
                    synchronized (obj) {
                        LinkedList<LogItem> linkedList = C0753.f4875;
                        obj.wait();
                    }
                } catch (InterruptedException unused) {
                    LinkedList<LogItem> linkedList2 = C0753.f4875;
                }
                try {
                    for (LogItem logItem : this.f3737) {
                        byte[] m1576 = logItem.m1576();
                        dataOutputStream.writeShort(m1576.length);
                        dataOutputStream.write(m1576);
                    }
                    dataOutputStream.writeShort(32767);
                    dataOutputStream.close();
                } catch (IOException unused2) {
                }
            }
        }

        @Override // p010.p011.p012.p013.InterfaceC0734
        /* renamed from: は〲ぱなで, reason: contains not printable characters */
        public TrafficHistory mo1597() {
            return C0753.f4883;
        }

        @Override // p010.p011.p012.p013.InterfaceC0734
        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public ParcelFileDescriptor mo1598(InterfaceC0728 interfaceC0728) {
            LogItem[] m2049 = C0753.m2049();
            C0499 c0499 = OpenVPNStatusService.f3729;
            if (c0499 != null) {
                interfaceC0728.mo1990(c0499.f3733, c0499.f3731, c0499.f3734, c0499.f3732, c0499.f3735);
            }
            OpenVPNStatusService.f3726.register(interfaceC0728);
            try {
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                new C0501(this, Crypt.a(Crypt.xrc("\u0019`f\u001ablJ7hLd>\u001cei@d<\u001ef<\u001c0i\u001ed<A0=\u001c7")), createPipe, m2049).start();
                return createPipe[0];
            } catch (IOException e) {
                throw new RemoteException(e.getMessage());
            }
        }

        @Override // p010.p011.p012.p013.InterfaceC0734
        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public String mo1599() {
            return C0753.f4882;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return f3727;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        LinkedList<LogItem> linkedList = C0753.f4875;
        synchronized (C0753.class) {
            C0753.f4869.add(this);
        }
        C0753.m2038(this);
        C0753.m2028(this);
        HandlerC0498 handlerC0498 = f3728;
        handlerC0498.getClass();
        handlerC0498.f3730 = new WeakReference<>(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C0753.m2039(this);
        C0753.m2047(this);
        C0753.m2040(this);
        f3726.kill();
    }

    @Override // p010.p011.p012.p013.C0753.InterfaceC0756
    /* renamed from: 〺つふすそ */
    public void mo1569(long j, long j2, long j3, long j4) {
        f3728.obtainMessage(102, Pair.create(Long.valueOf(j), Long.valueOf(j2))).sendToTarget();
    }

    @Override // p010.p011.p012.p013.C0753.InterfaceC0757
    /* renamed from: ぇ〳〲〺すっ */
    public void mo1583(String str) {
        f3728.obtainMessage(103, str).sendToTarget();
    }

    @Override // p010.p011.p012.p013.C0753.InterfaceC0755
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo1596(LogItem logItem) {
        f3728.obtainMessage(100, logItem).sendToTarget();
    }

    @Override // p010.p011.p012.p013.C0753.InterfaceC0757
    /* renamed from: ぺふねづ〺 */
    public void mo1595(String str, String str2, int i, ConnectionStatus connectionStatus, Intent intent) {
        C0499 c0499 = new C0499(str, str2, i, connectionStatus, intent);
        f3729 = c0499;
        f3728.obtainMessage(101, c0499).sendToTarget();
    }
}
