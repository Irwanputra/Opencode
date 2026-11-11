.class public Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/げつ〴ぬぐ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/どぇぞほだ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;
    .registers 5
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
    iget-object p2, p2, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/reflect/Type;

    .line 2
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    if-nez v0, :cond_15

    instance-of v1, p2, Ljava/lang/Class;

    if-eqz v1, :cond_13

    move-object v1, p2

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-nez v1, :cond_15

    :cond_13
    const/4 p1, 0x0

    return-object p1

    :cond_15
    if-eqz v0, :cond_1e

    .line 3
    check-cast p2, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p2

    goto :goto_24

    :cond_1e
    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    .line 4
    :goto_24
    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;

    invoke-direct {v0, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;-><init>(Ljava/lang/reflect/Type;)V

    .line 5
    invoke-virtual {p1, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->くし〴〺ぅ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;

    move-result-object v0

    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/げつ〴ぬぐ;

    invoke-static {p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/げつ〴ぬぐ;->づざかべべ(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-direct {v1, p1, v0, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;Ljava/lang/Class;)V

    return-object v1
.end method
