.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/いいにぽつ/〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/〻ぞまぎな〻;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u303b\u305e\u307e\u304e\u306a\u303b<",
        "Ljava/lang/Double;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/sockets/v2ray/V2RayVpnService;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Ljava/lang/Object;Ljava/lang/reflect/Type;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぶでにく〼〳;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;
    .registers 7

    check-cast p1, Ljava/lang/Double;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p2

    invoke-virtual {p1}, Ljava/lang/Double;->longValue()J

    move-result-wide v0

    long-to-double v0, v0

    cmpl-double v2, p2, v0

    new-instance p2, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;

    if-nez v2, :cond_19

    invoke-virtual {p1}, Ljava/lang/Double;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    :cond_19
    invoke-direct {p2, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;-><init>(Ljava/lang/Number;)V

    return-object p2
.end method
