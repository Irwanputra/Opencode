.class public final Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:Ljava/lang/Object;

.field public くし〴〺ぅ:Landroid/app/Activity;

.field public づざかべべ:Z

.field public なぎぱいぢぎ:Z

.field public びぐびあび:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;->びぐびあび:Z

    iput-boolean v0, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;->づざかべべ:Z

    iput-boolean v0, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .registers 3

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/app/Activity;

    if-ne v0, p1, :cond_a

    const/4 p1, 0x0

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/app/Activity;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;->づざかべべ:Z

    :cond_a
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .registers 7

    iget-boolean v0, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;->づざかべべ:Z

    if-eqz v0, :cond_31

    iget-boolean v0, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    if-nez v0, :cond_31

    iget-boolean v0, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;->びぐびあび:Z

    if-nez v0, :cond_31

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 1
    :try_start_10
    sget-object v3, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;->くし〴〺ぅ:Ljava/lang/reflect/Field;

    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v0, :cond_19

    goto :goto_2a

    :cond_19
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;->〺つふすそ:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;->ぁごぐすすぃ:Landroid/os/Handler;

    new-instance v4, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/びぐびあび;

    invoke-direct {v4, p1, v3}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/びぐびあび;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z
    :try_end_29
    .catchall {:try_start_10 .. :try_end_29} :catchall_2a

    const/4 v1, 0x1

    :catchall_2a
    :goto_2a
    if-eqz v1, :cond_31

    .line 2
    iput-boolean v2, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    const/4 p1, 0x0

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/Object;

    :cond_31
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .registers 2

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .registers 3

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/app/Activity;

    if-ne v0, p1, :cond_7

    const/4 p1, 0x1

    iput-boolean p1, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ$げつ〴ぬぐ;->びぐびあび:Z

    :cond_7
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .registers 2

    return-void
.end method
