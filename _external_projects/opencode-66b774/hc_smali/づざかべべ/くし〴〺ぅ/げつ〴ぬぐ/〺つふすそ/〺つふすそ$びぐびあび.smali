.class public Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;
.implements Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$なぎぱいぢぎ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;",
        "L\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d$\u306a\u304e\u3071\u3044\u3062\u304e<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public 〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d$\u304f\u3057\u3034\u303a\u3045<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public くし〴〺ぅ:Z

.field public final synthetic びぐびあび:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;


# direct methods
.method public constructor <init>(Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->びぐびあび:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->くし〴〺ぅ:Z

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .registers 4

    iget-boolean v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->くし〴〺ぅ:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->びぐびあび:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;

    iget-object v0, v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    if-eqz v0, :cond_d

    goto :goto_e

    :cond_d
    const/4 v1, 0x0

    :goto_e
    return v1

    :cond_f
    iget-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    if-eqz v0, :cond_18

    iget-object v0, v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;->びぐびあび:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    if-eqz v0, :cond_18

    goto :goto_19

    :cond_18
    const/4 v1, 0x0

    :goto_19
    return v1
.end method

.method public next()Ljava/lang/Object;
    .registers 2

    .line 1
    iget-boolean v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->くし〴〺ぅ:Z

    if-eqz v0, :cond_c

    const/4 v0, 0x0

    iput-boolean v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->くし〴〺ぅ:Z

    iget-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->びぐびあび:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;

    iget-object v0, v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    goto :goto_14

    :cond_c
    iget-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    if-eqz v0, :cond_13

    iget-object v0, v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;->びぐびあび:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    goto :goto_14

    :cond_13
    const/4 v0, 0x0

    :goto_14
    iput-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    return-object v0
.end method

.method public げつ〴ぬぐ(Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d$\u304f\u3057\u3034\u303a\u3045<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    if-ne p1, v0, :cond_f

    iget-object p1, v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;->づざかべべ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    iput-object p1, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    if-nez p1, :cond_c

    const/4 p1, 0x1

    goto :goto_d

    :cond_c
    const/4 p1, 0x0

    :goto_d
    iput-boolean p1, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->くし〴〺ぅ:Z

    :cond_f
    return-void
.end method
