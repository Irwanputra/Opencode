.class public Lde/blinkt/openvpn/core/OpenVPNStatusService$げつ〴ぬぐ$げつ〴ぬぐ;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lde/blinkt/openvpn/core/OpenVPNStatusService$げつ〴ぬぐ;->へぬ〴づぞ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〳ぜぞぜべっ;)Landroid/os/ParcelFileDescriptor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:[Landroid/os/ParcelFileDescriptor;

.field public final synthetic くし〴〺ぅ:[Lde/blinkt/openvpn/core/LogItem;


# direct methods
.method public constructor <init>(Lde/blinkt/openvpn/core/OpenVPNStatusService$げつ〴ぬぐ;Ljava/lang/String;[Landroid/os/ParcelFileDescriptor;[Lde/blinkt/openvpn/core/LogItem;)V
    .registers 5

    iput-object p3, p0, Lde/blinkt/openvpn/core/OpenVPNStatusService$げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:[Landroid/os/ParcelFileDescriptor;

    iput-object p4, p0, Lde/blinkt/openvpn/core/OpenVPNStatusService$げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:[Lde/blinkt/openvpn/core/LogItem;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 7

    new-instance v0, Ljava/io/DataOutputStream;

    new-instance v1, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;

    iget-object v2, p0, Lde/blinkt/openvpn/core/OpenVPNStatusService$げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:[Landroid/os/ParcelFileDescriptor;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-direct {v1, v2}, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    :try_start_f
    sget-object v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ:Ljava/lang/Object;

    monitor-enter v1
    :try_end_12
    .catch Ljava/lang/InterruptedException; {:try_start_f .. :try_end_12} :catch_1d

    :try_start_12
    sget-object v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    monitor-exit v1

    goto :goto_1f

    :goto_19
    monitor-exit v1
    :try_end_1a
    .catchall {:try_start_12 .. :try_end_1a} :catchall_1b

    :try_start_1a
    throw v2
    :try_end_1b
    .catch Ljava/lang/InterruptedException; {:try_start_1a .. :try_end_1b} :catch_1d

    :catchall_1b
    move-exception v2

    goto :goto_19

    .line 1
    :catch_1d
    sget-object v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    .line 2
    :goto_1f
    :try_start_1f
    iget-object v1, p0, Lde/blinkt/openvpn/core/OpenVPNStatusService$げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:[Lde/blinkt/openvpn/core/LogItem;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_23
    if-ge v3, v2, :cond_35

    aget-object v4, v1, v3

    invoke-virtual {v4}, Lde/blinkt/openvpn/core/LogItem;->なぎぱいぢぎ()[B

    move-result-object v4

    array-length v5, v4

    invoke-virtual {v0, v5}, Ljava/io/DataOutputStream;->writeShort(I)V

    invoke-virtual {v0, v4}, Ljava/io/DataOutputStream;->write([B)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_23

    :cond_35
    const/16 v1, 0x7fff

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeShort(I)V

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->close()V
    :try_end_3d
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_3d} :catch_3d

    :catch_3d
    return-void
.end method
