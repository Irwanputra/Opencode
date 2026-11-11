.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/のぷのちつ$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/どぇぞほだ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/のぷのちつ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public final 〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u307a\u3065\u3052\u307a\u304c/\u3052\u3064\u3034\u306c\u3050<",
            "*>;"
        }
    .end annotation
.end field

.field public final くし〴〺ぅ:Z

.field public final づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/〻ぞまぎな〻;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u303b\u305e\u307e\u304e\u306a\u303b<",
            "*>;"
        }
    .end annotation
.end field

.field public final なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぇぬぎばつ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u3047\u306c\u304e\u3070\u3064<",
            "*>;"
        }
    .end annotation
.end field

.field public final びぐびあび:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;ZLjava/lang/Class;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u307a\u3065\u3052\u307a\u304c/\u3052\u3064\u3034\u306c\u3050<",
            "*>;Z",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    instance-of p4, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/〻ぞまぎな〻;

    const/4 v0, 0x0

    if-eqz p4, :cond_c

    move-object p4, p1

    check-cast p4, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/〻ぞまぎな〻;

    goto :goto_d

    :cond_c
    move-object p4, v0

    :goto_d
    iput-object p4, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/のぷのちつ$くし〴〺ぅ;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/〻ぞまぎな〻;

    instance-of v1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぇぬぎばつ;

    if-eqz v1, :cond_16

    check-cast p1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぇぬぎばつ;

    goto :goto_17

    :cond_16
    move-object p1, v0

    :goto_17
    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/のぷのちつ$くし〴〺ぅ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぇぬぎばつ;

    if-nez p4, :cond_20

    if-eqz p1, :cond_1e

    goto :goto_20

    :cond_1e
    const/4 p1, 0x0

    goto :goto_21

    :cond_20
    :goto_20
    const/4 p1, 0x1

    :goto_21
    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〺つふすそ(Z)V

    iput-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/のぷのちつ$くし〴〺ぅ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;

    iput-boolean p3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/のぷのちつ$くし〴〺ぅ;->くし〴〺ぅ:Z

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/のぷのちつ$くし〴〺ぅ;->びぐびあび:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/なぶひせが;
    .registers 10
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

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/のぷのちつ$くし〴〺ぅ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;

    if-eqz v0, :cond_1b

    invoke-virtual {v0, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    iget-boolean v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/のぷのちつ$くし〴〺ぅ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_17

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/のぷのちつ$くし〴〺ぅ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/reflect/Type;

    .line 2
    iget-object v1, p2, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/Class;

    if-ne v0, v1, :cond_17

    goto :goto_19

    :cond_17
    const/4 v0, 0x0

    goto :goto_23

    :cond_19
    :goto_19
    const/4 v0, 0x1

    goto :goto_23

    .line 3
    :cond_1b
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/のぷのちつ$くし〴〺ぅ;->びぐびあび:Ljava/lang/Class;

    .line 4
    iget-object v1, p2, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/Class;

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    :goto_23
    if-eqz v0, :cond_33

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/のぷのちつ;

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/のぷのちつ$くし〴〺ぅ;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/〻ぞまぎな〻;

    iget-object v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/のぷのちつ$くし〴〺ぅ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぇぬぎばつ;

    move-object v1, v0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p0

    invoke-direct/range {v1 .. v6}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/のぷのちつ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/〻ぞまぎな〻;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぇぬぎばつ;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺづげぺが/げつ〴ぬぐ;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/どぇぞほだ;)V

    goto :goto_34

    :cond_33
    const/4 v0, 0x0

    :goto_34
    return-object v0
.end method
