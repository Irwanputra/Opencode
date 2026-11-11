.class public abstract Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;
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
    accessFlags = 0x409
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
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

.field public くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d$\u304f\u3057\u3034\u303a\u3045<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d$\u304f\u3057\u3034\u303a\u3045<",
            "TK;TV;>;",
            "L\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d$\u304f\u3057\u3034\u303a\u3045<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    iput-object p1, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    return v0
.end method

.method public next()Ljava/lang/Object;
    .registers 3

    .line 1
    iget-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    .line 2
    iget-object v1, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    if-eq v0, v1, :cond_e

    if-nez v1, :cond_9

    goto :goto_e

    :cond_9
    invoke-virtual {p0, v0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->くし〴〺ぅ(Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;)Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    move-result-object v1

    goto :goto_f

    :cond_e
    :goto_e
    const/4 v1, 0x0

    .line 3
    :goto_f
    iput-object v1, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    return-object v0
.end method

.method public abstract 〺つふすそ(Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;)Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d$\u304f\u3057\u3034\u303a\u3045<",
            "TK;TV;>;)",
            "L\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d$\u304f\u3057\u3034\u303a\u3045<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public abstract くし〴〺ぅ(Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;)Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d$\u304f\u3057\u3034\u303a\u3045<",
            "TK;TV;>;)",
            "L\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d$\u304f\u3057\u3034\u303a\u3045<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public げつ〴ぬぐ(Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d$\u304f\u3057\u3034\u303a\u3045<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    const/4 v1, 0x0

    if-ne v0, p1, :cond_d

    iget-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    if-ne p1, v0, :cond_d

    iput-object v1, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    iput-object v1, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    :cond_d
    iget-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    if-ne v0, p1, :cond_17

    invoke-virtual {p0, v0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->〺つふすそ(Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;)Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    move-result-object v0

    iput-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    :cond_17
    iget-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    if-ne v0, p1, :cond_28

    .line 1
    iget-object p1, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    if-eq v0, p1, :cond_26

    if-nez p1, :cond_22

    goto :goto_26

    :cond_22
    invoke-virtual {p0, v0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->くし〴〺ぅ(Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;)Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    move-result-object v1

    .line 2
    :cond_26
    :goto_26
    iput-object v1, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    :cond_28
    return-void
.end method
