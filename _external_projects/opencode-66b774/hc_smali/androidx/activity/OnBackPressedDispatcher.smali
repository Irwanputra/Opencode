.class public final Landroidx/activity/OnBackPressedDispatcher;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;,
        Landroidx/activity/OnBackPressedDispatcher$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public final 〺つふすそ:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "L\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d;",
            ">;"
        }
    .end annotation
.end field

.field public final げつ〴ぬぐ:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Landroidx/activity/OnBackPressedDispatcher;->〺つふすそ:Ljava/util/ArrayDeque;

    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher;->げつ〴ぬぐ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()V
    .registers 4

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher;->〺つふすそ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->descendingIterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lづざかべべ/げつ〴ぬぐ/〺つふすそ;

    .line 1
    iget-boolean v2, v1, Lづざかべべ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v2, :cond_6

    .line 2
    invoke-virtual {v1}, Lづざかべべ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ()V

    return-void

    :cond_1a
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher;->げつ〴ぬぐ:Ljava/lang/Runnable;

    if-eqz v0, :cond_21

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_21
    return-void
.end method
