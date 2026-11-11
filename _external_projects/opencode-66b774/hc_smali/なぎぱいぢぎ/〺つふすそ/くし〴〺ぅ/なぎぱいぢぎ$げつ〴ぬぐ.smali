.class public Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/なぎぱいぢぎ;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Ljava/lang/Runnable;

.field public final synthetic くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/なぎぱいぢぎ;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/なぎぱいぢぎ;Ljava/lang/Runnable;)V
    .registers 3

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/なぎぱいぢぎ;

    iput-object p2, p0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 2

    :try_start_0
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/なぎぱいぢぎ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0xa

    .line 2
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V
    :try_end_a
    .catchall {:try_start_0 .. :try_end_a} :catchall_a

    :catchall_a
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
