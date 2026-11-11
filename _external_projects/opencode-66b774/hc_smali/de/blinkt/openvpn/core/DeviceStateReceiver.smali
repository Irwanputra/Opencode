.class public Lde/blinkt/openvpn/core/DeviceStateReceiver;
.super Landroid/content/BroadcastReceiver;
.source ""

# interfaces
.implements Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$げつ〴ぬぐ;
.implements Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde/blinkt/openvpn/core/DeviceStateReceiver$〺つふすそ;,
        Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Ljava/lang/Runnable;

.field public final 〺つふすそ:Landroid/os/Handler;

.field public ぁごぐすすぃ:Ljava/lang/String;

.field public いいにぽつ:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lde/blinkt/openvpn/core/DeviceStateReceiver$\u303a\u3064\u3075\u3059\u305d;",
            ">;"
        }
    .end annotation
.end field

.field public くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

.field public づざかべべ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

.field public なぎぱいぢぎ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

.field public びぐびあび:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

.field public ぺぁあねじ:Landroid/net/NetworkInfo;


# direct methods
.method public constructor <init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;)V
    .registers 3

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    sget-object v0, Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;->びぐびあび:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    iput-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->びぐびあび:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    sget-object v0, Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;->〺つふすそ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    iput-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->づざかべべ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    iput-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->なぎぱいぢぎ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    const/4 v0, 0x0

    iput-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->ぁごぐすすぃ:Ljava/lang/String;

    new-instance v0, Lde/blinkt/openvpn/core/DeviceStateReceiver$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lde/blinkt/openvpn/core/DeviceStateReceiver$げつ〴ぬぐ;-><init>(Lde/blinkt/openvpn/core/DeviceStateReceiver;)V

    iput-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->〳ぜぞぜべっ:Ljava/lang/Runnable;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->いいにぽつ:Ljava/util/LinkedList;

    iput-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    invoke-interface {p1, p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->びぐびあび(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$げつ〴ぬぐ;)V

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->〺つふすそ:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 9

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぅみぱぎぎ(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Ad9A3>\u001deh\u0019emMbgHkjK19Ac=K`gM6l\u001bf=M6=NjnL4hKg=Mfl\u001e`iI0<Hfl\u001cahO`i\u0019`=Lam\u001eb=Iem@k9\u001b`>K1mNgj\u001969\u001e0hNgh"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-virtual {p0, p1}, Lde/blinkt/openvpn/core/DeviceStateReceiver;->くし〴〺ぅ(Landroid/content/Context;)V

    goto/16 :goto_b2

    :cond_1d
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v1, "L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4<\u001akmMf<L7fHg=\u001cbh\u001dj<Kfk\u001b`i\u001db<Ljo\u001cfm\u001dd:Ajf\u001ddh\u001d39K6fK1fHdiJe9A`nLg:"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_74

    const/4 p1, 0x0

    const-string p2, "@f>\u001e6jJg>Nfi\u001d4:M7f\u001echOdgK6kN`fKa"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p2, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_b2

    .line 1
    sget-object p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/は〲ぱなで;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    if-eqz p1, :cond_50

    .line 2
    iget-boolean p1, p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->ぷぞてのほき:Z

    if-nez p1, :cond_50

    const p1, 0x7f1102af

    invoke-static {p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->〳ぜぞぜべっ(I)V

    :cond_50
    sget-object p1, Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;->くし〴〺ぅ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    iput-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->づざかべべ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    .line 3
    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->いいにぽつ:Ljava/util/LinkedList;

    new-instance p2, Lde/blinkt/openvpn/core/DeviceStateReceiver$〺つふすそ;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/32 v3, 0x10000

    const/4 v5, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lde/blinkt/openvpn/core/DeviceStateReceiver$〺つふすそ;-><init>(JJLde/blinkt/openvpn/core/DeviceStateReceiver$げつ〴ぬぐ;)V

    invoke-virtual {p1, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->びぐびあび:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    sget-object p2, Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;->びぐびあび:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    if-eq p1, p2, :cond_71

    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->なぎぱいぢぎ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    if-ne p1, p2, :cond_b2

    :cond_71
    iput-object p2, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->づざかべべ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    goto :goto_b2

    :cond_74
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4k\u001b`:J4=\u001cj:\u0019`:\u001ddgM0oIcoK1oK4l\u001dbiI"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b2

    invoke-virtual {p0}, Lde/blinkt/openvpn/core/DeviceStateReceiver;->びぐびあび()Z

    move-result p1

    sget-object p2, Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;->〺つふすそ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    iput-object p2, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->づざかべべ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    iget-object p2, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->〺つふすそ:Landroid/os/Handler;

    iget-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->〳ぜぞぜべっ:Ljava/lang/Runnable;

    invoke-virtual {p2, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Lde/blinkt/openvpn/core/DeviceStateReceiver;->びぐびあび()Z

    move-result p2

    if-eq p2, p1, :cond_a3

    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    invoke-interface {p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->resume()V

    goto :goto_b2

    :cond_a3
    invoke-virtual {p0}, Lde/blinkt/openvpn/core/DeviceStateReceiver;->びぐびあび()Z

    move-result p1

    if-nez p1, :cond_b2

    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    invoke-virtual {p0}, Lde/blinkt/openvpn/core/DeviceStateReceiver;->げつ〴ぬぐ()Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;

    move-result-object p2

    invoke-interface {p1, p2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〺つふすそ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;)V

    :cond_b2
    :goto_b2
    return-void
.end method

.method public 〺つふすそ(JJJJ)V
    .registers 11

    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->づざかべべ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    sget-object p2, Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;->くし〴〺ぅ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    if-eq p1, p2, :cond_7

    return-void

    :cond_7
    add-long p1, p5, p7

    iget-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->いいにぽつ:Ljava/util/LinkedList;

    new-instance v1, Lde/blinkt/openvpn/core/DeviceStateReceiver$〺つふすそ;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p4

    const/4 p8, 0x0

    move-object p3, v1

    move-wide p6, p1

    invoke-direct/range {p3 .. p8}, Lde/blinkt/openvpn/core/DeviceStateReceiver$〺つふすそ;-><init>(JJLde/blinkt/openvpn/core/DeviceStateReceiver$げつ〴ぬぐ;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_1a
    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->いいにぽつ:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lde/blinkt/openvpn/core/DeviceStateReceiver$〺つふすそ;

    iget-wide p1, p1, Lde/blinkt/openvpn/core/DeviceStateReceiver$〺つふすそ;->げつ〴ぬぐ:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p3

    const-wide/32 p5, 0xea60

    sub-long/2addr p3, p5

    cmp-long p5, p1, p3

    if-gtz p5, :cond_36

    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->いいにぽつ:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    goto :goto_1a

    :cond_36
    const-wide/16 p1, 0x0

    iget-object p3, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->いいにぽつ:Ljava/util/LinkedList;

    invoke-virtual {p3}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_3e
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4e

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lde/blinkt/openvpn/core/DeviceStateReceiver$〺つふすそ;

    iget-wide p4, p4, Lde/blinkt/openvpn/core/DeviceStateReceiver$〺つふすそ;->〺つふすそ:J

    add-long/2addr p1, p4

    goto :goto_3e

    :cond_4e
    const-wide/32 p3, 0x10000

    cmp-long p5, p1, p3

    if-gez p5, :cond_81

    sget-object p1, Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;->びぐびあび:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    iput-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->づざかべべ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    const p1, 0x7f1102b0

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string p4, "\u0019`i@4f\u001e6h@4gMg<N1:Ig;\u0019f;LckNkjHf"

    invoke-static {p4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    aput-object p4, p2, p3

    const/4 p3, 0x1

    const/16 p4, 0x3c

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    aput-object p4, p2, p3

    invoke-static {p1, p2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->てぜきぽく(I[Ljava/lang/Object;)V

    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    invoke-virtual {p0}, Lde/blinkt/openvpn/core/DeviceStateReceiver;->げつ〴ぬぐ()Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;

    move-result-object p2

    invoke-interface {p1, p2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〺つふすそ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;)V

    :cond_81
    return-void
.end method

.method public くし〴〺ぅ(Landroid/content/Context;)V
    .registers 10

    .line 1
    sget-object v0, Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;->くし〴〺ぅ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    const-string v1, "N4k\u001a6:N4j@boL09O3nNb=\u001egoMfi\u001cbnNf"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1

    .line 2
    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぅみぱぎぎ(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v2, "I6:\u001eg;N39\u00193>J4;\u001bfgNd:J1fM`fNcn\u00196f\u001ck:Oe>AjoJ6<Ojk\u001d1mNb;Lf9O4<L0oM"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {p1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    const/4 v2, 0x0

    if-nez v1, :cond_37

    const-string v4, "@k:\u001c6h\u001e4;\u001a7o\u001bfl\u001eg:KdjJ6n@4m\u0019a>H0"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_6b

    :cond_37
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    if-nez v4, :cond_40

    move-object v4, v5

    :cond_40
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_47

    goto :goto_48

    :cond_47
    move-object v5, v6

    :goto_48
    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v2

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getDetailedState()Landroid/net/NetworkInfo$DetailedState;

    move-result-object v7

    aput-object v7, v6, v3

    const/4 v7, 0x2

    aput-object v5, v6, v7

    const/4 v5, 0x3

    aput-object v4, v6, v5

    const-string v4, "H0m\u001dbi\u001c0oNclM7hH0nM3:L1k@0:O3mI1;MahOef\u001d7gM09Aj=\u001dklLfgK3oM7j@bhM"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    :goto_6b
    if-eqz v1, :cond_e6

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v5

    sget-object v6, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v5, v6, :cond_e6

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getType()I

    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->びぐびあび:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    if-ne p1, v0, :cond_7e

    const/4 p1, 0x1

    goto :goto_7f

    :cond_7e
    const/4 p1, 0x0

    :goto_7f
    sget-object v5, Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;->〺つふすそ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    iput-object v5, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->びぐびあび:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    iget-object v5, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->ぺぁあねじ:Landroid/net/NetworkInfo;

    if-eqz v5, :cond_ac

    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getType()I

    move-result v5

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getType()I

    move-result v6

    if-ne v5, v6, :cond_ac

    iget-object v5, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->ぺぁあねじ:Landroid/net/NetworkInfo;

    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v6

    if-nez v5, :cond_a3

    if-nez v6, :cond_a1

    const/4 v5, 0x1

    goto :goto_a7

    :cond_a1
    const/4 v5, 0x0

    goto :goto_a7

    .line 3
    :cond_a3
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    :goto_a7
    if-nez v5, :cond_aa

    goto :goto_ac

    :cond_aa
    const/4 v5, 0x1

    goto :goto_ad

    :cond_ac
    :goto_ac
    const/4 v5, 0x0

    :goto_ad
    if-eqz p1, :cond_be

    if-eqz v5, :cond_be

    .line 4
    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->〺つふすそ:Landroid/os/Handler;

    iget-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->〳ぜぞぜべっ:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    invoke-interface {p1, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->くし〴〺ぅ(Z)V

    goto :goto_f5

    :cond_be
    iget-object v6, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->づざかべべ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    if-ne v6, v0, :cond_c6

    sget-object v0, Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;->びぐびあび:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    iput-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->づざかべべ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    :cond_c6
    invoke-virtual {p0}, Lde/blinkt/openvpn/core/DeviceStateReceiver;->びぐびあび()Z

    move-result v0

    if-eqz v0, :cond_e3

    iget-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->〺つふすそ:Landroid/os/Handler;

    iget-object v6, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->〳ぜぞぜべっ:Ljava/lang/Runnable;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    if-nez p1, :cond_de

    if-nez v5, :cond_d8

    goto :goto_de

    :cond_d8
    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    invoke-interface {p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->resume()V

    goto :goto_e3

    :cond_de
    :goto_de
    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    invoke-interface {p1, v5}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->くし〴〺ぅ(Z)V

    :cond_e3
    :goto_e3
    iput-object v1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->ぺぁあねじ:Landroid/net/NetworkInfo;

    goto :goto_f5

    :cond_e6
    if-nez v1, :cond_f5

    if-eqz p1, :cond_f5

    iput-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->びぐびあび:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->〺つふすそ:Landroid/os/Handler;

    iget-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->〳ぜぞぜべっ:Ljava/lang/Runnable;

    const-wide/16 v5, 0x4e20

    invoke-virtual {p1, v0, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_f5
    :goto_f5
    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->ぁごぐすすぃ:Ljava/lang/String;

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_107

    const p1, 0x7f1101f2

    new-array v0, v3, [Ljava/lang/Object;

    aput-object v4, v0, v2

    invoke-static {p1, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->てぜきぽく(I[Ljava/lang/Object;)V

    :cond_107
    iput-object v4, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->ぁごぐすすぃ:Ljava/lang/String;

    return-void
.end method

.method public final げつ〴ぬぐ()Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;
    .registers 4

    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;

    iget-object v1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->なぎぱいぢぎ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    sget-object v2, Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;->びぐびあび:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    if-ne v1, v2, :cond_9

    return-object v0

    :cond_9
    iget-object v1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->づざかべべ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    if-ne v1, v2, :cond_10

    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;

    return-object v0

    :cond_10
    iget-object v1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->びぐびあび:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    if-ne v1, v2, :cond_16

    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;->〺つふすそ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;

    :cond_16
    return-object v0
.end method

.method public づざかべべ(Z)V
    .registers 3

    if-eqz p1, :cond_10

    sget-object p1, Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;->びぐびあび:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    iput-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->なぎぱいぢぎ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    :cond_6
    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    invoke-virtual {p0}, Lde/blinkt/openvpn/core/DeviceStateReceiver;->げつ〴ぬぐ()Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;

    move-result-object v0

    invoke-interface {p1, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〺つふすそ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;)V

    goto :goto_25

    :cond_10
    invoke-virtual {p0}, Lde/blinkt/openvpn/core/DeviceStateReceiver;->びぐびあび()Z

    move-result p1

    sget-object v0, Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;->〺つふすそ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    iput-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->なぎぱいぢぎ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    invoke-virtual {p0}, Lde/blinkt/openvpn/core/DeviceStateReceiver;->びぐびあび()Z

    move-result v0

    if-eqz v0, :cond_6

    if-nez p1, :cond_6

    iget-object p1, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    invoke-interface {p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->resume()V

    :goto_25
    return-void
.end method

.method public final びぐびあび()Z
    .registers 3

    iget-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->づざかべべ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    sget-object v1, Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;->〺つふすそ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    if-ne v0, v1, :cond_10

    iget-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->なぎぱいぢぎ:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    if-ne v0, v1, :cond_10

    iget-object v0, p0, Lde/blinkt/openvpn/core/DeviceStateReceiver;->びぐびあび:Lde/blinkt/openvpn/core/DeviceStateReceiver$くし〴〺ぅ;

    if-ne v0, v1, :cond_10

    const/4 v0, 0x1

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    :goto_11
    return v0
.end method
