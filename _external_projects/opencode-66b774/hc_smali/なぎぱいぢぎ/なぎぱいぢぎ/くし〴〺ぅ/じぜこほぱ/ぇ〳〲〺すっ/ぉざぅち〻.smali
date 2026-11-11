.class public Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/ぉざぅち〻;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/どぇぞほだ;


# instance fields
.field public final synthetic 〺つふすそ:Ljava/lang/Class;

.field public final synthetic くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;)V
    .registers 3

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/ぉざぅち〻;->〺つふすそ:Ljava/lang/Class;

    iput-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/ぉざぅち〻;->くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "Factory[type="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/ぉざぅち〻;->〺つふすそ:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",adapter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/ぉざぅち〻;->くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u307a\u3075\u306d\u3065\u303a;",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u307a\u3065\u3052\u307a\u304c/\u3052\u3064\u3034\u306c\u3050<",
            "TT;>;)",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u306a\u3076\u3072\u305b\u304c<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object p1, p2, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/Class;

    .line 2
    iget-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/ぉざぅち〻;->〺つふすそ:Ljava/lang/Class;

    if-ne p1, p2, :cond_9

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/ぉざぅち〻;->くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;

    goto :goto_a

    :cond_9
    const/4 p1, 0x0

    :goto_a
    return-object p1
.end method
