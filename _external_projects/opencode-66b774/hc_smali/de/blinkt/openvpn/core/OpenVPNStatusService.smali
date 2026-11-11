.class public Lde/blinkt/openvpn/core/OpenVPNStatusService;
.super Landroid/app/Service;
.source ""

# interfaces
.implements Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$くし〴〺ぅ;
.implements Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$げつ〴ぬぐ;
.implements Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$びぐびあび;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde/blinkt/openvpn/core/OpenVPNStatusService$〺つふすそ;,
        Lde/blinkt/openvpn/core/OpenVPNStatusService$くし〴〺ぅ;
    }
.end annotation


# static fields
.field public static final 〺つふすそ:Landroid/os/RemoteCallbackList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/RemoteCallbackList<",
            "L\u3041\u3054\u3050\u3059\u3059\u3043/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3041\u3054\u3050\u3059\u3059\u3043/\u3033\u305c\u305e\u305c\u3079\u3063;",
            ">;"
        }
    .end annotation
.end field

.field public static final くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ$げつ〴ぬぐ;

.field public static final づざかべべ:Lde/blinkt/openvpn/core/OpenVPNStatusService$〺つふすそ;

.field public static びぐびあび:Lde/blinkt/openvpn/core/OpenVPNStatusService$くし〴〺ぅ;


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    new-instance v0, Landroid/os/RemoteCallbackList;

    invoke-direct {v0}, Landroid/os/RemoteCallbackList;-><init>()V

    sput-object v0, Lde/blinkt/openvpn/core/OpenVPNStatusService;->〺つふすそ:Landroid/os/RemoteCallbackList;

    new-instance v0, Lde/blinkt/openvpn/core/OpenVPNStatusService$げつ〴ぬぐ;

    invoke-direct {v0}, Lde/blinkt/openvpn/core/OpenVPNStatusService$げつ〴ぬぐ;-><init>()V

    sput-object v0, Lde/blinkt/openvpn/core/OpenVPNStatusService;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ$げつ〴ぬぐ;

    new-instance v0, Lde/blinkt/openvpn/core/OpenVPNStatusService$〺つふすそ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lde/blinkt/openvpn/core/OpenVPNStatusService$〺つふすそ;-><init>(Lde/blinkt/openvpn/core/OpenVPNStatusService$げつ〴ぬぐ;)V

    sput-object v0, Lde/blinkt/openvpn/core/OpenVPNStatusService;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNStatusService$〺つふすそ;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .registers 2

    sget-object p1, Lde/blinkt/openvpn/core/OpenVPNStatusService;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ$げつ〴ぬぐ;

    return-object p1
.end method

.method public onCreate()V
    .registers 3

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 1
    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    const-class v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;

    monitor-enter v0

    :try_start_8
    sget-object v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->〺つふすそ:Ljava/util/Vector;

    invoke-virtual {v1, p0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
    :try_end_d
    .catchall {:try_start_8 .. :try_end_d} :catchall_21

    monitor-exit v0

    .line 2
    invoke-static {p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$げつ〴ぬぐ;)V

    invoke-static {p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->〺つふすそ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$びぐびあび;)V

    sget-object v0, Lde/blinkt/openvpn/core/OpenVPNStatusService;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNStatusService$〺つふすそ;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lde/blinkt/openvpn/core/OpenVPNStatusService$〺つふすそ;->げつ〴ぬぐ:Ljava/lang/ref/WeakReference;

    return-void

    :catchall_21
    move-exception v1

    .line 4
    monitor-exit v0

    throw v1
.end method

.method public onDestroy()V
    .registers 2

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    invoke-static {p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ごづごきえ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$くし〴〺ぅ;)V

    invoke-static {p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->は〲ぱなで(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$げつ〴ぬぐ;)V

    invoke-static {p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ざっざへづ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$びぐびあび;)V

    sget-object v0, Lde/blinkt/openvpn/core/OpenVPNStatusService;->〺つふすそ:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->kill()V

    return-void
.end method

.method public 〺つふすそ(JJJJ)V
    .registers 9

    sget-object p5, Lde/blinkt/openvpn/core/OpenVPNStatusService;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNStatusService$〺つふすそ;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    const/16 p2, 0x66

    invoke-virtual {p5, p2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public ぇ〳〲〺すっ(Ljava/lang/String;)V
    .registers 4

    sget-object v0, Lde/blinkt/openvpn/core/OpenVPNStatusService;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNStatusService$〺つふすそ;

    const/16 v1, 0x67

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public げつ〴ぬぐ(Lde/blinkt/openvpn/core/LogItem;)V
    .registers 4

    sget-object v0, Lde/blinkt/openvpn/core/OpenVPNStatusService;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNStatusService$〺つふすそ;

    const/16 v1, 0x64

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public ぺふねづ〺(Ljava/lang/String;Ljava/lang/String;ILde/blinkt/openvpn/core/ConnectionStatus;Landroid/content/Intent;)V
    .registers 13

    new-instance v6, Lde/blinkt/openvpn/core/OpenVPNStatusService$くし〴〺ぅ;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lde/blinkt/openvpn/core/OpenVPNStatusService$くし〴〺ぅ;-><init>(Ljava/lang/String;Ljava/lang/String;ILde/blinkt/openvpn/core/ConnectionStatus;Landroid/content/Intent;)V

    sput-object v6, Lde/blinkt/openvpn/core/OpenVPNStatusService;->びぐびあび:Lde/blinkt/openvpn/core/OpenVPNStatusService$くし〴〺ぅ;

    sget-object p1, Lde/blinkt/openvpn/core/OpenVPNStatusService;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNStatusService$〺つふすそ;

    const/16 p2, 0x65

    invoke-virtual {p1, p2, v6}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method
