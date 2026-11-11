.class public Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static 〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;


# instance fields
.field public final げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/びぐびあび;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/くし〴〺ぅ;

    invoke-direct {v0}, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/くし〴〺ぅ;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/びぐびあび;

    return-void
.end method

.method public static げつ〴ぬぐ()Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;
    .registers 2

    sget-object v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;

    if-nez v0, :cond_17

    const-class v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;

    monitor-enter v0

    :try_start_7
    sget-object v1, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;

    if-nez v1, :cond_12

    new-instance v1, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;

    invoke-direct {v1}, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;-><init>()V

    sput-object v1, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;

    :cond_12
    monitor-exit v0

    goto :goto_17

    :catchall_14
    move-exception v1

    monitor-exit v0
    :try_end_16
    .catchall {:try_start_7 .. :try_end_16} :catchall_14

    throw v1

    :cond_17
    :goto_17
    sget-object v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/〺つふすそ;

    return-object v0
.end method
