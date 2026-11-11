.class public Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺぁあねじ;
.super Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u306a\u3076\u3072\u305b\u304c<",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;)V
    .registers 2

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺぁあねじ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;

    invoke-direct {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;Ljava/lang/Object;)V
    .registers 6

    check-cast p2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 1
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺぁあねじ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;->〺つふすそ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;Ljava/lang/Object;)V

    return-void
.end method

.method public げつ〴ぬぐ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/げつ〴ぬぐ;)Ljava/lang/Object;
    .registers 5

    .line 1
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺぁあねじ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;->げつ〴ぬぐ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/げつ〴ぬぐ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    return-object v0
.end method
