package p107.p108.p109.p110.p121;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1942 extends Thread {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public C1935 f8463;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public InputStream f8464;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f8465;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public OutputStream f8466;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Socket f8467;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f8468;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Socket f8469;

    public C1942(C1935 c1935, Socket socket, Socket socket2, boolean z) {
        this.f8469 = socket;
        this.f8467 = socket2;
        this.f8464 = socket.getInputStream();
        this.f8466 = this.f8467.getOutputStream();
        this.f8468 = z;
        this.f8463 = c1935;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0196, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0381, code lost:
    
        p034.p095.C1687.m3697(r12, r11 + new java.text.SimpleDateFormat(r10, java.util.Locale.getDefault()).format(new java.util.Date()) + r8 + team.dev.epro.apkcustom.App.m1605().getString(2131820811));
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03c6, code lost:
    
        if (((p034.p050.p053.C1216) team.dev.epro.apkcustom.App.m1604()).m2701(team.dev.epro.apkcustom.App.m1605(), team.dev.epro.apkcustom.sockets.Tun2SocksService.class) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03c8, code lost:
    
        r2 = new android.content.Intent(team.dev.epro.apkcustom.App.m1605(), (java.lang.Class<?>) team.dev.epro.apkcustom.sockets.Tun2SocksService.class);
        r2.setAction(r6);
        team.dev.epro.apkcustom.App.m1605().startService(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03ed, code lost:
    
        if (((p034.p050.p053.C1216) team.dev.epro.apkcustom.App.m1604()).m2701(team.dev.epro.apkcustom.App.m1605(), team.dev.epro.apkcustom.sockets.SSHTunnelService.class) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03ef, code lost:
    
        r2 = new android.content.Intent(team.dev.epro.apkcustom.App.m1605(), (java.lang.Class<?>) team.dev.epro.apkcustom.sockets.SSHTunnelService.class);
        r2.setAction(r6);
        team.dev.epro.apkcustom.App.m1605().startService(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0404, code lost:
    
        r22.f8464.close();
        r22.f8466.close();
        team.dev.epro.apkcustom.App.m1603().edit().putBoolean(r5, false).commit();
        team.dev.epro.apkcustom.App.m1603().edit().putBoolean(r4, false).commit();
        team.dev.epro.apkcustom.App.m1603().edit().putBoolean(r3, false).commit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x043c, code lost:
    
        r22.f8464.close();
        r22.f8466.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0446, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f5, code lost:
    
        p034.p095.C1687.m3697(r12, r11 + new java.text.SimpleDateFormat(r10, java.util.Locale.getDefault()).format(new java.util.Date()) + r8 + team.dev.epro.apkcustom.App.m1605().getString(2131820805));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x023a, code lost:
    
        if (((p034.p050.p053.C1216) team.dev.epro.apkcustom.App.m1604()).m2701(team.dev.epro.apkcustom.App.m1605(), team.dev.epro.apkcustom.sockets.Tun2SocksService.class) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x023c, code lost:
    
        r2 = new android.content.Intent(team.dev.epro.apkcustom.App.m1605(), (java.lang.Class<?>) team.dev.epro.apkcustom.sockets.Tun2SocksService.class);
        r2.setAction(r6);
        team.dev.epro.apkcustom.App.m1605().startService(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0261, code lost:
    
        if (((p034.p050.p053.C1216) team.dev.epro.apkcustom.App.m1604()).m2701(team.dev.epro.apkcustom.App.m1605(), team.dev.epro.apkcustom.sockets.SSHTunnelService.class) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0263, code lost:
    
        r2 = new android.content.Intent(team.dev.epro.apkcustom.App.m1605(), (java.lang.Class<?>) team.dev.epro.apkcustom.sockets.SSHTunnelService.class);
        r2.setAction(r6);
        team.dev.epro.apkcustom.App.m1605().startService(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0278, code lost:
    
        r22.f8464.close();
        r22.f8466.close();
        team.dev.epro.apkcustom.App.m1603().edit().putBoolean(r5, false).commit();
        team.dev.epro.apkcustom.App.m1603().edit().putBoolean(r4, false).commit();
        team.dev.epro.apkcustom.App.m1603().edit().putBoolean(r3, false).commit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00d1, code lost:
    
        p034.p095.C1687.m3697(r12, r11 + new java.text.SimpleDateFormat(r10, java.util.Locale.getDefault()).format(new java.util.Date()) + r8 + team.dev.epro.apkcustom.App.m1605().getString(2131820811));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0116, code lost:
    
        if (((p034.p050.p053.C1216) team.dev.epro.apkcustom.App.m1604()).m2701(team.dev.epro.apkcustom.App.m1605(), team.dev.epro.apkcustom.sockets.Tun2SocksService.class) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0118, code lost:
    
        r2 = new android.content.Intent(team.dev.epro.apkcustom.App.m1605(), (java.lang.Class<?>) team.dev.epro.apkcustom.sockets.Tun2SocksService.class);
        r2.setAction(r6);
        team.dev.epro.apkcustom.App.m1605().startService(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013d, code lost:
    
        if (((p034.p050.p053.C1216) team.dev.epro.apkcustom.App.m1604()).m2701(team.dev.epro.apkcustom.App.m1605(), team.dev.epro.apkcustom.sockets.SSHTunnelService.class) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x013f, code lost:
    
        r2 = new android.content.Intent(team.dev.epro.apkcustom.App.m1605(), (java.lang.Class<?>) team.dev.epro.apkcustom.sockets.SSHTunnelService.class);
        r2.setAction(r6);
        team.dev.epro.apkcustom.App.m1605().startService(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0154, code lost:
    
        r22.f8464.close();
        r22.f8466.close();
        team.dev.epro.apkcustom.App.m1603().edit().putBoolean(r5, false).commit();
        team.dev.epro.apkcustom.App.m1603().edit().putBoolean(r4, false).commit();
        team.dev.epro.apkcustom.App.m1603().edit().putBoolean(r3, false).commit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018c, code lost:
    
        r22.f8464.close();
        r22.f8466.close();
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p107.p108.p109.p110.p121.C1942.run():void");
    }
}
