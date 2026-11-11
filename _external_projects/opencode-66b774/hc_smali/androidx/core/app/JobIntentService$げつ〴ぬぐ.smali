.class public final Landroidx/core/app/JobIntentService$げつ〴ぬぐ;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/JobIntentService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroidx/core/app/JobIntentService;


# direct methods
.method public constructor <init>(Landroidx/core/app/JobIntentService;)V
    .registers 2

    iput-object p1, p0, Landroidx/core/app/JobIntentService$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/core/app/JobIntentService;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method public doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    check-cast p1, [Ljava/lang/Void;

    .line 1
    :goto_2
    iget-object p1, p0, Landroidx/core/app/JobIntentService$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/core/app/JobIntentService;

    .line 2
    iget-object v0, p1, Landroidx/core/app/JobIntentService;->〺つふすそ:Landroidx/core/app/JobIntentService$〺つふすそ;

    const/4 v1, 0x0

    if-eqz v0, :cond_31

    check-cast v0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ;

    .line 3
    iget-object v2, v0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ;->〺つふすそ:Ljava/lang/Object;

    monitor-enter v2

    :try_start_e
    iget-object p1, v0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ;->くし〴〺ぅ:Landroid/app/job/JobParameters;

    if-nez p1, :cond_14

    monitor-exit v2

    goto :goto_49

    :cond_14
    invoke-virtual {p1}, Landroid/app/job/JobParameters;->dequeueWork()Landroid/app/job/JobWorkItem;

    move-result-object p1

    monitor-exit v2
    :try_end_19
    .catchall {:try_start_e .. :try_end_19} :catchall_2e

    if-eqz p1, :cond_49

    invoke-virtual {p1}, Landroid/app/job/JobWorkItem;->getIntent()Landroid/content/Intent;

    move-result-object v2

    iget-object v3, v0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ;->げつ〴ぬぐ:Landroidx/core/app/JobIntentService;

    invoke-virtual {v3}, Landroid/app/Service;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    new-instance v2, Landroidx/core/app/JobIntentService$なぎぱいぢぎ$げつ〴ぬぐ;

    invoke-direct {v2, v0, p1}, Landroidx/core/app/JobIntentService$なぎぱいぢぎ$げつ〴ぬぐ;-><init>(Landroidx/core/app/JobIntentService$なぎぱいぢぎ;Landroid/app/job/JobWorkItem;)V

    goto :goto_4a

    :catchall_2e
    move-exception p1

    :try_start_2f
    monitor-exit v2
    :try_end_30
    .catchall {:try_start_2f .. :try_end_30} :catchall_2e

    throw p1

    .line 4
    :cond_31
    iget-object v0, p1, Landroidx/core/app/JobIntentService;->なぎぱいぢぎ:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_34
    iget-object v2, p1, Landroidx/core/app/JobIntentService;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_48

    iget-object p1, p1, Landroidx/core/app/JobIntentService;->なぎぱいぢぎ:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/core/app/JobIntentService$づざかべべ;

    monitor-exit v0

    goto :goto_4a

    :cond_48
    monitor-exit v0
    :try_end_49
    .catchall {:try_start_34 .. :try_end_49} :catchall_5a

    :cond_49
    :goto_49
    move-object v2, v1

    :goto_4a
    if-eqz v2, :cond_59

    .line 5
    iget-object p1, p0, Landroidx/core/app/JobIntentService$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/core/app/JobIntentService;

    invoke-interface {v2}, Landroidx/core/app/JobIntentService$づざかべべ;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/core/app/JobIntentService;->〺つふすそ(Landroid/content/Intent;)V

    invoke-interface {v2}, Landroidx/core/app/JobIntentService$づざかべべ;->げつ〴ぬぐ()V

    goto :goto_2

    :cond_59
    return-object v1

    :catchall_5a
    move-exception p1

    .line 6
    :try_start_5b
    monitor-exit v0
    :try_end_5c
    .catchall {:try_start_5b .. :try_end_5c} :catchall_5a

    goto :goto_5e

    :goto_5d
    throw p1

    :goto_5e
    goto :goto_5d
.end method

.method public onCancelled(Ljava/lang/Object;)V
    .registers 2

    check-cast p1, Ljava/lang/Void;

    .line 1
    iget-object p1, p0, Landroidx/core/app/JobIntentService$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/core/app/JobIntentService;

    invoke-virtual {p1}, Landroidx/core/app/JobIntentService;->くし〴〺ぅ()V

    return-void
.end method

.method public onPostExecute(Ljava/lang/Object;)V
    .registers 2

    check-cast p1, Ljava/lang/Void;

    .line 1
    iget-object p1, p0, Landroidx/core/app/JobIntentService$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/core/app/JobIntentService;

    invoke-virtual {p1}, Landroidx/core/app/JobIntentService;->くし〴〺ぅ()V

    return-void
.end method
