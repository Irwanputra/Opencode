.class public Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;
.implements Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;


# static fields
.field public static final ぇぬぎばつ:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "L\u3041\u3054\u3050\u3059\u3059\u3043/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3041\u3054\u3050\u3059\u3059\u3043/\u3078\u306c\u3034\u3065\u305e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public final 〺つふすそ:Landroid/os/Handler;

.field public ぁごぐすすぃ:Landroid/net/LocalServerSocket;

.field public いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;

.field public transient おぐぴう〸ず:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ;

.field public くし〴〺ぅ:Landroid/net/LocalSocket;

.field public づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

.field public てぜきぽく:Z

.field public なぎぱいぢぎ:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/io/FileDescriptor;",
            ">;"
        }
    .end annotation
.end field

.field public のぷのちつ:Ljava/lang/Runnable;

.field public びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

.field public へぬ〴づぞ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ$〺つふすそ;

.field public ぺぁあねじ:Landroid/net/LocalSocket;

.field public ぺふねづ〺:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$げつ〴ぬぐ;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    sput-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぇぬぎばつ:Ljava/util/Vector;

    return-void
.end method

.method public constructor <init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;Lde/blinkt/openvpn/core/OpenVPNService;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->なぎぱいぢぎ:Ljava/util/LinkedList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->〳ぜぞぜべっ:Z

    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;->〺つふすそ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;

    iput-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;

    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ$げつ〴ぬぐ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;)V

    iput-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->のぷのちつ:Ljava/lang/Runnable;

    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ$〺つふすそ;

    invoke-direct {v0, p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ$〺つふすそ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;)V

    iput-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->へぬ〴づぞ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ$〺つふすそ;

    iput-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iput-object p2, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    new-instance p1, Landroid/os/Handler;

    invoke-virtual {p2}, Landroid/net/VpnService;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->〺つふすそ:Landroid/os/Handler;

    return-void
.end method

.method public static のぷのちつ()Z
    .registers 4

    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぇぬぎばつ:Ljava/util/Vector;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_4
    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_23

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;

    const-string v3, "signal SIGINT\n"

    invoke-virtual {v1, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    move-result v3
    :try_end_1a
    .catchall {:try_start_4 .. :try_end_1a} :catchall_25

    :try_start_1a
    iget-object v1, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->くし〴〺ぅ:Landroid/net/LocalSocket;

    if-eqz v1, :cond_21

    invoke-virtual {v1}, Landroid/net/LocalSocket;->close()V
    :try_end_21
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_21} :catch_21
    .catchall {:try_start_1a .. :try_end_21} :catchall_25

    :catch_21
    :cond_21
    move v1, v3

    goto :goto_8

    :cond_23
    :try_start_23
    monitor-exit v0

    return v1

    :catchall_25
    move-exception v1

    monitor-exit v0
    :try_end_27
    .catchall {:try_start_23 .. :try_end_27} :catchall_25

    goto :goto_29

    :goto_28
    throw v1

    :goto_29
    goto :goto_28
.end method


# virtual methods
.method public resume()V
    .registers 2

    invoke-virtual {p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぺふねづ〺()V

    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;->〺つふすそ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;

    iput-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;

    return-void
.end method

.method public run()V
    .registers 8

    const/16 v0, 0x800

    new-array v0, v0, [B

    const-string v1, ""

    sget-object v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぇぬぎばつ:Ljava/util/Vector;

    monitor-enter v2

    :try_start_9
    invoke-virtual {v2, p0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    monitor-exit v2
    :try_end_d
    .catchall {:try_start_9 .. :try_end_d} :catchall_ac

    :try_start_d
    iget-object v2, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ:Landroid/net/LocalServerSocket;

    invoke-virtual {v2}, Landroid/net/LocalServerSocket;->accept()Landroid/net/LocalSocket;

    move-result-object v2

    iput-object v2, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->くし〴〺ぅ:Landroid/net/LocalSocket;

    invoke-virtual {v2}, Landroid/net/LocalSocket;->getInputStream()Ljava/io/InputStream;

    move-result-object v2
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_19} :catch_76

    :try_start_19
    iget-object v3, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ:Landroid/net/LocalServerSocket;

    invoke-virtual {v3}, Landroid/net/LocalServerSocket;->close()V
    :try_end_1e
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_1e} :catch_1f

    goto :goto_21

    .line 1
    :catch_1f
    :try_start_1f
    sget-object v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    :goto_21
    const-string v3, "version 3\n"

    .line 2
    invoke-virtual {p0, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    :goto_26
    invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_75

    .line 3
    sget-object v4, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "\u001ae=K3fJ1nN7fL7mM`n@kg\u001b3m\u001a1jNc>Mk"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    .line 4
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4
    :try_end_3e
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_3e} :catch_76

    if-nez v4, :cond_41

    goto :goto_75

    :cond_41
    const/4 v4, 0x0

    :try_start_42
    iget-object v5, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->くし〴〺ぅ:Landroid/net/LocalSocket;

    invoke-virtual {v5}, Landroid/net/LocalSocket;->getAncillaryFileDescriptors()[Ljava/io/FileDescriptor;

    move-result-object v4
    :try_end_48
    .catch Ljava/io/IOException; {:try_start_42 .. :try_end_48} :catch_49

    goto :goto_4b

    .line 5
    :catch_49
    :try_start_49
    sget-object v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    :goto_4b
    if-eqz v4, :cond_52

    .line 6
    iget-object v5, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->なぎぱいぢぎ:Ljava/util/LinkedList;

    invoke-static {v5, v4}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    :cond_52
    new-instance v4, Ljava/lang/String;

    const-string v5, "\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v0, v6, v3, v5}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->〳ぜぞぜべっ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_74
    .catch Ljava/io/IOException; {:try_start_49 .. :try_end_74} :catch_76

    goto :goto_26

    :cond_75
    :goto_75
    return-void

    :catch_76
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Hdn\u001bj;\u001b`n\u001d4i\u001bck@b=A7lL4gMd<\u001bfiIb"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a1

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u001b0lK3fJ`9@e;L4l\u001ac:\u001a1:\u0019g9Ia:A49JciIb>\u001ekm\u001e7;\u0019d=J4kMdn\u001a3mOk=N0<JkjN"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a1

    .line 7
    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    .line 8
    :cond_a1
    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぇぬぎばつ:Ljava/util/Vector;

    monitor-enter v0

    :try_start_a4
    invoke-virtual {v0, p0}, Ljava/util/Vector;->remove(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_a9
    move-exception v1

    monitor-exit v0
    :try_end_ab
    .catchall {:try_start_a4 .. :try_end_ab} :catchall_a9

    throw v1

    :catchall_ac
    move-exception v0

    :try_start_ad
    monitor-exit v2
    :try_end_ae
    .catchall {:try_start_ad .. :try_end_ae} :catchall_ac

    goto :goto_b0

    :goto_af
    throw v0

    :goto_b0
    goto :goto_af
.end method

.method public final 〳ぜぞぜべっ(Ljava/lang/String;)Ljava/lang/String;
    .registers 16

    :goto_0
    const-string v0, "\n"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8b6

    const-string v0, "\\r?\\n"

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aget-object v2, p1, v0

    .line 1
    sget-object v3, Lde/blinkt/openvpn/core/ConnectionStatus;->づざかべべ:Lde/blinkt/openvpn/core/ConnectionStatus;

    sget-object v10, Lde/blinkt/openvpn/core/ConnectionStatus;->いいにぽつ:Lde/blinkt/openvpn/core/ConnectionStatus;

    sget-object v4, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "\u001ae=K3fJ1nN7fL7mM`n@kg\u001b3m\u001a1jNc>Mk"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 2
    invoke-interface {v4, v5, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    const/4 v11, 0x1

    if-nez v4, :cond_2b

    goto/16 :goto_8ab

    :cond_2b
    const-string v4, "ObmKk>@39\u001aejMa=\u001c1g\u001a3kJanNa9Jf>\u0019g"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_860

    const-string v4, "\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_860

    const-string v4, "\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    aget-object v5, v4, v0

    invoke-virtual {v5, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    aget-object v4, v4, v11

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    const/4 v7, 0x4

    const/4 v8, 0x5

    const/16 v9, 0x8

    const/4 v12, 0x3

    sparse-switch v6, :sswitch_data_8b8

    goto/16 :goto_138

    :sswitch_72
    const-string v6, "Ie=Ogm\u001c1lAekHkmMg:Aeg\u0019ekLjn\u001ebmI3"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_84

    goto/16 :goto_138

    :cond_84
    const/16 v5, 0x9

    goto/16 :goto_139

    :sswitch_88
    const-string v6, "H4lJcj@d>\u001cbmKbhIaoJbm\u001cck\u001ba>JfjM4"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9a

    goto/16 :goto_138

    :cond_9a
    const/16 v5, 0x8

    goto/16 :goto_139

    :sswitch_9e
    const-string v6, "Ke>\u001dbiKe=\u001cg;@3iLej\u001b`>Oe;Ocf\u001d6jK4"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b0

    goto/16 :goto_138

    :cond_b0
    const/4 v5, 0x7

    goto/16 :goto_139

    :sswitch_b3
    const-string v6, "\u0019kkH1=Ac=L4f\u001c4nIfkO3;\u001eb<\u001d0mJ69\u001dk"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c4

    goto :goto_138

    :cond_c4
    const/4 v5, 0x6

    goto :goto_139

    :sswitch_c6
    const-string v6, "\u001a0f\u001bghAflI1:A79J7gK6=Ack\u001e0f\u001ajn@g"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d7

    goto :goto_138

    :cond_d7
    const/4 v5, 0x5

    goto :goto_139

    :sswitch_d9
    const-string v6, "Oe;\u001ca<\u00190i\u001d1f\u001ce<Kgn\u001a3<Ig>H7:Od>@j"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_ea

    goto :goto_138

    :cond_ea
    const/4 v5, 0x4

    goto :goto_139

    :sswitch_ec
    const-string v6, "\u001cb:\u001e6g\u001e6<\u001akfOehNc>O4j\u001e6mN7i\u001d0lO7"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_fd

    goto :goto_138

    :cond_fd
    const/4 v5, 0x3

    goto :goto_139

    :sswitch_ff
    const-string v6, "\u001bb:A3<\u001bg9@j=J7i\u0019dm\u0019bhK0>\u001eak\u001dbhOe"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_110

    goto :goto_138

    :cond_110
    const/4 v5, 0x2

    goto :goto_139

    :sswitch_112
    const-string v6, "NgjMdm\u001b4fA4l\u001c7k\u001d`;\u00193g\u001e6i\u001da9\u0019akL0"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_123

    goto :goto_138

    :cond_123
    const/4 v5, 0x1

    goto :goto_139

    :sswitch_125
    const-string v6, "\u001dkh\u001ej<N3fAbg\u001a6hJ6nOjm\u001cb9@gf\u001eb>\u001ac"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_136

    goto :goto_138

    :cond_136
    const/4 v5, 0x0

    goto :goto_139

    :goto_138
    const/4 v5, -0x1

    :goto_139
    const/16 v6, 0x10

    const/4 v13, 0x0

    packed-switch v5, :pswitch_data_8e2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JaoOck@g<N3=Hc:Og<\u001dd;H1kKbm\u001c4=KjjHfh\u001eflM7g\u001e0h\u001b0n\u001ad=LdnAb;\u001dbm\u0019b:N"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_89e

    :pswitch_150
    :try_start_150
    const-string v2, "Hg<\u001cg=M0m@c9K6<O7=\u001adoOc=A3n\u001ec:Ik"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-virtual {v4, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_162

    goto/16 :goto_8ab

    :cond_162
    const/16 v2, 0x27

    invoke-virtual {v4, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    add-int/2addr v3, v11

    invoke-virtual {v4, v2, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    invoke-virtual {v4, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v5, "AdhNaiNk=Og<N6<Kg>\u001bfiM7l\u001ediMek@7=Ngk\u001afl\u0019kjHelN0hN0<@39Mf=@19Oa>\u001b"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1aa

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v4, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lde/blinkt/openvpn/core/ConnectionStatus;->ぺぁあねじ:Lde/blinkt/openvpn/core/ConnectionStatus;

    const-string v2, "KfkN3<\u001d0iM6:\u001cbnMe>\u001cdgO4jL6;\u001a79Kc"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f1102f9

    invoke-static {v2, v0, v3, v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぇ〳〲〺すっ(Ljava/lang/String;Ljava/lang/String;ILde/blinkt/openvpn/core/ConnectionStatus;)V
    :try_end_1a8
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_150 .. :try_end_1a8} :catch_29c

    goto/16 :goto_8ab

    :cond_1aa
    const-string v2, "O0;Ke9Ab<@d<Off\u001cfiA7m@fo\u001d3hA`nHe"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1da

    iget-object v2, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    .line 6
    iget-object v4, v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->な〱ちぉじ:Ljava/util/UUID;

    .line 7
    invoke-static {v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/util/UUID;)Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;

    move-result-object v5

    iget-object v5, v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;->〺つふすそ:Ljava/lang/String;

    invoke-static {v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/util/UUID;)Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;

    move-result-object v4

    iput-object v13, v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;->〺つふすそ:Ljava/lang/String;

    if-eqz v5, :cond_1cd

    goto :goto_1d7

    .line 8
    :cond_1cd
    iget v2, v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:I

    if-eqz v2, :cond_1d5

    if-eq v2, v8, :cond_1d5

    move-object v5, v13

    goto :goto_1d7

    :cond_1d5
    const-string v5, ""

    :goto_1d7
    move-object v2, v13

    move-object v13, v5

    goto :goto_220

    :cond_1da
    const-string v2, "M1j\u001ejlHg>\u001d3o\u001cf9N4;@`=A7<\u001agkHfnMk"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 9
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_206

    iget-object v2, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    .line 10
    iget-object v4, v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->な〱ちぉじ:Ljava/util/UUID;

    .line 11
    invoke-static {v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/util/UUID;)Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;

    move-result-object v5

    iget-object v5, v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;->くし〴〺ぅ:Ljava/lang/String;

    invoke-static {v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/util/UUID;)Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;

    move-result-object v4

    iput-object v13, v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;->くし〴〺ぅ:Ljava/lang/String;

    if-eqz v5, :cond_1fe

    move-object v13, v5

    goto :goto_201

    .line 12
    :cond_1fe
    iget-object v2, v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->〻ぞまぎな〻:Ljava/lang/String;

    move-object v13, v2

    .line 13
    :goto_201
    iget-object v2, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget-object v2, v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->ぉ〲なぱぽた:Ljava/lang/String;

    goto :goto_220

    :cond_206
    const-string v2, "Jk9K`lJ1hIcmHeiI0iLdg\u001dfl\u001djn\u001a1o\u001ck"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_21f

    iget-object v2, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->おぐぴう〸ず:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ;

    if-eqz v2, :cond_21f

    iget-object v13, v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ;->へぬ〴づぞ:Ljava/lang/String;

    iget-object v2, v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ;->のぷのちつ:Ljava/lang/String;

    goto :goto_220

    :cond_21f
    move-object v2, v13

    :goto_220
    if-eqz v13, :cond_24c

    if-eqz v2, :cond_237

    new-array v4, v1, [Ljava/lang/Object;

    aput-object v3, v4, v0

    invoke-static {v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->のぷのちつ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v4, v11

    const-string v2, "username \'%s\' %s\n"

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    :cond_237
    new-array v1, v1, [Ljava/lang/Object;

    aput-object v3, v1, v0

    invoke-static {v13}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->のぷのちつ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v11

    const-string v0, "password \'%s\' %s\n"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    goto/16 :goto_8ab

    :cond_24c
    iget-object v4, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    const v1, 0x7f11022c

    .line 14
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u001bkhI0i\u001d4=Ibo\u001ac9\u001e0f\u001a3;@6;Agn\u0019cjO`"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "Jk:Mk;\u001cj;Hd:\u00191:\u001b`i\u001a`gAbi\u001a4<Md>\u001ed"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2, v1, v10}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぇ〳〲〺すっ(Ljava/lang/String;Ljava/lang/String;ILde/blinkt/openvpn/core/ConnectionStatus;)V

    invoke-virtual {v4, v1}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v1}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v6

    const-wide/16 v8, 0x0

    const-string v7, "K0h\u00196i@e9\u0019j>\u001bdi\u0019e9A1gJgh\u001b3iOjg\u001dj"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v4 .. v10}, Lde/blinkt/openvpn/core/OpenVPNService;->ながふずは(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLde/blinkt/openvpn/core/ConnectionStatus;)V

    new-array v1, v11, [Ljava/lang/Object;

    aput-object v3, v1, v0

    const-string v0, "Openvpn requires Authentication type \'%s\' but no password/key information available"

    .line 15
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2aa

    :catch_29c
    const-string v0, "\u001acgJkjNg=A7iHaiN6h\u001a`m\u001ajm\u001a6h\u001aa:\u001cbnJbk\u001b`>\u001e7lMff\u001bbn\u001a6;NalO3oO3kMc;\u001ebkOgm\u001dbk@fmKc<Kal@4hOjhKk=Kb9Ad="

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2aa
    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    goto/16 :goto_8ab

    :pswitch_2af
    const/16 v1, 0x2c

    .line 16
    invoke-virtual {v4, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    add-int/2addr v1, v11

    invoke-virtual {v4, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v2, v3, v0, v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぶでにく〼〳(JJ)V

    goto/16 :goto_8ab

    :pswitch_2cb
    const-string v2, "\u0019j>A7;K4:\u001a6:@79IbkJ7fO3g\u00190hAbjO3"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 17
    invoke-virtual {v4, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    aget-object v3, v2, v11

    const-string v4, "NjjMeh\u001d3>A3iOb9@g:N1oH0mHfoJ0:Igk\u001b09A`<MkoH19Ng;AgiH7nNbf\u001agoOc>\u0019"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget-object v5, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    aget-object v2, v2, v0

    .line 18
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    iget v7, v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:I

    if-ne v7, v9, :cond_329

    .line 19
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_302

    goto/16 :goto_411

    :cond_302
    :try_start_302
    iget-object v3, v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->びぐびあび:Ljava/lang/String;

    invoke-static {v5, v13, v3, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->せだてはぺて(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[B)[B

    move-result-object v0
    :try_end_308
    .catch Landroid/security/KeyChainException; {:try_start_302 .. :try_end_308} :catch_30c
    .catch Ljava/lang/InterruptedException; {:try_start_302 .. :try_end_308} :catch_30a

    goto/16 :goto_412

    :catch_30a
    move-exception v2

    goto :goto_30d

    :catch_30c
    move-exception v2

    :goto_30d
    const v3, 0x7f110114

    new-array v4, v12, [Ljava/lang/Object;

    aput-object v13, v4, v0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v11

    invoke-virtual {v2}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v1

    invoke-static {v3, v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぺぁあねじ(I[Ljava/lang/Object;)V

    goto/16 :goto_411

    .line 20
    :cond_329
    iget-object v4, v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->ぎきぁ〱ぢ:Ljava/security/PrivateKey;

    .line 21
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const v7, 0x7f110119

    if-ne v5, v6, :cond_3a1

    .line 22
    :try_start_332
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v5

    const-string v6, "Jj>Nf;N`jO7:I4lK6k\u0019ei\u001d7nLcjKblMk"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-array v8, v0, [Ljava/lang/Class;

    invoke-virtual {v5, v6, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v11}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    new-array v6, v0, [Ljava/lang/Object;

    invoke-virtual {v5, v4, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v5, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    const-string v6, "HfoHfj@7k\u001bb;Kf:Ia>Kfl\u001dah\u001ea>LgiO4"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-array v8, v0, [Ljava/lang/Class;

    invoke-virtual {v5, v6, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v11}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    new-array v6, v0, [Ljava/lang/Object;

    invoke-virtual {v5, v4, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v5, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    invoke-static {v2, v4, v3}, Lde/blinkt/openvpn/core/NativeUtils;->rsasign([BIZ)[B

    move-result-object v0
    :try_end_380
    .catch Ljava/lang/NoSuchMethodException; {:try_start_332 .. :try_end_380} :catch_38a
    .catch Ljava/security/InvalidKeyException; {:try_start_332 .. :try_end_380} :catch_388
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_332 .. :try_end_380} :catch_386
    .catch Ljava/lang/IllegalAccessException; {:try_start_332 .. :try_end_380} :catch_384
    .catch Ljava/lang/IllegalArgumentException; {:try_start_332 .. :try_end_380} :catch_382

    goto/16 :goto_412

    :catch_382
    move-exception v2

    goto :goto_38b

    :catch_384
    move-exception v2

    goto :goto_38b

    :catch_386
    move-exception v2

    goto :goto_38b

    :catch_388
    move-exception v2

    goto :goto_38b

    :catch_38a
    move-exception v2

    :goto_38b
    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-virtual {v2}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v11

    invoke-static {v7, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぺぁあねじ(I[Ljava/lang/Object;)V

    goto :goto_411

    .line 23
    :cond_3a1
    :try_start_3a1
    invoke-interface {v4}, Ljava/security/PrivateKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v5

    const-string v6, "Igg\u001daj\u001bdfJgh@glIa>\u001bd:Ib9O7k@1=@j"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3ce

    const-string v3, "Laj\u0019a9N0;JeoHb=J`kJ0oN6h\u001d1:OcnNd"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    invoke-virtual {v3, v2}, Ljava/security/Signature;->update([B)V

    invoke-virtual {v3}, Ljava/security/Signature;->sign()[B

    move-result-object v0

    goto :goto_412

    :cond_3ce
    if-eqz v3, :cond_3db

    const-string v3, "K`nL1>\u001e3hNe>\u001edh\u0019bn\u001a7:I`g\u001dgo\u001cdiLfhJboI`<I09O`>MffNd9@ah\u001d0>L6fLgi\u001e"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_3e5

    :cond_3db
    const-string v3, "M`<@coK4:@f:Ak:HcnKj=\u001c`mI7;\u001d6h\u0019j;Ofh\u0019fo@1;\u001bj>Lk>Aa>\u0019fiO7;\u001bkj\u001eejI"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_3e5
    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    invoke-virtual {v3, v11, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    invoke-virtual {v3, v2}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0
    :try_end_3f0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_3a1 .. :try_end_3f0} :catch_3fb
    .catch Ljava/security/InvalidKeyException; {:try_start_3a1 .. :try_end_3f0} :catch_3f9
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_3a1 .. :try_end_3f0} :catch_3f7
    .catch Ljavax/crypto/BadPaddingException; {:try_start_3a1 .. :try_end_3f0} :catch_3f5
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_3a1 .. :try_end_3f0} :catch_3f3
    .catch Ljava/security/SignatureException; {:try_start_3a1 .. :try_end_3f0} :catch_3f1

    goto :goto_412

    :catch_3f1
    move-exception v2

    goto :goto_3fc

    :catch_3f3
    move-exception v2

    goto :goto_3fc

    :catch_3f5
    move-exception v2

    goto :goto_3fc

    :catch_3f7
    move-exception v2

    goto :goto_3fc

    :catch_3f9
    move-exception v2

    goto :goto_3fc

    :catch_3fb
    move-exception v2

    :goto_3fc
    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-virtual {v2}, Ljava/security/GeneralSecurityException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v11

    invoke-static {v7, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぺぁあねじ(I[Ljava/lang/Object;)V

    :goto_411
    move-object v0, v13

    :goto_412
    if-eqz v0, :cond_418

    .line 24
    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v13

    :cond_418
    const-string v0, "\nEND\n"

    const-string v1, "pk-sig\n"

    .line 25
    invoke-virtual {p0, v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    if-nez v13, :cond_429

    invoke-virtual {p0, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    invoke-static {}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->のぷのちつ()Z

    goto/16 :goto_8ab

    :cond_429
    invoke-virtual {p0, v13}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    invoke-virtual {p0, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    goto/16 :goto_8ab

    .line 26
    :pswitch_431
    iget-boolean v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->てぜきぽく:Z

    if-nez v0, :cond_8ab

    const-string v0, "\u0019j>A7;K4:\u001a6:@79IbkJ7fO3g\u00190hAbjO3"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 27
    invoke-virtual {v4, v0, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    aget-object v2, v0, v11

    aget-object v3, v0, v1

    const-string v4, "M4h@clI7<H6m\u001eelKgi\u001ebk\u001ackNj=\u001e1mHj"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_45a

    const-string v0, ""

    goto :goto_45c

    :cond_45a
    aget-object v0, v0, v1

    :goto_45c
    invoke-static {v2, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぉ〲なぱぽた(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_8ab

    .line 28
    :pswitch_461
    sget-object v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;

    const-string v5, "\u0019j>A7;K4:\u001a6:@79IbkJ7fO3g\u00190hAbjO3"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;->〺つふすそ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;

    aget-object v6, v4, v0

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    sub-int/2addr v6, v11

    iget-object v7, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget-object v7, v7, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->えがぐせほち:[Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ;

    array-length v8, v7

    if-le v8, v6, :cond_48e

    aget-object v6, v7, v6

    iget-object v7, v6, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ;->ぺぁあねじ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;

    iget-object v13, v6, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ;->いいにぽつ:Ljava/lang/String;

    iget-object v8, v6, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ;->ぺふねづ〺:Ljava/lang/String;

    iget-boolean v9, v6, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ;->てぜきぽく:Z

    iput-object v6, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->おぐぴう〸ず:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ;

    goto :goto_4ac

    :cond_48e
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v8, "\u001dckH6k\u001e0g\u001dj;Oeh\u001dg<N49\u001cbm\u001d4mHb<LjfJjj\u001bg>JaoAgfKghN3f\u00196fManHjn\u001c6:OfnJk9\u001e0jHjn\u001dbfM4;@b=Jdm@en\u0019e>I7<Ljg\u001dco\u001b4<Heh\u001egoK4mN0oL1hI4lI1h@4<KcoId9L3fJ0k\u001ed;J0;\u001djmNfo\u001e6m\u001ec:K"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-array v9, v11, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v9, v0

    invoke-static {v7, v8, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    const/4 v9, 0x0

    move-object v7, v5

    move-object v8, v13

    :goto_4ac
    if-ne v7, v5, :cond_511

    iget-object v5, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    .line 29
    :try_start_4b0
    new-instance v6, Ljava/net/URL;

    const-string v10, "\u001a1kJ`9K3kO4kJek\u001bco\u001b7fAc;J`l@elOf"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v12, v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->〴ねぷぐくぼ:Ljava/lang/String;

    aput-object v12, v1, v0

    iget-object v5, v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->はつきどっ:Ljava/lang/String;

    aput-object v5, v1, v11

    invoke-static {v10, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぉひのべい(Ljava/net/URL;)Ljava/net/Proxy;

    move-result-object v1

    if-nez v1, :cond_4d4

    goto :goto_4fc

    :cond_4d4
    invoke-virtual {v1}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v1

    instance-of v5, v1, Ljava/net/InetSocketAddress;
    :try_end_4da
    .catch Ljava/net/MalformedURLException; {:try_start_4b0 .. :try_end_4da} :catch_4ed
    .catch Ljava/net/URISyntaxException; {:try_start_4b0 .. :try_end_4da} :catch_4dd

    if-eqz v5, :cond_4fc

    goto :goto_4fd

    :catch_4dd
    move-exception v1

    new-array v5, v11, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/net/URISyntaxException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v5, v0

    const v1, 0x7f110151

    invoke-static {v1, v5}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぺぁあねじ(I[Ljava/lang/Object;)V

    goto :goto_4fc

    :catch_4ed
    move-exception v1

    const v5, 0x7f110151

    new-array v6, v11, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/net/MalformedURLException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v6, v0

    invoke-static {v5, v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぺぁあねじ(I[Ljava/lang/Object;)V

    :cond_4fc
    :goto_4fc
    const/4 v1, 0x0

    .line 30
    :goto_4fd
    instance-of v5, v1, Ljava/net/InetSocketAddress;

    if-eqz v5, :cond_511

    check-cast v1, Ljava/net/InetSocketAddress;

    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    move-object v7, v2

    goto :goto_512

    :cond_511
    move v0, v9

    :goto_512
    array-length v1, v4

    const/4 v5, 0x2

    if-lt v1, v5, :cond_538

    if-ne v7, v2, :cond_538

    aget-object v1, v4, v11

    const-string v2, "\u001a7;Lb:Mjg\u001cfk@eh\u001ejkL1oH`l\u00194f@0gIa"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_538

    const-string v1, "\u001a6o\u001c0j\u001e0:\u001b1>Ka=\u001e6;\u001ca=J7>H1>Ac<\u001djf\u001ckg\u001a6:\u00196<HfkKboMki\u00193o\u001ejkAcj\u001a39Ng:Kfl\u001b7hNjg\u001ecoNjj\u001bffJd>Jd:Kfg\u001d6g\u001c6:\u0019a<\u001a4l\u001d4mK6o\u001bfkI6f\u001ejm\u001e7j\u001cakL3"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->のぷのちつ(Ljava/lang/String;)V

    const/4 v13, 0x0

    :cond_538
    sget-object v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;

    if-ne v7, v1, :cond_5e9

    const-string v0, "Mc=Id>\u001aa=J6f\u00190o\u001bdi\u001cd;\u0019afHciMamMa"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Jeg\u001c1fJ7fJ7g\u001a7hKak\u001d6g\u001dd<@0mK09Jf;I1fL19\u001ba9\u001bk:J3j\u001d3;\u001damAg;Kb<\u001djh@"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f11030d

    invoke-static {v0, v1, v2, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぇ〳〲〺すっ(Ljava/lang/String;Ljava/lang/String;ILde/blinkt/openvpn/core/ConnectionStatus;)V

    invoke-static {}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->〺つふすそ()Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;

    move-result-object v0

    iget-object v1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-static {v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->げつ〴ぬぐ(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_56f

    const-string v1, "O3kJa;\u00193hNb;\u001aglKk:H6i\u0019b;MklHagJekK3nHblLajJehI`m\u001efjKbh\u001bk;\u001c4n\u00197lA3f\u001aelM`nHf9\u001e1j\u001e3nI1h\u001d6gO`oI3nHa:"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    :cond_56f
    iget-object v1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->〺つふすそ:Landroid/os/Handler;

    iget-object v2, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->のぷのちつ:Ljava/lang/Runnable;

    const-wide/16 v3, 0x4e20

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object v1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    iget-object v2, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->へぬ〴づぞ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ$〺つふすそ;

    .line 31
    monitor-enter v0

    :try_start_57d
    iget-object v3, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->〺つふすそ:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    if-nez v3, :cond_5a3

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->くし〴〺ぅ:Landroid/content/BroadcastReceiver;

    new-instance v5, Landroid/content/IntentFilter;

    const-string v6, "NfkHc9@3<J6iL3g\u0019c9\u00190oO6nO4k\u001eg9\u001dajHf9IekA3mHjg\u001e`n\u001b`;\u001ekkI7>\u001e4gK4iMfhN1f\u001dd=\u001e1i@3m\u001afhIdg\u001aajIb>JcfOkl"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iput-object v3, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->げつ〴ぬぐ:Landroid/content/Context;

    :cond_5a3
    invoke-static {v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->げつ〴ぬぐ(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_5ac

    invoke-interface {v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ$〺つふすそ;->びぐびあび()V

    :cond_5ac
    iget-object v1, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->〺つふすそ:Ljava/util/Set;

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_5b1
    .catchall {:try_start_57d .. :try_end_5b1} :catchall_5e6

    monitor-exit v0

    .line 32
    iget-object v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->げつ〴ぬぐ:Landroid/content/Context;

    .line 33
    new-instance v1, Landroid/content/Intent;

    const-string v2, "NfkHc9@3<J6iL3g\u0019c9\u00190oO6nO4k\u001eg9\u001dajHf9IekA3mHjg\u001e`n\u001b`;\u001ekkI7>\u001e4gK4iMdf\u001b4jA`:M4oJffK79LakMg>Ne=\u001c0nHei"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "NfkHc9@3<J6iL3g\u0019c9\u00190oO6nO4k\u001eg9\u001damLfo\u001e`k\u001e`gM`9\u001e7>\u0019eg\u0019`>Nd:O6o\u001e`n\u001e"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "NfkHc9@3<J6iL3g\u0019c9\u00190oO6nO4k\u001eg9\u001dal\u001bdlHai\u001a7oO4fK`kN7lO`<M3fN69\u001ebh\u001ag;\u001ed<OahI09\u00190<IcgM`l\u001b`oKbfO`o\u001bjiIag\u001abgO3nN7i\u001bk<\u0019ek\u001c7m\u0019`;\u001cbg\u001edk@6"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 34
    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto/16 :goto_8ab

    :catchall_5e6
    move-exception p1

    .line 35
    monitor-exit v0

    throw p1

    .line 36
    :cond_5e9
    invoke-virtual {p0, v7, v13, v8, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->てぜきぽく(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_8ab

    .line 37
    :pswitch_5ee
    iput-boolean v11, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->〳ぜぞぜべっ:Z

    .line 38
    iget-object v1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぺふねづ〺:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$げつ〴ぬぐ;

    if-nez v1, :cond_5f6

    const/4 v1, 0x0

    goto :goto_5fc

    :cond_5f6
    check-cast v1, Lde/blinkt/openvpn/core/DeviceStateReceiver;

    .line 39
    invoke-virtual {v1}, Lde/blinkt/openvpn/core/DeviceStateReceiver;->びぐびあび()Z

    move-result v1

    :goto_5fc
    if-eqz v1, :cond_624

    const/4 v1, 0x2

    .line 40
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const v4, 0x7f11030c

    const-string v5, "Ie<JefJ4f\u0019k9@4gK3:\u001d3=\u001b4<M3fI0>Hc"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2, v4, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぇ〳〲〺すっ(Ljava/lang/String;Ljava/lang/String;ILde/blinkt/openvpn/core/ConnectionStatus;)V

    new-instance v2, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/おぐぴう〸ず/げつ〴ぬぐ;

    new-instance v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/おぐぴう〸ず;

    invoke-direct {v3, p0, v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/おぐぴう〸ず;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;I)V

    invoke-direct {v2, v3}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/おぐぴう〸ず/げつ〴ぬぐ;-><init>(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/おぐぴう〸ず/〺つふすそ;)V

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v2, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto/16 :goto_8ab

    :cond_624
    iget-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->〻ぞまぎな〻(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;)V

    goto/16 :goto_8ab

    .line 41
    :pswitch_62b
    sget-object v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    const-string v2, "\u0019j>A7;K4:\u001a6:@79IbkJ7fO3g\u00190hAbjO3"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v2

    aget-object v3, v2, v11

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/16 v5, 0x44

    if-eq v4, v5, :cond_68e

    const/16 v5, 0x46

    if-eq v4, v5, :cond_67b

    const/16 v5, 0x49

    if-eq v4, v5, :cond_668

    const/16 v5, 0x57

    if-eq v4, v5, :cond_655

    goto :goto_69e

    :cond_655
    const-string v4, "Jbh\u001c`j\u001ea9Je9M1hHdhOfmAem\u001dbjIffN6"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_666

    goto :goto_69e

    :cond_666
    const/4 v3, 0x3

    goto :goto_6a1

    :cond_668
    const-string v4, "JghJjn\u00191m\u001bdoA0<NfhK6>He;\u001dgn\u00193;\u001ej"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_679

    goto :goto_69e

    :cond_679
    const/4 v3, 0x2

    goto :goto_6a1

    :cond_67b
    const-string v4, "I4o\u001b4;JemIakK4:H0oHa<\u0019ajNjoH`f\u001dd"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_68c

    goto :goto_69e

    :cond_68c
    const/4 v3, 0x1

    goto :goto_6a1

    :cond_68e
    const-string v4, "Ach\u001b3;MjnAd;JjfAe<NbiA3iHfmLboHg"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6a0

    :goto_69e
    const/4 v3, -0x1

    goto :goto_6a1

    :cond_6a0
    const/4 v3, 0x0

    :goto_6a1
    if-eqz v3, :cond_6ae

    if-eq v3, v11, :cond_6ab

    if-eq v3, v12, :cond_6a8

    goto :goto_6b0

    :cond_6a8
    sget-object v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    goto :goto_6b0

    :cond_6ab
    sget-object v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    goto :goto_6b0

    :cond_6ae
    sget-object v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->なぎぱいぢぎ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    :goto_6b0
    const/4 v3, 0x2

    aget-object v3, v2, v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    and-int/lit8 v3, v3, 0xf

    aget-object v2, v2, v12

    const-string v4, "Ha;M3<I0iHa;M6lLckMcoMcf\u001e7mJajHa"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6cf

    invoke-static {v7, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 42
    :cond_6cf
    sget-object v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    new-instance v4, Lde/blinkt/openvpn/core/LogItem;

    invoke-direct {v4, v1, v3, v2}, Lde/blinkt/openvpn/core/LogItem;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;ILjava/lang/String;)V

    .line 43
    invoke-static {v4, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ざとぅぼこ〺(Lde/blinkt/openvpn/core/LogItem;Z)V

    goto/16 :goto_8ab

    :pswitch_6db
    const-string v1, "Kai\u001a1mM3fAclAbm\u001a1;@6nH6<\u0019c:I49\u001c7"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 44
    invoke-virtual {v4, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_71a

    const-string v1, "@1;\u0019fjM4mA3m\u001d6=@dnO19H`m\u001a7o@09Hg"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6fc

    goto :goto_71a

    :cond_6fc
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "@0i\u001d69Oa<MgnLknO1=\u001ca<Obn\u00190>K3nN7;\u001b0nI`<J7nN0j\u001b4>\u001e`nH`nNa:@kg\u001e6<K"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぁごぐすすぃ(Ljava/lang/String;)V

    goto/16 :goto_8ab

    :cond_71a
    :goto_71a
    iget-object v1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v4, v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    aget-object v3, v3, v0

    const-string v5, "\u001ba=\u001e3>JeiAgf\u001ad;@1;\u001bdnN6iA0hAaf\u00193"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/net/VpnService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/app/NotificationManager;

    new-instance v7, Landroid/app/Notification$Builder;

    invoke-direct {v7, v1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v7, v11}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    const v8, 0x108009b

    invoke-virtual {v7, v8}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    const-string v8, "H1gNjk\u001b3j\u001c`hL1;Ae:IalM7n\u001ckk\u0019j=Ic"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_78e

    const/4 v3, 0x2

    invoke-virtual {v4, v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v2

    aget-object v2, v2, v11

    const v3, 0x7f11021a

    invoke-virtual {v1, v3}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    invoke-virtual {v7, v2}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    new-instance v4, Landroid/content/Intent;

    const-string v8, "L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4fNj<Hkh\u001d4mJjkKb>Lg=A0>\u001c19Jb:\u001ed;\u0019"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v4, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/high16 v2, 0x10000000

    invoke-virtual {v4, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_7e9

    :cond_78e
    const-string v8, "\u001dk>H3:JalJk:H3g\u001abhJ0mJ`<I`=KdnHg"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_83f

    const/4 v3, 0x2

    invoke-virtual {v4, v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v2

    aget-object v2, v2, v11

    const v3, 0x7f1100c5

    invoke-virtual {v1, v3}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    invoke-virtual {v7, v2}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    new-instance v8, Landroid/content/ComponentName;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Landroid/net/VpnService;->getPackageName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "\u001cg:AbnL1=JfkH1<\u001e0n\u001e1k\u0019joK3f\u001949\u001ejnJknHciN`mNkjJ4iMj:MdfI4g\u0019eiN6iO"

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v1, v9}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v4, v8}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string v8, "Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bj\u0019g9\u001eeiA3kKfoHeg@fk\u001bb9Nk>\u001bfoJj:IggL0iI7fJ0kNgnL`jOdmL7>I0:\u00190nAkf"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :goto_7e9
    invoke-static {v1, v0, v4, v0}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    const-string v2, "\u001d1:\u00197h\u001a1=@j;\u001d0:Ibk\u001b3lLgf\u0019aj@4:L4"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v8, "J19\u001a3k@`<L09KcjHbmJ6hL0;\u001e0:K6mK`g\u001caf@g9LfkN6k\u001eej@gg\u001d6o\u00196f\u001dkm\u001909O"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v2, v8, v3, v10, v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->びえぁぜい(Ljava/lang/String;Ljava/lang/String;ILde/blinkt/openvpn/core/ConnectionStatus;Landroid/content/Intent;)V

    invoke-virtual {v7, v0}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v6, :cond_80f

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v7}, Lde/blinkt/openvpn/core/OpenVPNService;->ぇとしたべど(ILandroid/app/Notification$Builder;)V

    :cond_80f
    const/16 v1, 0x15

    if-lt v0, v1, :cond_823

    const-string v1, "LcgL7<\u0019a>OjmO6jHkiAe>@a;\u001aa=KkjH1"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 46
    invoke-virtual {v7, v1}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    invoke-virtual {v7, v11}, Landroid/app/Notification$Builder;->setLocalOnly(Z)Landroid/app/Notification$Builder;

    :cond_823
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_834

    const-string v0, "Kdl\u001cdiH0:AfnJ6kJemI4oAfmN6f@0j\u001af"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 47
    invoke-virtual {v7, v0}, Landroid/app/Notification$Builder;->setChannelId(Ljava/lang/String;)Landroid/app/Notification$Builder;

    :cond_834
    invoke-virtual {v7}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;

    move-result-object v0

    const v1, -0x160fa7e2

    invoke-virtual {v5, v1, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    goto :goto_8ab

    :cond_83f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "A6l\u001ajkN7>K7o\u001bgn\u001d3;I6iA3j\u001d4nNj<\u001ej;K1;KkoL1:\u001bg>\u001b1oL1oA`jL4i\u0019b>\u001eagI"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    goto :goto_8ab

    .line 48
    :pswitch_85c
    invoke-virtual {p0, v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぺぁあねじ(Ljava/lang/String;)V

    goto :goto_8ab

    :cond_860
    const-string v0, "\u001d7iMfl@4;Af9\u001dgfM1lLj:\u001bjlNe:Ncl\u001ef"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_871

    goto :goto_8ab

    :cond_871
    const-string v0, "Okf@d>O1jK4i\u001e`<Jj>\u001abg\u001dc=IkiAd:\u001bg"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_88f

    iget-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->なぎぱいぢぎ:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/FileDescriptor;

    if-eqz v0, :cond_8ab

    invoke-virtual {p0, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->いいにぽつ(Ljava/io/FileDescriptor;)V

    goto :goto_8ab

    :cond_88f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JaoOck@g<N3=Hc:Og<\u001dd;H1kKbm\u001c4=Kj:\u001c4:\u001e0oKchL4:O0jNf>\u001efh\u001c3o\u0019jf\u001ae=\u001b1kMcg\u0019`o\u001ba<K6<Ncl\u001e`9HbgJ7mI4jJ0;"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_89e
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぉざぅち〻(Ljava/lang/String;)V

    .line 49
    :cond_8ab
    :goto_8ab
    :pswitch_8ab
    array-length v0, p1

    if-ne v0, v11, :cond_8b2

    const-string p1, ""

    goto/16 :goto_0

    :cond_8b2
    aget-object p1, p1, v11

    goto/16 :goto_0

    :cond_8b6
    return-object p1

    nop

    :sswitch_data_8b8
    .sparse-switch
        -0x682f9d8d -> :sswitch_125
        -0x613f980d -> :sswitch_112
        0x12724 -> :sswitch_ff
        0x21ecbf -> :sswitch_ec
        0x225cae -> :sswitch_d9
        0x48dd24e -> :sswitch_c6
        0x4b8cc71 -> :sswitch_b3
        0xd4f8981 -> :sswitch_9e
        0x2c0c64e7 -> :sswitch_88
        0x772faa9b -> :sswitch_72
    .end sparse-switch

    :pswitch_data_8e2
    .packed-switch 0x0
        :pswitch_85c
        :pswitch_6db
        :pswitch_62b
        :pswitch_5ee
        :pswitch_8ab
        :pswitch_461
        :pswitch_431
        :pswitch_2cb
        :pswitch_2af
        :pswitch_150
    .end packed-switch
.end method

.method public 〺つふすそ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;)V
    .registers 3

    iput-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;

    .line 1
    iget-boolean v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->〳ぜぞぜべっ:Z

    if-nez v0, :cond_c

    const-string p1, "signal SIGUSR1\n"

    invoke-virtual {p0, p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    goto :goto_f

    :cond_c
    invoke-static {p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->〻ぞまぎな〻(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$〺つふすそ;)V

    :goto_f
    return-void
.end method

.method public ぁごぐすすぃ(Ljava/lang/String;)Z
    .registers 3

    :try_start_0
    iget-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->くし〴〺ぅ:Landroid/net/LocalSocket;

    if-eqz v0, :cond_22

    invoke-virtual {v0}, Landroid/net/LocalSocket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    if-eqz v0, :cond_22

    iget-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->くし〴〺ぅ:Landroid/net/LocalSocket;

    invoke-virtual {v0}, Landroid/net/LocalSocket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    iget-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->くし〴〺ぅ:Landroid/net/LocalSocket;

    invoke-virtual {p1}, Landroid/net/LocalSocket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_20
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_20} :catch_22

    const/4 p1, 0x1

    return p1

    :catch_22
    :cond_22
    const/4 p1, 0x0

    return p1
.end method

.method public final いいにぽつ(Ljava/io/FileDescriptor;)V
    .registers 6

    :try_start_0
    const-class v0, Ljava/io/FileDescriptor;

    const-string v1, "\u001abjL09\u001ejkOej\u001de:Ak>\u001c0kJ6h\u001e7hI7;L`"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-virtual {v1, v0}, Landroid/net/VpnService;->protect(I)Z

    move-result v1

    if-nez v1, :cond_34

    const-string v1, "Aj:\u001djjH`gJcl\u001b4m\u001e`lO0nNdj\u001ajkIgkI3oNf;Mk=@b9\u001b0oNe:Lj<Hdj\u001cf9Ic:\u001e`9\u001a"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぉざぅち〻(Ljava/lang/String;)V

    :cond_34
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_3e

    invoke-virtual {p0, p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->なぎぱいぢぎ(Ljava/io/FileDescriptor;)V

    goto :goto_41

    :cond_3e
    invoke-static {v0}, Lde/blinkt/openvpn/core/NativeUtils;->jniclose(I)V
    :try_end_41
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_41} :catch_42
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_41} :catch_42
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_41} :catch_42
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_41} :catch_42
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_41} :catch_42

    :goto_41
    return-void

    :catch_42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Kj=H4mOg9Lj=\u001edgKenAek@f9JgnL0oO7mN4kOj>IglHd;\u001bcfLal\u001cfiH6=\u001bei\u001e6iH3>Ad:Nc;\u001c6:\u001a`lJg=\u001a0h\u001b6gN0mNa>\u001aak"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1
    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Kj=H4mOg9Lj=\u001edgKenAek@f9JgnL0oO7mN4kOj>IglHd;\u001bcfLal\u001cfiH6=\u001bei\u001e6iH`jM`;N1h\u001dc>\u001cf9N7;\u001eki@a;N39K`>Jco"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    return-void
.end method

.method public くし〴〺ぅ(Z)V
    .registers 3

    iget-boolean v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->〳ぜぞぜべっ:Z

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぺふねづ〺()V

    goto :goto_12

    :cond_8
    if-eqz p1, :cond_d

    const-string p1, "network-change samenetwork\n"

    goto :goto_f

    :cond_d
    const-string p1, "network-change\n"

    :goto_f
    invoke-virtual {p0, p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    :goto_12
    return-void
.end method

.method public げつ〴ぬぐ(Z)Z
    .registers 4

    invoke-static {}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->のぷのちつ()Z

    move-result p1

    if-eqz p1, :cond_1d

    const/4 v0, 0x1

    iput-boolean v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->てぜきぽく:Z

    new-instance v0, Ljava/io/File;

    .line 1
    sget-object v1, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 2
    invoke-static {v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぇ〳〲〺すっ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1d

    :try_start_1a
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1d} :catch_1d

    :catch_1d
    :cond_1d
    return p1
.end method

.method public づざかべべ(Ljava/lang/String;)V
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Lf=Ok;@`o\u001aahKe9\u0019kmJ49\u001aj<J`k\u0019g9\u001a4"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    return-void
.end method

.method public final てぜきぽく(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;Ljava/lang/String;Ljava/lang/String;Z)V
    .registers 11

    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;->〺つふすそ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;

    if-eq p1, v0, :cond_52

    if-eqz p2, :cond_52

    const v0, 0x7f110358

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const/4 v4, 0x1

    aput-object p3, v2, v4

    invoke-static {v0, v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->てぜきぽく(I[Ljava/lang/Object;)V

    if-eqz p4, :cond_22

    const-string p4, "\u001a1oA`kJci\u0019c<\u001c4hJdi\u001bj>Ma>\u001ekoOg:J1"

    invoke-static {p4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    goto :goto_24

    :cond_22
    const-string p4, ""

    :goto_24
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    sget-object v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;

    if-ne p1, v5, :cond_38

    const-string p1, "Oe=\u001e`;HfoI3i\u001belM39McmMblJ3;Ig<L7"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_42

    :cond_38
    const-string p1, "Od<Kg;\u001bjlH4mNko\u0019`l\u001a7h\u001dffK0iK6nHb"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_42
    aput-object p1, v2, v3

    aput-object p2, v2, v4

    aput-object p3, v2, v1

    const/4 p1, 0x3

    aput-object p4, v2, p1

    const-string p1, "proxy %s %s %s%s\n"

    invoke-static {v0, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_54

    :cond_52
    const-string p1, "proxy NONE\n"

    :goto_54
    invoke-virtual {p0, p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    return-void
.end method

.method public final なぎぱいぢぎ(Ljava/io/FileDescriptor;)V
    .registers 4

    :try_start_0
    invoke-static {p1}, Landroid/system/Os;->close(Ljava/io/FileDescriptor;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_3} :catch_4

    goto :goto_2b

    :catch_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Nj9J7n\u001c3;A0oN7iKkiJfnJcnN7:\u0019cjA`gHjmAkh\u001ae>O3m\u001dghOff\u001bg:Hah@`o\u001eckO"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1
    sget-object p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    :goto_2b
    return-void
.end method

.method public びぐびあび(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$げつ〴ぬぐ;)V
    .registers 2

    iput-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぺふねづ〺:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ$げつ〴ぬぐ;

    return-void
.end method

.method public final ぺぁあねじ(Ljava/lang/String;)V
    .registers 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const/16 v2, 0x27

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, 0x1

    add-int/2addr v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x2

    invoke-virtual {v0, v3, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v5

    aget-object v5, v5, v4

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v6

    const/4 v8, 0x0

    sparse-switch v6, :sswitch_data_a24

    goto/16 :goto_f8

    :sswitch_32
    const-string v6, "\u001e1g@0;A`:H6=Ico\u001b1jA1nLgm\u001bklM4fKb"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_44

    goto/16 :goto_f8

    :cond_44
    const/16 v6, 0x9

    goto/16 :goto_f9

    :sswitch_48
    const-string v6, "NjgMjf\u001abh\u001ck:H`i\u001a0mH3;N7mA19\u001ebf\u0019ao\u001a3o\u001da>AdlHeiMe=Ie>Ieo\u001ac<\u001e6hI7jM"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5a

    goto/16 :goto_f8

    :cond_5a
    const/16 v6, 0x8

    goto/16 :goto_f9

    :sswitch_5e
    const-string v6, "Ag:L`m\u001c0f\u001e4i\u001a`k\u001agl\u001abn\u001b0=@d<\u00197mKk"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_70

    goto/16 :goto_f8

    :cond_70
    const/4 v6, 0x7

    goto/16 :goto_f9

    :sswitch_73
    const-string v6, "\u00196mA3gMg=KaoHenH6j\u001ac=J0nHbhO1>H0"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_84

    goto :goto_f8

    :cond_84
    const/4 v6, 0x6

    goto :goto_f9

    :sswitch_86
    const-string v6, "Od;K09\u00194g@ekLclL1oIf:\u001c4f\u001cgi\u001d0i\u001e0"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_97

    goto :goto_f8

    :cond_97
    const/4 v6, 0x5

    goto :goto_f9

    :sswitch_99
    const-string v6, "O0=Ob:J4mO4i\u001b7;\u001bjlM`k\u001e7=\u001ecjL3l\u001e3"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_aa

    goto :goto_f8

    :cond_aa
    const/4 v6, 0x4

    goto :goto_f9

    :sswitch_ac
    const-string v6, "K4;H0<\u001dcf\u0019d=Ik;Lj9Mjo\u001b4<\u001eej@0nJ7"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_bd

    goto :goto_f8

    :cond_bd
    const/4 v6, 0x3

    goto :goto_f9

    :sswitch_bf
    const-string v6, "@agAd;J0n\u001bklOf;@`kH7;\u0019g;L`o@fhNe"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d0

    goto :goto_f8

    :cond_d0
    const/4 v6, 0x2

    goto :goto_f9

    :sswitch_d2
    const-string v6, "Jf=@7fL1l\u001c0<\u0019k=K7>\u001e4:Mf:\u001d0k\u001d`fHa"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e3

    goto :goto_f8

    :cond_e3
    const/4 v6, 0x1

    goto :goto_f9

    :sswitch_e5
    const-string v6, "\u001e1l\u001a0oOb:Mb=\u001ae=\u001d79\u001e`lJ1gL1gN4jIk"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_f6

    goto :goto_f8

    :cond_f6
    const/4 v6, 0x0

    goto :goto_f9

    :goto_f8
    const/4 v6, -0x1

    :goto_f9
    const-string v9, "Jgi\u001a0oKamL3mK79@dm\u001cf=\u0019gi\u001e`jM0k\u001d0"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "N1k\u001b3g\u001bf>\u0019a:\u001effHfnLjhL4fM6:JegK6"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "A6hOen\u001ea<LjoN3lN3o@`=LclIdmNbiA7"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "NgkIb9Kef\u001bfhLa>Lb;O0nMa;\u001c0nK7:\u001a6"

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/16 v13, 0x13

    const-string v14, "HeoHcl\u001979Lf9\u001d3f\u001dbjL4j\u0019ej\u001b0>\u0019`n\u001a7"

    invoke-static {v14}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v15, "\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"

    invoke-static {v15}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const/4 v7, 0x0

    packed-switch v6, :pswitch_data_a4e

    return-void

    :pswitch_13c
    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    .line 1
    invoke-virtual {v0}, Lde/blinkt/openvpn/core/OpenVPNService;->ぷぞてのほき()Ljava/lang/String;

    move-result-object v3

    iget-object v0, v0, Lde/blinkt/openvpn/core/OpenVPNService;->は〲ぱなで:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_157

    const-string v0, "IemAkiK79\u001b1<NakLjhLf<\u001b3o\u001b3gIckO`"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_154
    move-object v14, v0

    goto/16 :goto_a10

    :cond_157
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ne v3, v13, :cond_180

    invoke-virtual {v0, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_180

    invoke-virtual {v0, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_180

    invoke-virtual {v0, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_180

    invoke-virtual {v0, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_180

    const-string v0, "A4o\u00197m\u001c6g\u001df<J3j\u00197kIkf\u001eg:\u001e3m\u001cgg\u001dgh\u0019fnIfhNenL3j\u001bg:\u001ak<H1:\u0019flL1=\u0019f9\u001a"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_154

    :cond_180
    const-string v0, "\u001bbnM7g\u001d0m\u001ek:O`m\u001e3g\u001bd=\u001e4;\u001bg9Hfo\u001djm@gk@bf\u001bf9Lgi@a;Ig=@`>@dk\u00190l\u0019e>J"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_154

    .line 2
    :pswitch_18b
    invoke-virtual {v5, v15}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    aget-object v3, v0, v4

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    iget-object v4, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    .line 3
    iput v3, v4, Lde/blinkt/openvpn/core/OpenVPNService;->ぺふねづ〺:I

    .line 4
    aget-object v0, v0, v8

    .line 5
    iput-object v0, v4, Lde/blinkt/openvpn/core/OpenVPNService;->てぜきぽく:Ljava/lang/String;

    :goto_19d
    move-object/from16 v16, v14

    goto/16 :goto_a0e

    .line 6
    :pswitch_1a1
    invoke-virtual {v5, v15}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v5, v3

    const/4 v6, 0x5

    if-ne v5, v6, :cond_1b9

    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    aget-object v5, v3, v8

    aget-object v4, v3, v4

    const/4 v6, 0x2

    aget-object v6, v3, v6

    const/4 v7, 0x4

    aget-object v3, v3, v7

    invoke-virtual {v0, v5, v4, v6, v3}, Lde/blinkt/openvpn/core/OpenVPNService;->ぅみぱぎぎ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_19d

    :cond_1b9
    const/4 v5, 0x2

    array-length v6, v3

    const/4 v9, 0x3

    if-lt v6, v9, :cond_1ca

    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    aget-object v6, v3, v8

    aget-object v4, v3, v4

    aget-object v3, v3, v5

    invoke-virtual {v0, v6, v4, v3, v7}, Lde/blinkt/openvpn/core/OpenVPNService;->ぅみぱぎぎ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_19d

    :cond_1ca
    const-string v4, "Jeo\u001e7j\u001d4lA3jI0fL79L0jHd<MbfN`mKb=\u001d1>M`g@`iK3hN`n\u001a3kJ4iA4;L`gO4hJ"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "Jb;L4g\u00193>\u001e3nKc;IjmHdi\u001aclIffNknKf"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    goto :goto_19d

    :pswitch_1f7
    const-string v0, "@cg\u001ag=Ad9Oen\u00190gMj:H3h@jmK`o\u001cki\u00197"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21e

    new-array v0, v4, [Ljava/lang/Object;

    aput-object v5, v0, v8

    const-string v3, "H6jIchKg=HkmLknIb:I3lHcm\u00194;Nk=Lgk@ckIegJ7;I49@d:I0gHd<NfmKj9M0f\u001c7lH4=\u001c6kAbkOjlNem\u001d3g\u001a0=A0gAai\u001a6iJglK1=\u001ddoN6=O3kLj<\u001ca9@c;NffK1g\u001abnL6:\u001da9Kfn\u00193mKan\u001b3<Kah\u001b6n\u001de<O3;\u0019"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    goto/16 :goto_8dd

    :cond_21e
    iget-object v5, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    .line 8
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Landroid/net/VpnService$Builder;

    invoke-direct {v6, v5}, Landroid/net/VpnService$Builder;-><init>(Landroid/net/VpnService;)V

    new-array v0, v8, [Ljava/lang/Object;

    const v7, 0x7f110192

    invoke-static {v7, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->てぜきぽく(I[Ljava/lang/Object;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x15

    if-lt v0, v7, :cond_23f

    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget-boolean v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->のびぶけせ:Z

    if-nez v0, :cond_23f

    const/4 v0, 0x1

    const/4 v7, 0x1

    goto :goto_241

    :cond_23f
    const/4 v0, 0x0

    const/4 v7, 0x0

    :goto_241
    if-eqz v7, :cond_24d

    .line 9
    sget v0, Landroid/system/OsConstants;->AF_INET:I

    invoke-virtual {v6, v0}, Landroid/net/VpnService$Builder;->allowFamily(I)Landroid/net/VpnService$Builder;

    sget v0, Landroid/system/OsConstants;->AF_INET6:I

    invoke-virtual {v6, v0}, Landroid/net/VpnService$Builder;->allowFamily(I)Landroid/net/VpnService$Builder;

    .line 10
    :cond_24d
    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    if-nez v0, :cond_263

    iget-object v13, v5, Lde/blinkt/openvpn/core/OpenVPNService;->てぜきぽく:Ljava/lang/String;

    if-nez v13, :cond_263

    const v0, 0x7f110219

    invoke-virtual {v5, v0}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    move-object/from16 v16, v14

    goto/16 :goto_885

    :cond_263
    const-string v13, "J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad"

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v0, :cond_352

    .line 11
    invoke-static {v5}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぅみぱぎぎ(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v4, "\u001b6k\u001dd:H1fLkf\u001acmO4j\u001ejhNgmN6<Ac9Nc"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 12
    invoke-static {v5, v8}, Lづざかべべ/は〲ぱなで/〺つふすそ;->せづっ〸ちね(Landroid/content/Context;Z)Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x1

    :goto_289
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_30e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 p1, v0

    move-object/from16 v0, v16

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, v13}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    aget-object v8, v0, v8

    aget-object v0, v0, v4

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move/from16 v16, v4

    iget-object v4, v5, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    iget-object v4, v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2b6

    move/from16 v4, v16

    move-object/from16 v16, v14

    goto :goto_307

    :cond_2b6
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    move-object/from16 v16, v14

    const/16 v14, 0x13

    if-ge v4, v14, :cond_2f0

    iget-object v14, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget-boolean v14, v14, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->ぃぜぶの〸ぃ:Z

    if-nez v14, :cond_2ee

    iget-object v4, v5, Lde/blinkt/openvpn/core/OpenVPNService;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    new-instance v14, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    invoke-direct {v14, v8, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;I)V

    .line 13
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    const/4 v8, 0x1

    invoke-direct {v0, v14, v8}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;Z)V

    invoke-virtual {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->ぁごぐすすぃ()[Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    move-result-object v0

    array-length v8, v0

    const/4 v14, 0x0

    :goto_2da
    if-ge v14, v8, :cond_305

    move/from16 v17, v8

    aget-object v8, v0, v14

    move-object/from16 v18, v0

    iget-object v0, v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    invoke-virtual {v0, v8}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v14, v14, 0x1

    move/from16 v8, v17

    move-object/from16 v0, v18

    goto :goto_2da

    :cond_2ee
    const/16 v14, 0x13

    :cond_2f0
    if-lt v4, v14, :cond_305

    .line 14
    iget-object v4, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget-boolean v4, v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->ぃぜぶの〸ぃ:Z

    if-eqz v4, :cond_305

    iget-object v4, v5, Lde/blinkt/openvpn/core/OpenVPNService;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    new-instance v14, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    invoke-direct {v14, v8, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;I)V

    .line 15
    iget-object v0, v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    const/4 v4, 0x0

    invoke-static {v14, v4, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇ〳〲〺すっ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;ZLjava/util/TreeSet;)V

    :cond_305
    const/4 v0, 0x1

    const/4 v4, 0x1

    :goto_307
    const/4 v8, 0x0

    move-object/from16 v0, p1

    move-object/from16 v14, v16

    goto/16 :goto_289

    :cond_30e
    move-object/from16 v16, v14

    .line 16
    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget-boolean v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->ぃぜぶの〸ぃ:Z

    if-eqz v0, :cond_330

    const/4 v0, 0x1

    invoke-static {v5, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->せづっ〸ちね(Landroid/content/Context;Z)Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_31f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_330

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const/4 v8, 0x0

    invoke-virtual {v5, v4, v8}, Lde/blinkt/openvpn/core/OpenVPNService;->じぜこほぱ(Ljava/lang/String;Z)V

    goto :goto_31f

    .line 17
    :cond_330
    :try_start_330
    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    iget-object v4, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    iget v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->〺つふすそ:I

    invoke-virtual {v6, v4, v0}, Landroid/net/VpnService$Builder;->addAddress(Ljava/lang/String;I)Landroid/net/VpnService$Builder;
    :try_end_339
    .catch Ljava/lang/IllegalArgumentException; {:try_start_330 .. :try_end_339} :catch_33a

    goto :goto_354

    :catch_33a
    move-exception v0

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, v5, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x1

    aput-object v0, v3, v4

    const v0, 0x7f1100ec

    invoke-static {v0, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぺぁあねじ(I[Ljava/lang/Object;)V

    goto/16 :goto_885

    :cond_352
    move-object/from16 v16, v14

    :goto_354
    const/4 v0, 0x0

    const/4 v4, 0x1

    iget-object v8, v5, Lde/blinkt/openvpn/core/OpenVPNService;->てぜきぽく:Ljava/lang/String;

    if-eqz v8, :cond_382

    invoke-virtual {v8, v13}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    :try_start_35e
    aget-object v0, v8, v0

    aget-object v4, v8, v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v6, v0, v4}, Landroid/net/VpnService$Builder;->addAddress(Ljava/lang/String;I)Landroid/net/VpnService$Builder;
    :try_end_369
    .catch Ljava/lang/IllegalArgumentException; {:try_start_35e .. :try_end_369} :catch_36a

    goto :goto_382

    :catch_36a
    move-exception v0

    const v3, 0x7f11017c

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, v5, Lde/blinkt/openvpn/core/OpenVPNService;->てぜきぽく:Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x1

    aput-object v0, v4, v5

    invoke-static {v3, v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぺぁあねじ(I[Ljava/lang/Object;)V

    goto/16 :goto_885

    :cond_382
    :goto_382
    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〺つふすそ:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_388
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3af

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    :try_start_395
    invoke-virtual {v6, v8}, Landroid/net/VpnService$Builder;->addDnsServer(Ljava/lang/String;)Landroid/net/VpnService$Builder;
    :try_end_398
    .catch Ljava/lang/IllegalArgumentException; {:try_start_395 .. :try_end_398} :catch_399

    goto :goto_388

    :catch_399
    move-exception v0

    move-object v13, v0

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v14, 0x0

    aput-object v8, v0, v14

    invoke-virtual {v13}, Ljava/lang/IllegalArgumentException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v8

    const/4 v13, 0x1

    aput-object v8, v0, v13

    const v8, 0x7f1100ec

    invoke-static {v8, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぺぁあねじ(I[Ljava/lang/Object;)V

    goto :goto_388

    :cond_3af
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x13

    if-ne v4, v8, :cond_3f6

    invoke-virtual {v0, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3f6

    invoke-virtual {v0, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3f6

    invoke-virtual {v0, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3f6

    invoke-virtual {v0, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3f6

    iget v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->ぺふねづ〺:I

    const/16 v8, 0x500

    if-ge v0, v8, :cond_3f6

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v11, 0x0

    aput-object v0, v10, v11

    const-string v0, "A6k\u001ba=Hkk\u0019aoL4k\u001c3hL1n\u0019ahMjj\u001ckk@ahAf9Kjj\u0019cjKf>\u001bc>N6gO6o\u001eclA4mI1l\u001b4=Ld=\u00191=L0fO1gOe<Meh\u0019`:\u001cgi\u001cekJ7oAcmIfmN1oM4<H`l\u001eco\u0019am\u001dgg\u001a`>\u001een\u001c6kJ6kHdl@7k\u001eggK0f\u001ceoJ`fO`>N0oIf>J"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->のぷのちつ(Ljava/lang/String;)V

    invoke-virtual {v6, v8}, Landroid/net/VpnService$Builder;->setMtu(I)Landroid/net/VpnService$Builder;

    goto :goto_3fb

    :cond_3f6
    iget v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->ぺふねづ〺:I

    invoke-virtual {v6, v0}, Landroid/net/VpnService$Builder;->setMtu(I)Landroid/net/VpnService$Builder;

    :goto_3fb
    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    invoke-virtual {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->くし〴〺ぅ()Ljava/util/Collection;

    move-result-object v8

    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    invoke-virtual {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->くし〴〺ぅ()Ljava/util/Collection;

    move-result-object v9

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const-string v10, "M3h\u001eb>A4oMgjH3o\u0019dl\u001db<\u001b`9IkoK6:Jc"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4ab

    const/16 v0, 0x15

    if-lt v4, v0, :cond_4ab

    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〺つふすそ:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    const/4 v4, 0x1

    if-lt v0, v4, :cond_4ab

    :try_start_426
    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    new-instance v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    iget-object v10, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〺つふすそ:Ljava/util/Vector;

    const/4 v11, 0x0

    invoke-virtual {v10, v11}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    const/16 v11, 0x20

    invoke-direct {v4, v10, v11}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;I)V

    const/4 v10, 0x1

    invoke-direct {v0, v4, v10}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;Z)V

    move-object v4, v8

    check-cast v4, Ljava/util/Vector;

    invoke-virtual {v4}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v11, 0x0

    :cond_444
    :goto_444
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_458

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    invoke-virtual {v12, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->げつ〴ぬぐ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;)Z

    move-result v12

    if-eqz v12, :cond_444

    const/4 v11, 0x1

    goto :goto_444

    :cond_458
    if-nez v11, :cond_4ab

    const-string v10, "K7<M7iJfmO1kO1:\u001abn\u001agl\u001ckh\u001bb<\u001dbgMaoN3:K0;\u001b1oI0;MekOk;\u001a4=H0:H7;\u00194oM1;HdkAk>\u001c1gKk>Ic>\u001agfJjiNjj\u001c`hOjh\u001c3n\u0019jh@4=K3:J`lO4:@co\u001afjO1=\u001c6fL1>\u00196=MdfMkf\u001e3;Leo\u001cg>MflJ3lAg:JekN1hN7=@0>L6gMfoLe=Mgn\u001e69M6j\u001b4kO49\u001bai\u0019f9Ia=Kbo\u001d0jN3gJ`mNf=@k=\u001bk:MjhLeoLkj\u001bd;Lkn\u001a3=Nfn\u001bj>O3=\u001e39\u001a6n\u001dbmAfl\u00194nIggMfn\u001b0;@afLan\u0019af\u001d7:@b>I09\u001dk;IfkKe;LjkHb;Ic:LejN3nN1o\u001d3"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/Object;

    iget-object v12, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〺つふすそ:Ljava/util/Vector;

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v12

    aput-object v12, v11, v13

    invoke-static {v10, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぉざぅち〻(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
    :try_end_47a
    .catch Ljava/lang/Exception; {:try_start_426 .. :try_end_47a} :catch_47b

    goto :goto_4ab

    :catch_47b
    nop

    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〺つふすそ:Ljava/util/Vector;

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4ab

    const-string v0, "Mb;@f<\u001b7:M3nAf<Ja<\u001cen\u001ba9Kk>I1lJ1=Akf\u001eciH`kIbfK4kO6<NbiK6:I6l\u00193<@"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〺つふすそ:Ljava/util/Vector;

    invoke-virtual {v3, v4}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    :cond_4ab
    :goto_4ab
    new-instance v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    const-string v4, "IgjL6:Lbf\u001c79N69\u001cff\u00190h@4n\u001dcgHej\u001a6"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x3

    invoke-direct {v0, v4, v10}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;I)V

    const/4 v4, 0x1

    invoke-direct {v3, v0, v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;Z)V

    move-object v0, v8

    check-cast v0, Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4c8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const v10, 0x7f11029a

    if-eqz v0, :cond_51b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    :try_start_4d8
    invoke-virtual {v3, v11}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->げつ〴ぬぐ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;)Z

    move-result v0

    if-eqz v0, :cond_4ef

    const v0, 0x7f110167

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    invoke-virtual {v11}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    aput-object v13, v12, v14

    invoke-static {v0, v12}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->なぎぱいぢぎ(I[Ljava/lang/Object;)V

    goto :goto_4c8

    :cond_4ef
    invoke-virtual {v11}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->くし〴〺ぅ()Ljava/lang/String;

    move-result-object v0

    iget v12, v11, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {v6, v0, v12}, Landroid/net/VpnService$Builder;->addRoute(Ljava/lang/String;I)Landroid/net/VpnService$Builder;
    :try_end_4f8
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4d8 .. :try_end_4f8} :catch_4f9

    goto :goto_4c8

    :catch_4f9
    move-exception v0

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v10}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    goto :goto_4c8

    :cond_51b
    move-object v0, v9

    check-cast v0, Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_522
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_55b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;

    :try_start_52f
    invoke-virtual {v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->びぐびあび()Ljava/lang/String;

    move-result-object v0

    iget v11, v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {v6, v0, v11}, Landroid/net/VpnService$Builder;->addRoute(Ljava/lang/String;I)Landroid/net/VpnService$Builder;
    :try_end_538
    .catch Ljava/lang/IllegalArgumentException; {:try_start_52f .. :try_end_538} :catch_539

    goto :goto_522

    :catch_539
    move-exception v0

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v10}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    goto :goto_522

    :cond_55b
    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->ぺぁあねじ:Ljava/lang/String;

    if-eqz v0, :cond_562

    invoke-virtual {v6, v0}, Landroid/net/VpnService$Builder;->addSearchDomain(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    :cond_562
    if-eqz v7, :cond_56f

    const-string v0, "Kkl\u001ad<\u001a7fH1nMb<\u001e4jH4fLekNbiK6>Oe>K6iKd9Ob:\u001ek<Lk<Kd=AglI6lO0n\u001cjjM"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_579

    :cond_56f
    const-string v0, "\u0019jlN4;Kc:M3jM7:O0:K`;Oj:\u0019dm\u001c0lH4"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_579
    iget-object v3, v5, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    if-eqz v3, :cond_582

    iget v4, v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->〺つふすそ:I

    iget-object v3, v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    goto :goto_584

    :cond_582
    const/4 v4, -0x1

    move-object v3, v0

    :goto_584
    iget-object v7, v5, Lde/blinkt/openvpn/core/OpenVPNService;->てぜきぽく:Ljava/lang/String;

    if-eqz v7, :cond_589

    move-object v0, v7

    :cond_589
    const v7, 0x7f110196

    const/4 v10, 0x4

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v3, v10, v11

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v10, v4

    const/4 v3, 0x2

    aput-object v0, v10, v3

    iget v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->ぺふねづ〺:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v4, 0x3

    aput-object v0, v10, v4

    invoke-static {v7, v10}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->てぜきぽく(I[Ljava/lang/Object;)V

    const v0, 0x7f1100f1

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v7, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〺つふすそ:Ljava/util/Vector;

    const-string v10, "\u001ej=\u001cdmNj<\u001ed<\u001cjfLfg\u001dc;L3k\u001cg>H3mKb"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v7}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v4, v11

    iget-object v7, v5, Lde/blinkt/openvpn/core/OpenVPNService;->ぺぁあねじ:Ljava/lang/String;

    const/4 v12, 0x1

    aput-object v7, v4, v12

    invoke-static {v0, v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->てぜきぽく(I[Ljava/lang/Object;)V

    const v0, 0x7f11029e

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v7, v5, Lde/blinkt/openvpn/core/OpenVPNService;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    invoke-virtual {v7, v12}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->〺つふすそ(Z)Ljava/util/Collection;

    move-result-object v7

    invoke-static {v10, v7}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v4, v11

    iget-object v7, v5, Lde/blinkt/openvpn/core/OpenVPNService;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    invoke-virtual {v7, v12}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->〺つふすそ(Z)Ljava/util/Collection;

    move-result-object v7

    invoke-static {v10, v7}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v4, v12

    invoke-static {v0, v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->てぜきぽく(I[Ljava/lang/Object;)V

    const v0, 0x7f11029d

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v7, v5, Lde/blinkt/openvpn/core/OpenVPNService;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    invoke-virtual {v7, v11}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->〺つふすそ(Z)Ljava/util/Collection;

    move-result-object v7

    invoke-static {v10, v7}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v4, v11

    iget-object v7, v5, Lde/blinkt/openvpn/core/OpenVPNService;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    invoke-virtual {v7, v11}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->〺つふすそ(Z)Ljava/util/Collection;

    move-result-object v7

    invoke-static {v10, v7}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v4, v12

    invoke-static {v0, v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->てぜきぽく(I[Ljava/lang/Object;)V

    const v0, 0x7f11029c

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v10, v8}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v11

    invoke-static {v10, v9}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v12

    invoke-static {v0, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->なぎぱいぢぎ(I[Ljava/lang/Object;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v0, v3, :cond_715

    .line 18
    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget-object v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->えがぐせほち:[Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ;

    array-length v3, v0

    const/4 v4, 0x0

    const/4 v7, 0x0

    :goto_628
    if-ge v4, v3, :cond_636

    aget-object v8, v0, v4

    iget-object v8, v8, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ;->ぺぁあねじ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;

    sget-object v9, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;

    if-ne v8, v9, :cond_633

    const/4 v7, 0x1

    :cond_633
    add-int/lit8 v4, v4, 0x1

    goto :goto_628

    :cond_636
    if-eqz v7, :cond_645

    const-string v0, "O6lAc>\u001bfk\u001ck>O0nKf=Od:\u001b7=\u0019bhI3iKf:\u001ad>@6gNgjOdiIemJaiIg>J`i\u001djnKdlL0<\u001ad=Ljl\u001bbh\u001e4:\u001bk;OenAkj\u001ej:A0:\u001cchAg;A6:\u001deiNfjHaj@b>@cgK6o\u001b4l@3=H4:IkoAjnOeiN1<\u0019k<Mdk\u001a1fJklLbk\u001c4:M79\u0019aj\u001bc<Hbf\u0019d:@elIdgJejKdmNj9L4h\u001d0nA69Je9Hjl\u001adkKjg\u001dai\u001a7=\u001bgfKjhN6"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぁごぐすすぃ(Ljava/lang/String;)V

    :cond_645
    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget-boolean v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->こ〲しでおか:Z

    const-string v3, "NfkHc9@3<J6iL3g\u0019c9\u00190oO6nO4k\u001eg9\u001damLfo\u001e`k\u001e`gM`9\u001e7>\u0019eg\u0019`>Nd:O6o\u001e`n\u001e"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v0, :cond_668

    if-eqz v7, :cond_668

    :try_start_657
    invoke-virtual {v6, v3}, Landroid/net/VpnService$Builder;->addDisallowedApplication(Ljava/lang/String;)Landroid/net/VpnService$Builder;
    :try_end_65a
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_657 .. :try_end_65a} :catch_65b

    goto :goto_668

    :catch_65b
    const-string v0, "@09Jj<\u001b`j\u00191o\u001cbm\u001eag\u001cdf\u001cfj\u001dc=\u001c6m\u001dfoAfhLdi\u001cc;OdjOc=\u001a1<\u001a6:M3<Hk>\u0019jl\u001e"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぁごぐすすぃ(Ljava/lang/String;)V

    :cond_668
    :goto_668
    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget-object v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->ごまけがぢは:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x0

    :cond_671
    :goto_671
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6a8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    :try_start_67d
    iget-object v9, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget-boolean v9, v9, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->こ〲しでおか:Z

    if-eqz v9, :cond_687

    invoke-virtual {v6, v8}, Landroid/net/VpnService$Builder;->addDisallowedApplication(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    goto :goto_671

    :cond_687
    if-eqz v7, :cond_68f

    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_671

    :cond_68f
    invoke-virtual {v6, v8}, Landroid/net/VpnService$Builder;->addAllowedApplication(Ljava/lang/String;)Landroid/net/VpnService$Builder;
    :try_end_692
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_67d .. :try_end_692} :catch_694

    const/4 v4, 0x1

    goto :goto_671

    :catch_694
    iget-object v9, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget-object v9, v9, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->ごまけがぢは:Ljava/util/HashSet;

    invoke-virtual {v9, v8}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    const v9, 0x7f110057

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    aput-object v8, v11, v12

    invoke-static {v9, v11}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->てぜきぽく(I[Ljava/lang/Object;)V

    goto :goto_671

    :cond_6a8
    const/4 v0, 0x1

    const/4 v3, 0x0

    iget-object v7, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget-boolean v7, v7, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->こ〲しでおか:Z

    if-nez v7, :cond_6e5

    if-nez v4, :cond_6e5

    const v4, 0x7f1101f4

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v5}, Landroid/net/VpnService;->getPackageName()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v0, v3

    invoke-static {v4, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->なぎぱいぢぎ(I[Ljava/lang/Object;)V

    :try_start_6c0
    invoke-virtual {v5}, Landroid/net/VpnService;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/net/VpnService$Builder;->addAllowedApplication(Ljava/lang/String;)Landroid/net/VpnService$Builder;
    :try_end_6c7
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_6c0 .. :try_end_6c7} :catch_6c8

    goto :goto_6e5

    :catch_6c8
    move-exception v0

    const-string v3, "KdnK3:AdgIjk\u0019g;H6hIdm\u00191i\u001ckg@0<K`9\u001bfmNj>Obg\u001bjkN1gI7nAk9\u001b7;\u001d1n\u001ca>\u001b"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    :cond_6e5
    :goto_6e5
    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget-boolean v3, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->こ〲しでおか:Z

    if-eqz v3, :cond_6fe

    const v3, 0x7f1100e5

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->ごまけがぢは:Ljava/util/HashSet;

    invoke-static {v10, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    const/4 v7, 0x0

    aput-object v0, v4, v7

    invoke-static {v3, v4}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->なぎぱいぢぎ(I[Ljava/lang/Object;)V

    goto :goto_710

    :cond_6fe
    const/4 v3, 0x1

    const/4 v4, 0x0

    const v7, 0x7f11004f

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->ごまけがぢは:Ljava/util/HashSet;

    invoke-static {v10, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v7, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->なぎぱいぢぎ(I[Ljava/lang/Object;)V

    :goto_710
    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    :cond_715
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x16

    if-lt v0, v3, :cond_71f

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/net/VpnService$Builder;->setUnderlyingNetworks([Landroid/net/Network;)Landroid/net/VpnService$Builder;

    :cond_71f
    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget-object v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:Ljava/lang/String;

    iget-object v3, v5, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    if-eqz v3, :cond_73f

    iget-object v4, v5, Lde/blinkt/openvpn/core/OpenVPNService;->てぜきぽく:Ljava/lang/String;

    if-eqz v4, :cond_73f

    const v7, 0x7f1102d2

    const/4 v8, 0x3

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v0, v8, v9

    const/4 v0, 0x1

    aput-object v3, v8, v0

    const/4 v0, 0x2

    aput-object v4, v8, v0

    invoke-virtual {v5, v7, v8}, Landroid/net/VpnService;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_75e

    :cond_73f
    const/4 v9, 0x0

    const/4 v4, 0x1

    const/4 v7, 0x2

    const v8, 0x7f1102d1

    if-eqz v3, :cond_752

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v0, v7, v9

    aput-object v3, v7, v4

    invoke-virtual {v5, v8, v7}, Landroid/net/VpnService;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_75e

    :cond_752
    new-array v3, v7, [Ljava/lang/Object;

    aput-object v0, v3, v9

    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->てぜきぽく:Ljava/lang/String;

    aput-object v0, v3, v4

    invoke-virtual {v5, v8, v3}, Landroid/net/VpnService;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_75e
    invoke-virtual {v6, v0}, Landroid/net/VpnService$Builder;->setSession(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〺つふすそ:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-nez v0, :cond_771

    const v0, 0x7f110374

    new-array v3, v9, [Ljava/lang/Object;

    invoke-static {v0, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->てぜきぽく(I[Ljava/lang/Object;)V

    :cond_771
    invoke-virtual {v5}, Lde/blinkt/openvpn/core/OpenVPNService;->ぷぞてのほき()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->は〲ぱなで:Ljava/lang/String;

    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->〺つふすそ:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    .line 20
    iget-object v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    invoke-virtual {v0}, Ljava/util/TreeSet;->clear()V

    .line 21
    iget-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    .line 22
    iget-object v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    invoke-virtual {v0}, Ljava/util/TreeSet;->clear()V

    const/4 v0, 0x0

    .line 23
    iput-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    iput-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->てぜきぽく:Ljava/lang/String;

    iput-object v0, v5, Lde/blinkt/openvpn/core/OpenVPNService;->ぺぁあねじ:Ljava/lang/String;

    invoke-virtual {v5}, Lde/blinkt/openvpn/core/OpenVPNService;->せづっ〸ちね()Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/net/VpnService$Builder;->setConfigureIntent(Landroid/app/PendingIntent;)Landroid/net/VpnService$Builder;

    :try_start_798
    invoke-virtual {v6}, Landroid/net/VpnService$Builder;->establish()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    if-eqz v0, :cond_7a0

    goto/16 :goto_886

    :cond_7a0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v3, "J4kAef\u001cdiLal@4:NfiI0fMe9\u0019f=\u0019bn@cfK3nM79\u001bko\u001b0>Mdo\u001abhLfn\u001cbjK4:NklK`:K6>K3k@e;Mc9JgmO3o\u001e`:@`iK`gJkf\u0019jj\u001d1f\u001e`k\u001dkjN4<\u001d7jA1nNfh\u001c0:K1oKc<J1<\u001ee;\u0019e9A6iHd<\u0019egLe=AbiA`k\u0019eoJ"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7b0
    .catch Ljava/lang/Exception; {:try_start_798 .. :try_end_7b0} :catch_7b0

    :catch_7b0
    move-exception v0

    const-string v3, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    new-instance v6, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    const-string v8, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v6, v8, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v7, Ljava/util/Date;

    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    invoke-virtual {v6, v7}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "] <font color=#FF0000>VPNService can\'t establish, any 2 ways to fix it choose one of both"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v6, "O79A6hKcf\u001b3lA3f\u00194gJji\u0019km@0oJ3=O4"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v7, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v9

    invoke-direct {v7, v8, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    invoke-virtual {v7, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019gk\u001eb9KjgAbk\u001akoOaf\u001cjoMgoH3k\u001d3h\u0019jl\u001ce:O4nNcn\u001adg\u001afhI4i\u001dcgMbhA7hM1m\u001e1h"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    invoke-direct {v3, v8, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v7, Ljava/util/Date;

    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3, v7}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019g:N4l\u001d1fI1>N4n\u0019ah\u001bbfAcgL7h\u001eai\u001c`>\u001ek>A6i\u001c3m\u001dj;\u001c`mKcmKk>\u001ae;\u001cdi\u001defJ`fH4h\u001c7iM6j\u001c`n@d=\u0019ah\u001def\u0019d:\u001b7f\u001979\u001akhNc9L6mN3lH6h@ci\u001c6:@`<\u001d3l\u00191lM`=\u001b0:Le<OakKkj\u001b7;\u001e3gIkjMbmAa:M`9\u001c0i\u001cfkK3;Odo\u001e7jLa<\u001agn\u00193h\u001a3mMk9Ajn\u001ad"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V

    const v3, 0x7f110342

    invoke-static {v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->〳ぜぞぜべっ(I)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f110113

    invoke-virtual {v5, v4}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-gt v0, v3, :cond_885

    const v0, 0x7f110341

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->〳ぜぞぜべっ(I)V

    :cond_885
    :goto_885
    const/4 v0, 0x0

    :goto_886
    if-nez v0, :cond_889

    goto :goto_8dc

    .line 24
    :cond_889
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFd()I

    move-result v3

    :try_start_88d
    const-class v4, Ljava/io/FileDescriptor;

    const-string v5, "\u001c0;\u001c3<\u0019dk\u001ekiM0o\u0019`iH4<Oki\u001ej=L3gK`"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Class;

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v8, 0x0

    aput-object v7, v6, v8

    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    new-instance v5, Ljava/io/FileDescriptor;

    invoke-direct {v5}, Ljava/io/FileDescriptor;-><init>()V

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v8, 0x0

    aput-object v3, v7, v8

    invoke-virtual {v4, v5, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    new-array v3, v6, [Ljava/io/FileDescriptor;

    aput-object v5, v3, v8

    iget-object v4, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->くし〴〺ぅ:Landroid/net/LocalSocket;

    invoke-virtual {v4, v3}, Landroid/net/LocalSocket;->setFileDescriptorsForSend([Ljava/io/FileDescriptor;)V

    const-string v3, "needok \'%s\' %s\n"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v8

    const/4 v5, 0x1

    aput-object v16, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    iget-object v3, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->くし〴〺ぅ:Landroid/net/LocalSocket;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/net/LocalSocket;->setFileDescriptorsForSend([Ljava/io/FileDescriptor;)V

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_8da
    .catch Ljava/lang/NoSuchMethodException; {:try_start_88d .. :try_end_8da} :catch_8dc
    .catch Ljava/lang/IllegalArgumentException; {:try_start_88d .. :try_end_8da} :catch_8dc
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_88d .. :try_end_8da} :catch_8dc
    .catch Ljava/io/IOException; {:try_start_88d .. :try_end_8da} :catch_8dc
    .catch Ljava/lang/IllegalAccessException; {:try_start_88d .. :try_end_8da} :catch_8dc

    const/4 v8, 0x1

    goto :goto_8dd

    :catch_8dc
    :goto_8dc
    const/4 v8, 0x0

    :goto_8dd
    if-eqz v8, :cond_8e0

    return-void

    :cond_8e0
    const-string v14, "\u001d1oH6:\u001c7lHek\u001bjl\u001dahNc<Aa;\u001e7fHel\u001dj"

    invoke-static {v14}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    goto/16 :goto_a10

    :pswitch_8ec
    move-object/from16 v16, v14

    .line 25
    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    .line 26
    iget-object v0, v0, Lde/blinkt/openvpn/core/OpenVPNService;->〺つふすそ:Ljava/util/Vector;

    invoke-virtual {v0, v5}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    goto/16 :goto_a0e

    :pswitch_8f7
    move-object/from16 v16, v14

    .line 27
    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    .line 28
    iget-object v3, v0, Lde/blinkt/openvpn/core/OpenVPNService;->ぺぁあねじ:Ljava/lang/String;

    if-nez v3, :cond_a0e

    iput-object v5, v0, Lde/blinkt/openvpn/core/OpenVPNService;->ぺぁあねじ:Ljava/lang/String;

    goto/16 :goto_a0e

    :pswitch_903
    move-object/from16 v16, v14

    .line 29
    invoke-virtual {v5, v15}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iget-object v3, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    const/4 v4, 0x0

    aget-object v4, v0, v4

    const/4 v5, 0x1

    aget-object v0, v0, v5

    .line 30
    invoke-virtual {v3, v0}, Lde/blinkt/openvpn/core/OpenVPNService;->〺でおいここ(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {v3, v4, v0}, Lde/blinkt/openvpn/core/OpenVPNService;->じぜこほぱ(Ljava/lang/String;Z)V

    goto/16 :goto_a0e

    :pswitch_91a
    move-object/from16 v16, v14

    .line 31
    invoke-virtual {v5, v15}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x2

    aget-object v3, v0, v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    iget-object v4, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    const/4 v5, 0x0

    aget-object v5, v0, v5

    const/4 v6, 0x1

    aget-object v6, v0, v6

    const/4 v7, 0x3

    aget-object v0, v0, v7

    .line 32
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    invoke-direct {v7, v5, v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v7, v4, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    iput v3, v4, Lde/blinkt/openvpn/core/OpenVPNService;->ぺふねづ〺:I

    const/4 v3, 0x0

    iput-object v3, v4, Lde/blinkt/openvpn/core/OpenVPNService;->ごづごきえ:Ljava/lang/String;

    invoke-static {v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->〺つふすそ(Ljava/lang/String;)J

    move-result-wide v7

    iget-object v3, v4, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    iget v3, v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->〺つふすそ:I

    const-string v9, "IdfJag\u00191iN09\u0019do\u001d4fL7=\u001e7j@1nM7m@4"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "Ad<\u001ck=\u0019ckH`=@3g\u001bbmKgmLfn\u0019e;IahJ4"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/16 v11, 0x1f

    const/16 v12, 0x1e

    const/16 v13, 0x20

    if-ne v3, v13, :cond_9b4

    const-string v3, "\u0019b=\u001cgl\u001d4n\u001dblOk=L7iAb:IcjL7l\u001cai@f"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9b4

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_980

    const-wide/16 v13, -0x4

    const/16 v3, 0x1e

    goto :goto_984

    :cond_980
    const-wide/16 v13, -0x2

    const/16 v3, 0x1f

    :goto_984
    and-long/2addr v7, v13

    iget-object v15, v4, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    .line 33
    iget-object v15, v15, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-static {v15}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->〺つふすそ(Ljava/lang/String;)J

    move-result-wide v17

    and-long v13, v13, v17

    cmp-long v15, v7, v13

    .line 34
    iget-object v7, v4, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    if-nez v15, :cond_998

    iput v3, v7, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->〺つふすそ:I

    goto :goto_9b4

    :cond_998
    const/16 v3, 0x20

    iput v3, v7, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->〺つふすそ:I

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9b4

    const v3, 0x7f11017e

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v5, v7, v8

    const/4 v8, 0x1

    aput-object v6, v7, v8

    const/4 v8, 0x2

    aput-object v0, v7, v8

    invoke-static {v3, v7}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぇぬぎばつ(I[Ljava/lang/Object;)V

    :cond_9b4
    :goto_9b4
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9c2

    iget-object v3, v4, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    iget v3, v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->〺つふすそ:I

    const/16 v7, 0x20

    if-lt v3, v7, :cond_9ce

    :cond_9c2
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9e0

    iget-object v3, v4, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    iget v3, v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->〺つふすそ:I

    if-ge v3, v12, :cond_9e0

    :cond_9ce
    const v3, 0x7f11017d

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v5, v7, v8

    const/4 v5, 0x1

    aput-object v6, v7, v5

    const/4 v5, 0x2

    aput-object v0, v7, v5

    invoke-static {v3, v7}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぇぬぎばつ(I[Ljava/lang/Object;)V

    :cond_9e0
    iget-object v0, v4, Lde/blinkt/openvpn/core/OpenVPNService;->いいにぽつ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    iget v3, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->〺つふすそ:I

    if-gt v3, v11, :cond_9fe

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x15

    if-lt v5, v7, :cond_9fe

    new-instance v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;

    iget-object v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-direct {v5, v0, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v5}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;->くし〴〺ぅ()Z

    .line 35
    iget-object v0, v4, Lde/blinkt/openvpn/core/OpenVPNService;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;

    .line 36
    iget-object v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/util/TreeSet;

    const/4 v3, 0x1

    invoke-static {v5, v3, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇ〳〲〺すっ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/げつ〴ぬぐ;ZLjava/util/TreeSet;)V

    .line 37
    :cond_9fe
    iput-object v6, v4, Lde/blinkt/openvpn/core/OpenVPNService;->ごづごきえ:Ljava/lang/String;

    goto :goto_a0e

    :pswitch_a01
    move-object/from16 v16, v14

    .line 38
    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->なぎぱいぢぎ:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/FileDescriptor;

    invoke-virtual {v1, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->いいにぽつ(Ljava/io/FileDescriptor;)V

    :cond_a0e
    :goto_a0e
    move-object/from16 v14, v16

    :goto_a10
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const/4 v2, 0x1

    aput-object v14, v0, v2

    const-string v2, "needok \'%s\' %s\n"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    return-void

    nop

    :sswitch_data_a24
    .sparse-switch
        -0x7e2d8453 -> :sswitch_e5
        -0x73038961 -> :sswitch_d2
        -0x6f9174d3 -> :sswitch_bf
        -0x580ad8f3 -> :sswitch_ac
        -0x3efc7e74 -> :sswitch_99
        -0x207ef49d -> :sswitch_86
        0x4a8ba29 -> :sswitch_73
        0x12925d77 -> :sswitch_5e
        0x2fbe4c33 -> :sswitch_48
        0x78830dd0 -> :sswitch_32
    .end sparse-switch

    :pswitch_data_a4e
    .packed-switch 0x0
        :pswitch_a01
        :pswitch_91a
        :pswitch_903
        :pswitch_8f7
        :pswitch_8ec
        :pswitch_1f7
        :pswitch_1a1
        :pswitch_18b
        :pswitch_13c
        :pswitch_8ec
    .end packed-switch
.end method

.method public ぺふねづ〺()V
    .registers 2

    iget-boolean v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->〳ぜぞぜべっ:Z

    if-eqz v0, :cond_19

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->〳ぜぞぜべっ:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    const-string v0, "hold release\n"

    invoke-virtual {p0, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    const-string v0, "bytecount 2\n"

    invoke-virtual {p0, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    const-string v0, "state on\n"

    invoke-virtual {p0, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ(Ljava/lang/String;)Z

    :cond_19
    return-void
.end method
