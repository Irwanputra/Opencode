.class public Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# direct methods
.method public constructor <init>(I)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .registers 3

    new-instance v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;

    invoke-direct {v0, p0, p1}, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/なぎぱいぢぎ$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/なぎぱいぢぎ;Ljava/lang/Runnable;)V

    new-instance p1, Ljava/lang/Thread;

    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    return-object p1
.end method
