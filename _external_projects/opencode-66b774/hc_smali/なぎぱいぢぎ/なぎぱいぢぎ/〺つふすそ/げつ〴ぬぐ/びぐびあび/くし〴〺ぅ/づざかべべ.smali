.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;
.super Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/くし〴〺ぅ;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final 〳ぜぞぜべっ:J

.field public final ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/びぐびあび/げつ〴ぬぐ;

.field public final づざかべべ:Landroid/content/Context;

.field public final なぎぱいぢぎ:Landroid/os/Handler;

.field public final びぐびあび:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3052\u3064\u3034\u306c\u3050/\u3073\u3050\u3073\u3042\u3073/\u304f\u3057\u3034\u303a\u3045/\u3073\u3050\u3073\u3042\u3073;",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3052\u3064\u3034\u306c\u3050/\u3073\u3050\u3073\u3042\u3073/\u304f\u3057\u3034\u303a\u3045/\u306a\u304e\u3071\u3044\u3062\u304e;",
            ">;"
        }
    .end annotation
.end field

.field public final ぺぁあねじ:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    invoke-direct {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/くし〴〺ぅ;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->びぐびあび:Ljava/util/HashMap;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->づざかべべ:Landroid/content/Context;

    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->なぎぱいぢぎ:Landroid/os/Handler;

    invoke-static {}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/びぐびあび/げつ〴ぬぐ;->〺つふすそ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/びぐびあび/げつ〴ぬぐ;

    move-result-object p1

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/びぐびあび/げつ〴ぬぐ;

    const-wide/16 v0, 0x1388

    iput-wide v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->〳ぜぞぜべっ:J

    const-wide/32 v0, 0x493e0

    iput-wide v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->ぺぁあねじ:J

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .registers 8

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_46

    if-eq v0, v2, :cond_9

    return v1

    :cond_9
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->びぐびあび:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_c
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/びぐびあび;

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->びぐびあび:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;

    if-eqz v1, :cond_41

    .line 1
    iget v3, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->〺つふすそ:I

    const/4 v4, 0x3

    if-ne v3, v4, :cond_41

    .line 2
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    new-instance v3, Ljava/lang/Exception;

    invoke-direct {v3}, Ljava/lang/Exception;-><init>()V

    .line 3
    iget-object v3, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->なぎぱいぢぎ:Landroid/content/ComponentName;

    if-nez v3, :cond_33

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    :cond_33
    if-nez v3, :cond_3e

    new-instance v3, Landroid/content/ComponentName;

    .line 5
    iget-object p1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/びぐびあび;->〺つふすそ:Ljava/lang/String;

    const-string v4, "unknown"

    .line 6
    invoke-direct {v3, p1, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3e
    invoke-virtual {v1, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->onServiceDisconnected(Landroid/content/ComponentName;)V

    :cond_41
    monitor-exit v0

    return v2

    :catchall_43
    move-exception p1

    monitor-exit v0
    :try_end_45
    .catchall {:try_start_c .. :try_end_45} :catchall_43

    throw p1

    :cond_46
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->びぐびあび:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_49
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/びぐびあび;

    iget-object v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->びぐびあび:Ljava/util/HashMap;

    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;

    if-eqz v3, :cond_7f

    .line 7
    iget-object v4, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/Set;

    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_7f

    .line 8
    iget-boolean v4, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->くし〴〺ぅ:Z

    if-eqz v4, :cond_7a

    .line 9
    iget-object v4, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;

    .line 10
    iget-object v4, v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->なぎぱいぢぎ:Landroid/os/Handler;

    .line 11
    iget-object v5, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/びぐびあび;

    invoke-virtual {v4, v2, v5}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v4, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;

    .line 12
    iget-object v5, v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/びぐびあび/げつ〴ぬぐ;

    .line 13
    iget-object v4, v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->づざかべべ:Landroid/content/Context;

    .line 14
    invoke-virtual {v4, v3}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iput-boolean v1, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->くし〴〺ぅ:Z

    const/4 v1, 0x2

    iput v1, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->〺つふすそ:I

    .line 15
    :cond_7a
    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->びぐびあび:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7f
    monitor-exit v0

    return v2

    :catchall_81
    move-exception p1

    monitor-exit v0
    :try_end_83
    .catchall {:try_start_49 .. :try_end_83} :catchall_81

    throw p1
.end method

.method public final 〺つふすそ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/びぐびあび;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    .registers 6

    const-string p3, "ServiceConnection must not be null"

    invoke-static {p2, p3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->びぐびあび(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->びぐびあび:Ljava/util/HashMap;

    monitor-enter p3

    :try_start_8
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->びぐびあび:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;

    if-eqz v0, :cond_5c

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/Set;

    invoke-interface {v1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3b

    .line 2
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;

    .line 3
    iget-object v1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/びぐびあび/げつ〴ぬぐ;

    .line 4
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/Set;

    invoke-interface {v1, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 5
    iget-object p2, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/Set;

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_39

    .line 6
    iget-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->なぎぱいぢぎ:Landroid/os/Handler;

    const/4 v0, 0x0

    invoke-virtual {p2, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->なぎぱいぢぎ:Landroid/os/Handler;

    iget-wide v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->〳ぜぞぜべっ:J

    invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_39
    monitor-exit p3

    return-void

    :cond_3b
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x4c

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Trying to unbind a GmsServiceConnection  that was not bound before.  config="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5c
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x32

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Nonexistent connection status for service config: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :catchall_7d
    move-exception p1

    monitor-exit p3
    :try_end_7f
    .catchall {:try_start_8 .. :try_end_7f} :catchall_7d

    throw p1
.end method

.method public final げつ〴ぬぐ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/びぐびあび;Landroid/content/ServiceConnection;Ljava/lang/String;)Z
    .registers 8

    const-string v0, "ServiceConnection must not be null"

    invoke-static {p2, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->びぐびあび(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->びぐびあび:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_8
    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->びぐびあび:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;

    if-nez v1, :cond_28

    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;

    invoke-direct {v1, p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/びぐびあび;)V

    .line 1
    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/びぐびあび;->げつ〴ぬぐ()Landroid/content/Intent;

    iget-object v2, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/Set;

    invoke-interface {v2, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 2
    invoke-virtual {v1, p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->げつ〴ぬぐ(Ljava/lang/String;)V

    iget-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->びぐびあび:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5a

    :cond_28
    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->なぎぱいぢぎ:Landroid/os/Handler;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 3
    iget-object v2, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/Set;

    invoke-interface {v2, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5e

    .line 4
    iget-object p1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;

    .line 5
    iget-object p1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/づざかべべ;->ぁごぐすすぃ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/びぐびあび/げつ〴ぬぐ;

    .line 6
    iget-object p1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/びぐびあび;

    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/びぐびあび;->げつ〴ぬぐ()Landroid/content/Intent;

    iget-object p1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/util/Set;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 7
    iget p1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->〺つふすそ:I

    const/4 v2, 0x1

    if-eq p1, v2, :cond_51

    const/4 p2, 0x2

    if-eq p1, p2, :cond_4d

    goto :goto_5a

    .line 8
    :cond_4d
    invoke-virtual {v1, p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->げつ〴ぬぐ(Ljava/lang/String;)V

    goto :goto_5a

    .line 9
    :cond_51
    iget-object p1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->なぎぱいぢぎ:Landroid/content/ComponentName;

    .line 10
    iget-object p3, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->びぐびあび:Landroid/os/IBinder;

    .line 11
    check-cast p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/びえぁぜい;

    invoke-virtual {p2, p1, p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/びえぁぜい;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V

    .line 12
    :goto_5a
    iget-boolean p1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/なぎぱいぢぎ;->くし〴〺ぅ:Z

    .line 13
    monitor-exit v0

    return p1

    :cond_5e
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    add-int/lit8 p3, p3, 0x51

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p3, "Trying to bind a GmsServiceConnection that was already connected before.  config="

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :catchall_7f
    move-exception p1

    monitor-exit v0
    :try_end_81
    .catchall {:try_start_8 .. :try_end_81} :catchall_7f

    throw p1
.end method
