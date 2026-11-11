.class public Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/のぷのちつ/づざかべべ;
.implements Lづざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/OnBackPressedDispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LifecycleOnBackPressedCancellable"
.end annotation


# instance fields
.field public final 〺つふすそ:Lづざかべべ/げつ〴ぬぐ/〺つふすそ;

.field public くし〴〺ぅ:Lづざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;

.field public final げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび;

.field public final synthetic びぐびあび:Landroidx/activity/OnBackPressedDispatcher;


# direct methods
.method public constructor <init>(Landroidx/activity/OnBackPressedDispatcher;Lづざかべべ/のぷのちつ/びぐびあび;Lづざかべべ/げつ〴ぬぐ/〺つふすそ;)V
    .registers 4

    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->びぐびあび:Landroidx/activity/OnBackPressedDispatcher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび;

    iput-object p3, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->〺つふすそ:Lづざかべべ/げつ〴ぬぐ/〺つふすそ;

    invoke-virtual {p2, p0}, Lづざかべべ/のぷのちつ/びぐびあび;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/なぎぱいぢぎ;)V

    return-void
.end method


# virtual methods
.method public cancel()V
    .registers 2

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび;

    check-cast v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    .line 1
    iget-object v0, v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    invoke-virtual {v0, p0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->びぐびあび(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->〺つふすそ:Lづざかべべ/げつ〴ぬぐ/〺つふすそ;

    .line 3
    iget-object v0, v0, Lづざかべべ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->くし〴〺ぅ:Lづざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;

    if-eqz v0, :cond_1a

    invoke-interface {v0}, Lづざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->くし〴〺ぅ:Lづざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;

    :cond_1a
    return-void
.end method

.method public びぐびあび(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V
    .registers 4

    sget-object p1, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_START:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    if-ne p2, p1, :cond_1a

    iget-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->びぐびあび:Landroidx/activity/OnBackPressedDispatcher;

    iget-object p2, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->〺つふすそ:Lづざかべべ/げつ〴ぬぐ/〺つふすそ;

    .line 1
    iget-object v0, p1, Landroidx/activity/OnBackPressedDispatcher;->〺つふすそ:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    new-instance v0, Landroidx/activity/OnBackPressedDispatcher$げつ〴ぬぐ;

    invoke-direct {v0, p1, p2}, Landroidx/activity/OnBackPressedDispatcher$げつ〴ぬぐ;-><init>(Landroidx/activity/OnBackPressedDispatcher;Lづざかべべ/げつ〴ぬぐ/〺つふすそ;)V

    .line 2
    iget-object p1, p2, Lづざかべべ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 3
    iput-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->くし〴〺ぅ:Lづざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;

    goto :goto_2d

    :cond_1a
    sget-object p1, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_STOP:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    if-ne p2, p1, :cond_26

    iget-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->くし〴〺ぅ:Lづざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;

    if-eqz p1, :cond_2d

    invoke-interface {p1}, Lづざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;->cancel()V

    goto :goto_2d

    :cond_26
    sget-object p1, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_DESTROY:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    if-ne p2, p1, :cond_2d

    invoke-virtual {p0}, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->cancel()V

    :cond_2d
    :goto_2d
    return-void
.end method
