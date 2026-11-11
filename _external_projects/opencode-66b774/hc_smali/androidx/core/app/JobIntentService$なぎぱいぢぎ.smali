.class public final Landroidx/core/app/JobIntentService$なぎぱいぢぎ;
.super Landroid/app/job/JobServiceEngine;
.source ""

# interfaces
.implements Landroidx/core/app/JobIntentService$〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/JobIntentService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u306a\u304e\u3071\u3044\u3062\u304e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/app/JobIntentService$なぎぱいぢぎ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public final 〺つふすそ:Ljava/lang/Object;

.field public くし〴〺ぅ:Landroid/app/job/JobParameters;

.field public final げつ〴ぬぐ:Landroidx/core/app/JobIntentService;


# direct methods
.method public constructor <init>(Landroidx/core/app/JobIntentService;)V
    .registers 3

    invoke-direct {p0, p1}, Landroid/app/job/JobServiceEngine;-><init>(Landroid/app/Service;)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ;->〺つふすそ:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ;->げつ〴ぬぐ:Landroidx/core/app/JobIntentService;

    return-void
.end method


# virtual methods
.method public onStartJob(Landroid/app/job/JobParameters;)Z
    .registers 3

    iput-object p1, p0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ;->くし〴〺ぅ:Landroid/app/job/JobParameters;

    iget-object p1, p0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ;->げつ〴ぬぐ:Landroidx/core/app/JobIntentService;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/core/app/JobIntentService;->げつ〴ぬぐ(Z)V

    const/4 p1, 0x1

    return p1
.end method

.method public onStopJob(Landroid/app/job/JobParameters;)Z
    .registers 4

    iget-object p1, p0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ;->げつ〴ぬぐ:Landroidx/core/app/JobIntentService;

    .line 1
    iget-object p1, p1, Landroidx/core/app/JobIntentService;->びぐびあび:Landroidx/core/app/JobIntentService$げつ〴ぬぐ;

    if-eqz p1, :cond_a

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->cancel(Z)Z

    :cond_a
    const/4 p1, 0x1

    .line 2
    iget-object v0, p0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ;->〺つふすそ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_f
    iput-object v1, p0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ;->くし〴〺ぅ:Landroid/app/job/JobParameters;

    monitor-exit v0

    return p1

    :catchall_13
    move-exception p1

    monitor-exit v0
    :try_end_15
    .catchall {:try_start_f .. :try_end_15} :catchall_13

    throw p1
.end method
