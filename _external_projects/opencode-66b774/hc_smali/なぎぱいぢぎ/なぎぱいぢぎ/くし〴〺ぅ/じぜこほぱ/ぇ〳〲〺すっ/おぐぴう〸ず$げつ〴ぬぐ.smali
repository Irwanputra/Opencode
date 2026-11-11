.class public Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/おぐぴう〸ず$げつ〴ぬぐ;
.super Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/おぐぴう〸ず;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u306a\u3076\u3072\u305b\u304c<",
        "Ljava/util/concurrent/atomic/AtomicIntegerArray;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;Ljava/lang/Object;)V
    .registers 7

    check-cast p2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 1
    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;->ぺづげぺが()Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_a
    if-ge v1, v0, :cond_17

    invoke-virtual {p2, v1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p1, v2, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;->ち〴みぎ〻び(J)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_17
    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;->ぷぞてのほき()Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;

    return-void
.end method

.method public げつ〴ぬぐ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/げつ〴ぬぐ;)Ljava/lang/Object;
    .registers 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/げつ〴ぬぐ;->じぜこほぱ()V

    :goto_8
    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/げつ〴ぬぐ;->ぇとしたべど()Z

    move-result v1

    if-eqz v1, :cond_21

    :try_start_e
    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/げつ〴ぬぐ;->ち〴みぎ〻び()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_19
    .catch Ljava/lang/NumberFormatException; {:try_start_e .. :try_end_19} :catch_1a

    goto :goto_8

    :catch_1a
    move-exception p1

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉ〲なぱぽた;

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉ〲なぱぽた;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_21
    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/げつ〴ぬぐ;->ぷぞてのほき()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-instance v1, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-direct {v1, p1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;-><init>(I)V

    const/4 v2, 0x0

    :goto_2e
    if-ge v2, p1, :cond_40

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->set(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2e

    :cond_40
    return-object v1
.end method
