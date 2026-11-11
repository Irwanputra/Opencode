.class public Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;


# direct methods
.method public constructor <init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;)V
    .registers 2

    iput-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ$〺つふすそ;->げつ〴ぬぐ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .registers 6

    .line 1
    sget p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:I

    const-string p1, "\u001e3<K0>M1:K7:KknHc9I4l\u001af<\u001dbfOfi\u00196f\u001acg\u001da:If;I79H1n\u001b7<\u00193m\u001c6<IfhHe=Hjm\u001cagOdl\u001b3>KklN79@dhI0n\u001bbn\u001cgo\u001cgj"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p2, :cond_10

    const/4 v0, 0x0

    goto :goto_22

    :cond_10
    invoke-interface {p2, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1d

    instance-of v1, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ;

    if-eqz v1, :cond_1d

    check-cast v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ;

    goto :goto_22

    :cond_1d
    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ$げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {v0, p2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ$げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Landroid/os/IBinder;)V

    .line 2
    :goto_22
    :try_start_22
    invoke-interface {p2, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p1

    if-nez p1, :cond_6b

    invoke-interface {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ;->ぺぁあねじ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->でどあくず(Ljava/lang/String;)V

    invoke-interface {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ;->は〲ぱなで()Lde/blinkt/openvpn/core/TrafficHistory;

    move-result-object p1

    .line 3
    sput-object p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぺふねづ〺:Lde/blinkt/openvpn/core/TrafficHistory;

    .line 4
    iget-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ$〺つふすそ;->げつ〴ぬぐ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;

    .line 5
    iget-object p1, p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〳ぜぞぜべっ;

    .line 6
    invoke-interface {v0, p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ;->へぬ〴づぞ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〳ぜぞぜべっ;)Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    new-instance p2, Ljava/io/DataInputStream;

    new-instance v0, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    invoke-direct {v0, p1}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    invoke-direct {p2, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {p2}, Ljava/io/DataInputStream;->readShort()S

    move-result p1

    const v0, 0xff38

    new-array v0, v0, [B

    :goto_50
    const/16 v1, 0x7fff

    if-eq p1, v1, :cond_65

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1, p1}, Ljava/io/DataInputStream;->readFully([BII)V

    new-instance v2, Lde/blinkt/openvpn/core/LogItem;

    invoke-direct {v2, v0, p1}, Lde/blinkt/openvpn/core/LogItem;-><init>([BI)V

    invoke-static {v2, v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ざとぅぼこ〺(Lde/blinkt/openvpn/core/LogItem;Z)V

    invoke-virtual {p2}, Ljava/io/DataInputStream;->readShort()S

    move-result p1

    goto :goto_50

    :cond_65
    invoke-virtual {p2}, Ljava/io/DataInputStream;->close()V
    :try_end_68
    .catch Landroid/os/RemoteException; {:try_start_22 .. :try_end_68} :catch_69
    .catch Ljava/io/IOException; {:try_start_22 .. :try_end_68} :catch_69

    goto :goto_6b

    .line 7
    :catch_69
    sget-object p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    :cond_6b
    :goto_6b
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .registers 2

    iget-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ$〺つふすそ;->げつ〴ぬぐ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ごづごきえ;

    invoke-static {p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ごづごきえ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$くし〴〺ぅ;)V

    return-void
.end method
