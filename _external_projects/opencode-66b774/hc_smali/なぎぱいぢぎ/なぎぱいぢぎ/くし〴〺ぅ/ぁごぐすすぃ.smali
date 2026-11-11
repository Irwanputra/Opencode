.class public Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ;
.super Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u306a\u3076\u3072\u305b\u304c<",
        "Ljava/lang/Number;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;)V
    .registers 2

    invoke-direct {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;Ljava/lang/Object;)V
    .registers 5

    check-cast p2, Ljava/lang/Number;

    if-nez p2, :cond_8

    .line 1
    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;->ぇとしたべど()Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;

    goto :goto_13

    :cond_8
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->げつ〴ぬぐ(D)V

    invoke-virtual {p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;->ばおぢでぎか(Ljava/lang/Number;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;

    :goto_13
    return-void
.end method

.method public げつ〴ぬぐ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/げつ〴ぬぐ;)Ljava/lang/Object;
    .registers 4

    .line 1
    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/げつ〴ぬぐ;->〱こか〺ぃせ()Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/〺つふすそ;

    move-result-object v0

    sget-object v1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/〺つふすそ;->いいにぽつ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/〺つふすそ;

    if-ne v0, v1, :cond_d

    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/げつ〴ぬぐ;->こ〲しでおか()V

    const/4 p1, 0x0

    goto :goto_16

    :cond_d
    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/げつ〴ぬぐ;->ておぞぞはね()D

    move-result-wide v0

    double-to-float p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    :goto_16
    return-object p1
.end method
