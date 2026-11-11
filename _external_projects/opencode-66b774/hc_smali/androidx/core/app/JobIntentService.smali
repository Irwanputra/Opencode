.class public abstract Landroidx/core/app/JobIntentService;
.super Landroid/app/Service;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/app/JobIntentService$げつ〴ぬぐ;,
        Landroidx/core/app/JobIntentService$びぐびあび;,
        Landroidx/core/app/JobIntentService$づざかべべ;,
        Landroidx/core/app/JobIntentService$なぎぱいぢぎ;,
        Landroidx/core/app/JobIntentService$くし〴〺ぅ;,
        Landroidx/core/app/JobIntentService$〺つふすそ;,
        Landroidx/core/app/JobIntentService$ぁごぐすすぃ;
    }
.end annotation


# static fields
.field public static final ぁごぐすすぃ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/content/ComponentName;",
            "Landroidx/core/app/JobIntentService$\u3041\u3054\u3050\u3059\u3059\u3043;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 〺つふすそ:Landroidx/core/app/JobIntentService$〺つふすそ;

.field public くし〴〺ぅ:Landroidx/core/app/JobIntentService$ぁごぐすすぃ;

.field public づざかべべ:Z

.field public final なぎぱいぢぎ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/core/app/JobIntentService$\u3073\u3050\u3073\u3042\u3073;",
            ">;"
        }
    .end annotation
.end field

.field public びぐびあび:Landroidx/core/app/JobIntentService$げつ〴ぬぐ;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Landroidx/core/app/JobIntentService;->ぁごぐすすぃ:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/core/app/JobIntentService;->づざかべべ:Z

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_e

    const/4 v0, 0x0

    goto :goto_13

    :cond_e
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_13
    iput-object v0, p0, Landroidx/core/app/JobIntentService;->なぎぱいぢぎ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .registers 2

    iget-object p1, p0, Landroidx/core/app/JobIntentService;->〺つふすそ:Landroidx/core/app/JobIntentService$〺つふすそ;

    if-eqz p1, :cond_b

    check-cast p1, Landroidx/core/app/JobIntentService$なぎぱいぢぎ;

    .line 1
    invoke-virtual {p1}, Landroid/app/job/JobServiceEngine;->getBinder()Landroid/os/IBinder;

    move-result-object p1

    return-object p1

    :cond_b
    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .registers 6

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1a

    if-lt v0, v2, :cond_14

    new-instance v0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ;

    invoke-direct {v0, p0}, Landroidx/core/app/JobIntentService$なぎぱいぢぎ;-><init>(Landroidx/core/app/JobIntentService;)V

    iput-object v0, p0, Landroidx/core/app/JobIntentService;->〺つふすそ:Landroidx/core/app/JobIntentService$〺つふすそ;

    iput-object v1, p0, Landroidx/core/app/JobIntentService;->くし〴〺ぅ:Landroidx/core/app/JobIntentService$ぁごぐすすぃ;

    goto :goto_3e

    :cond_14
    iput-object v1, p0, Landroidx/core/app/JobIntentService;->〺つふすそ:Landroidx/core/app/JobIntentService$〺つふすそ;

    new-instance v1, Landroid/content/ComponentName;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v1, p0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1
    sget-object v3, Landroidx/core/app/JobIntentService;->ぁごぐすすぃ:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/core/app/JobIntentService$ぁごぐすすぃ;

    if-nez v4, :cond_3c

    if-ge v0, v2, :cond_34

    new-instance v4, Landroidx/core/app/JobIntentService$くし〴〺ぅ;

    invoke-direct {v4, p0, v1}, Landroidx/core/app/JobIntentService$くし〴〺ぅ;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3c

    :cond_34
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t be here without a job id"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2
    :cond_3c
    :goto_3c
    iput-object v4, p0, Landroidx/core/app/JobIntentService;->くし〴〺ぅ:Landroidx/core/app/JobIntentService$ぁごぐすすぃ;

    :goto_3e
    return-void
.end method

.method public onDestroy()V
    .registers 3

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    iget-object v0, p0, Landroidx/core/app/JobIntentService;->なぎぱいぢぎ:Ljava/util/ArrayList;

    if-eqz v0, :cond_15

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_9
    iput-boolean v1, p0, Landroidx/core/app/JobIntentService;->づざかべべ:Z

    iget-object v1, p0, Landroidx/core/app/JobIntentService;->くし〴〺ぅ:Landroidx/core/app/JobIntentService$ぁごぐすすぃ;

    invoke-virtual {v1}, Landroidx/core/app/JobIntentService$ぁごぐすすぃ;->げつ〴ぬぐ()V

    monitor-exit v0

    goto :goto_15

    :catchall_12
    move-exception v1

    monitor-exit v0
    :try_end_14
    .catchall {:try_start_9 .. :try_end_14} :catchall_12

    throw v1

    :cond_15
    :goto_15
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .registers 6

    iget-object p2, p0, Landroidx/core/app/JobIntentService;->なぎぱいぢぎ:Ljava/util/ArrayList;

    if-eqz p2, :cond_28

    iget-object p2, p0, Landroidx/core/app/JobIntentService;->くし〴〺ぅ:Landroidx/core/app/JobIntentService$ぁごぐすすぃ;

    invoke-virtual {p2}, Landroidx/core/app/JobIntentService$ぁごぐすすぃ;->くし〴〺ぅ()V

    iget-object p2, p0, Landroidx/core/app/JobIntentService;->なぎぱいぢぎ:Ljava/util/ArrayList;

    monitor-enter p2

    :try_start_c
    iget-object v0, p0, Landroidx/core/app/JobIntentService;->なぎぱいぢぎ:Ljava/util/ArrayList;

    new-instance v1, Landroidx/core/app/JobIntentService$びぐびあび;

    if-eqz p1, :cond_13

    goto :goto_18

    :cond_13
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    :goto_18
    invoke-direct {v1, p0, p1, p3}, Landroidx/core/app/JobIntentService$びぐびあび;-><init>(Landroidx/core/app/JobIntentService;Landroid/content/Intent;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/core/app/JobIntentService;->げつ〴ぬぐ(Z)V

    monitor-exit p2

    const/4 p1, 0x3

    return p1

    :catchall_25
    move-exception p1

    monitor-exit p2
    :try_end_27
    .catchall {:try_start_c .. :try_end_27} :catchall_25

    throw p1

    :cond_28
    const/4 p1, 0x2

    return p1
.end method

.method public abstract 〺つふすそ(Landroid/content/Intent;)V
.end method

.method public くし〴〺ぅ()V
    .registers 3

    iget-object v0, p0, Landroidx/core/app/JobIntentService;->なぎぱいぢぎ:Ljava/util/ArrayList;

    if-eqz v0, :cond_25

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_6
    iput-object v1, p0, Landroidx/core/app/JobIntentService;->びぐびあび:Landroidx/core/app/JobIntentService$げつ〴ぬぐ;

    iget-object v1, p0, Landroidx/core/app/JobIntentService;->なぎぱいぢぎ:Ljava/util/ArrayList;

    if-eqz v1, :cond_17

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_17

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroidx/core/app/JobIntentService;->げつ〴ぬぐ(Z)V

    goto :goto_20

    :cond_17
    iget-boolean v1, p0, Landroidx/core/app/JobIntentService;->づざかべべ:Z

    if-nez v1, :cond_20

    iget-object v1, p0, Landroidx/core/app/JobIntentService;->くし〴〺ぅ:Landroidx/core/app/JobIntentService$ぁごぐすすぃ;

    invoke-virtual {v1}, Landroidx/core/app/JobIntentService$ぁごぐすすぃ;->げつ〴ぬぐ()V

    :cond_20
    :goto_20
    monitor-exit v0

    goto :goto_25

    :catchall_22
    move-exception v1

    monitor-exit v0
    :try_end_24
    .catchall {:try_start_6 .. :try_end_24} :catchall_22

    throw v1

    :cond_25
    :goto_25
    return-void
.end method

.method public げつ〴ぬぐ(Z)V
    .registers 4

    iget-object v0, p0, Landroidx/core/app/JobIntentService;->びぐびあび:Landroidx/core/app/JobIntentService$げつ〴ぬぐ;

    if-nez v0, :cond_1e

    new-instance v0, Landroidx/core/app/JobIntentService$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Landroidx/core/app/JobIntentService$げつ〴ぬぐ;-><init>(Landroidx/core/app/JobIntentService;)V

    iput-object v0, p0, Landroidx/core/app/JobIntentService;->びぐびあび:Landroidx/core/app/JobIntentService$げつ〴ぬぐ;

    iget-object v0, p0, Landroidx/core/app/JobIntentService;->くし〴〺ぅ:Landroidx/core/app/JobIntentService$ぁごぐすすぃ;

    if-eqz v0, :cond_14

    if-eqz p1, :cond_14

    invoke-virtual {v0}, Landroidx/core/app/JobIntentService$ぁごぐすすぃ;->〺つふすそ()V

    :cond_14
    iget-object p1, p0, Landroidx/core/app/JobIntentService;->びぐびあび:Landroidx/core/app/JobIntentService$げつ〴ぬぐ;

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {p1, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_1e
    return-void
.end method
