.class public final Landroidx/core/app/JobIntentService$なぎぱいぢぎ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/core/app/JobIntentService$づざかべべ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/JobIntentService$なぎぱいぢぎ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/core/app/JobIntentService$なぎぱいぢぎ;

.field public final げつ〴ぬぐ:Landroid/app/job/JobWorkItem;


# direct methods
.method public constructor <init>(Landroidx/core/app/JobIntentService$なぎぱいぢぎ;Landroid/app/job/JobWorkItem;)V
    .registers 3

    iput-object p1, p0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ$げつ〴ぬぐ;->〺つふすそ:Landroidx/core/app/JobIntentService$なぎぱいぢぎ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/app/job/JobWorkItem;

    return-void
.end method


# virtual methods
.method public getIntent()Landroid/content/Intent;
    .registers 2

    iget-object v0, p0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/app/job/JobWorkItem;

    invoke-virtual {v0}, Landroid/app/job/JobWorkItem;->getIntent()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ()V
    .registers 4

    iget-object v0, p0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ$げつ〴ぬぐ;->〺つふすそ:Landroidx/core/app/JobIntentService$なぎぱいぢぎ;

    iget-object v0, v0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ;->〺つふすそ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_5
    iget-object v1, p0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ$げつ〴ぬぐ;->〺つふすそ:Landroidx/core/app/JobIntentService$なぎぱいぢぎ;

    iget-object v1, v1, Landroidx/core/app/JobIntentService$なぎぱいぢぎ;->くし〴〺ぅ:Landroid/app/job/JobParameters;

    if-eqz v1, :cond_10

    iget-object v2, p0, Landroidx/core/app/JobIntentService$なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/app/job/JobWorkItem;

    invoke-virtual {v1, v2}, Landroid/app/job/JobParameters;->completeWork(Landroid/app/job/JobWorkItem;)V

    :cond_10
    monitor-exit v0

    return-void

    :catchall_12
    move-exception v1

    monitor-exit v0
    :try_end_14
    .catchall {:try_start_5 .. :try_end_14} :catchall_12

    throw v1
.end method
