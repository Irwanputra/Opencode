.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/どぇぞほだ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/〺つふすそ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public final 〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぁごぐすすぃ;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぁごぐすすぃ;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぁごぐすすぃ;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;
    .registers 6
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
    iget-object v0, p2, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/reflect/Type;

    .line 2
    iget-object v1, p2, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/Class;

    .line 3
    const-class v2, Ljava/util/Collection;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_e

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_e
    const-class v2, Ljava/util/Collection;

    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/reflect/WildcardType;

    const/4 v2, 0x0

    if-eqz v1, :cond_21

    check-cast v0, Ljava/lang/reflect/WildcardType;

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v0, v0, v2

    :cond_21
    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v1, :cond_2e

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v0, v0, v2

    goto :goto_30

    :cond_2e
    const-class v0, Ljava/lang/Object;

    .line 5
    :goto_30
    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;

    invoke-direct {v1, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;-><init>(Ljava/lang/reflect/Type;)V

    .line 6
    invoke-virtual {p1, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->くし〴〺ぅ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;

    move-result-object v1

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぁごぐすすぃ;

    invoke-virtual {v2, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぁごぐすすぃ;->げつ〴ぬぐ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ごづごきえ;

    move-result-object p2

    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/〺つふすそ$げつ〴ぬぐ;

    invoke-direct {v2, p1, v0, v1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/〺つふすそ$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;Ljava/lang/reflect/Type;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ごづごきえ;)V

    return-object v2
.end method
