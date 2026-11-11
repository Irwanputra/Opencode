.class public final Lde/blinkt/openvpn/core/OpenVPNStatusService$げつ〴ぬぐ;
.super Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ$げつ〴ぬぐ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lde/blinkt/openvpn/core/OpenVPNStatusService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ$げつ〴ぬぐ;-><init>()V

    return-void
.end method


# virtual methods
.method public は〲ぱなで()Lde/blinkt/openvpn/core/TrafficHistory;
    .registers 2

    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぺふねづ〺:Lde/blinkt/openvpn/core/TrafficHistory;

    return-object v0
.end method

.method public へぬ〴づぞ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〳ぜぞぜべっ;)Landroid/os/ParcelFileDescriptor;
    .registers 10

    invoke-static {}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->びぐびあび()[Lde/blinkt/openvpn/core/LogItem;

    move-result-object v0

    sget-object v1, Lde/blinkt/openvpn/core/OpenVPNStatusService;->びぐびあび:Lde/blinkt/openvpn/core/OpenVPNStatusService$くし〴〺ぅ;

    if-eqz v1, :cond_16

    .line 1
    iget-object v3, v1, Lde/blinkt/openvpn/core/OpenVPNStatusService$くし〴〺ぅ;->げつ〴ぬぐ:Ljava/lang/String;

    iget-object v4, v1, Lde/blinkt/openvpn/core/OpenVPNStatusService$くし〴〺ぅ;->〺つふすそ:Ljava/lang/String;

    iget v5, v1, Lde/blinkt/openvpn/core/OpenVPNStatusService$くし〴〺ぅ;->づざかべべ:I

    iget-object v6, v1, Lde/blinkt/openvpn/core/OpenVPNStatusService$くし〴〺ぅ;->くし〴〺ぅ:Lde/blinkt/openvpn/core/ConnectionStatus;

    iget-object v7, v1, Lde/blinkt/openvpn/core/OpenVPNStatusService$くし〴〺ぅ;->びぐびあび:Landroid/content/Intent;

    move-object v2, p1

    invoke-interface/range {v2 .. v7}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〳ぜぞぜべっ;->ぶでにく〼〳(Ljava/lang/String;Ljava/lang/String;ILde/blinkt/openvpn/core/ConnectionStatus;Landroid/content/Intent;)V

    .line 2
    :cond_16
    sget-object v1, Lde/blinkt/openvpn/core/OpenVPNStatusService;->〺つふすそ:Landroid/os/RemoteCallbackList;

    invoke-virtual {v1, p1}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;)Z

    :try_start_1b
    invoke-static {}, Landroid/os/ParcelFileDescriptor;->createPipe()[Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    new-instance v1, Lde/blinkt/openvpn/core/OpenVPNStatusService$げつ〴ぬぐ$げつ〴ぬぐ;

    const-string v2, "\u0019`f\u001ablJ7hLd>\u001cei@d<\u001ef<\u001c0i\u001ed<A0=\u001c7"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2, p1, v0}, Lde/blinkt/openvpn/core/OpenVPNStatusService$げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Lde/blinkt/openvpn/core/OpenVPNStatusService$げつ〴ぬぐ;Ljava/lang/String;[Landroid/os/ParcelFileDescriptor;[Lde/blinkt/openvpn/core/LogItem;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    const/4 v0, 0x0

    aget-object p1, p1, v0
    :try_end_34
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_34} :catch_35

    return-object p1

    :catch_35
    move-exception p1

    new-instance v0, Landroid/os/RemoteException;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ぺぁあねじ()Ljava/lang/String;
    .registers 2

    .line 1
    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぺぁあねじ:Ljava/lang/String;

    return-object v0
.end method
