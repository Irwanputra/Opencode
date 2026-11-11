.class public Lgo/Seq1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgo/Seq1$RefMap;,
        Lgo/Seq1$GoRef;,
        Lgo/Seq1$GoRefQueue;,
        Lgo/Seq1$RefTracker;,
        Lgo/Seq1$Ref;,
        Lgo/Seq1$Proxy;,
        Lgo/Seq1$GoObject;
    }
.end annotation


# static fields
.field private static final NULL_REFNUM:I = 0x29

.field private static final goRefQueue:Lgo/Seq1$GoRefQueue;

.field private static log:Ljava/util/logging/Logger;

.field public static final nullRef:Lgo/Seq1$Ref;

.field public static final tracker:Lgo/Seq1$RefTracker;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    const-string v0, "GoSeq"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lgo/Seq1;->log:Ljava/util/logging/Logger;

    new-instance v0, Lgo/Seq1$Ref;

    const/16 v1, 0x29

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgo/Seq1$Ref;-><init>(ILjava/lang/Object;)V

    sput-object v0, Lgo/Seq1;->nullRef:Lgo/Seq1$Ref;

    new-instance v0, Lgo/Seq1$GoRefQueue;

    invoke-direct {v0}, Lgo/Seq1$GoRefQueue;-><init>()V

    sput-object v0, Lgo/Seq1;->goRefQueue:Lgo/Seq1$GoRefQueue;

    invoke-static {}, Lgo/Seq1;->init()V

    invoke-static {}, Lgo/Universe1;->touch()V

    new-instance v0, Lgo/Seq1$RefTracker;

    invoke-direct {v0}, Lgo/Seq1$RefTracker;-><init>()V

    sput-object v0, Lgo/Seq1;->tracker:Lgo/Seq1$RefTracker;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic access$000()Ljava/util/logging/Logger;
    .registers 1

    sget-object v0, Lgo/Seq1;->log:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static decRef(I)V
    .registers 2

    sget-object v0, Lgo/Seq1;->tracker:Lgo/Seq1$RefTracker;

    invoke-virtual {v0, p0}, Lgo/Seq1$RefTracker;->dec(I)V

    return-void
.end method

.method public static native destroyRef(I)V
.end method

.method public static getRef(I)Lgo/Seq1$Ref;
    .registers 2

    sget-object v0, Lgo/Seq1;->tracker:Lgo/Seq1$RefTracker;

    invoke-virtual {v0, p0}, Lgo/Seq1$RefTracker;->get(I)Lgo/Seq1$Ref;

    move-result-object p0

    return-object p0
.end method

.method public static incGoObjectRef(Lgo/Seq1$GoObject;)I
    .registers 1

    invoke-interface {p0}, Lgo/Seq1$GoObject;->incRefnum()I

    move-result p0

    return p0
.end method

.method public static native incGoRef(ILgo/Seq1$GoObject;)V
.end method

.method public static incRef(Ljava/lang/Object;)I
    .registers 2

    sget-object v0, Lgo/Seq1;->tracker:Lgo/Seq1$RefTracker;

    invoke-virtual {v0, p0}, Lgo/Seq1$RefTracker;->inc(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static incRefnum(I)V
    .registers 2

    sget-object v0, Lgo/Seq1;->tracker:Lgo/Seq1$RefTracker;

    invoke-virtual {v0, p0}, Lgo/Seq1$RefTracker;->incRefnum(I)V

    return-void
.end method

.method private static native init()V
.end method

.method public static setContext(Landroid/content/Context;)V
    .registers 1

    invoke-static {p0}, Lgo/Seq1;->setContext(Ljava/lang/Object;)V

    return-void
.end method

.method public static native setContext(Ljava/lang/Object;)V
.end method

.method public static touch()V
    .registers 0

    return-void
.end method

.method public static trackGoRef(ILgo/Seq1$GoObject;)V
    .registers 3

    if-gtz p0, :cond_8

    sget-object v0, Lgo/Seq1;->goRefQueue:Lgo/Seq1$GoRefQueue;

    invoke-virtual {v0, p0, p1}, Lgo/Seq1$GoRefQueue;->track(ILgo/Seq1$GoObject;)V

    return-void

    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "trackGoRef called with Java refnum "

    invoke-static {v0, p0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
