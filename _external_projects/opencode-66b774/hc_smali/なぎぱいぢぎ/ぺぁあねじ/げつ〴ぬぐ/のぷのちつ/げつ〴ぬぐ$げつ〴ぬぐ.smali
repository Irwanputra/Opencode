.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;

.field public final synthetic くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

.field public げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/〺つふすそ;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;)V
    .registers 5

    iput-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;

    iget v1, p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:I

    const/16 v2, 0x800

    invoke-direct {v0, p1, v2, v1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;

    return-void
.end method


# virtual methods
.method public 〺つふすそ([BII)I
    .registers 14

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    if-nez p3, :cond_9

    goto :goto_5e

    :cond_9
    :goto_9
    iget-object v2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/lang/Object;

    monitor-enter v2

    :goto_c
    :try_start_c
    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->げつ〴ぬぐ()I

    move-result v3

    invoke-static {p3, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-lez v3, :cond_47

    iget-object v4, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->づざかべべ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ$〺つふすそ;

    .line 2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v6, p2

    move v5, v3

    :goto_1d
    if-lez v5, :cond_38

    invoke-virtual {v4}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ$〺つふすそ;->げつ〴ぬぐ()I

    move-result v7

    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    iget-object v8, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ$げつ〴ぬぐ;

    iget-object v8, v8, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:[B

    iget v9, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ$〺つふすそ;->〺つふすそ:I

    invoke-static {v8, v9, p1, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v8, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ$〺つふすそ;->〺つふすそ:I

    add-int/2addr v8, v7

    iput v8, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ$〺つふすそ;->〺つふすそ:I

    sub-int/2addr v5, v7

    add-int/2addr v6, v7

    goto :goto_1d

    :cond_38
    add-int/2addr p2, v3

    sub-int/2addr p3, v3

    add-int/2addr v1, v3

    .line 3
    iget v4, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->〺つふすそ:I

    sub-int/2addr v4, v3

    iput v4, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->〺つふすそ:I

    iget-object v3, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v2

    goto :goto_9

    :cond_47
    if-lez v1, :cond_4b

    monitor-exit v2

    goto :goto_5e

    :cond_4b
    iget-boolean v3, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->ぁごぐすすぃ:Z

    if-eqz v3, :cond_5f

    if-eqz v3, :cond_5c

    .line 4
    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->げつ〴ぬぐ()I

    move-result p1

    if-nez p1, :cond_5c

    const/4 p1, 0x0

    iput-object p1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ$〺つふすそ;

    iput-object p1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->づざかべべ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ$〺つふすそ;

    :cond_5c
    const/4 v1, -0x1

    .line 5
    monitor-exit v2

    :goto_5e
    return v1

    :cond_5f
    iget-object v3, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->wait()V

    goto :goto_c

    :catchall_65
    move-exception p1

    monitor-exit v2
    :try_end_67
    .catchall {:try_start_c .. :try_end_67} :catchall_65

    goto :goto_69

    :goto_68
    throw p1

    :goto_69
    goto :goto_68
.end method

.method public げつ〴ぬぐ()V
    .registers 5

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;

    const/4 v1, 0x0

    if-eqz v0, :cond_23

    .line 1
    iget-object v2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/lang/Object;

    monitor-enter v2

    :try_start_8
    iget-boolean v3, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->ぁごぐすすぃ:Z

    if-nez v3, :cond_1e

    const/4 v3, 0x1

    iput-boolean v3, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->ぁごぐすすぃ:Z

    .line 2
    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->げつ〴ぬぐ()I

    move-result v3

    if-nez v3, :cond_19

    iput-object v1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ$〺つふすそ;

    iput-object v1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->づざかべべ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ$〺つふすそ;

    .line 3
    :cond_19
    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    :cond_1e
    monitor-exit v2

    return-void

    :catchall_20
    move-exception v0

    monitor-exit v2
    :try_end_22
    .catchall {:try_start_8 .. :try_end_22} :catchall_20

    throw v0

    .line 4
    :cond_23
    throw v1
.end method
