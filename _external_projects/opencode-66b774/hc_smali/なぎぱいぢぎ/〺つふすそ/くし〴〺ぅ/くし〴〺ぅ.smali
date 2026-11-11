.class public Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/びぐびあび;


# static fields
.field public static final びぐびあび:I


# instance fields
.field public final 〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ;

.field public final くし〴〺ぅ:Ljava/util/concurrent/Executor;

.field public final げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    sput v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/くし〴〺ぅ;->びぐびあび:I

    return-void
.end method

.method public constructor <init>()V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/なぎぱいぢぎ;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/なぎぱいぢぎ;-><init>(I)V

    new-instance v1, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ;

    sget v2, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/くし〴〺ぅ;->びぐびあび:I

    invoke-direct {v1, v2, v0}, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    iput-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/くし〴〺ぅ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ;

    new-instance v1, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ;

    const/4 v2, 0x2

    invoke-direct {v1, v2, v0}, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    iput-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/くし〴〺ぅ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ;

    new-instance v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/づざかべべ;

    invoke-direct {v0}, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/づざかべべ;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/util/concurrent/Executor;

    return-void
.end method
