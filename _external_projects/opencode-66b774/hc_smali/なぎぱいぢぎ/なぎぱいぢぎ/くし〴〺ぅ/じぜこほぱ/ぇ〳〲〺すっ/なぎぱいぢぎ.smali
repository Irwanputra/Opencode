.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;
.super Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;
.source ""


# static fields
.field public static final ぇぬぎばつ:Ljava/io/Writer;

.field public static final ぉざぅち〻:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;


# instance fields
.field public おぐぴう〸ず:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;

.field public final のぷのちつ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u3049\u3056\u3045\u3061\u303b;",
            ">;"
        }
    .end annotation
.end field

.field public へぬ〴づぞ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ$げつ〴ぬぐ;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ$げつ〴ぬぐ;-><init>()V

    sput-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->ぇぬぎばつ:Ljava/io/Writer;

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;-><init>(Ljava/lang/String;)V

    sput-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->ぉざぅち〻:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    sget-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->ぇぬぎばつ:Ljava/io/Writer;

    invoke-direct {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;-><init>(Ljava/io/Writer;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->のぷのちつ:Ljava/util/List;

    sget-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/は〲ぱなで;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/は〲ぱなで;

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->おぐぴう〸ず:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;

    return-void
.end method


# virtual methods
.method public close()V
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->のぷのちつ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->のぷのちつ:Ljava/util/List;

    sget-object v1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->ぉざぅち〻:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_10
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete document"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public flush()V
    .registers 1

    return-void
.end method

.method public ぇとしたべど()Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;
    .registers 2

    sget-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/は〲ぱなで;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/は〲ぱなで;

    invoke-virtual {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->くねねぱす〻(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;)V

    return-object p0
.end method

.method public えがぐせほち(Ljava/lang/Boolean;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;
    .registers 3

    if-nez p1, :cond_8

    .line 1
    sget-object p1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/は〲ぱなで;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/は〲ぱなで;

    invoke-virtual {p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->くねねぱす〻(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;)V

    return-object p0

    .line 2
    :cond_8
    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->くねねぱす〻(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;)V

    return-object p0
.end method

.method public ぉひのべい()Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;
    .registers 3

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;-><init>()V

    invoke-virtual {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->くねねぱす〻(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;)V

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->のぷのちつ:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public おかぷせ〱(Ljava/lang/String;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->のぷのちつ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1d

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->へぬ〴づぞ:Ljava/lang/String;

    if-nez v0, :cond_1d

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->のね〱ばぁぢ()Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;

    move-result-object v0

    instance-of v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;

    if-eqz v0, :cond_17

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->へぬ〴づぞ:Ljava/lang/String;

    return-object p0

    :cond_17
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1d
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final くねねぱす〻(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;)V
    .registers 4

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->へぬ〴づぞ:Ljava/lang/String;

    if-eqz v0, :cond_1b

    .line 1
    instance-of v0, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/は〲ぱなで;

    if-eqz v0, :cond_c

    .line 2
    iget-boolean v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;->いいにぽつ:Z

    if-eqz v0, :cond_17

    .line 3
    :cond_c
    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->のね〱ばぁぢ()Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->へぬ〴づぞ:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;->〺つふすそ(Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;)V

    :cond_17
    const/4 p1, 0x0

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->へぬ〴づぞ:Ljava/lang/String;

    goto :goto_35

    :cond_1b
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->のぷのちつ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_26

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->おぐぴう〸ず:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;

    goto :goto_35

    :cond_26
    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->のね〱ばぁぢ()Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;

    move-result-object v0

    instance-of v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/へぬ〴づぞ;

    if-eqz v1, :cond_36

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/へぬ〴づぞ;

    .line 4
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/へぬ〴づぞ;->〺つふすそ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_35
    return-void

    .line 5
    :cond_36
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public けときぜと()Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->のぷのちつ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_26

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->へぬ〴づぞ:Ljava/lang/String;

    if-nez v0, :cond_26

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->のね〱ばぁぢ()Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;

    move-result-object v0

    instance-of v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;

    if-eqz v0, :cond_20

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->のぷのちつ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-object p0

    :cond_20
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_26
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public こ〲しでおか(Z)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;
    .registers 3

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->くねねぱす〻(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;)V

    return-object p0
.end method

.method public ごまけがぢは(Ljava/lang/String;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;
    .registers 3

    if-nez p1, :cond_8

    .line 1
    sget-object p1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/は〲ぱなで;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/は〲ぱなで;

    invoke-virtual {p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->くねねぱす〻(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;)V

    return-object p0

    .line 2
    :cond_8
    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->くねねぱす〻(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;)V

    return-object p0
.end method

.method public ち〴みぎ〻び(J)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;
    .registers 4

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;-><init>(Ljava/lang/Number;)V

    invoke-virtual {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->くねねぱす〻(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;)V

    return-object p0
.end method

.method public final のね〱ばぁぢ()Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->のぷのちつ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;

    return-object v0
.end method

.method public ばおぢでぎか(Ljava/lang/Number;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;
    .registers 5

    if-nez p1, :cond_8

    .line 1
    sget-object p1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/は〲ぱなで;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/は〲ぱなで;

    invoke-virtual {p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->くねねぱす〻(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;)V

    return-object p0

    .line 2
    :cond_8
    iget-boolean v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;->ぁごぐすすぃ:Z

    if-nez v0, :cond_34

    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_1d

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_1d

    goto :goto_34

    :cond_1d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JSON forbids NaN and infinities: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    :goto_34
    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/でどあくず;-><init>(Ljava/lang/Number;)V

    invoke-virtual {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->くねねぱす〻(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;)V

    return-object p0
.end method

.method public ぷぞてのほき()Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->のぷのちつ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_26

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->へぬ〴づぞ:Ljava/lang/String;

    if-nez v0, :cond_26

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->のね〱ばぁぢ()Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;

    move-result-object v0

    instance-of v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/へぬ〴づぞ;

    if-eqz v0, :cond_20

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->のぷのちつ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-object p0

    :cond_20
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_26
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public ぺづげぺが()Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉひのべい/くし〴〺ぅ;
    .registers 3

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/へぬ〴づぞ;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/へぬ〴づぞ;-><init>()V

    invoke-virtual {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->くねねぱす〻(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;)V

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/ぇ〳〲〺すっ/なぎぱいぢぎ;->のぷのちつ:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method
