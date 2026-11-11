.class public Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;
.super Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;
.source ""


# instance fields
.field public final 〺つふすそ:Ljava/util/concurrent/ExecutorService;

.field public final げつ〴ぬぐ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Ljava/lang/Object;

    new-instance v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;-><init>(Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;)V

    const/4 v1, 0x2

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Ljava/util/concurrent/ExecutorService;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()Z
    .registers 3

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_10

    const/4 v0, 0x1

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    :goto_11
    return v0
.end method
